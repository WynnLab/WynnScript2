// Generated from D:/IdeaProjects/WynnScript2/src/main/antlr\WynnScriptParser.g4 by ANTLR 4.9.1
package com.wynnlab.wynnscript.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WynnScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NL=1, Space=2, LineComment=3, BlockComment=4, SEMI=5, COLON=6, COMMA=7, 
		DOT=8, COLONCOLON=9, ELLIPSIS=10, PLUS=11, DASH=12, STAR=13, POW=14, SLASH=15, 
		PERCENT=16, LPAREN=17, RPAREN=18, LSQUARE=19, RSQUARE=20, LCURL=21, RCURL=22, 
		LANGLE=23, RANGLE=24, EQ=25, EQEQ=26, NEQ=27, LE=28, GE=29, AND=30, OR=31, 
		BANG=32, HASH=33, TILDE=34, QUEST=35, AT=36, PLUS_EQ=37, MINUS_EQ=38, 
		TIMES_EQ=39, POW_EQ=40, DIV_EQ=41, MOD_EQ=42, INC=43, DEC=44, FUNCTION=45, 
		VAR=46, IF=47, ELSE=48, WHILE=49, DO=50, FOR=51, IN=52, IS=53, NOT_IN=54, 
		NOT_IS=55, CONTINUE=56, BREAK=57, RETURN=58, YIELD=59, ASYNC=60, AWAIT=61, 
		TRUE=62, FALSE=63, NULL=64, THIS=65, StringLiteral=66, NumberLiteral=67, 
		HexLiteral=68, BinLiteral=69, Identifier=70;
	public static final int
		RULE_wynnScript = 0, RULE_header = 1, RULE_function = 2, RULE_parameters = 3, 
		RULE_statements = 4, RULE_statement = 5, RULE_var_declaration = 6, RULE_if_statement = 7, 
		RULE_while_statement = 8, RULE_for_statement = 9, RULE_control_statement = 10, 
		RULE_expression = 11, RULE_operator_expression = 12, RULE_assign_operator = 13, 
		RULE_field_get = 14, RULE_field_set = 15, RULE_function_call = 16, RULE_method_call = 17, 
		RULE_index_get = 18, RULE_index_set = 19, RULE_args = 20, RULE_primary_expression = 21, 
		RULE_literal = 22, RULE_simple_id = 23, RULE_id = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"wynnScript", "header", "function", "parameters", "statements", "statement", 
			"var_declaration", "if_statement", "while_statement", "for_statement", 
			"control_statement", "expression", "operator_expression", "assign_operator", 
			"field_get", "field_set", "function_call", "method_call", "index_get", 
			"index_set", "args", "primary_expression", "literal", "simple_id", "id"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "';'", "':'", "','", "'.'", "'::'", "'...'", 
			"'+'", "'-'", "'*'", "'**'", "'/'", "'%'", "'('", "')'", "'['", "']'", 
			"'{'", "'}'", "'<'", "'>'", "'='", "'=='", "'!='", "'<='", "'>='", "'&&'", 
			"'||'", "'!'", "'#'", "'~'", "'?'", "'@'", "'+='", "'-='", "'*='", "'**='", 
			"'/='", "'%='", "'++'", "'--'", "'function'", "'var'", "'if'", "'else'", 
			"'while'", "'do'", "'for'", "'in'", "'is'", "'!in'", "'!is'", "'continue'", 
			"'break'", "'return'", "'yield'", "'async'", "'await'", "'true'", "'false'", 
			"'null'", "'this'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NL", "Space", "LineComment", "BlockComment", "SEMI", "COLON", 
			"COMMA", "DOT", "COLONCOLON", "ELLIPSIS", "PLUS", "DASH", "STAR", "POW", 
			"SLASH", "PERCENT", "LPAREN", "RPAREN", "LSQUARE", "RSQUARE", "LCURL", 
			"RCURL", "LANGLE", "RANGLE", "EQ", "EQEQ", "NEQ", "LE", "GE", "AND", 
			"OR", "BANG", "HASH", "TILDE", "QUEST", "AT", "PLUS_EQ", "MINUS_EQ", 
			"TIMES_EQ", "POW_EQ", "DIV_EQ", "MOD_EQ", "INC", "DEC", "FUNCTION", "VAR", 
			"IF", "ELSE", "WHILE", "DO", "FOR", "IN", "IS", "NOT_IN", "NOT_IS", "CONTINUE", 
			"BREAK", "RETURN", "YIELD", "ASYNC", "AWAIT", "TRUE", "FALSE", "NULL", 
			"THIS", "StringLiteral", "NumberLiteral", "HexLiteral", "BinLiteral", 
			"Identifier"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "WynnScriptParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public WynnScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class WynnScriptContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(WynnScriptParser.EOF, 0); }
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public WynnScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wynnScript; }
	}

	public final WynnScriptContext wynnScript() throws RecognitionException {
		WynnScriptContext _localctx = new WynnScriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_wynnScript);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HASH) {
				{
				setState(50);
				header();
				}
			}

			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(53);
				function();
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HeaderContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(WynnScriptParser.HASH, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(HASH);
			setState(62);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(WynnScriptParser.FUNCTION, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(WynnScriptParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(WynnScriptParser.RPAREN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(FUNCTION);
			setState(65);
			id();
			setState(66);
			match(LPAREN);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(67);
				parameters();
				}
			}

			setState(70);
			match(RPAREN);
			setState(71);
			statements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersContext extends ParserRuleContext {
		public List<Simple_idContext> simple_id() {
			return getRuleContexts(Simple_idContext.class);
		}
		public Simple_idContext simple_id(int i) {
			return getRuleContext(Simple_idContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(WynnScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(WynnScriptParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			simple_id();
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(74);
				match(COMMA);
				setState(75);
				simple_id();
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public TerminalNode LCURL() { return getToken(WynnScriptParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(WynnScriptParser.RCURL, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(LCURL);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEMI) | (1L << ELLIPSIS) | (1L << PLUS) | (1L << DASH) | (1L << LPAREN) | (1L << BANG) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << VAR) | (1L << IF) | (1L << WHILE) | (1L << DO) | (1L << FOR) | (1L << CONTINUE) | (1L << BREAK) | (1L << RETURN) | (1L << YIELD) | (1L << TRUE) | (1L << FALSE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NULL - 64)) | (1L << (StringLiteral - 64)) | (1L << (NumberLiteral - 64)) | (1L << (HexLiteral - 64)) | (1L << (BinLiteral - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				{
				setState(82);
				statement();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
			match(RCURL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(WynnScriptParser.SEMI, 0); }
		public ExContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class VarContext extends StatementContext {
		public Var_declarationContext var_declaration() {
			return getRuleContext(Var_declarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(WynnScriptParser.SEMI, 0); }
		public VarContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ForContext extends StatementContext {
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public ForContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ControlContext extends StatementContext {
		public Control_statementContext control_statement() {
			return getRuleContext(Control_statementContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(WynnScriptParser.SEMI, 0); }
		public ControlContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class WhileContext extends StatementContext {
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public WhileContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class IfContext extends StatementContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public IfContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class EmptyContext extends StatementContext {
		public TerminalNode SEMI() { return getToken(WynnScriptParser.SEMI, 0); }
		public EmptyContext(StatementContext ctx) { copyFrom(ctx); }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		try {
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				_localctx = new VarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				var_declaration();
				setState(91);
				match(SEMI);
				}
				break;
			case IF:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				if_statement();
				}
				break;
			case WHILE:
			case DO:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				while_statement();
				}
				break;
			case FOR:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(95);
				for_statement();
				}
				break;
			case CONTINUE:
			case BREAK:
			case RETURN:
			case YIELD:
				_localctx = new ControlContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(96);
				control_statement();
				setState(97);
				match(SEMI);
				}
				break;
			case ELLIPSIS:
			case PLUS:
			case DASH:
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case TRUE:
			case FALSE:
			case NULL:
			case StringLiteral:
			case NumberLiteral:
			case HexLiteral:
			case BinLiteral:
			case Identifier:
				_localctx = new ExContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(99);
				expression();
				setState(100);
				match(SEMI);
				}
				break;
			case SEMI:
				_localctx = new EmptyContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(102);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_declarationContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(WynnScriptParser.VAR, 0); }
		public Simple_idContext simple_id() {
			return getRuleContext(Simple_idContext.class,0);
		}
		public TerminalNode EQ() { return getToken(WynnScriptParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Var_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_declaration; }
	}

	public final Var_declarationContext var_declaration() throws RecognitionException {
		Var_declarationContext _localctx = new Var_declarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_var_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(VAR);
			setState(106);
			simple_id();
			setState(107);
			match(EQ);
			setState(108);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statementContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(WynnScriptParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(WynnScriptParser.IF, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(WynnScriptParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(WynnScriptParser.LPAREN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(WynnScriptParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(WynnScriptParser.RPAREN, i);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(WynnScriptParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(WynnScriptParser.ELSE, i);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_if_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(IF);
			setState(111);
			match(LPAREN);
			setState(112);
			expression();
			setState(113);
			match(RPAREN);
			setState(114);
			statements();
			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(115);
					match(ELSE);
					setState(116);
					match(IF);
					setState(117);
					match(LPAREN);
					setState(118);
					expression();
					setState(119);
					match(RPAREN);
					setState(120);
					statements();
					}
					} 
				}
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(127);
			match(ELSE);
			setState(128);
			statements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(WynnScriptParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(WynnScriptParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(WynnScriptParser.RPAREN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode DO() { return getToken(WynnScriptParser.DO, 0); }
		public TerminalNode SEMI() { return getToken(WynnScriptParser.SEMI, 0); }
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_while_statement);
		try {
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(WHILE);
				setState(131);
				match(LPAREN);
				setState(132);
				expression();
				setState(133);
				match(RPAREN);
				setState(134);
				statements();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(DO);
				setState(137);
				statements();
				setState(138);
				match(WHILE);
				setState(139);
				match(LPAREN);
				setState(140);
				expression();
				setState(141);
				match(RPAREN);
				setState(142);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(WynnScriptParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(WynnScriptParser.LPAREN, 0); }
		public Simple_idContext simple_id() {
			return getRuleContext(Simple_idContext.class,0);
		}
		public TerminalNode IN() { return getToken(WynnScriptParser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(WynnScriptParser.RPAREN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(FOR);
			setState(147);
			match(LPAREN);
			setState(148);
			simple_id();
			setState(149);
			match(IN);
			setState(150);
			expression();
			setState(151);
			match(RPAREN);
			setState(152);
			statements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Control_statementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(WynnScriptParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(WynnScriptParser.CONTINUE, 0); }
		public TerminalNode RETURN() { return getToken(WynnScriptParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode YIELD() { return getToken(WynnScriptParser.YIELD, 0); }
		public Control_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_control_statement; }
	}

	public final Control_statementContext control_statement() throws RecognitionException {
		Control_statementContext _localctx = new Control_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_control_statement);
		int _la;
		try {
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BREAK:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				match(BREAK);
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(CONTINUE);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				match(RETURN);
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (ELLIPSIS - 10)) | (1L << (PLUS - 10)) | (1L << (DASH - 10)) | (1L << (LPAREN - 10)) | (1L << (BANG - 10)) | (1L << (TILDE - 10)) | (1L << (INC - 10)) | (1L << (DEC - 10)) | (1L << (TRUE - 10)) | (1L << (FALSE - 10)) | (1L << (NULL - 10)) | (1L << (StringLiteral - 10)) | (1L << (NumberLiteral - 10)) | (1L << (HexLiteral - 10)) | (1L << (BinLiteral - 10)) | (1L << (Identifier - 10)))) != 0)) {
					{
					setState(157);
					expression();
					}
				}

				}
				break;
			case YIELD:
				enterOuterAlt(_localctx, 4);
				{
				setState(160);
				match(YIELD);
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (ELLIPSIS - 10)) | (1L << (PLUS - 10)) | (1L << (DASH - 10)) | (1L << (LPAREN - 10)) | (1L << (BANG - 10)) | (1L << (TILDE - 10)) | (1L << (INC - 10)) | (1L << (DEC - 10)) | (1L << (TRUE - 10)) | (1L << (FALSE - 10)) | (1L << (NULL - 10)) | (1L << (StringLiteral - 10)) | (1L << (NumberLiteral - 10)) | (1L << (HexLiteral - 10)) | (1L << (BinLiteral - 10)) | (1L << (Identifier - 10)))) != 0)) {
					{
					setState(161);
					expression();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OperatorContext extends ExpressionContext {
		public Operator_expressionContext operator_expression() {
			return getRuleContext(Operator_expressionContext.class,0);
		}
		public OperatorContext(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expression);
		try {
			_localctx = new OperatorContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			operator_expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operator_expressionContext extends ParserRuleContext {
		public Operator_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_expression; }
	 
		public Operator_expressionContext() { }
		public void copyFrom(Operator_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SetFieldContext extends Operator_expressionContext {
		public Field_setContext field_set() {
			return getRuleContext(Field_setContext.class,0);
		}
		public SetFieldContext(Operator_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class ProductContext extends Operator_expressionContext {
		public List<Operator_expressionContext> operator_expression() {
			return getRuleContexts(Operator_expressionContext.class);
		}
		public Operator_expressionContext operator_expression(int i) {
			return getRuleContext(Operator_expressionContext.class,i);
		}
		public TerminalNode STAR() { return getToken(WynnScriptParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(WynnScriptParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(WynnScriptParser.PERCENT, 0); }
		public ProductContext(Operator_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class ComparisonContext extends Operator_expressionContext {
		public List<Operator_expressionContext> operator_expression() {
			return getRuleContexts(Operator_expressionContext.class);
		}
		public Operator_expressionContext operator_expression(int i) {
			return getRuleContext(Operator_expressionContext.class,i);
		}
		public TerminalNode LANGLE() { return getToken(WynnScriptParser.LANGLE, 0); }
		public TerminalNode RANGLE() { return getToken(WynnScriptParser.RANGLE, 0); }
		public TerminalNode LE() { return getToken(WynnScriptParser.LE, 0); }
		public TerminalNode GE() { return getToken(WynnScriptParser.GE, 0); }
		public TerminalNode IN() { return getToken(WynnScriptParser.IN, 0); }
		public TerminalNode IS() { return getToken(WynnScriptParser.IS, 0); }
		public TerminalNode NOT_IN() { return getToken(WynnScriptParser.NOT_IN, 0); }
		public TerminalNode NOT_IS() { return getToken(WynnScriptParser.NOT_IS, 0); }
		public ComparisonContext(Operator_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class OrContext extends Operator_expressionContext {
		public List<Operator_expressionContext> operator_expression() {
			return getRuleContexts(Operator_expressionContext.class);
		}
		public Operator_expressionContext operator_expression(int i) {
			return getRuleContext(Operator_expressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(WynnScriptParser.OR, 0); }
		public OrContext(Operator_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class MethodContext extends Operator_expressionContext {
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public MethodContext(Operator_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class GetIndexContext extends Operator_expressionContext {
		public Index_getContext index_get() {
			return getRuleContext(Index_getContext.class,0);
		}
		public GetIndexContext(Operator_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class ConditionalContext extends Operator_expressionContext {
		public List<Operator_expressionContext> operator_expression() {
			return getRuleContexts(Operator_expressionContext.class);
		}
		public Operator_expressionContext operator_expression(int i) {
			return getRuleContext(Operator_expressionContext.class,i);
		}
		public TerminalNode QUEST() { return getToken(WynnScriptParser.QUEST, 0); }
		public TerminalNode COLON() { return getToken(WynnScriptParser.COLON, 0); }
		public ConditionalContext(Operator_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class PrefixContext extends Operator_expressionContext {
		public Operator_expressionContext operator_expression() {
			return getRuleContext(Operator_expressionContext.class,0);
		}
		public TerminalNode BANG() { return getToken(WynnScriptParser.BANG, 0); }
		public TerminalNode TILDE() { return getToken(WynnScriptParser.TILDE, 0); }
		public TerminalNode PLUS() { return getToken(WynnScriptParser.PLUS, 0); }
		public TerminalNode DASH() { return getToken(WynnScriptParser.DASH, 0); }
		public TerminalNode INC() { return getToken(WynnScriptParser.INC, 0); }
		public TerminalNode DEC() { return getToken(WynnScriptParser.DEC, 0); }
		public PrefixContext(Operator_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class GetFieldContext extends Operator_expressionContext {
		public Field_getContext field_get() {
			return getRuleContext(Field_getContext.class,0);
		}
		public GetFieldContext(Operator_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class InvokeContext extends Operator_expressionContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public InvokeContext(Operator_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class SumContext extends Operator_expressionContext {
		public List<Operator_expressionContext> operator_expression() {
			return getRuleContexts(Operator_expressionContext.class);
		}
		public Operator_expressionContext operator_expression(int i) {
			return getRuleContext(Operator_expressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(WynnScriptParser.PLUS, 0); }
		public TerminalNode DASH() { return getToken(WynnScriptParser.DASH, 0); }
		public SumContext(Operator_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class SpreadContext extends Operator_expressionContext {
		public TerminalNode ELLIPSIS() { return getToken(WynnScriptParser.ELLIPSIS, 0); }
		public Operator_expressionContext operator_expression() {
			return getRuleContext(Operator_expressionContext.class,0);
		}
		public SpreadContext(Operator_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class SetIndexContext extends Operator_expressionContext {
		public Index_setContext index_set() {
			return getRuleContext(Index_setContext.class,0);
		}
		public SetIndexContext(Operator_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class AndContext extends Operator_expressionContext {
		public List<Operator_expressionContext> operator_expression() {
			return getRuleContexts(Operator_expressionContext.class);
		}
		public Operator_expressionContext operator_expression(int i) {
			return getRuleContext(Operator_expressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(WynnScriptParser.AND, 0); }
		public AndContext(Operator_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class PowerContext extends Operator_expressionContext {
		public List<Operator_expressionContext> operator_expression() {
			return getRuleContexts(Operator_expressionContext.class);
		}
		public Operator_expressionContext operator_expression(int i) {
			return getRuleContext(Operator_expressionContext.class,i);
		}
		public TerminalNode POW() { return getToken(WynnScriptParser.POW, 0); }
		public PowerContext(Operator_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class PostfixContext extends Operator_expressionContext {
		public Operator_expressionContext operator_expression() {
			return getRuleContext(Operator_expressionContext.class,0);
		}
		public TerminalNode INC() { return getToken(WynnScriptParser.INC, 0); }
		public TerminalNode DEC() { return getToken(WynnScriptParser.DEC, 0); }
		public PostfixContext(Operator_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class EqualityContext extends Operator_expressionContext {
		public List<Operator_expressionContext> operator_expression() {
			return getRuleContexts(Operator_expressionContext.class);
		}
		public Operator_expressionContext operator_expression(int i) {
			return getRuleContext(Operator_expressionContext.class,i);
		}
		public TerminalNode EQEQ() { return getToken(WynnScriptParser.EQEQ, 0); }
		public TerminalNode NEQ() { return getToken(WynnScriptParser.NEQ, 0); }
		public EqualityContext(Operator_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class PrimaryContext extends Operator_expressionContext {
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public PrimaryContext(Operator_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class AssignContext extends Operator_expressionContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Assign_operatorContext assign_operator() {
			return getRuleContext(Assign_operatorContext.class,0);
		}
		public Operator_expressionContext operator_expression() {
			return getRuleContext(Operator_expressionContext.class,0);
		}
		public AssignContext(Operator_expressionContext ctx) { copyFrom(ctx); }
	}

	public final Operator_expressionContext operator_expression() throws RecognitionException {
		return operator_expression(0);
	}

	private Operator_expressionContext operator_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Operator_expressionContext _localctx = new Operator_expressionContext(_ctx, _parentState);
		Operator_expressionContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_operator_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new PrimaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(169);
				primary_expression();
				}
				break;
			case 2:
				{
				_localctx = new GetFieldContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(170);
				field_get(0);
				}
				break;
			case 3:
				{
				_localctx = new SetFieldContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(171);
				field_set();
				}
				break;
			case 4:
				{
				_localctx = new InvokeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172);
				function_call();
				}
				break;
			case 5:
				{
				_localctx = new MethodContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(173);
				method_call();
				}
				break;
			case 6:
				{
				_localctx = new GetIndexContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174);
				index_get();
				}
				break;
			case 7:
				{
				_localctx = new SetIndexContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(175);
				index_set();
				}
				break;
			case 8:
				{
				_localctx = new PrefixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(176);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << DASH) | (1L << BANG) | (1L << TILDE) | (1L << INC) | (1L << DEC))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(177);
				operator_expression(11);
				}
				break;
			case 9:
				{
				_localctx = new AssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(178);
				id();
				setState(179);
				assign_operator();
				setState(180);
				operator_expression(2);
				}
				break;
			case 10:
				{
				_localctx = new SpreadContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(182);
				match(ELLIPSIS);
				setState(183);
				operator_expression(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(217);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(215);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new PowerContext(new Operator_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operator_expression);
						setState(186);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(187);
						match(POW);
						setState(188);
						operator_expression(11);
						}
						break;
					case 2:
						{
						_localctx = new ProductContext(new Operator_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operator_expression);
						setState(189);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(190);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << SLASH) | (1L << PERCENT))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(191);
						operator_expression(10);
						}
						break;
					case 3:
						{
						_localctx = new SumContext(new Operator_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operator_expression);
						setState(192);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(193);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==DASH) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(194);
						operator_expression(9);
						}
						break;
					case 4:
						{
						_localctx = new ComparisonContext(new Operator_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operator_expression);
						setState(195);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(196);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LANGLE) | (1L << RANGLE) | (1L << LE) | (1L << GE) | (1L << IN) | (1L << IS) | (1L << NOT_IN) | (1L << NOT_IS))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(197);
						operator_expression(8);
						}
						break;
					case 5:
						{
						_localctx = new EqualityContext(new Operator_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operator_expression);
						setState(198);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(199);
						_la = _input.LA(1);
						if ( !(_la==EQEQ || _la==NEQ) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(200);
						operator_expression(7);
						}
						break;
					case 6:
						{
						_localctx = new AndContext(new Operator_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operator_expression);
						setState(201);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(202);
						match(AND);
						setState(203);
						operator_expression(6);
						}
						break;
					case 7:
						{
						_localctx = new OrContext(new Operator_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operator_expression);
						setState(204);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(205);
						match(OR);
						setState(206);
						operator_expression(5);
						}
						break;
					case 8:
						{
						_localctx = new ConditionalContext(new Operator_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operator_expression);
						setState(207);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(208);
						match(QUEST);
						setState(209);
						operator_expression(0);
						setState(210);
						match(COLON);
						setState(211);
						operator_expression(3);
						}
						break;
					case 9:
						{
						_localctx = new PostfixContext(new Operator_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operator_expression);
						setState(213);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(214);
						_la = _input.LA(1);
						if ( !(_la==INC || _la==DEC) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Assign_operatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(WynnScriptParser.EQ, 0); }
		public TerminalNode PLUS_EQ() { return getToken(WynnScriptParser.PLUS_EQ, 0); }
		public TerminalNode MINUS_EQ() { return getToken(WynnScriptParser.MINUS_EQ, 0); }
		public TerminalNode TIMES_EQ() { return getToken(WynnScriptParser.TIMES_EQ, 0); }
		public TerminalNode DIV_EQ() { return getToken(WynnScriptParser.DIV_EQ, 0); }
		public TerminalNode MOD_EQ() { return getToken(WynnScriptParser.MOD_EQ, 0); }
		public TerminalNode POW_EQ() { return getToken(WynnScriptParser.POW_EQ, 0); }
		public Assign_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_operator; }
	}

	public final Assign_operatorContext assign_operator() throws RecognitionException {
		Assign_operatorContext _localctx = new Assign_operatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assign_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << PLUS_EQ) | (1L << MINUS_EQ) | (1L << TIMES_EQ) | (1L << POW_EQ) | (1L << DIV_EQ) | (1L << MOD_EQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_getContext extends ParserRuleContext {
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public Field_getContext field_get() {
			return getRuleContext(Field_getContext.class,0);
		}
		public TerminalNode DOT() { return getToken(WynnScriptParser.DOT, 0); }
		public Simple_idContext simple_id() {
			return getRuleContext(Simple_idContext.class,0);
		}
		public Field_getContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_get; }
	}

	public final Field_getContext field_get() throws RecognitionException {
		return field_get(0);
	}

	private Field_getContext field_get(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Field_getContext _localctx = new Field_getContext(_ctx, _parentState);
		Field_getContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_field_get, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(223);
			primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(230);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Field_getContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_field_get);
					setState(225);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(226);
					match(DOT);
					setState(227);
					simple_id();
					}
					} 
				}
				setState(232);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Field_setContext extends ParserRuleContext {
		public Field_getContext field_get() {
			return getRuleContext(Field_getContext.class,0);
		}
		public Assign_operatorContext assign_operator() {
			return getRuleContext(Assign_operatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Field_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_set; }
	}

	public final Field_setContext field_set() throws RecognitionException {
		Field_setContext _localctx = new Field_setContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_field_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			field_get(0);
			setState(234);
			assign_operator();
			setState(235);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_callContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(WynnScriptParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(WynnScriptParser.RPAREN, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			id();
			setState(238);
			match(LPAREN);
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (ELLIPSIS - 10)) | (1L << (PLUS - 10)) | (1L << (DASH - 10)) | (1L << (LPAREN - 10)) | (1L << (BANG - 10)) | (1L << (TILDE - 10)) | (1L << (INC - 10)) | (1L << (DEC - 10)) | (1L << (TRUE - 10)) | (1L << (FALSE - 10)) | (1L << (NULL - 10)) | (1L << (StringLiteral - 10)) | (1L << (NumberLiteral - 10)) | (1L << (HexLiteral - 10)) | (1L << (BinLiteral - 10)) | (1L << (Identifier - 10)))) != 0)) {
				{
				setState(239);
				args();
				}
			}

			setState(242);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_callContext extends ParserRuleContext {
		public Field_getContext field_get() {
			return getRuleContext(Field_getContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(WynnScriptParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(WynnScriptParser.RPAREN, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public Method_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call; }
	}

	public final Method_callContext method_call() throws RecognitionException {
		Method_callContext _localctx = new Method_callContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_method_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			field_get(0);
			setState(245);
			match(LPAREN);
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (ELLIPSIS - 10)) | (1L << (PLUS - 10)) | (1L << (DASH - 10)) | (1L << (LPAREN - 10)) | (1L << (BANG - 10)) | (1L << (TILDE - 10)) | (1L << (INC - 10)) | (1L << (DEC - 10)) | (1L << (TRUE - 10)) | (1L << (FALSE - 10)) | (1L << (NULL - 10)) | (1L << (StringLiteral - 10)) | (1L << (NumberLiteral - 10)) | (1L << (HexLiteral - 10)) | (1L << (BinLiteral - 10)) | (1L << (Identifier - 10)))) != 0)) {
				{
				setState(246);
				args();
				}
			}

			setState(249);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_getContext extends ParserRuleContext {
		public Field_getContext field_get() {
			return getRuleContext(Field_getContext.class,0);
		}
		public TerminalNode LSQUARE() { return getToken(WynnScriptParser.LSQUARE, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode RSQUARE() { return getToken(WynnScriptParser.RSQUARE, 0); }
		public Index_getContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_get; }
	}

	public final Index_getContext index_get() throws RecognitionException {
		Index_getContext _localctx = new Index_getContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_index_get);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			field_get(0);
			setState(252);
			match(LSQUARE);
			setState(253);
			args();
			setState(254);
			match(RSQUARE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_setContext extends ParserRuleContext {
		public Index_getContext index_get() {
			return getRuleContext(Index_getContext.class,0);
		}
		public Assign_operatorContext assign_operator() {
			return getRuleContext(Assign_operatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Index_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_set; }
	}

	public final Index_setContext index_set() throws RecognitionException {
		Index_setContext _localctx = new Index_setContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_index_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			index_get();
			setState(257);
			assign_operator();
			setState(258);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(WynnScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(WynnScriptParser.COMMA, i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			expression();
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(261);
				match(COMMA);
				setState(262);
				expression();
				}
				}
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primary_expressionContext extends ParserRuleContext {
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
	 
		public Primary_expressionContext() { }
		public void copyFrom(Primary_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParenContext extends Primary_expressionContext {
		public TerminalNode LPAREN() { return getToken(WynnScriptParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(WynnScriptParser.RPAREN, 0); }
		public ParenContext(Primary_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class LitContext extends Primary_expressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LitContext(Primary_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class NameContext extends Primary_expressionContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public NameContext(Primary_expressionContext ctx) { copyFrom(ctx); }
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_primary_expression);
		try {
			setState(274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				_localctx = new ParenContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				match(LPAREN);
				setState(269);
				expression();
				setState(270);
				match(RPAREN);
				}
				break;
			case TRUE:
			case FALSE:
			case NULL:
			case StringLiteral:
			case NumberLiteral:
			case HexLiteral:
			case BinLiteral:
				_localctx = new LitContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				literal();
				}
				break;
			case Identifier:
				_localctx = new NameContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(273);
				id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(WynnScriptParser.StringLiteral, 0); }
		public TerminalNode NumberLiteral() { return getToken(WynnScriptParser.NumberLiteral, 0); }
		public TerminalNode HexLiteral() { return getToken(WynnScriptParser.HexLiteral, 0); }
		public TerminalNode BinLiteral() { return getToken(WynnScriptParser.BinLiteral, 0); }
		public TerminalNode TRUE() { return getToken(WynnScriptParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(WynnScriptParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(WynnScriptParser.NULL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_la = _input.LA(1);
			if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (TRUE - 62)) | (1L << (FALSE - 62)) | (1L << (NULL - 62)) | (1L << (StringLiteral - 62)) | (1L << (NumberLiteral - 62)) | (1L << (HexLiteral - 62)) | (1L << (BinLiteral - 62)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_idContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(WynnScriptParser.Identifier, 0); }
		public Simple_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_id; }
	}

	public final Simple_idContext simple_id() throws RecognitionException {
		Simple_idContext _localctx = new Simple_idContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_simple_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public List<Simple_idContext> simple_id() {
			return getRuleContexts(Simple_idContext.class);
		}
		public Simple_idContext simple_id(int i) {
			return getRuleContext(Simple_idContext.class,i);
		}
		public List<TerminalNode> COLONCOLON() { return getTokens(WynnScriptParser.COLONCOLON); }
		public TerminalNode COLONCOLON(int i) {
			return getToken(WynnScriptParser.COLONCOLON, i);
		}
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_id);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			simple_id();
			setState(285);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(281);
					match(COLONCOLON);
					setState(282);
					simple_id();
					}
					} 
				}
				setState(287);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return operator_expression_sempred((Operator_expressionContext)_localctx, predIndex);
		case 14:
			return field_get_sempred((Field_getContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean operator_expression_sempred(Operator_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 3);
		case 8:
			return precpred(_ctx, 12);
		}
		return true;
	}
	private boolean field_get_sempred(Field_getContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3H\u0123\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\5\2\66\n\2\3\2\7\29\n\2\f\2\16\2<\13\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\5\4G\n\4\3\4\3\4\3\4\3\5\3\5\3\5\7\5O\n\5\f\5\16"+
		"\5R\13\5\3\6\3\6\7\6V\n\6\f\6\16\6Y\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7j\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t}\n\t\f\t\16\t\u0080\13\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n"+
		"\u0093\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f"+
		"\u00a1\n\f\3\f\3\f\5\f\u00a5\n\f\5\f\u00a7\n\f\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u00bb\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\7\16\u00da\n\16\f\16\16\16\u00dd\13\16\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\7\20\u00e7\n\20\f\20\16\20\u00ea\13\20\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\5\22\u00f3\n\22\3\22\3\22\3\23\3\23\3\23"+
		"\5\23\u00fa\n\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\7\26\u010a\n\26\f\26\16\26\u010d\13\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\5\27\u0115\n\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\7\32"+
		"\u011e\n\32\f\32\16\32\u0121\13\32\3\32\2\4\32\36\33\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\n\6\2\r\16\"\"$$-.\4\2\17\17\21"+
		"\22\3\2\r\16\5\2\31\32\36\37\669\3\2\34\35\3\2-.\4\2\33\33\',\4\2@BDG"+
		"\2\u0134\2\65\3\2\2\2\4?\3\2\2\2\6B\3\2\2\2\bK\3\2\2\2\nS\3\2\2\2\fi\3"+
		"\2\2\2\16k\3\2\2\2\20p\3\2\2\2\22\u0092\3\2\2\2\24\u0094\3\2\2\2\26\u00a6"+
		"\3\2\2\2\30\u00a8\3\2\2\2\32\u00ba\3\2\2\2\34\u00de\3\2\2\2\36\u00e0\3"+
		"\2\2\2 \u00eb\3\2\2\2\"\u00ef\3\2\2\2$\u00f6\3\2\2\2&\u00fd\3\2\2\2(\u0102"+
		"\3\2\2\2*\u0106\3\2\2\2,\u0114\3\2\2\2.\u0116\3\2\2\2\60\u0118\3\2\2\2"+
		"\62\u011a\3\2\2\2\64\66\5\4\3\2\65\64\3\2\2\2\65\66\3\2\2\2\66:\3\2\2"+
		"\2\679\5\6\4\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;=\3\2\2\2<:\3"+
		"\2\2\2=>\7\2\2\3>\3\3\2\2\2?@\7#\2\2@A\5\62\32\2A\5\3\2\2\2BC\7/\2\2C"+
		"D\5\62\32\2DF\7\23\2\2EG\5\b\5\2FE\3\2\2\2FG\3\2\2\2GH\3\2\2\2HI\7\24"+
		"\2\2IJ\5\n\6\2J\7\3\2\2\2KP\5\60\31\2LM\7\t\2\2MO\5\60\31\2NL\3\2\2\2"+
		"OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\t\3\2\2\2RP\3\2\2\2SW\7\27\2\2TV\5\f\7"+
		"\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z[\7\30"+
		"\2\2[\13\3\2\2\2\\]\5\16\b\2]^\7\7\2\2^j\3\2\2\2_j\5\20\t\2`j\5\22\n\2"+
		"aj\5\24\13\2bc\5\26\f\2cd\7\7\2\2dj\3\2\2\2ef\5\30\r\2fg\7\7\2\2gj\3\2"+
		"\2\2hj\7\7\2\2i\\\3\2\2\2i_\3\2\2\2i`\3\2\2\2ia\3\2\2\2ib\3\2\2\2ie\3"+
		"\2\2\2ih\3\2\2\2j\r\3\2\2\2kl\7\60\2\2lm\5\60\31\2mn\7\33\2\2no\5\30\r"+
		"\2o\17\3\2\2\2pq\7\61\2\2qr\7\23\2\2rs\5\30\r\2st\7\24\2\2t~\5\n\6\2u"+
		"v\7\62\2\2vw\7\61\2\2wx\7\23\2\2xy\5\30\r\2yz\7\24\2\2z{\5\n\6\2{}\3\2"+
		"\2\2|u\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2\2"+
		"\u0080~\3\2\2\2\u0081\u0082\7\62\2\2\u0082\u0083\5\n\6\2\u0083\21\3\2"+
		"\2\2\u0084\u0085\7\63\2\2\u0085\u0086\7\23\2\2\u0086\u0087\5\30\r\2\u0087"+
		"\u0088\7\24\2\2\u0088\u0089\5\n\6\2\u0089\u0093\3\2\2\2\u008a\u008b\7"+
		"\64\2\2\u008b\u008c\5\n\6\2\u008c\u008d\7\63\2\2\u008d\u008e\7\23\2\2"+
		"\u008e\u008f\5\30\r\2\u008f\u0090\7\24\2\2\u0090\u0091\7\7\2\2\u0091\u0093"+
		"\3\2\2\2\u0092\u0084\3\2\2\2\u0092\u008a\3\2\2\2\u0093\23\3\2\2\2\u0094"+
		"\u0095\7\65\2\2\u0095\u0096\7\23\2\2\u0096\u0097\5\60\31\2\u0097\u0098"+
		"\7\66\2\2\u0098\u0099\5\30\r\2\u0099\u009a\7\24\2\2\u009a\u009b\5\n\6"+
		"\2\u009b\25\3\2\2\2\u009c\u00a7\7;\2\2\u009d\u00a7\7:\2\2\u009e\u00a0"+
		"\7<\2\2\u009f\u00a1\5\30\r\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a7\3\2\2\2\u00a2\u00a4\7=\2\2\u00a3\u00a5\5\30\r\2\u00a4\u00a3\3\2"+
		"\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u009c\3\2\2\2\u00a6"+
		"\u009d\3\2\2\2\u00a6\u009e\3\2\2\2\u00a6\u00a2\3\2\2\2\u00a7\27\3\2\2"+
		"\2\u00a8\u00a9\5\32\16\2\u00a9\31\3\2\2\2\u00aa\u00ab\b\16\1\2\u00ab\u00bb"+
		"\5,\27\2\u00ac\u00bb\5\36\20\2\u00ad\u00bb\5 \21\2\u00ae\u00bb\5\"\22"+
		"\2\u00af\u00bb\5$\23\2\u00b0\u00bb\5&\24\2\u00b1\u00bb\5(\25\2\u00b2\u00b3"+
		"\t\2\2\2\u00b3\u00bb\5\32\16\r\u00b4\u00b5\5\62\32\2\u00b5\u00b6\5\34"+
		"\17\2\u00b6\u00b7\5\32\16\4\u00b7\u00bb\3\2\2\2\u00b8\u00b9\7\f\2\2\u00b9"+
		"\u00bb\5\32\16\3\u00ba\u00aa\3\2\2\2\u00ba\u00ac\3\2\2\2\u00ba\u00ad\3"+
		"\2\2\2\u00ba\u00ae\3\2\2\2\u00ba\u00af\3\2\2\2\u00ba\u00b0\3\2\2\2\u00ba"+
		"\u00b1\3\2\2\2\u00ba\u00b2\3\2\2\2\u00ba\u00b4\3\2\2\2\u00ba\u00b8\3\2"+
		"\2\2\u00bb\u00db\3\2\2\2\u00bc\u00bd\f\f\2\2\u00bd\u00be\7\20\2\2\u00be"+
		"\u00da\5\32\16\r\u00bf\u00c0\f\13\2\2\u00c0\u00c1\t\3\2\2\u00c1\u00da"+
		"\5\32\16\f\u00c2\u00c3\f\n\2\2\u00c3\u00c4\t\4\2\2\u00c4\u00da\5\32\16"+
		"\13\u00c5\u00c6\f\t\2\2\u00c6\u00c7\t\5\2\2\u00c7\u00da\5\32\16\n\u00c8"+
		"\u00c9\f\b\2\2\u00c9\u00ca\t\6\2\2\u00ca\u00da\5\32\16\t\u00cb\u00cc\f"+
		"\7\2\2\u00cc\u00cd\7 \2\2\u00cd\u00da\5\32\16\b\u00ce\u00cf\f\6\2\2\u00cf"+
		"\u00d0\7!\2\2\u00d0\u00da\5\32\16\7\u00d1\u00d2\f\5\2\2\u00d2\u00d3\7"+
		"%\2\2\u00d3\u00d4\5\32\16\2\u00d4\u00d5\7\b\2\2\u00d5\u00d6\5\32\16\5"+
		"\u00d6\u00da\3\2\2\2\u00d7\u00d8\f\16\2\2\u00d8\u00da\t\7\2\2\u00d9\u00bc"+
		"\3\2\2\2\u00d9\u00bf\3\2\2\2\u00d9\u00c2\3\2\2\2\u00d9\u00c5\3\2\2\2\u00d9"+
		"\u00c8\3\2\2\2\u00d9\u00cb\3\2\2\2\u00d9\u00ce\3\2\2\2\u00d9\u00d1\3\2"+
		"\2\2\u00d9\u00d7\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\33\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00df\t\b\2"+
		"\2\u00df\35\3\2\2\2\u00e0\u00e1\b\20\1\2\u00e1\u00e2\5,\27\2\u00e2\u00e8"+
		"\3\2\2\2\u00e3\u00e4\f\4\2\2\u00e4\u00e5\7\n\2\2\u00e5\u00e7\5\60\31\2"+
		"\u00e6\u00e3\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9"+
		"\3\2\2\2\u00e9\37\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ec\5\36\20\2\u00ec"+
		"\u00ed\5\34\17\2\u00ed\u00ee\5\30\r\2\u00ee!\3\2\2\2\u00ef\u00f0\5\62"+
		"\32\2\u00f0\u00f2\7\23\2\2\u00f1\u00f3\5*\26\2\u00f2\u00f1\3\2\2\2\u00f2"+
		"\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\7\24\2\2\u00f5#\3\2\2\2"+
		"\u00f6\u00f7\5\36\20\2\u00f7\u00f9\7\23\2\2\u00f8\u00fa\5*\26\2\u00f9"+
		"\u00f8\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\7\24"+
		"\2\2\u00fc%\3\2\2\2\u00fd\u00fe\5\36\20\2\u00fe\u00ff\7\25\2\2\u00ff\u0100"+
		"\5*\26\2\u0100\u0101\7\26\2\2\u0101\'\3\2\2\2\u0102\u0103\5&\24\2\u0103"+
		"\u0104\5\34\17\2\u0104\u0105\5\30\r\2\u0105)\3\2\2\2\u0106\u010b\5\30"+
		"\r\2\u0107\u0108\7\t\2\2\u0108\u010a\5\30\r\2\u0109\u0107\3\2\2\2\u010a"+
		"\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c+\3\2\2\2"+
		"\u010d\u010b\3\2\2\2\u010e\u010f\7\23\2\2\u010f\u0110\5\30\r\2\u0110\u0111"+
		"\7\24\2\2\u0111\u0115\3\2\2\2\u0112\u0115\5.\30\2\u0113\u0115\5\62\32"+
		"\2\u0114\u010e\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0113\3\2\2\2\u0115-"+
		"\3\2\2\2\u0116\u0117\t\t\2\2\u0117/\3\2\2\2\u0118\u0119\7H\2\2\u0119\61"+
		"\3\2\2\2\u011a\u011f\5\60\31\2\u011b\u011c\7\13\2\2\u011c\u011e\5\60\31"+
		"\2\u011d\u011b\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120"+
		"\3\2\2\2\u0120\63\3\2\2\2\u0121\u011f\3\2\2\2\26\65:FPWi~\u0092\u00a0"+
		"\u00a4\u00a6\u00ba\u00d9\u00db\u00e8\u00f2\u00f9\u010b\u0114\u011f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}