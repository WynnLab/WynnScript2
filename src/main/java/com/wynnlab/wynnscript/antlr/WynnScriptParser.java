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
		DOT=8, ELLIPSIS=9, PLUS=10, DASH=11, STAR=12, POW=13, SLASH=14, PERCENT=15, 
		LPAREN=16, RPAREN=17, LSQUARE=18, RSQUARE=19, LCURL=20, RCURL=21, LANGLE=22, 
		RANGLE=23, EQ=24, EQEQ=25, NEQ=26, LE=27, GE=28, AND=29, OR=30, BANG=31, 
		HASH=32, TILDE=33, QUEST=34, AT=35, PLUS_EQ=36, MINUS_EQ=37, TIMES_EQ=38, 
		POW_EQ=39, DIV_EQ=40, MOD_EQ=41, INC=42, DEC=43, FUNCTION=44, VAR=45, 
		IF=46, ELSE=47, WHILE=48, DO=49, FOR=50, IN=51, IS=52, NOT_IN=53, NOT_IS=54, 
		CONTINUE=55, BREAK=56, RETURN=57, YIELD=58, ASYNC=59, AWAIT=60, TRUE=61, 
		FALSE=62, NULL=63, THIS=64, StringLiteral=65, NumberLiteral=66, HexLiteral=67, 
		BinLiteral=68, Identifier=69;
	public static final int
		RULE_wynnScript = 0, RULE_header = 1, RULE_function = 2, RULE_parameters = 3, 
		RULE_statements = 4, RULE_statement = 5, RULE_var_declaration = 6, RULE_if_statement = 7, 
		RULE_while_statement = 8, RULE_for_statement = 9, RULE_control_statement = 10, 
		RULE_expression = 11, RULE_operator_expression = 12, RULE_assign_operator = 13, 
		RULE_field_get = 14, RULE_field_set = 15, RULE_function_call = 16, RULE_method_call = 17, 
		RULE_index_get = 18, RULE_index_set = 19, RULE_args = 20, RULE_primary_expression = 21, 
		RULE_literal = 22, RULE_id = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"wynnScript", "header", "function", "parameters", "statements", "statement", 
			"var_declaration", "if_statement", "while_statement", "for_statement", 
			"control_statement", "expression", "operator_expression", "assign_operator", 
			"field_get", "field_set", "function_call", "method_call", "index_get", 
			"index_set", "args", "primary_expression", "literal", "id"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "';'", "':'", "','", "'.'", "'...'", "'+'", 
			"'-'", "'*'", "'**'", "'/'", "'%'", "'('", "')'", "'['", "']'", "'{'", 
			"'}'", "'<'", "'>'", "'='", "'=='", "'!='", "'<='", "'>='", "'&&'", "'||'", 
			"'!'", "'#'", "'~'", "'?'", "'@'", "'+='", "'-='", "'*='", "'**='", "'/='", 
			"'%='", "'++'", "'--'", "'function'", "'var'", "'if'", "'else'", "'while'", 
			"'do'", "'for'", "'in'", "'is'", "'!in'", "'!is'", "'continue'", "'break'", 
			"'return'", "'yield'", "'async'", "'await'", "'true'", "'false'", "'null'", 
			"'this'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NL", "Space", "LineComment", "BlockComment", "SEMI", "COLON", 
			"COMMA", "DOT", "ELLIPSIS", "PLUS", "DASH", "STAR", "POW", "SLASH", "PERCENT", 
			"LPAREN", "RPAREN", "LSQUARE", "RSQUARE", "LCURL", "RCURL", "LANGLE", 
			"RANGLE", "EQ", "EQEQ", "NEQ", "LE", "GE", "AND", "OR", "BANG", "HASH", 
			"TILDE", "QUEST", "AT", "PLUS_EQ", "MINUS_EQ", "TIMES_EQ", "POW_EQ", 
			"DIV_EQ", "MOD_EQ", "INC", "DEC", "FUNCTION", "VAR", "IF", "ELSE", "WHILE", 
			"DO", "FOR", "IN", "IS", "NOT_IN", "NOT_IS", "CONTINUE", "BREAK", "RETURN", 
			"YIELD", "ASYNC", "AWAIT", "TRUE", "FALSE", "NULL", "THIS", "StringLiteral", 
			"NumberLiteral", "HexLiteral", "BinLiteral", "Identifier"
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
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HASH) {
				{
				setState(48);
				header();
				}
			}

			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(51);
				function();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
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
			setState(59);
			match(HASH);
			setState(60);
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
			setState(62);
			match(FUNCTION);
			setState(63);
			id();
			setState(64);
			match(LPAREN);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(65);
				parameters();
				}
			}

			setState(68);
			match(RPAREN);
			setState(69);
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
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
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
			setState(71);
			id();
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(72);
				match(COMMA);
				setState(73);
				id();
				}
				}
				setState(78);
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
			setState(79);
			match(LCURL);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEMI) | (1L << ELLIPSIS) | (1L << PLUS) | (1L << DASH) | (1L << LPAREN) | (1L << BANG) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << VAR) | (1L << IF) | (1L << WHILE) | (1L << DO) | (1L << FOR) | (1L << CONTINUE) | (1L << BREAK) | (1L << RETURN) | (1L << YIELD) | (1L << TRUE) | (1L << FALSE) | (1L << NULL))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (StringLiteral - 65)) | (1L << (NumberLiteral - 65)) | (1L << (HexLiteral - 65)) | (1L << (BinLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
				{
				{
				setState(80);
				statement();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
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
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				_localctx = new VarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				var_declaration();
				setState(89);
				match(SEMI);
				}
				break;
			case IF:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				if_statement();
				}
				break;
			case WHILE:
			case DO:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				while_statement();
				}
				break;
			case FOR:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
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
				setState(94);
				control_statement();
				setState(95);
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
				setState(97);
				expression();
				setState(98);
				match(SEMI);
				}
				break;
			case SEMI:
				_localctx = new EmptyContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(100);
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
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
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
			setState(103);
			match(VAR);
			setState(104);
			id();
			setState(105);
			match(EQ);
			setState(106);
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
			setState(108);
			match(IF);
			setState(109);
			match(LPAREN);
			setState(110);
			expression();
			setState(111);
			match(RPAREN);
			setState(112);
			statements();
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(113);
					match(ELSE);
					setState(114);
					match(IF);
					setState(115);
					match(LPAREN);
					setState(116);
					expression();
					setState(117);
					match(RPAREN);
					setState(118);
					statements();
					}
					} 
				}
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(125);
			match(ELSE);
			setState(126);
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
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(WHILE);
				setState(129);
				match(LPAREN);
				setState(130);
				expression();
				setState(131);
				match(RPAREN);
				setState(132);
				statements();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(DO);
				setState(135);
				statements();
				setState(136);
				match(WHILE);
				setState(137);
				match(LPAREN);
				setState(138);
				expression();
				setState(139);
				match(RPAREN);
				setState(140);
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
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
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
			setState(144);
			match(FOR);
			setState(145);
			match(LPAREN);
			setState(146);
			id();
			setState(147);
			match(IN);
			setState(148);
			expression();
			setState(149);
			match(RPAREN);
			setState(150);
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
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BREAK:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				match(BREAK);
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(CONTINUE);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				match(RETURN);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (ELLIPSIS - 9)) | (1L << (PLUS - 9)) | (1L << (DASH - 9)) | (1L << (LPAREN - 9)) | (1L << (BANG - 9)) | (1L << (TILDE - 9)) | (1L << (INC - 9)) | (1L << (DEC - 9)) | (1L << (TRUE - 9)) | (1L << (FALSE - 9)) | (1L << (NULL - 9)) | (1L << (StringLiteral - 9)) | (1L << (NumberLiteral - 9)) | (1L << (HexLiteral - 9)) | (1L << (BinLiteral - 9)) | (1L << (Identifier - 9)))) != 0)) {
					{
					setState(155);
					expression();
					}
				}

				}
				break;
			case YIELD:
				enterOuterAlt(_localctx, 4);
				{
				setState(158);
				match(YIELD);
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (ELLIPSIS - 9)) | (1L << (PLUS - 9)) | (1L << (DASH - 9)) | (1L << (LPAREN - 9)) | (1L << (BANG - 9)) | (1L << (TILDE - 9)) | (1L << (INC - 9)) | (1L << (DEC - 9)) | (1L << (TRUE - 9)) | (1L << (FALSE - 9)) | (1L << (NULL - 9)) | (1L << (StringLiteral - 9)) | (1L << (NumberLiteral - 9)) | (1L << (HexLiteral - 9)) | (1L << (BinLiteral - 9)) | (1L << (Identifier - 9)))) != 0)) {
					{
					setState(159);
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
	public static class SetFieldContext extends ExpressionContext {
		public Field_setContext field_set() {
			return getRuleContext(Field_setContext.class,0);
		}
		public SetFieldContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class MethodContext extends ExpressionContext {
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public MethodContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class GetIndexContext extends ExpressionContext {
		public Index_getContext index_get() {
			return getRuleContext(Index_getContext.class,0);
		}
		public GetIndexContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class SetIndexContext extends ExpressionContext {
		public Index_setContext index_set() {
			return getRuleContext(Index_setContext.class,0);
		}
		public SetIndexContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class GetFieldContext extends ExpressionContext {
		public Field_getContext field_get() {
			return getRuleContext(Field_getContext.class,0);
		}
		public GetFieldContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class InvokeContext extends ExpressionContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public InvokeContext(ExpressionContext ctx) { copyFrom(ctx); }
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
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new OperatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				operator_expression(0);
				}
				break;
			case 2:
				_localctx = new GetFieldContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				field_get(0);
				}
				break;
			case 3:
				_localctx = new SetFieldContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				field_set();
				}
				break;
			case 4:
				_localctx = new InvokeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(167);
				function_call();
				}
				break;
			case 5:
				_localctx = new MethodContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(168);
				method_call();
				}
				break;
			case 6:
				_localctx = new GetIndexContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(169);
				index_get();
				}
				break;
			case 7:
				_localctx = new SetIndexContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(170);
				index_set();
				}
				break;
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
	public static class PrimaryContext extends Operator_expressionContext {
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public PrimaryContext(Operator_expressionContext ctx) { copyFrom(ctx); }
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
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new PrefixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(174);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << DASH) | (1L << BANG) | (1L << TILDE) | (1L << INC) | (1L << DEC))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(175);
				operator_expression(12);
				}
				break;
			case 2:
				{
				_localctx = new AssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(176);
				id();
				setState(177);
				assign_operator();
				setState(178);
				operator_expression(3);
				}
				break;
			case 3:
				{
				_localctx = new SpreadContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(180);
				match(ELLIPSIS);
				setState(181);
				operator_expression(2);
				}
				break;
			case 4:
				{
				_localctx = new PrimaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(182);
				primary_expression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(214);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new PowerContext(new Operator_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operator_expression);
						setState(185);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(186);
						match(POW);
						setState(187);
						operator_expression(12);
						}
						break;
					case 2:
						{
						_localctx = new ProductContext(new Operator_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operator_expression);
						setState(188);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(189);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << SLASH) | (1L << PERCENT))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(190);
						operator_expression(11);
						}
						break;
					case 3:
						{
						_localctx = new SumContext(new Operator_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operator_expression);
						setState(191);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(192);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==DASH) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(193);
						operator_expression(10);
						}
						break;
					case 4:
						{
						_localctx = new ComparisonContext(new Operator_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operator_expression);
						setState(194);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(195);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LANGLE) | (1L << RANGLE) | (1L << LE) | (1L << GE) | (1L << IN) | (1L << IS) | (1L << NOT_IN) | (1L << NOT_IS))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(196);
						operator_expression(9);
						}
						break;
					case 5:
						{
						_localctx = new EqualityContext(new Operator_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operator_expression);
						setState(197);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(198);
						_la = _input.LA(1);
						if ( !(_la==EQEQ || _la==NEQ) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(199);
						operator_expression(8);
						}
						break;
					case 6:
						{
						_localctx = new AndContext(new Operator_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operator_expression);
						setState(200);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(201);
						match(AND);
						setState(202);
						operator_expression(7);
						}
						break;
					case 7:
						{
						_localctx = new OrContext(new Operator_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operator_expression);
						setState(203);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(204);
						match(OR);
						setState(205);
						operator_expression(6);
						}
						break;
					case 8:
						{
						_localctx = new ConditionalContext(new Operator_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operator_expression);
						setState(206);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(207);
						match(QUEST);
						setState(208);
						operator_expression(0);
						setState(209);
						match(COLON);
						setState(210);
						operator_expression(4);
						}
						break;
					case 9:
						{
						_localctx = new PostfixContext(new Operator_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operator_expression);
						setState(212);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(213);
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
				setState(218);
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
			setState(219);
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
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
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
			setState(222);
			primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(229);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Field_getContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_field_get);
					setState(224);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(225);
					match(DOT);
					setState(226);
					id();
					}
					} 
				}
				setState(231);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
			setState(232);
			field_get(0);
			setState(233);
			assign_operator();
			setState(234);
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
			setState(236);
			id();
			setState(237);
			match(LPAREN);
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (ELLIPSIS - 9)) | (1L << (PLUS - 9)) | (1L << (DASH - 9)) | (1L << (LPAREN - 9)) | (1L << (BANG - 9)) | (1L << (TILDE - 9)) | (1L << (INC - 9)) | (1L << (DEC - 9)) | (1L << (TRUE - 9)) | (1L << (FALSE - 9)) | (1L << (NULL - 9)) | (1L << (StringLiteral - 9)) | (1L << (NumberLiteral - 9)) | (1L << (HexLiteral - 9)) | (1L << (BinLiteral - 9)) | (1L << (Identifier - 9)))) != 0)) {
				{
				setState(238);
				args();
				}
			}

			setState(241);
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
			setState(243);
			field_get(0);
			setState(244);
			match(LPAREN);
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (ELLIPSIS - 9)) | (1L << (PLUS - 9)) | (1L << (DASH - 9)) | (1L << (LPAREN - 9)) | (1L << (BANG - 9)) | (1L << (TILDE - 9)) | (1L << (INC - 9)) | (1L << (DEC - 9)) | (1L << (TRUE - 9)) | (1L << (FALSE - 9)) | (1L << (NULL - 9)) | (1L << (StringLiteral - 9)) | (1L << (NumberLiteral - 9)) | (1L << (HexLiteral - 9)) | (1L << (BinLiteral - 9)) | (1L << (Identifier - 9)))) != 0)) {
				{
				setState(245);
				args();
				}
			}

			setState(248);
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
			setState(250);
			field_get(0);
			setState(251);
			match(LSQUARE);
			setState(252);
			args();
			setState(253);
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
			setState(255);
			index_get();
			setState(256);
			assign_operator();
			setState(257);
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
			setState(259);
			expression();
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(260);
				match(COMMA);
				setState(261);
				expression();
				}
				}
				setState(266);
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
			setState(273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				_localctx = new ParenContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				match(LPAREN);
				setState(268);
				expression();
				setState(269);
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
				setState(271);
				literal();
				}
				break;
			case Identifier:
				_localctx = new NameContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(272);
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
			setState(275);
			_la = _input.LA(1);
			if ( !(((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (TRUE - 61)) | (1L << (FALSE - 61)) | (1L << (NULL - 61)) | (1L << (StringLiteral - 61)) | (1L << (NumberLiteral - 61)) | (1L << (HexLiteral - 61)) | (1L << (BinLiteral - 61)))) != 0)) ) {
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(WynnScriptParser.Identifier, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
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
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 13);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3G\u011a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\5\2\64\n\2\3\2\7\2\67\n\2\f\2\16\2:\13\2\3\2\3\2\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\5\4E\n\4\3\4\3\4\3\4\3\5\3\5\3\5\7\5M\n\5\f\5\16\5P\13\5"+
		"\3\6\3\6\7\6T\n\6\f\6\16\6W\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\5\7h\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t{\n\t\f\t\16\t~\13\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0091\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u009f\n\f\3\f"+
		"\3\f\5\f\u00a3\n\f\5\f\u00a5\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ae"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00ba\n\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\7\16\u00d9\n\16\f\16\16\16\u00dc\13\16\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\7\20\u00e6\n\20\f\20\16\20\u00e9\13\20\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\5\22\u00f2\n\22\3\22\3\22\3\23\3\23\3\23\5\23\u00f9"+
		"\n\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\7\26\u0109\n\26\f\26\16\26\u010c\13\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u0114\n\27\3\30\3\30\3\31\3\31\3\31\2\4\32\36\32\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\n\6\2\f\r!!##,-\4\2\16\16"+
		"\20\21\3\2\f\r\5\2\30\31\35\36\658\3\2\33\34\3\2,-\4\2\32\32&+\4\2?AC"+
		"F\2\u012b\2\63\3\2\2\2\4=\3\2\2\2\6@\3\2\2\2\bI\3\2\2\2\nQ\3\2\2\2\fg"+
		"\3\2\2\2\16i\3\2\2\2\20n\3\2\2\2\22\u0090\3\2\2\2\24\u0092\3\2\2\2\26"+
		"\u00a4\3\2\2\2\30\u00ad\3\2\2\2\32\u00b9\3\2\2\2\34\u00dd\3\2\2\2\36\u00df"+
		"\3\2\2\2 \u00ea\3\2\2\2\"\u00ee\3\2\2\2$\u00f5\3\2\2\2&\u00fc\3\2\2\2"+
		"(\u0101\3\2\2\2*\u0105\3\2\2\2,\u0113\3\2\2\2.\u0115\3\2\2\2\60\u0117"+
		"\3\2\2\2\62\64\5\4\3\2\63\62\3\2\2\2\63\64\3\2\2\2\648\3\2\2\2\65\67\5"+
		"\6\4\2\66\65\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29;\3\2\2\2:8\3\2"+
		"\2\2;<\7\2\2\3<\3\3\2\2\2=>\7\"\2\2>?\5\60\31\2?\5\3\2\2\2@A\7.\2\2AB"+
		"\5\60\31\2BD\7\22\2\2CE\5\b\5\2DC\3\2\2\2DE\3\2\2\2EF\3\2\2\2FG\7\23\2"+
		"\2GH\5\n\6\2H\7\3\2\2\2IN\5\60\31\2JK\7\t\2\2KM\5\60\31\2LJ\3\2\2\2MP"+
		"\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\t\3\2\2\2PN\3\2\2\2QU\7\26\2\2RT\5\f\7\2"+
		"SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2VX\3\2\2\2WU\3\2\2\2XY\7\27\2"+
		"\2Y\13\3\2\2\2Z[\5\16\b\2[\\\7\7\2\2\\h\3\2\2\2]h\5\20\t\2^h\5\22\n\2"+
		"_h\5\24\13\2`a\5\26\f\2ab\7\7\2\2bh\3\2\2\2cd\5\30\r\2de\7\7\2\2eh\3\2"+
		"\2\2fh\7\7\2\2gZ\3\2\2\2g]\3\2\2\2g^\3\2\2\2g_\3\2\2\2g`\3\2\2\2gc\3\2"+
		"\2\2gf\3\2\2\2h\r\3\2\2\2ij\7/\2\2jk\5\60\31\2kl\7\32\2\2lm\5\30\r\2m"+
		"\17\3\2\2\2no\7\60\2\2op\7\22\2\2pq\5\30\r\2qr\7\23\2\2r|\5\n\6\2st\7"+
		"\61\2\2tu\7\60\2\2uv\7\22\2\2vw\5\30\r\2wx\7\23\2\2xy\5\n\6\2y{\3\2\2"+
		"\2zs\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177"+
		"\u0080\7\61\2\2\u0080\u0081\5\n\6\2\u0081\21\3\2\2\2\u0082\u0083\7\62"+
		"\2\2\u0083\u0084\7\22\2\2\u0084\u0085\5\30\r\2\u0085\u0086\7\23\2\2\u0086"+
		"\u0087\5\n\6\2\u0087\u0091\3\2\2\2\u0088\u0089\7\63\2\2\u0089\u008a\5"+
		"\n\6\2\u008a\u008b\7\62\2\2\u008b\u008c\7\22\2\2\u008c\u008d\5\30\r\2"+
		"\u008d\u008e\7\23\2\2\u008e\u008f\7\7\2\2\u008f\u0091\3\2\2\2\u0090\u0082"+
		"\3\2\2\2\u0090\u0088\3\2\2\2\u0091\23\3\2\2\2\u0092\u0093\7\64\2\2\u0093"+
		"\u0094\7\22\2\2\u0094\u0095\5\60\31\2\u0095\u0096\7\65\2\2\u0096\u0097"+
		"\5\30\r\2\u0097\u0098\7\23\2\2\u0098\u0099\5\n\6\2\u0099\25\3\2\2\2\u009a"+
		"\u00a5\7:\2\2\u009b\u00a5\79\2\2\u009c\u009e\7;\2\2\u009d\u009f\5\30\r"+
		"\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a5\3\2\2\2\u00a0\u00a2"+
		"\7<\2\2\u00a1\u00a3\5\30\r\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a5\3\2\2\2\u00a4\u009a\3\2\2\2\u00a4\u009b\3\2\2\2\u00a4\u009c\3\2"+
		"\2\2\u00a4\u00a0\3\2\2\2\u00a5\27\3\2\2\2\u00a6\u00ae\5\32\16\2\u00a7"+
		"\u00ae\5\36\20\2\u00a8\u00ae\5 \21\2\u00a9\u00ae\5\"\22\2\u00aa\u00ae"+
		"\5$\23\2\u00ab\u00ae\5&\24\2\u00ac\u00ae\5(\25\2\u00ad\u00a6\3\2\2\2\u00ad"+
		"\u00a7\3\2\2\2\u00ad\u00a8\3\2\2\2\u00ad\u00a9\3\2\2\2\u00ad\u00aa\3\2"+
		"\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\31\3\2\2\2\u00af\u00b0"+
		"\b\16\1\2\u00b0\u00b1\t\2\2\2\u00b1\u00ba\5\32\16\16\u00b2\u00b3\5\60"+
		"\31\2\u00b3\u00b4\5\34\17\2\u00b4\u00b5\5\32\16\5\u00b5\u00ba\3\2\2\2"+
		"\u00b6\u00b7\7\13\2\2\u00b7\u00ba\5\32\16\4\u00b8\u00ba\5,\27\2\u00b9"+
		"\u00af\3\2\2\2\u00b9\u00b2\3\2\2\2\u00b9\u00b6\3\2\2\2\u00b9\u00b8\3\2"+
		"\2\2\u00ba\u00da\3\2\2\2\u00bb\u00bc\f\r\2\2\u00bc\u00bd\7\17\2\2\u00bd"+
		"\u00d9\5\32\16\16\u00be\u00bf\f\f\2\2\u00bf\u00c0\t\3\2\2\u00c0\u00d9"+
		"\5\32\16\r\u00c1\u00c2\f\13\2\2\u00c2\u00c3\t\4\2\2\u00c3\u00d9\5\32\16"+
		"\f\u00c4\u00c5\f\n\2\2\u00c5\u00c6\t\5\2\2\u00c6\u00d9\5\32\16\13\u00c7"+
		"\u00c8\f\t\2\2\u00c8\u00c9\t\6\2\2\u00c9\u00d9\5\32\16\n\u00ca\u00cb\f"+
		"\b\2\2\u00cb\u00cc\7\37\2\2\u00cc\u00d9\5\32\16\t\u00cd\u00ce\f\7\2\2"+
		"\u00ce\u00cf\7 \2\2\u00cf\u00d9\5\32\16\b\u00d0\u00d1\f\6\2\2\u00d1\u00d2"+
		"\7$\2\2\u00d2\u00d3\5\32\16\2\u00d3\u00d4\7\b\2\2\u00d4\u00d5\5\32\16"+
		"\6\u00d5\u00d9\3\2\2\2\u00d6\u00d7\f\17\2\2\u00d7\u00d9\t\7\2\2\u00d8"+
		"\u00bb\3\2\2\2\u00d8\u00be\3\2\2\2\u00d8\u00c1\3\2\2\2\u00d8\u00c4\3\2"+
		"\2\2\u00d8\u00c7\3\2\2\2\u00d8\u00ca\3\2\2\2\u00d8\u00cd\3\2\2\2\u00d8"+
		"\u00d0\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2"+
		"\2\2\u00da\u00db\3\2\2\2\u00db\33\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00de"+
		"\t\b\2\2\u00de\35\3\2\2\2\u00df\u00e0\b\20\1\2\u00e0\u00e1\5,\27\2\u00e1"+
		"\u00e7\3\2\2\2\u00e2\u00e3\f\4\2\2\u00e3\u00e4\7\n\2\2\u00e4\u00e6\5\60"+
		"\31\2\u00e5\u00e2\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\37\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\5\36\20"+
		"\2\u00eb\u00ec\5\34\17\2\u00ec\u00ed\5\30\r\2\u00ed!\3\2\2\2\u00ee\u00ef"+
		"\5\60\31\2\u00ef\u00f1\7\22\2\2\u00f0\u00f2\5*\26\2\u00f1\u00f0\3\2\2"+
		"\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\7\23\2\2\u00f4"+
		"#\3\2\2\2\u00f5\u00f6\5\36\20\2\u00f6\u00f8\7\22\2\2\u00f7\u00f9\5*\26"+
		"\2\u00f8\u00f7\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb"+
		"\7\23\2\2\u00fb%\3\2\2\2\u00fc\u00fd\5\36\20\2\u00fd\u00fe\7\24\2\2\u00fe"+
		"\u00ff\5*\26\2\u00ff\u0100\7\25\2\2\u0100\'\3\2\2\2\u0101\u0102\5&\24"+
		"\2\u0102\u0103\5\34\17\2\u0103\u0104\5\30\r\2\u0104)\3\2\2\2\u0105\u010a"+
		"\5\30\r\2\u0106\u0107\7\t\2\2\u0107\u0109\5\30\r\2\u0108\u0106\3\2\2\2"+
		"\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b+\3"+
		"\2\2\2\u010c\u010a\3\2\2\2\u010d\u010e\7\22\2\2\u010e\u010f\5\30\r\2\u010f"+
		"\u0110\7\23\2\2\u0110\u0114\3\2\2\2\u0111\u0114\5.\30\2\u0112\u0114\5"+
		"\60\31\2\u0113\u010d\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0112\3\2\2\2\u0114"+
		"-\3\2\2\2\u0115\u0116\t\t\2\2\u0116/\3\2\2\2\u0117\u0118\7G\2\2\u0118"+
		"\61\3\2\2\2\26\638DNUg|\u0090\u009e\u00a2\u00a4\u00ad\u00b9\u00d8\u00da"+
		"\u00e7\u00f1\u00f8\u010a\u0113";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}