package com.wynnlab.wynnscript

import com.wynnlab.wynnscript.antlr.WynnScriptLexer
import com.wynnlab.wynnscript.antlr.WynnScriptParser
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import java.io.InputStream
import java.io.Reader

class WynnScript(
    private val charStream: CharStream
) {
    constructor(string: String) : this(CharStreams.fromString(string))
    constructor(stream: InputStream) : this(CharStreams.fromStream(stream))
    constructor(reader: Reader) : this(CharStreams.fromReader(reader))

    private val lexer = WynnScriptLexer(charStream)
    private val parser = WynnScriptParser(CommonTokenStream(lexer))

    fun compile() = CompiledWynnScript(parser.wynnScript())
}