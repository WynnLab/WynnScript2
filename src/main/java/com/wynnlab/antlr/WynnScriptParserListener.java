// Generated from D:/IdeaProjects/WynnScript2/src/main/antlr\WynnScriptParser.g4 by ANTLR 4.9.1
package com.wynnlab.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link WynnScriptParser}.
 */
public interface WynnScriptParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link WynnScriptParser#wynnScript}.
	 * @param ctx the parse tree
	 */
	void enterWynnScript(WynnScriptParser.WynnScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link WynnScriptParser#wynnScript}.
	 * @param ctx the parse tree
	 */
	void exitWynnScript(WynnScriptParser.WynnScriptContext ctx);
}