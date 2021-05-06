package com.wynnlab.wynnscript.ast

import com.wynnlab.wynnscript.*
import com.wynnlab.wynnscript.antlr.WynnScriptParser

internal interface Access : Expression {
    companion object {
        operator fun invoke(ctx: WynnScriptParser.AccessContext): Access {
            val op = ctx.operation()
            return when {
                op.LPAREN() != null -> if (ctx.access() != null) MethodCall(ctx) else FunctionCall(ctx)
                op.expression() != null -> SetIndex(ctx)
                op.LSQUARE().isNotEmpty() -> GetIndex(ctx)
                else -> GetField(ctx)
            }
        }

        fun accessOrPEx(ctx: WynnScriptParser.AccessContext) =
            ctx.primary_expression()?.let { PrimaryExpression(it) } ?:
            ctx.THIS()?.let { Name("this") } ?:
            if (ctx.access() == null) ctx.operation().let { op -> when {
                op.LPAREN() != null -> FunctionCall(ctx)
                op.LSQUARE().isNotEmpty() -> GetIndex(ctx)
                else -> Name(op.simple_id().text)
            } } else Access(ctx)
    }
}

internal class GetField(ctx: WynnScriptParser.AccessContext) : Access {
    private val caller = Access.accessOrPEx(ctx.access())
    private val name = ctx.operation().simple_id().text!!
    private val thiz = caller is Data

    override fun invoke(scope: Scope): Any? {
        val c = if (thiz) scope.lookup("this") else caller(scope)

        if (thiz) return (c as Map<*, *>)[name]

        return c!!.getField(name)
    }
}

internal class SetField(ctx: WynnScriptParser.Field_setContext) : Access {
    private val caller = Access.accessOrPEx(ctx.access())
    private val name = ctx.simple_id().text!!
    private val value = Expression(ctx.expression())
    private val operator = assignOperator(ctx.assign_operator())
    private val thiz = caller is Data

    @Suppress("unchecked_cast")
    override fun invoke(scope: Scope): Any? {
        val c = if (thiz) scope.lookup("this") else caller(scope)
        var v = value(scope)

        val prev = if (operator > 0) (if (thiz) (c as Map<*, *>)[name] else c!!.getField(name)) else null

        v = applyAssignOperator(operator, prev, v)

        if (thiz)
            (c as MutableMap<String, Any?>)[name] = v
        else
            c!!.setField(name, v)

        return v
    }
}

internal class FunctionCall(ctx: WynnScriptParser.AccessContext) : Access, WithArgs(ctx.operation().args().getOrNull(0)) {
    private val name = ctx.operation().simple_id().text!!

    override fun invoke(scope: Scope): Any? =
        (scope.lookup(name) as Invocable)(scope, *args(scope))
}

internal class MethodCall(ctx: WynnScriptParser.AccessContext) : Access, WithArgs(ctx.operation().args().getOrNull(0)) {
    private val caller = Access.accessOrPEx(ctx.access())
    private val name = ctx.operation().simple_id().text!!

    override fun invoke(scope: Scope): Any? =
        caller(scope)!!.invokeMethod(name, *args(scope))
}

internal class GetIndex(ctx: WynnScriptParser.AccessContext) : Access, WithMultiArgs(ctx.operation().args()) {
    private val caller = ctx.access()?.let { Access.accessOrPEx(it) }
    private val name = ctx.operation().simple_id().text!!

    override fun invoke(scope: Scope): Any? {
        val c = caller?.invoke(scope)
        val f = if (c != null) c.getField(name) else scope.lookup(name)
        var r = f
        args.forEach {
            r = r!!.invokeMethod("get", *it.args(scope))
        }
        return r
    }
}

internal class SetIndex(ctx: WynnScriptParser.AccessContext) : Access, WithMultiArgs(ctx.operation().args()) {
    private val caller = ctx.access()?.let { Access.accessOrPEx(it) }
    private val name = ctx.operation().simple_id().text!!
    private val value = Expression(ctx.operation().expression())
    private val operator = assignOperator(ctx.operation().assign_operator())

    override fun invoke(scope: Scope): Any? {
        val c = caller?.invoke(scope)
        val f = if (c != null) c.getField(name) else scope.lookup(name)
        var v = value(scope)

        var r = f
        for (it in args) {
            if (it === args.last()) break
            r = r!!.invokeMethod("get", *it.args(scope))
        }

        val lastArgs = args.last().let { a -> Array(a.size) { i -> a[i](scope) } }
        val prev = if (operator > 0) r!!.invokeMethod("get", *lastArgs) else null

        v = applyAssignOperator(operator, prev, v)

        r!!.invokeMethod("set", *lastArgs, v)

        return v
    }
}

internal open class WithArgs(ctx: WynnScriptParser.ArgsContext?) {
    protected val args: List<Expression> = ctx?.expression()?.map { Expression(it) } ?: emptyList()

    fun args(scope: Scope) = Array(args.size) { i -> args[i](scope) }
}

internal open class WithMultiArgs(ctx: List<WynnScriptParser.ArgsContext?>) {
    protected val args: List<List<Expression>> = ctx.map { c -> c?.expression()?.map { Expression(it) } ?: emptyList() }

    fun List<Expression>.args(scope: Scope) = Array(size) { i -> get(i)(scope) }
}