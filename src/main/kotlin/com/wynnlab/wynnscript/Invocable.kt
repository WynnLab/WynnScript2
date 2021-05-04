package com.wynnlab.wynnscript

fun interface Invocable {
    operator fun invoke(scope: Scope, vararg args: Any?): Any?
}