import com.wynnlab.wynnscript.*
import org.junit.jupiter.api.Test
import java.lang.IllegalArgumentException

@Test
fun main() {
    val script = WynnScript("""
        # Test
        
        function main(a, u, v) {
            out.println("Hi");
        }
    """.trimIndent())

    val ast = script.compile()

    ast["println"] = Invocable { _, args -> if (args.size != 1) throw IllegalArgumentException() else println(args[0]) }
    ast["out"] = System.out

    println("==========")

    ast.invoke("main", A(), U(), 0)
/*    for (i in listOf("plus", "minus", "times", "div", "rem")) {
        println("""fun Number.$i(other: Number): Number {
    if (this is Double) return $i(other.toDouble())
    if (other is Double) return toDouble().$i(other)
    if (this is Long) return $i(other.toLong())
    if (other is Long) return toLong().$i(other)
    return toInt().$i(other.toInt())
}
""")
    }*/
}

class A {
    fun i() = "i"
    var b: Any = B()
    fun b() = b

    fun get(u: U) = u
    fun set(u: U, i: Int) = i

    val u = U()
}

class B {
    val c = "c"
    fun c() = c
}

class U {
    val i = "I"
    fun i() = i

    fun get(i: Double) = i
}

/*    /*val int = "1"
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
    }*/

    val a = A(5)

    println(a.setField("a", 2))
}*/

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