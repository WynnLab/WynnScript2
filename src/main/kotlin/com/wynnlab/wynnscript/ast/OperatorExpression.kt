package com.wynnlab.wynnscript.ast

import com.wynnlab.wynnscript.Scope
import com.wynnlab.wynnscript.WynnScriptParseException
import com.wynnlab.wynnscript.antlr.WynnScriptParser
import com.wynnlab.wynnscript.getMethod
import com.wynnlab.wynnscript.invokeMethod
import kotlin.math.pow

internal interface OperatorExpression : Expression {
    companion object {
        operator fun invoke(ctx: WynnScriptParser.Operator_expressionContext): Expression = when(ctx) {
            is WynnScriptParser.GetFieldContext -> GetField(ctx.field_get())
            is WynnScriptParser.SetFieldContext -> SetField(ctx.field_set())
            is WynnScriptParser.InvokeContext -> FunctionCall(ctx.function_call())
            is WynnScriptParser.MethodContext -> MethodCall(ctx.method_call())
            is WynnScriptParser.GetIndexContext -> GetIndex(ctx.index_get())
            is WynnScriptParser.SetIndexContext -> SetIndex(ctx.index_set())
            is WynnScriptParser.PostfixContext -> Postfix(ctx)
            is WynnScriptParser.PrefixContext -> Prefix(ctx)
            is WynnScriptParser.PowerContext -> Power(ctx)
            is WynnScriptParser.ProductContext -> Product(ctx)
            is WynnScriptParser.SumContext -> Sum(ctx)
            is WynnScriptParser.ComparisonContext -> Comparison(ctx)
            is WynnScriptParser.EqualityContext -> Equality(ctx)
            is WynnScriptParser.AndContext -> And(ctx)
            is WynnScriptParser.OrContext -> Or(ctx)
            is WynnScriptParser.ConditionalContext -> Conditional(ctx)
            is WynnScriptParser.AssignContext -> Assign(ctx)
            is WynnScriptParser.SpreadContext -> Spread(ctx)
            is WynnScriptParser.PrimaryContext -> PrimaryExpression(ctx.primary_expression())
            else -> throw WynnScriptParseException(ctx)
        }
    }
}

internal interface UnaryOperator : OperatorExpression {
    val value: Expression
}

internal interface BinaryOperator : OperatorExpression {
    val left: Expression
    val right: Expression
}

internal interface TernaryOperator : OperatorExpression {
    val left: Expression
    val center: Expression
    val right: Expression
}

internal class Postfix(ctx: WynnScriptParser.PostfixContext) : UnaryOperator {
    override val value = OperatorExpression(ctx.operator_expression())
    private val operator = ctx.DEC() == null

    override fun invoke(scope: Scope): Any? {
        throw NotImplementedError()
    }
}

internal class Prefix(ctx: WynnScriptParser.PrefixContext) : UnaryOperator {
    override val value = OperatorExpression(ctx.operator_expression())
    val operator = ctx.BANG()?.let { 0 } ?: ctx.TILDE()?.let { 1 } ?: ctx.PLUS()?.let { 2 } ?: ctx.DASH()?.let { 3 } ?:
        ctx.INC()?.let { 4 } ?: 5

    override fun invoke(scope: Scope): Any? = when (operator) {
        0 -> value(scope)!!.invokeMethod("not")
        2 -> value(scope)!!.invokeMethod("unaryPlus")
        3 -> value(scope)!!.invokeMethod("unaryMinus")
        else -> throw NotImplementedError()
    }
}

internal class Power(ctx: WynnScriptParser.PowerContext) : BinaryOperator {
    override val left = OperatorExpression(ctx.operator_expression(0))
    override val right = OperatorExpression(ctx.operator_expression(1))

    override fun invoke(scope: Scope): Any = (left(scope) as Number).toDouble().pow((right(scope) as Number).toDouble())
}

internal class Product(ctx: WynnScriptParser.ProductContext) : BinaryOperator {
    override val left = OperatorExpression(ctx.operator_expression(0))
    override val right = OperatorExpression(ctx.operator_expression(1))
    private val operator = ctx.STAR()?.let { 0 } ?: ctx.SLASH()?.let { 1 } ?: 2

    override fun invoke(scope: Scope): Any? = left(scope)!!.invokeMethod(when (operator) {
        0 -> "times"
        1 -> "div"
        else -> "rem"
    }, right(scope))
}

internal class Sum(ctx: WynnScriptParser.SumContext) : BinaryOperator {
    override val left = OperatorExpression(ctx.operator_expression(0))
    override val right = OperatorExpression(ctx.operator_expression(1))
    private val operator = ctx.DASH() == null

