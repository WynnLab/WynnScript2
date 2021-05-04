package com.wynnlab.wynnscript

import java.lang.reflect.Method

fun Any.getMethod(name: String, vararg parameters: Class<*>?): Method {
    val c = this::class.java

    val pc = parameters.size

    var res: Method? = null

    ml@ for (m in c.methods) {
        if (m.name != name) continue@ml

        if (m.parameterCount != pc) continue@ml

        var i = -1
        pl@ for (p in m.parameters) {
            ++i

            val ep = parameters[i] ?: continue@pl

            if (!p.type.isAssignableFrom(ep) && primitiveToWrapper(p.type) != ep) continue@ml
        }

        if (res != null) {
            throw AmbiguousMethodRequested("${c.canonicalName}.$name(${parameters.map { it?.canonicalName }.joinToString()})")
        }

        res = m
    }

    return res ?: throw NoSuchMethodException("${c.canonicalName}.$name(${parameters.map { it?.canonicalName }.joinToString()})")
}

fun Any.invokeMethod(name: String, vararg args: Any?): Any? = when (this) {
    is Int, is Long, is Double -> methods[name]?.invoke(this as Number, args[0] as Number)
    else -> getMethod(name, *Array(args.size) { i -> args[i]?.javaClass }).invoke(this, *args)
}

fun Any.getField(name: String): Any? {
    val c = this::class.java

    return try {
        c.getField(name).get(this)
    } catch (e: NoSuchFieldException) {
        try {
            c.getMethod("get${name[0].toUpperCase()}${name.substring(1)}")(this)
        } catch (_: NoSuchMethodException) {
            throw e
        }
    }
}

fun Any.setField(name: String, value: Any?, valueClass: Class<*>? = value?.javaClass): Any? {
    val c = this::class.java

    try {
        c.getField(name).set(this, value)
    } catch (e: NoSuchFieldException) {
        try {
            getMethod("set${name[0].toUpperCase()}${name.substring(1)}", valueClass)(this, value)
        } catch (_: NoSuchMethodException) {
            try {
                val getter = c.getMethod("get${name[0].toUpperCase()}${name.substring(1)}")
                throw IllegalAccessException("Can not set final ${getter.returnType} field ${c.name}.$name to ${valueClass?.name}")
            } catch (_: NoSuchMethodException) {
                throw e
            }
        }
    }

    return value
}

fun primitiveToWrapper(clazz: Class<*>) = when (clazz) {
    Byte::class.java -> java.lang.Byte::class.java
    Short::class.java -> java.lang.Short::class.java
    Int::class.java -> Integer::class.java
    Long::class.java -> java.lang.Long::class.java
    Float::class.java -> java.lang.Float::class.java
    Double::class.java -> java.lang.Double::class.java
    Boolean::class.java -> java.lang.Boolean::class.java
    Char::class.java -> Character::class.java
    else -> clazz
}

class AmbiguousMethodRequested(name: String) : Exception(name)