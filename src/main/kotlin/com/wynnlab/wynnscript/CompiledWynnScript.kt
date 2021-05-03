package com.wynnlab.wynnscript

import com.wynnlab.wynnscript.antlr.WynnScriptParser
import com.wynnlab.wynnscript.ast.Function

class CompiledWynnScript(parseTree: WynnScriptParser.WynnScriptContext) {
    internal val header: String = parseTree.header().id().text
    internal val functions: List<Function> = parseTree.function().map { Function(it) }
}