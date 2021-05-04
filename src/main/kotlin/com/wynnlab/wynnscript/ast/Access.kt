package com.wynnlab.wynnscript.ast

import com.wynnlab.wynnscript.*
import com.wynnlab.wynnscript.antlr.WynnScriptParser

internal class GetField(ctx: WynnScriptParser.Field_getContext) : Expression {
    val obj = try {
        GetField(ctx.field_get())
    } catch (e: NullPointerException) {
        Name(ctx.field_get().text!!)
    }
    val name = ctx.id().text!!

    override fun invoke(scope: Scope): Any? = obj(scope)!!.getField(name)
}

internal class SetField(ctx: WynnScriptParser.Field_setContext) : Expression {
    private val field = GetField(ctx.field_get())
    private val value = Expression(ctx.expression())
    private val operator = assignOperator(ctx.assign_operator())

    override fun invoke(scope: Scope): Any? {
        val o = field.obj(scope)!!
        var v = value(scope)
        val prev = if (operator > 0) o.getField(field.name) else null
        v = applyAssignOperator(operator, prev, v)
        o.setField(field.name, v)
        return v
    }
}

internal class FunctionCall(ctx: WynnScriptParser.Function_callContext) : Expression, WithArgs(ctx.args()) {
    private val name = ctx.id().text!!

    override fun invoke(scope: Scope): Any? {
        val globals = scope.root
        return (globals.lookup(name) as Invocable).invoke(Scope(globals), *Array(args.size) { i -> args[i](scope) })
    }
}

internal class MethodCall(ctx: WynnScriptParser.Method_callContext) : Expression, WithArgs(ctx.args()) {
    private val method = GetField(ctx.field_get())

    override fun invoke(scope: Scope): Any? =
        method.obj(scope)!!.invokeMethod(method.name, *Array(args.size) { i -> args[i](scope) })
}

internal class GetIndex(ctx: WynnScriptParser.Index_getContext) : Expression, WithArgs(ctx.args()) {
    val obj = try {
        GetField(ctx.field_get()).obj
    } catch (e: NullPointerException) {
        Name(ctx.field_get().text!!)
    }

    override fun invoke(scope: Scope): Any? =
        obj(scope)!!.invokeMethod("get", *Array(args.size) { i -> args[i](scope) })
}

internal class SetIndex(ctx: WynnScriptParser.Index_setContext) : Expression {
    private val obj = GetIndex(ctx.index_get())
    private val value = Expression(ctx.expression())
    private val operator = assignOperator(ctx.assign_operator())

    override fun invoke(scope: Scope): Any? {
        val o = obj.obj(scope)!!
        val args = Array(obj.args.size) { i -> obj.args[i](scope) }
        var v = value(scope)
        val prev = if (operator > 0) o.invokeMethod("get", *args) else null
        v = applyAssignOperator(operator, prev, v)
        o.invokeMethod("set", *args, v)
        return v
    }
}

internal open class WithArgs(ctx: WynnScriptParser.ArgsContext?) {
    val args: List<Expression> = ctx?.expression()?.map { Expression(it) } ?: emptyList()
}