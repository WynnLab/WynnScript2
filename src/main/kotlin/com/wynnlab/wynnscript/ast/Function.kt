package com.wynnlab.wynnscript.ast

import com.wynnlab.wynnscript.Invocable
import com.wynnlab.wynnscript.Scope
import com.wynnlab.wynnscript.antlr.WynnScriptParser

internal class Function(ctx: WynnScriptParser.FunctionContext) : Invocable {
    val name = ctx.id().text!!
    val parameters = ctx.parameters()?.id()?.map { it.text!! } ?: emptyList()
    val statements = Statement.list(ctx.statements())

    override operator fun invoke(scope: Scope, vararg args: Any?): Any {
        val locals = Scope(scope)

        parameters.forEachIndexed { i, n ->
            locals.store(n, args[i])
        }

        return statements(locals)
    }
}