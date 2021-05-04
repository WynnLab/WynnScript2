package com.wynnlab.wynnscript.ast

import com.wynnlab.wynnscript.Scope
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
            is WynnScriptParser.EmptyContext -> PASS
            else -> throw WynnScriptParseException(ctx)
        }
    }

    operator fun invoke(scope: Scope): Any?
}

internal operator fun List<Statement>.invoke(scope: Scope) {
    forEach { it(scope) }
}

internal class VarDeclaration(ctx: WynnScriptParser.Var_declarationContext) : Statement {
    private val name = ctx.simple_id().text!!
    private val value = Expression(ctx.expression())

    override fun invoke(scope: Scope) {
        scope.store(name, value(scope))
    }
}

internal class IfStatement(ctx: WynnScriptParser.If_statementContext) : Statement {
    private val conditions = ctx.expression().map { Expression(it) }
    private val bodies = ctx.statements().map { Statement.list(it) }

    override fun invoke(scope: Scope) {
        var met = false

        for ((i, c) in conditions.withIndex()) {
            if (c(scope).isTrue()) {
                bodies[i](Scope(scope))
                met = true
            }
        }

        if (!met && bodies.size > conditions.size) {
            bodies[bodies.size - 1](Scope(scope))
        }
    }
}

internal class WhileStatement(ctx: WynnScriptParser.While_statementContext) : Statement {
    private val condition = Expression(ctx.expression())
    private val body = Statement.list(ctx.statements())
    private val bodyFirst = ctx.DO() != null

    override fun invoke(scope: Scope) = if (bodyFirst) {
        do {
            try {
                body(Scope(scope))
            } catch (_: Break) {
                break
            } catch (_: Continue) {
                continue
            }
        } while (condition(scope).isTrue())
    } else {
        while (condition(scope).isTrue())
            try {
                body(Scope(scope))
            } catch (_: Break) {
                break
            } catch (_: Continue) {
                continue
            }
    }
}

internal class ForStatement(ctx: WynnScriptParser.For_statementContext) : Statement {
    private val varName = ctx.simple_id().text!!
    private val iterable = Expression(ctx.expression())
    private val body = Statement.list(ctx.statements())

    override fun invoke(scope: Scope) {
        val iterator = iterable(scope) as Iterable<*>

        for (variable in iterator)
            try {
                body(Scope(scope).apply { store(varName, variable) })
            } catch (_: Break) {
                break
            } catch (_: Continue) {
                continue
            }
    }
}

internal class ControlStatement(ctx: WynnScriptParser.Control_statementContext) : Statement {
    private val type = ctx.BREAK()?.let { 0 } ?: ctx.CONTINUE()?.let { 1 } ?: ctx.RETURN()?.let { 2 } ?: 3
    private val value = ctx.expression()?.let { Expression(it) }

    override fun invoke(scope: Scope) = throw when (type) {
        0 -> Break
        1 -> Continue
        2 -> Return(valueOrUnit(scope))
        3 -> Yield(valueOrUnit(scope))
        else -> NotImplementedError()
    }

    private fun valueOrUnit(scope: Scope) = if (value == null) Unit else value.invoke(scope)
}

internal object PASS : Statement {
    override fun invoke(scope: Scope) {}
}

private object Break : Exception()
private object Continue : Exception()
internal class Return(val value: Any?) : Exception()
private class Yield(val value: Any?) : Exception()