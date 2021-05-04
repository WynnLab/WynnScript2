package com.wynnlab.wynnscript.ast

import com.wynnlab.wynnscript.Scope
import com.wynnlab.wynnscript.WynnScriptParseException
import com.wynnlab.wynnscript.antlr.WynnScriptParser
import java.lang.NumberFormatException

internal interface Expression : Statement {
    companion object {
        operator fun invoke(ctx: WynnScriptParser.ExpressionContext) = when (ctx) {
            is WynnScriptParser.OperatorContext -> OperatorExpression(ctx.operator_expression())
            is WynnScriptParser.GetFieldContext -> GetField(ctx.field_get())
            is WynnScriptParser.SetFieldContext -> SetField(ctx.field_set())
            is WynnScriptParser.InvokeContext -> FunctionCall(ctx.function_call())
            is WynnScriptParser.MethodContext -> MethodCall(ctx.method_call())
            is WynnScriptParser.GetIndexContext -> GetIndex(ctx.index_get())
            is WynnScriptParser.SetIndexContext -> SetIndex(ctx.index_set())
            else -> throw WynnScriptParseException(ctx)
        }
    }
}

fun Any?.isTrue() = this == true || this != false && this.hashCode() != 0

internal interface PrimaryExpression : Expression {
    companion object {
        operator fun invoke(ctx: WynnScriptParser.Primary_expressionContext): Expression = when (ctx) {
            is WynnScriptParser.ParenContext -> Expression(ctx.expression())
            is WynnScriptParser.LitContext -> Literal(ctx.literal())
            is WynnScriptParser.NameContext -> Name(ctx.text!!)
            else -> throw WynnScriptParseException(ctx)
        }
    }
}

internal class Literal(ctx: WynnScriptParser.LiteralContext) : PrimaryExpression {
    val value = ctx.StringLiteral()?.let { getString(it.text) } ?:
        ctx.NumberLiteral()?.let { getNumber(it.text) } ?:
        ctx.HexLiteral()?.text?.substring(2)?.toLong(16) ?:
        ctx.BinLiteral()?.text?.substring(2)?.toInt(2) ?:
        ctx.TRUE()?.let { true } ?:
        ctx.FALSE()?.let { false }

    private fun getString(text: String) = text.substring(1, text.length - 1)

    private fun getNumber(text: String) = (text.toIntOrNull() ?: text.toLongOrNull() ?: text.toDoubleOrNull() ?:
        throw NumberFormatException(text)) as Number

    override fun invoke(scope: Scope): Any? = value
}

internal data class Name(val name: String) : PrimaryExpression {
    override fun invoke(scope: Scope): Any? = scope.lookup(name)
}