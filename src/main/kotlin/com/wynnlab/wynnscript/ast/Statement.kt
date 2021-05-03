package com.wynnlab.wynnscript.ast

import com.wynnlab.wynnscript.WynnScriptParseException
import com.wynnlab.wynnscript.antlr.WynnScriptParser

internal interface Statement {
    companion object {
        fun list(ctx: WynnScriptParser.StatementsContext) = ctx.statement().map { Statement(it) }

        operator fun invoke(ctx: WynnScriptParser.StatementContext): Statement = when (ctx) {
            is WynnScriptParser.VarContext -> VarDeclaration(ctx.var_declaration())
            is WynnScriptParser.IfContext -> IfStatement(ctx.if_statement())
            is WynnScriptParser.WhileContext -> WhileStatement(ctx.while_statement())
            is WynnScriptParser.ForContext -> ForStatement(ctx.for_statement())
            is WynnScriptParser.ControlContext -> ControlStatement(ctx.control_statement())
            is WynnScriptParser.ExContext -> Expression(ctx.expression())
            else -> throw WynnScriptParseException(ctx)
        }
    }
}

internal class VarDeclaration(ctx: WynnScriptParser.Var_declarationContext) : Statement {
    val name = ctx.id().text!!
    val value = Expression(ctx.expression())
}

internal class IfStatement(ctx: WynnScriptParser.If_statementContext) : Statement {
    val conditions = ctx.expression().map { Expression(it) }
    val bodies = ctx.statements().map { Statement.list(it) }
}

internal class WhileStatement(ctx: WynnScriptParser.While_statementContext) : Statement {
    val condition = Expression(ctx.expression())
    val body = Statement.list(ctx.statements())
    val bodyFirst = ctx.DO() != null
}

internal class ForStatement(ctx: WynnScriptParser.For_statementContext) : Statement {
    val varName = ctx.id().text!!
    val iterable = Expression(ctx.expression())
    val body = Statement.list(ctx.statements())
}

internal class ControlStatement(ctx: WynnScriptParser.Control_statementContext) : Statement {
    val type = ctx.BREAK()?.let { 0 } ?: ctx.CONTINUE()?.let { 1 } ?: ctx.RETURN()?.let { 2 } ?: 3
    val value = ctx.expression()?.let { Expression(it) }
}