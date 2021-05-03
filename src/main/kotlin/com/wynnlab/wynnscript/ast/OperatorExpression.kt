package com.wynnlab.wynnscript.ast

import com.wynnlab.wynnscript.WynnScriptParseException
import com.wynnlab.wynnscript.antlr.WynnScriptParser

internal interface OperatorExpression : Expression {
    companion object {
        operator fun invoke(ctx: WynnScriptParser.Operator_expressionContext): Expression = when(ctx) {
            is WynnScriptParser.AccessContext -> Access(ctx)
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

internal abstract class WithArgs(ctx: WynnScriptParser.ArgsContext?) : OperatorExpression {
    abstract val left: Expression
    val args: List<Expression> = ctx?.expression()?.map { Expression(it) } ?: emptyList()
}

internal interface Access : OperatorExpression {
    companion object {
        operator fun invoke(ctx: WynnScriptParser.AccessContext) =
            ctx.DOT()?.let { Call(ctx) } ?:
            ctx.LSQUARE()?.let { Index(ctx) } ?:
            Invocation(ctx)
    }
}

internal class Call(ctx: WynnScriptParser.AccessContext) : Access, BinaryOperator {
    override val left = OperatorExpression(ctx.operator_expression(0))
    override val right = OperatorExpression(ctx.operator_expression(1))
}

internal class Index(ctx: WynnScriptParser.AccessContext) : WithArgs(ctx.args()), Access {
    override val left = OperatorExpression(ctx.operator_expression(0))
}

internal class Invocation(ctx: WynnScriptParser.AccessContext) : WithArgs(ctx.args()), Access {
    override val left = OperatorExpression(ctx.operator_expression(0))
}

internal class Postfix(ctx: WynnScriptParser.PostfixContext) : UnaryOperator {
    override val value = OperatorExpression(ctx.operator_expression())
    val operator = if (ctx.DEC() == null) 0 else 1
}

internal class Prefix(ctx: WynnScriptParser.PrefixContext) : UnaryOperator {
    override val value = OperatorExpression(ctx.operator_expression())
    val operator = ctx.BANG()?.let { 0 } ?: ctx.TILDE()?.let { 1 } ?: ctx.PLUS()?.let { 2 } ?: ctx.DASH()?.let { 3 } ?:
        ctx.INC()?.let { 4 } ?: 5
}

internal class Power(ctx: WynnScriptParser.PowerContext) : BinaryOperator {
    override val left = OperatorExpression(ctx.operator_expression(0))
    override val right = OperatorExpression(ctx.operator_expression(1))
}

internal class Product(ctx: WynnScriptParser.ProductContext) : BinaryOperator {
    override val left = OperatorExpression(ctx.operator_expression(0))
    override val right = OperatorExpression(ctx.operator_expression(1))
    val operator = ctx.STAR()?.let { 0 } ?: ctx.SLASH()?.let { 1 } ?: 2
}

internal class Sum(ctx: WynnScriptParser.SumContext) : BinaryOperator {
    override val left = OperatorExpression(ctx.operator_expression(0))
    override val right = OperatorExpression(ctx.operator_expression(1))
    val operator = if (ctx.DASH() == null) 0 else 1
}

internal class Comparison(ctx: WynnScriptParser.ComparisonContext) : BinaryOperator {
    override val left = OperatorExpression(ctx.operator_expression(0))
    override val right = OperatorExpression(ctx.operator_expression(1))
    val operator = ctx.LANGLE()?.let { 0 } ?: ctx.RANGLE()?.let { 1 } ?: ctx.LE()?.let { 2 } ?: ctx.GE()?.let { 3 } ?:
        ctx.IN()?.let { 4 } ?: ctx.IS()?.let { 5 } ?: ctx.NOT_IN()?.let { 6 } ?: 7
}

internal class Equality(ctx: WynnScriptParser.EqualityContext) : BinaryOperator {
    override val left = OperatorExpression(ctx.operator_expression(0))
    override val right = OperatorExpression(ctx.operator_expression(1))
    val operator = if (ctx.NEQ() == null) 0 else 1
}

internal class And(ctx: WynnScriptParser.AndContext) : BinaryOperator {
    override val left = OperatorExpression(ctx.operator_expression(0))
    override val right = OperatorExpression(ctx.operator_expression(1))
}

internal class Or(ctx: WynnScriptParser.OrContext) : BinaryOperator {
    override val left = OperatorExpression(ctx.operator_expression(0))
    override val right = OperatorExpression(ctx.operator_expression(1))
}

internal class Conditional(ctx: WynnScriptParser.ConditionalContext) : TernaryOperator {
    override val left = OperatorExpression(ctx.operator_expression(0))
    override val center = OperatorExpression(ctx.operator_expression(1))
    override val right = OperatorExpression(ctx.operator_expression(2))
}

internal class Assign(ctx: WynnScriptParser.AssignContext) : BinaryOperator {
    override val left = OperatorExpression(ctx.operator_expression(0))
    override val right = OperatorExpression(ctx.operator_expression(1))
    val operator = ctx.PLUS_EQ()?.let { 0 } ?: ctx.MINUS_EQ()?.let { 1 } ?: ctx.TIMES_EQ()?.let { 2 } ?:
        ctx.DIV_EQ()?.let { 3 } ?: ctx.MOD_EQ()?.let { 4 } ?: 5
}

internal class Spread(ctx: WynnScriptParser.SpreadContext) : UnaryOperator {
    override val value = OperatorExpression(ctx.operator_expression())
}