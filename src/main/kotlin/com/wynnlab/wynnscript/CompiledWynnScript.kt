package com.wynnlab.wynnscript

import com.wynnlab.wynnscript.antlr.WynnScriptParser
import com.wynnlab.wynnscript.ast.Function

class CompiledWynnScript(parseTree: WynnScriptParser.WynnScriptContext) {
    private val header: String = parseTree.header().id().text
    private val functions: Map<String, Invocable> = parseTree.function().asSequence().map { Function(it) }
        .associateBy { it.name }

    private val scope = Scope()
    init {
        functions.forEach { (k, v) -> scope.store(k, v) }
    }

    private val data: HashMap<String, Any?> = hashMapOf()
    init {
        scope.store("this", data)
    }

    operator fun invoke(name: String, vararg args: Any?): Any? {
        val function = functions[name] ?: throw NoSuchFunctionException(name, args.size)

        return function(scope, *args)
    }

    operator fun set(name: String, value: Any?) {
        scope.store(name, value)
    }

    operator fun get(name: String) {
        scope.lookup(name)
    }

    fun setData(key: String, value: Any?) {
        data[key] = value
    }

    fun getData(key: String) = data[key]

    fun resetVars() {
        scope.clear()
    }

    fun resetData() {
        data.clear()
    }

    fun reset() {
        resetVars()
        resetData()
    }
}