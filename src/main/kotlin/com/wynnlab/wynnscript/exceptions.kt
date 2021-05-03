package com.wynnlab.wynnscript

import org.antlr.v4.runtime.ParserRuleContext

class WynnScriptParseException(ctx: ParserRuleContext) : Exception("Exception at parsing ${ctx::class.simpleName}")