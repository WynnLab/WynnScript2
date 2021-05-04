package com.wynnlab.wynnscript

class Scope(private val parent: Scope? = null) {
    private val names = hashMapOf<String, Any?>()

    fun store(name: String, value: Any?) {
        names[name] = value
    }

    fun lookup(name: String): Any? = when {
        names.containsKey(name) -> names[name]
        parent != null -> parent.lookup(name)
        else -> throw NameNotDefinedException(name)
    }

    fun remove(name: String) {
        if (names.containsKey(name))
            names.remove(name)
        else
            throw NameNotDefinedException(name)
    }

    fun change(name: String, value: Any?): Unit = when {
        names.containsKey(name) -> names[name] = value
        parent != null -> parent.change(name, value)
        else -> throw NameNotDefinedException(name)
    }

    val root: Scope get() = parent?.root ?: this
}