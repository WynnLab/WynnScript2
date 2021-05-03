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
		FALSE=62, NULL=63, StringLiteral=64, NumberLiteral=65, HexLiteral=66, 
		BinLiteral=67, Identifier=68;
	public static final int
		RULE_wynnScript = 0, RULE_header = 1, RULE_function = 2, RULE_parameters = 3, 
		RULE_statements = 4, RULE_statement = 5, RULE_var_declaration = 6, RULE_if_statement = 7, 
		RULE_while_statement = 8, RULE_for_statement = 9, RULE_control_statement = 10, 
		RULE_expression = 11, RULE_operator_expression = 12, RULE_args = 13, RULE_primary_expression = 14, 
		RULE_literal = 15, RULE_id = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"wynnScript", "header", "function", "parameters", "statements", "statement", 
			"var_declaration", "if_statement", "while_statement", "for_statement", 
			"control_statement", "expression", "operator_expression", "args", "primary_expression", 
			"literal", "id"
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
			"'return'", "'yield'", "'async'", "'await'", "'true'", "'false'", "'null'"
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
			"YIELD", "ASYNC", "AWAIT", "TRUE", "FALSE", "NULL", "StringLiteral", 
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
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HASH) {
				{
				setState(34);
				header();
				}
			}

			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(37);
				function();
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43);
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
			setState(45);
			match(HASH);
			setState(46);
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
			setState(48);
			match(FUNCTION);
			setState(49);
			id();
			setState(50);
			match(LPAREN);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(51);
				parameters();
				}
			}

			setState(54);
			match(RPAREN);
			setState(55);
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
			setState(57);
			id();
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(58);
				match(COMMA);
				setState(59);
				id();
				}
				}
				setState(64);
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
			setState(65);
			match(LCURL);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (ELLIPSIS - 9)) | (1L << (PLUS - 9)) | (1L << (DASH - 9)) | (1L << (LPAREN - 9)) | (1L << (BANG - 9)) | (1L << (TILDE - 9)) | (1L << (INC - 9)) | (1L << (DEC - 9)) | (1L << (VAR - 9)) | (1L << (IF - 9)) | (1L << (WHILE - 9)) | (1L << (DO - 9)) | (1L << (FOR - 9)) | (1L << (CONTINUE - 9)) | (1L << (BREAK - 9)) | (1L << (RETURN - 9)) | (1L << (YIELD - 9)) | (1L << (TRUE - 9)) | (1L << (FALSE - 9)) | (1L << (NULL - 9)) | (1L << (StringLiteral - 9)) | (1L << (NumberLiteral - 9)) | (1L << (HexLiteral - 9)) | (1L << (BinLiteral - 9)) | (1L << (Identifier - 9)))) != 0)) {
				{
				{
				setState(66);
				statement();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
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

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		try {
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				_localctx = new VarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				var_declaration();
				setState(75);
				match(SEMI);
				}
				break;
			case IF:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				if_statement();
				}
				break;
			case WHILE:
			case DO:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				while_statement();
				}
				break;
			case FOR:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
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
				setState(80);
				control_statement();
				setState(81);
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
				setState(83);
				expression();
				setState(84);
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
			setState(88);
			match(VAR);
			setState(89);
			id();
			setState(90);
			match(EQ);
			setState(91);
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
			setState(93);
			match(IF);
			setState(94);
			match(LPAREN);
			setState(95);
			expression();
			setState(96);
			match(RPAREN);
			setState(97);
			statements();
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(98);
					match(ELSE);
					setState(99);
					match(IF);
					setState(100);
					match(LPAREN);
					setState(101);
					expression();
					setState(102);
					match(RPAREN);
					setState(103);
					statements();
					}
					} 
				}
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(110);
			match(ELSE);
			setState(111);
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
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_while_statement);
		try {
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				match(WHILE);
				setState(114);
				match(LPAREN);
				setState(115);
				expression();
				setState(116);
				match(RPAREN);
				setState(117);
				statements();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(DO);
				setState(120);
				statements();
				setState(121);
				match(WHILE);
				setState(122);
				match(LPAREN);
				setState(123);
				expression();
				setState(124);
				match(RPAREN);
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
			setState(128);
			match(FOR);
			setState(129);
			match(LPAREN);
			setState(130);
			id();
			setState(131);
			match(IN);
			setState(132);
			expression();
			setState(133);
			match(RPAREN);
			setState(134);
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
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BREAK:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(BREAK);
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(CONTINUE);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				match(RETURN);
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (ELLIPSIS - 9)) | (1L << (PLUS - 9)) | (1L << (DASH - 9)) | (1L << (LPAREN - 9)) | (1L << (BANG - 9)) | (1L << (TILDE - 9)) | (1L << (INC - 9)) | (1L << (DEC - 9)) | (1L << (TRUE - 9)) | (1L << (FALSE - 9)) | (1L << (NULL - 9)) | (1L << (StringLiteral - 9)) | (1L << (NumberLiteral - 9)) | (1L << (HexLiteral - 9)) | (1L << (BinLiteral - 9)) | (1L << (Identifier - 9)))) != 0)) {
					{
					setState(139);
					expression();
					}
				}

				}
				break;
			case YIELD:
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				match(YIELD);
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (ELLIPSIS - 9)) | (1L << (PLUS - 9)) | (1L << (DASH - 9)) | (1L << (LPAREN - 9)) | (1L << (BANG - 9)) | (1L << (TILDE - 9)) | (1L << (INC - 9)) | (1L << (DEC - 9)) | (1L << (TRUE - 9)) | (1L << (FALSE - 9)) | (1L << (NULL - 9)) | (1L << (StringLiteral - 9)) | (1L << (NumberLiteral - 9)) | (1L << (HexLiteral - 9)) | (1L << (BinLiteral - 9)) | (1L << (Identifier - 9)))) != 0)) {
					{
					setState(143);
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
		public Operator_expressionContext operator_expression() {
			return getRuleContext(Operator_expressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
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
	public static class AccessContext extends Operator_expressionContext {
		public List<Operator_expressionContext> operator_expression() {
			return getRuleContexts(Operator_expressionContext.class);
		}
		public Operator_expressionContext operator_expression(int i) {
			return getRuleContext(Operator_expressionContext.class,i);
		}
		public TerminalNode DOT() { return getToken(WynnScriptParser.DOT, 0); }
		public TerminalNode LSQUARE() { return getToken(WynnScriptParser.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(WynnScriptParser.RSQUARE, 0); }
		public TerminalNode LPAREN() { return getToken(WynnScriptParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(WynnScriptParser.RPAREN, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public AccessContext(Operator_expressionContext ctx) { copyFrom(ctx); }
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
	public static class PrimaryContext extends Operator_expressionContext {
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public PrimaryContext(Operator_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class AssignContext extends Operator_expressionContext {
		public List<Operator_expressionContext> operator_expression() {
			return getRuleContexts(Operator_expressionContext.class);
		}
		public Operator_expressionContext operator_expression(int i) {
			return getRuleContext(Operator_expressionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(WynnScriptParser.EQ, 0); }
		public TerminalNode PLUS_EQ() { return getToken(WynnScriptParser.PLUS_EQ, 0); }
		public TerminalNode MINUS_EQ() { return getToken(WynnScriptParser.MINUS_EQ, 0); }
		public TerminalNode TIMES_EQ() { return getToken(WynnScriptParser.TIMES_EQ, 0); }
		public TerminalNode DIV_EQ() { return getToken(WynnScriptParser.DIV_EQ, 0); }
		public TerminalNode MOD_EQ() { return getToken(WynnScriptParser.MOD_EQ, 0); }
		public TerminalNode POW_EQ() { return getToken(WynnScriptParser.POW_EQ, 0); }
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
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case DASH:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
				{
				_localctx = new PrefixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(151);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << DASH) | (1L << BANG) | (1L << TILDE) | (1L << INC) | (1L << DEC))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(152);
				operator_expression(12);
				}
				break;
			case ELLIPSIS:
				{
				_localctx = new SpreadContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(153);
				match(ELLIPSIS);
				setState(154);
				operator_expression(2);
				}
				break;
			case LPAREN:
			case TRUE:
			case FALSE:
			case NULL:
			case StringLiteral:
			case NumberLiteral:
			case HexLiteral:
			case BinLiteral:
			case Identifier:
				{
				_localctx = new PrimaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(155);
				primary_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(207);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(205);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new PowerContext(new Operator_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operator_expression);
						setState(158);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(159);
						match(POW);
						setState(160);
						operator_expression(12);
						}
						break;
					case 2:
						{
						_localctx = new ProductContext(new Operator_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operator_expression);
						setState(161);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(162);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << SLASH) | (1L << PERCENT))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(163);
						operator_expression(11);
						}
						break;
					case 3:
						{
						_localctx = new SumContext(new Operator_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operator_expression);
						setState(164);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(165);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==DASH) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(166);
						operator_expression(10);
						}
						break;
					case 4:
						{
						_localctx = new ComparisonContext(new Operator_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operator_expression);
						setState(167);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(168);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LANGLE) | (1L << RANGLE) | (1L << LE) | (1L << GE) | (1L << IN) | (1L << IS) | (1L << NOT_IN) | (1L << NOT_IS))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(169);
						operator_expression(9);
						}
						break;
					case 5:
						{
						_localctx = new EqualityContext(new Operator_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operator_expression);
						setState(170);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(171);
						_la = _input.LA(1);
						if ( !(_la==EQEQ || _la==NEQ) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(172);
						operator_expression(8);
						}
						break;
					case 6:
						{
						_localctx = new AndContext(new Operator_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operator_expression);
						setState(173);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(174);
						match(AND);
						setState(175);
						operator_expression(7);
						}
						break;
					case 7:
						{
						_localctx = new OrContext(new Operator_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operator_expression);
						setState(176);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(177);
						match(OR);
						setState(178);
						operator_expression(6);
						}
						break;
					case 8:
						{
						_localctx = new ConditionalContext(new Operator_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operator_expression);
						setState(179);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(180);
						match(QUEST);
						setState(181);
						operator_expression(0);
						setState(182);
						match(COLON);
						setState(183);
						operator_expression(5);
						}
						break;
					case 9:
						{
						_localctx = new AssignContext(new Operator_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operator_expression);
						setState(185);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(186);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << PLUS_EQ) | (1L << MINUS_EQ) | (1L << TIMES_EQ) | (1L << POW_EQ) | (1L << DIV_EQ) | (1L << MOD_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(187);
						operator_expression(4);
						}
						break;
					case 10:
						{
						_localctx = new AccessContext(new Operator_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operator_expression);
						setState(188);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(201);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case DOT:
							{
							setState(189);
							match(DOT);
							setState(190);
							operator_expression(0);
							}
							break;
						case LSQUARE:
							{
							setState(191);
							match(LSQUARE);
							setState(193);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (ELLIPSIS - 9)) | (1L << (PLUS - 9)) | (1L << (DASH - 9)) | (1L << (LPAREN - 9)) | (1L << (BANG - 9)) | (1L << (TILDE - 9)) | (1L << (INC - 9)) | (1L << (DEC - 9)) | (1L << (TRUE - 9)) | (1L << (FALSE - 9)) | (1L << (NULL - 9)) | (1L << (StringLiteral - 9)) | (1L << (NumberLiteral - 9)) | (1L << (HexLiteral - 9)) | (1L << (BinLiteral - 9)) | (1L << (Identifier - 9)))) != 0)) {
								{
								setState(192);
								args();
								}
							}

							setState(195);
							match(RSQUARE);
							}
							break;
						case LPAREN:
							{
							setState(196);
							match(LPAREN);
							setState(198);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (ELLIPSIS - 9)) | (1L << (PLUS - 9)) | (1L << (DASH - 9)) | (1L << (LPAREN - 9)) | (1L << (BANG - 9)) | (1L << (TILDE - 9)) | (1L << (INC - 9)) | (1L << (DEC - 9)) | (1L << (TRUE - 9)) | (1L << (FALSE - 9)) | (1L << (NULL - 9)) | (1L << (StringLiteral - 9)) | (1L << (NumberLiteral - 9)) | (1L << (HexLiteral - 9)) | (1L << (BinLiteral - 9)) | (1L << (Identifier - 9)))) != 0)) {
								{
								setState(197);
								args();
								}
							}

							setState(200);
							match(RPAREN);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 11:
						{
						_localctx = new PostfixContext(new Operator_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operator_expression);
						setState(203);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(204);
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
				setState(209);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		enterRule(_localctx, 26, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			expression();
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(211);
				match(COMMA);
				setState(212);
				expression();
				}
				}
				setState(217);
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
		enterRule(_localctx, 28, RULE_primary_expression);
		try {
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				_localctx = new ParenContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				match(LPAREN);
				setState(219);
				expression();
				setState(220);
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
				setState(222);
				literal();
				}
				break;
			case Identifier:
				_localctx = new NameContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
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
		enterRule(_localctx, 30, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
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
		enterRule(_localctx, 32, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
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
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 14);
		case 10:
			return precpred(_ctx, 13);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3F\u00e9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\5\2&\n\2\3\2\7\2)\n\2\f\2\16\2,\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\5\4\67\n\4\3\4\3\4\3\4\3\5\3\5\3\5\7\5?\n\5\f\5\16\5B\13\5\3"+
		"\6\3\6\7\6F\n\6\f\6\16\6I\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\5\7Y\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\7\tl\n\t\f\t\16\to\13\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0081\n\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u008f\n\f\3\f\3\f\5\f\u0093"+
		"\n\f\5\f\u0095\n\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u009f\n"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00c4\n\16\3\16\3\16\3\16"+
		"\5\16\u00c9\n\16\3\16\5\16\u00cc\n\16\3\16\3\16\7\16\u00d0\n\16\f\16\16"+
		"\16\u00d3\13\16\3\17\3\17\3\17\7\17\u00d8\n\17\f\17\16\17\u00db\13\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00e3\n\20\3\21\3\21\3\22\3\22\3\22"+
		"\2\3\32\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\n\6\2\f\r!!##,"+
		"-\4\2\16\16\20\21\3\2\f\r\5\2\30\31\35\36\658\3\2\33\34\4\2\32\32&+\3"+
		"\2,-\3\2?E\2\u00fc\2%\3\2\2\2\4/\3\2\2\2\6\62\3\2\2\2\b;\3\2\2\2\nC\3"+
		"\2\2\2\fX\3\2\2\2\16Z\3\2\2\2\20_\3\2\2\2\22\u0080\3\2\2\2\24\u0082\3"+
		"\2\2\2\26\u0094\3\2\2\2\30\u0096\3\2\2\2\32\u009e\3\2\2\2\34\u00d4\3\2"+
		"\2\2\36\u00e2\3\2\2\2 \u00e4\3\2\2\2\"\u00e6\3\2\2\2$&\5\4\3\2%$\3\2\2"+
		"\2%&\3\2\2\2&*\3\2\2\2\')\5\6\4\2(\'\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2"+
		"\2\2+-\3\2\2\2,*\3\2\2\2-.\7\2\2\3.\3\3\2\2\2/\60\7\"\2\2\60\61\5\"\22"+
		"\2\61\5\3\2\2\2\62\63\7.\2\2\63\64\5\"\22\2\64\66\7\22\2\2\65\67\5\b\5"+
		"\2\66\65\3\2\2\2\66\67\3\2\2\2\678\3\2\2\289\7\23\2\29:\5\n\6\2:\7\3\2"+
		"\2\2;@\5\"\22\2<=\7\t\2\2=?\5\"\22\2><\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3"+
		"\2\2\2A\t\3\2\2\2B@\3\2\2\2CG\7\26\2\2DF\5\f\7\2ED\3\2\2\2FI\3\2\2\2G"+
		"E\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JK\7\27\2\2K\13\3\2\2\2LM\5\16"+
		"\b\2MN\7\7\2\2NY\3\2\2\2OY\5\20\t\2PY\5\22\n\2QY\5\24\13\2RS\5\26\f\2"+
		"ST\7\7\2\2TY\3\2\2\2UV\5\30\r\2VW\7\7\2\2WY\3\2\2\2XL\3\2\2\2XO\3\2\2"+
		"\2XP\3\2\2\2XQ\3\2\2\2XR\3\2\2\2XU\3\2\2\2Y\r\3\2\2\2Z[\7/\2\2[\\\5\""+
		"\22\2\\]\7\32\2\2]^\5\30\r\2^\17\3\2\2\2_`\7\60\2\2`a\7\22\2\2ab\5\30"+
		"\r\2bc\7\23\2\2cm\5\n\6\2de\7\61\2\2ef\7\60\2\2fg\7\22\2\2gh\5\30\r\2"+
		"hi\7\23\2\2ij\5\n\6\2jl\3\2\2\2kd\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2"+
		"\2np\3\2\2\2om\3\2\2\2pq\7\61\2\2qr\5\n\6\2r\21\3\2\2\2st\7\62\2\2tu\7"+
		"\22\2\2uv\5\30\r\2vw\7\23\2\2wx\5\n\6\2x\u0081\3\2\2\2yz\7\63\2\2z{\5"+
		"\n\6\2{|\7\62\2\2|}\7\22\2\2}~\5\30\r\2~\177\7\23\2\2\177\u0081\3\2\2"+
		"\2\u0080s\3\2\2\2\u0080y\3\2\2\2\u0081\23\3\2\2\2\u0082\u0083\7\64\2\2"+
		"\u0083\u0084\7\22\2\2\u0084\u0085\5\"\22\2\u0085\u0086\7\65\2\2\u0086"+
		"\u0087\5\30\r\2\u0087\u0088\7\23\2\2\u0088\u0089\5\n\6\2\u0089\25\3\2"+
		"\2\2\u008a\u0095\7:\2\2\u008b\u0095\79\2\2\u008c\u008e\7;\2\2\u008d\u008f"+
		"\5\30\r\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0095\3\2\2\2"+
		"\u0090\u0092\7<\2\2\u0091\u0093\5\30\r\2\u0092\u0091\3\2\2\2\u0092\u0093"+
		"\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u008a\3\2\2\2\u0094\u008b\3\2\2\2\u0094"+
		"\u008c\3\2\2\2\u0094\u0090\3\2\2\2\u0095\27\3\2\2\2\u0096\u0097\5\32\16"+
		"\2\u0097\31\3\2\2\2\u0098\u0099\b\16\1\2\u0099\u009a\t\2\2\2\u009a\u009f"+
		"\5\32\16\16\u009b\u009c\7\13\2\2\u009c\u009f\5\32\16\4\u009d\u009f\5\36"+
		"\20\2\u009e\u0098\3\2\2\2\u009e\u009b\3\2\2\2\u009e\u009d\3\2\2\2\u009f"+
		"\u00d1\3\2\2\2\u00a0\u00a1\f\r\2\2\u00a1\u00a2\7\17\2\2\u00a2\u00d0\5"+
		"\32\16\16\u00a3\u00a4\f\f\2\2\u00a4\u00a5\t\3\2\2\u00a5\u00d0\5\32\16"+
		"\r\u00a6\u00a7\f\13\2\2\u00a7\u00a8\t\4\2\2\u00a8\u00d0\5\32\16\f\u00a9"+
		"\u00aa\f\n\2\2\u00aa\u00ab\t\5\2\2\u00ab\u00d0\5\32\16\13\u00ac\u00ad"+
		"\f\t\2\2\u00ad\u00ae\t\6\2\2\u00ae\u00d0\5\32\16\n\u00af\u00b0\f\b\2\2"+
		"\u00b0\u00b1\7\37\2\2\u00b1\u00d0\5\32\16\t\u00b2\u00b3\f\7\2\2\u00b3"+
		"\u00b4\7 \2\2\u00b4\u00d0\5\32\16\b\u00b5\u00b6\f\6\2\2\u00b6\u00b7\7"+
		"$\2\2\u00b7\u00b8\5\32\16\2\u00b8\u00b9\7\b\2\2\u00b9\u00ba\5\32\16\7"+
		"\u00ba\u00d0\3\2\2\2\u00bb\u00bc\f\5\2\2\u00bc\u00bd\t\7\2\2\u00bd\u00d0"+
		"\5\32\16\6\u00be\u00cb\f\20\2\2\u00bf\u00c0\7\n\2\2\u00c0\u00cc\5\32\16"+
		"\2\u00c1\u00c3\7\24\2\2\u00c2\u00c4\5\34\17\2\u00c3\u00c2\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00cc\7\25\2\2\u00c6\u00c8\7"+
		"\22\2\2\u00c7\u00c9\5\34\17\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2"+
		"\u00c9\u00ca\3\2\2\2\u00ca\u00cc\7\23\2\2\u00cb\u00bf\3\2\2\2\u00cb\u00c1"+
		"\3\2\2\2\u00cb\u00c6\3\2\2\2\u00cc\u00d0\3\2\2\2\u00cd\u00ce\f\17\2\2"+
		"\u00ce\u00d0\t\b\2\2\u00cf\u00a0\3\2\2\2\u00cf\u00a3\3\2\2\2\u00cf\u00a6"+
		"\3\2\2\2\u00cf\u00a9\3\2\2\2\u00cf\u00ac\3\2\2\2\u00cf\u00af\3\2\2\2\u00cf"+
		"\u00b2\3\2\2\2\u00cf\u00b5\3\2\2\2\u00cf\u00bb\3\2\2\2\u00cf\u00be\3\2"+
		"\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2\33\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d9\5\30\r"+
		"\2\u00d5\u00d6\7\t\2\2\u00d6\u00d8\5\30\r\2\u00d7\u00d5\3\2\2\2\u00d8"+
		"\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\35\3\2\2"+
		"\2\u00db\u00d9\3\2\2\2\u00dc\u00dd\7\22\2\2\u00dd\u00de\5\30\r\2\u00de"+
		"\u00df\7\23\2\2\u00df\u00e3\3\2\2\2\u00e0\u00e3\5 \21\2\u00e1\u00e3\5"+
		"\"\22\2\u00e2\u00dc\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3"+
		"\37\3\2\2\2\u00e4\u00e5\t\t\2\2\u00e5!\3\2\2\2\u00e6\u00e7\7F\2\2\u00e7"+
		"#\3\2\2\2\25%*\66@GXm\u0080\u008e\u0092\u0094\u009e\u00c3\u00c8\u00cb"+
		"\u00cf\u00d1\u00d9\u00e2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}