    override fun invoke(scope: Scope): Any? = left(scope)!!.invokeMethod(
        if (operator) "plus" else "minus", right(scope))
}

internal class Comparison(ctx: WynnScriptParser.ComparisonContext) : BinaryOperator {
    override val left = OperatorExpression(ctx.operator_expression(0))
    override val right = OperatorExpression(ctx.operator_expression(1))
    private val operator = ctx.LANGLE()?.let { 0 } ?: ctx.RANGLE()?.let { 1 } ?: ctx.LE()?.let { 2 } ?: ctx.GE()?.let { 3 } ?:
        ctx.IN()?.let { 4 } ?: ctx.IS()?.let { 5 } ?: ctx.NOT_IN()?.let { 6 } ?: 7

    override fun invoke(scope: Scope): Boolean = when (operator) {
        0, 1, 2, 3 -> {
            val comp = left(scope)!!.invokeMethod("compareTo", right(scope)) as Int
            when (operator) {
                0 -> comp < 0
                1 -> comp > 0
                2 -> comp <= 0
                else -> comp >= 0
            }
        }
        4, 6 -> !(right(scope)!!.invokeMethod("contains", left(scope)) as Boolean xor (operator == 4))
        else -> !((right(scope) as Class<*>).isInstance(left(scope)) xor (operator == 5))
    }
}

internal class Equality(ctx: WynnScriptParser.EqualityContext) : BinaryOperator {
    override val left = OperatorExpression(ctx.operator_expression(0))
    override val right = OperatorExpression(ctx.operator_expression(1))
    private val operator = ctx.NEQ() == null

    override fun invoke(scope: Scope): Boolean {
        return !((left(scope) ?: return right(scope) == null).invokeMethod("equals", right(scope)) as Boolean xor operator)
    }
}

internal class And(ctx: WynnScriptParser.AndContext) : BinaryOperator {
    override val left = OperatorExpression(ctx.operator_expression(0))
    override val right = OperatorExpression(ctx.operator_expression(1))

    override fun invoke(scope: Scope): Boolean =
        left(scope).isTrue() && right(scope).isTrue()
}

internal class Or(ctx: WynnScriptParser.OrContext) : BinaryOperator {
    override val left = OperatorExpression(ctx.operator_expression(0))
    override val right = OperatorExpression(ctx.operator_expression(1))

    override fun invoke(scope: Scope): Boolean =
        left(scope).isTrue() || right(scope).isTrue()
}

internal class Conditional(ctx: WynnScriptParser.ConditionalContext) : TernaryOperator {
    override val left = OperatorExpression(ctx.operator_expression(0))
    override val center = OperatorExpression(ctx.operator_expression(1))
    override val right = OperatorExpression(ctx.operator_expression(2))

    override fun invoke(scope: Scope): Any? =
        if (left(scope).isTrue()) center(scope) else right(scope)
}

internal class Assign(ctx: WynnScriptParser.AssignContext) : BinaryOperator {
    override val left = Name(ctx.id().text!!)
    override val right = OperatorExpression(ctx.operator_expression())
    private val operator = assignOperator(ctx.assign_operator())

    override fun invoke(scope: Scope): Any? {
        val prev = if (operator > 0) left(scope) else null
        var v = right(scope)
        v = applyAssignOperator(operator, prev, v)
        scope.change(left.name, v)
        return v
    }
}

internal class Spread(ctx: WynnScriptParser.SpreadContext) : UnaryOperator {
    override val value = OperatorExpression(ctx.operator_expression())

    override fun invoke(scope: Scope): Any? {
        throw NotImplementedError()
    }
}

fun assignOperator(ctx: WynnScriptParser.Assign_operatorContext) =
    ctx.EQ()?.let { 0 } ?: ctx.PLUS_EQ()?.let { 1 } ?: ctx.MINUS_EQ()?.let { 2 } ?: ctx.TIMES_EQ()?.let { 3 } ?:
    ctx.DIV_EQ()?.let { 4 } ?: ctx.MOD_EQ()?.let { 5 } ?: 6

fun applyAssignOperator(operator: Int, prev: Any?, v: Any?) = when (operator) {
    1 -> prev!!.invokeMethod("plus", v)
    2 -> prev!!.invokeMethod("minus", v)
    3 -> prev!!.invokeMethod("times", v)
    4 -> prev!!.invokeMethod("div", v)
    5 -> prev!!.invokeMethod("rem", v)
    6 -> prev!!.invokeMethod("pow", v)
    else -> v
}