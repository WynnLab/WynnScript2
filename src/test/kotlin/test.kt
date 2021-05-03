import com.wynnlab.wynnscript.WynnScript
import com.wynnlab.wynnscript.antlr.WynnScriptLexer
import com.wynnlab.wynnscript.antlr.WynnScriptParser
import com.wynnlab.wynnscript.ast.Call
import com.wynnlab.wynnscript.ast.Literal
import com.wynnlab.wynnscript.ast.Name
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

@Test
fun main() {
    val int = "1"
    val float = "1f"
    val double = "1.0"
    val long = "1234567890123"
    val exponent = "1e-4"
    val hex = "0xffe25"
    val bin = "0b010101"

    val string = """"Hi!""""
    val sqString = "'Single Quote'"

    for(s in listOf(int, float, double, long, exponent, hex, bin, string, sqString)) {

        val lexer = WynnScriptLexer(CharStreams.fromString(s))
        val parser = WynnScriptParser(CommonTokenStream(lexer))

        val literal = Literal(parser.literal())

        println(literal.value?.let { "${it::class.simpleName}: $it" })
    }
}

/*@Test
fun `test basic mob spell script`() {
    val script = WynnScript("""
        # MobSpell
        
        function tick(t, caster, target) {
            caster.setVelocity((target.location - caster.location).toVector());
            return true;
        }
    """.trimIndent())

    val ast = script.compile()

    assertEquals(ast.header, "MobSpell")

    assert(ast.functions.size == 1)

    with(ast.functions[0]) {
        assertEquals(name, "tick")
        assertEquals(parameters, listOf("t", "caster", "target"))
        assert(statements.size == 2)

        with(statements[0]) {
            assert(this is Call)
            this as Call

            assertEquals(left, Name("caster"))

        }
    }
}*/