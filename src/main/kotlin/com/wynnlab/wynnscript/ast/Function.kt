package com.wynnlab.wynnscript.ast

import com.wynnlab.wynnscript.antlr.WynnScriptParser

internal class Function(ctx: WynnScriptParser.FunctionContext) {
    val name = ctx.id().text!!
    val parameters = ctx.parameters()?.id()?.map { it.text!! } ?: emptyList()
    val statements = Statement.list(ctx.statements())
}