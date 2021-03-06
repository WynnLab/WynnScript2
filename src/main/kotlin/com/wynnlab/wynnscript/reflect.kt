package com.wynnlab.wynnscript

import com.wynnlab.wynnscript.ast.isTrue
import java.lang.reflect.Method

fun Any.getMethod(name: String, vararg parameters: Class<*>?): Method {
    val static = this is Class<*>
    val c = if (static) this as Class<*> else this::class.java

    val pc = parameters.size

    var given = 0
    var matched = 0

    var res: Method? = null

    ml@ for (m in c.methods) {
        if (m.name != name) continue@ml

        if (m.parameterCount != pc) continue@ml

        var g = 0 // given
        var md = 0 // matched

        var i = -1
        pl@ for (p in m.parameters) {
            ++i

            val ep = parameters[i] ?: continue@pl
            ++g

            val t = primitiveToWrapper(p.type)

            if (t == ep)
                ++md
            else if (!p.type.isAssignableFrom(ep) && !Number::class.java.isAssignableFrom(t))
                continue@ml
        }

        if (res != null) {
            if (g <= given && md <= matched)
                continue@ml //throw AmbiguousMethodRequested("${c.canonicalName}.$name(${parameters.map { it?.canonicalName }.joinToString()})")
        }

        given = g; matched = md

        res = m
    }

    return res ?: throw NoSuchMethodException("${c.canonicalName}.$name(${parameters.map { it?.canonicalName }.joinToString()})")
}

fun Any.invokeMethod(name: String, vararg args: Any?): Any? {
    return when (this) {
        is Int, is Long, is Double, is Boolean -> binaryNumberMethods[name]?.also { return it(this as Number, args[0] as Number) } ?:
            unaryNumberMethods[name]?.also { return it(this as Number) } ?: unaryBooleanMethods[name]?.also { return it(this.isTrue()) }
        else ->
            getMethod(name, *Array(args.size) { i -> args[i]?.javaClass })
                .invoke(if (this is Class<*>) null else this, *args)
    }
}

fun Any.getField(name: String): Any? {
    val static = this is Class<*>
    //println("$this $static $name")
    val c = if (static) this as Class<*> else this::class.java

    return try {
        c.getField(name).get(if (static) null else this)
    } catch (e: NoSuchFieldException) {
        try {
            c.getMethod("get${name[0].toUpperCase()}${name.substring(1)}")(if (static) null else this)
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