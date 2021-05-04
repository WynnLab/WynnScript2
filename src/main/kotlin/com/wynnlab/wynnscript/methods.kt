package com.wynnlab.wynnscript

val methods = hashMapOf("plus" to Number::plus, "minus" to Number::minus, "times" to Number::times,
    "div" to Number::div, "rem" to Number::rem, "compareTo" to Number::compareTo, "equals" to Number::equals)

// Generated code

fun Number.plus(other: Number): Number {
    if (this is Double) return plus(other.toDouble())
    if (other is Double) return toDouble().plus(other)
    if (this is Long) return plus(other.toLong())
    if (other is Long) return toLong().plus(other)
    return toInt().plus(other.toInt())
}

fun Number.minus(other: Number): Number {
    if (this is Double) return minus(other.toDouble())
    if (other is Double) return toDouble().minus(other)
    if (this is Long) return minus(other.toLong())
    if (other is Long) return toLong().minus(other)
    return toInt().minus(other.toInt())
}

fun Number.times(other: Number): Number {
    if (this is Double) return times(other.toDouble())
    if (other is Double) return toDouble().times(other)
    if (this is Long) return times(other.toLong())
    if (other is Long) return toLong().times(other)
    return toInt().times(other.toInt())
}

fun Number.div(other: Number): Number {
    if (this is Double) return div(other.toDouble())
    if (other is Double) return toDouble().div(other)
    if (this is Long) return div(other.toLong())
    if (other is Long) return toLong().div(other)
    return toInt().div(other.toInt())
}

fun Number.rem(other: Number): Number {
    if (this is Double) return rem(other.toDouble())
    if (other is Double) return toDouble().rem(other)
    if (this is Long) return rem(other.toLong())
    if (other is Long) return toLong().rem(other)
    return toInt().rem(other.toInt())
}

fun Number.compareTo(other: Number): Number {
    if (this is Double) return compareTo(other.toDouble())
    if (other is Double) return toDouble().compareTo(other)
    if (this is Long) return compareTo(other.toLong())
    if (other is Long) return toLong().compareTo(other)
    return toInt().compareTo(other.toInt())
}