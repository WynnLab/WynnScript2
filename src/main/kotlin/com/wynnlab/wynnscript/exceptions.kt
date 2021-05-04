package com.wynnlab.wynnscript

import org.antlr.v4.runtime.ParserRuleContext

class WynnScriptParseException(ctx: ParserRuleContext) : Exception("Exception at parsing ${ctx::class.simpleName}")

class NoSuchFunctionException(name: String, args: Int) : Exception("No such function: $name with $args args")

class NameNotDefinedException(name: String) : Exception("Name not defined: $name")