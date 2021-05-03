package com.wynnlab.wynnscript.ast

import com.wynnlab.wynnscript.WynnScriptParseException
import com.wynnlab.wynnscript.antlr.WynnScriptParser
import java.lang.NumberFormatException

internal interface Expression : Statement {
    companion object {
        operator fun invoke(ctx: WynnScriptParser.ExpressionContext) = OperatorExpression(ctx.operator_expression())
    }
}

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
}

internal data class Name(val name: String) : PrimaryExpression