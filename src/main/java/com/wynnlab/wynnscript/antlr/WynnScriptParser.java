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
		VAR=46, DEL=47, IF=48, ELSE=49, WHILE=50, DO=51, FOR=52, IN=53, IS=54, 
		NOT_IN=55, NOT_IS=56, CONTINUE=57, BREAK=58, RETURN=59, YIELD=60, ASYNC=61, 
		AWAIT=62, TRUE=63, FALSE=64, NULL=65, THIS=66, StringLiteral=67, NumberLiteral=68, 
		HexLiteral=69, BinLiteral=70, Identifier=71;
	public static final int
		RULE_wynnScript = 0, RULE_header = 1, RULE_function = 2, RULE_parameters = 3, 
		RULE_statements = 4, RULE_statement = 5, RULE_var_declaration = 6, RULE_var_deletion = 7, 
		RULE_if_statement = 8, RULE_while_statement = 9, RULE_for_statement = 10, 
		RULE_control_statement = 11, RULE_expression = 12, RULE_operator_expression = 13, 
		RULE_assign_operator = 14, RULE_access = 15, RULE_operation = 16, RULE_args = 17, 
		RULE_primary_expression = 18, RULE_literal = 19, RULE_simple_id = 20, 
		RULE_id = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"wynnScript", "header", "function", "parameters", "statements", "statement", 
			"var_declaration", "var_deletion", "if_statement", "while_statement", 
			"for_statement", "control_statement", "expression", "operator_expression", 
			"assign_operator", "access", "operation", "args", "primary_expression", 
			"literal", "simple_id", "id"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "';'", "':'", "','", "'.'", "'::'", "'...'", 
			"'+'", "'-'", "'*'", "'**'", "'/'", "'%'", "'('", "')'", "'['", "']'", 
			"'{'", "'}'", "'<'", "'>'", "'='", "'=='", "'!='", "'<='", "'>='", "'&&'", 
			"'||'", "'!'", "'#'", "'~'", "'?'", "'@'", "'+='", "'-='", "'*='", "'**='", 
			"'/='", "'%='", "'++'", "'--'", "'function'", "'var'", "'del'", "'if'", 
			"'else'", "'while'", "'do'", "'for'", "'in'", "'is'", "'!in'", "'!is'", 
			"'continue'", "'break'", "'return'", "'yield'", "'async'", "'await'", 
			"'true'", "'false'", "'null'", "'this'"
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
			"DEL", "IF", "ELSE", "WHILE", "DO", "FOR", "IN", "IS", "NOT_IN", "NOT_IS", 
			"CONTINUE", "BREAK", "RETURN", "YIELD", "ASYNC", "AWAIT", "TRUE", "FALSE", 
			"NULL", "THIS", "StringLiteral", "NumberLiteral", "HexLiteral", "BinLiteral", 
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
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HASH) {
				{
				setState(44);
				header();
				}
			}

			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(47);
				function();
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53);
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
			setState(55);
			match(HASH);
			setState(56);
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
			setState(58);
			match(FUNCTION);
			setState(59);
			id();
			setState(60);
			match(LPAREN);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(61);
				parameters();
				}
			}

			setState(64);
			match(RPAREN);
			setState(65);
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
			setState(67);
			simple_id();
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(68);
				match(COMMA);
				setState(69);
				simple_id();
				}
				}
				setState(74);
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
			setState(75);
			match(LCURL);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEMI) | (1L << ELLIPSIS) | (1L << PLUS) | (1L << DASH) | (1L << LPAREN) | (1L << BANG) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << VAR) | (1L << DEL) | (1L << IF) | (1L << WHILE) | (1L << DO) | (1L << FOR) | (1L << CONTINUE) | (1L << BREAK) | (1L << RETURN) | (1L << YIELD) | (1L << TRUE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FALSE - 64)) | (1L << (NULL - 64)) | (1L << (THIS - 64)) | (1L << (StringLiteral - 64)) | (1L << (NumberLiteral - 64)) | (1L << (HexLiteral - 64)) | (1L << (BinLiteral - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				{
				setState(76);
				statement();
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
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
	public static class DelContext extends StatementContext {
		public Var_deletionContext var_deletion() {
			return getRuleContext(Var_deletionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(WynnScriptParser.SEMI, 0); }
		public DelContext(StatementContext ctx) { copyFrom(ctx); }
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
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				_localctx = new VarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				var_declaration();
				setState(85);
				match(SEMI);
				}
				break;
			case DEL:
				_localctx = new DelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				var_deletion();
				setState(88);
				match(SEMI);
				}
				break;
			case IF:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				if_statement();
				}
				break;
			case WHILE:
			case DO:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(91);
				while_statement();
				}
				break;
			case FOR:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(92);
				for_statement();
				}
				break;
			case CONTINUE:
			case BREAK:
			case RETURN:
			case YIELD:
				_localctx = new ControlContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(93);
				control_statement();
				setState(94);
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
			case THIS:
			case StringLiteral:
			case NumberLiteral:
			case HexLiteral:
			case BinLiteral:
			case Identifier:
				_localctx = new ExContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(96);
				expression();
				setState(97);
				match(SEMI);
				}
				break;
			case SEMI:
				_localctx = new EmptyContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(99);
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
			setState(102);
			match(VAR);
			setState(103);
			simple_id();
			setState(104);
			match(EQ);
			setState(105);
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

	public static class Var_deletionContext extends ParserRuleContext {
		public TerminalNode DEL() { return getToken(WynnScriptParser.DEL, 0); }
		public Simple_idContext simple_id() {
			return getRuleContext(Simple_idContext.class,0);
		}
		public Var_deletionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_deletion; }
	}

	public final Var_deletionContext var_deletion() throws RecognitionException {
		Var_deletionContext _localctx = new Var_deletionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var_deletion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(DEL);
			setState(108);
			simple_id();
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
		enterRule(_localctx, 16, RULE_if_statement);
		int _la;
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
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(127);
				match(ELSE);
				setState(128);
				statements();
				}
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
		enterRule(_localctx, 18, RULE_while_statement);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(WHILE);
				setState(132);
				match(LPAREN);
				setState(133);
				expression();
				setState(134);
				match(RPAREN);
				setState(135);
				statements();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(DO);
				setState(138);
				statements();
				setState(139);
				match(WHILE);
				setState(140);
				match(LPAREN);
				setState(141);
				expression();
				setState(142);
				match(RPAREN);
				setState(143);
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
		enterRule(_localctx, 20, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(FOR);
			setState(148);
			match(LPAREN);
			setState(149);
			simple_id();
			setState(150);
			match(IN);
			setState(151);
			expression();
			setState(152);
			match(RPAREN);
			setState(153);
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
		enterRule(_localctx, 22, RULE_control_statement);
		int _la;
		try {
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BREAK:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(BREAK);
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				match(CONTINUE);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				match(RETURN);
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (ELLIPSIS - 10)) | (1L << (PLUS - 10)) | (1L << (DASH - 10)) | (1L << (LPAREN - 10)) | (1L << (BANG - 10)) | (1L << (TILDE - 10)) | (1L << (INC - 10)) | (1L << (DEC - 10)) | (1L << (TRUE - 10)) | (1L << (FALSE - 10)) | (1L << (NULL - 10)) | (1L << (THIS - 10)) | (1L << (StringLiteral - 10)) | (1L << (NumberLiteral - 10)) | (1L << (HexLiteral - 10)) | (1L << (BinLiteral - 10)) | (1L << (Identifier - 10)))) != 0)) {
					{
					setState(158);
					expression();
					}
				}

				}
				break;
			case YIELD:
				enterOuterAlt(_localctx, 4);
				{
				setState(161);
				match(YIELD);
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (ELLIPSIS - 10)) | (1L << (PLUS - 10)) | (1L << (DASH - 10)) | (1L << (LPAREN - 10)) | (1L << (BANG - 10)) | (1L << (TILDE - 10)) | (1L << (INC - 10)) | (1L << (DEC - 10)) | (1L << (TRUE - 10)) | (1L << (FALSE - 10)) | (1L << (NULL - 10)) | (1L << (THIS - 10)) | (1L << (StringLiteral - 10)) | (1L << (NumberLiteral - 10)) | (1L << (HexLiteral - 10)) | (1L << (BinLiteral - 10)) | (1L << (Identifier - 10)))) != 0)) {
					{
					setState(162);
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
		enterRule(_localctx, 24, RULE_expression);
		try {
			_localctx = new OperatorContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
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
	public static class AccContext extends Operator_expressionContext {
		public AccessContext access() {
			return getRuleContext(AccessContext.class,0);
		}
		public AccContext(Operator_expressionContext ctx) { copyFrom(ctx); }
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
	public static class Field_setContext extends Operator_expressionContext {
		public AccessContext access() {
			return getRuleContext(AccessContext.class,0);
		}
		public TerminalNode DOT() { return getToken(WynnScriptParser.DOT, 0); }
		public Simple_idContext simple_id() {
			return getRuleContext(Simple_idContext.class,0);
		}
		public Assign_operatorContext assign_operator() {
			return getRuleContext(Assign_operatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Field_setContext(Operator_expressionContext ctx) { copyFrom(ctx); }
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_operator_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new PrimaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(170);
				primary_expression();
				}
				break;
			case 2:
				{
				_localctx = new AccContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(171);
				access(0);
				}
				break;
			case 3:
				{
				_localctx = new PrefixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << DASH) | (1L << BANG) | (1L << TILDE) | (1L << INC) | (1L << DEC))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(173);
				operator_expression(12);
				}
				break;
			case 4:
				{
				_localctx = new AssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174);
				id();
				setState(175);
				assign_operator();
				setState(176);
				operator_expression(3);
				}
				break;
			case 5:
				{
				_localctx = new Field_setContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(178);
				access(0);
				setState(179);
				match(DOT);
				setState(180);
				simple_id();
				setState(181);
				assign_operator();
				setState(182);
				expression();
				}
				break;
			case 6:
				{
				_localctx = new SpreadContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(184);
				match(ELLIPSIS);
				setState(185);
				operator_expression(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(217);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new PowerContext(new Operator_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operator_expression);
						setState(188);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(189);
						match(POW);
						setState(190);
						operator_expression(12);
						}
						break;
					case 2:
						{
						_localctx = new ProductContext(new Operator_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operator_expression);
						setState(191);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(192);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << SLASH) | (1L << PERCENT))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(193);
						operator_expression(11);
						}
						break;
					case 3:
						{
						_localctx = new SumContext(new Operator_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operator_expression);
						setState(194);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(195);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==DASH) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(196);
						operator_expression(10);
						}
						break;
					case 4:
						{
						_localctx = new ComparisonContext(new Operator_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operator_expression);
						setState(197);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(198);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LANGLE) | (1L << RANGLE) | (1L << LE) | (1L << GE) | (1L << IN) | (1L << IS) | (1L << NOT_IN) | (1L << NOT_IS))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(199);
						operator_expression(9);
						}
						break;
					case 5:
						{
						_localctx = new EqualityContext(new Operator_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operator_expression);
						setState(200);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(201);
						_la = _input.LA(1);
						if ( !(_la==EQEQ || _la==NEQ) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(202);
						operator_expression(8);
						}
						break;
					case 6:
						{
						_localctx = new AndContext(new Operator_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operator_expression);
						setState(203);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(204);
						match(AND);
						setState(205);
						operator_expression(7);
						}
						break;
					case 7:
						{
						_localctx = new OrContext(new Operator_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operator_expression);
						setState(206);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(207);
						match(OR);
						setState(208);
						operator_expression(6);
						}
						break;
					case 8:
						{
						_localctx = new ConditionalContext(new Operator_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operator_expression);
						setState(209);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(210);
						match(QUEST);
						setState(211);
						operator_expression(0);
						setState(212);
						match(COLON);
						setState(213);
						operator_expression(4);
						}
						break;
					case 9:
						{
						_localctx = new PostfixContext(new Operator_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operator_expression);
						setState(215);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(216);
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
				setState(221);
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
		enterRule(_localctx, 28, RULE_assign_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
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

	public static class AccessContext extends ParserRuleContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public TerminalNode THIS() { return getToken(WynnScriptParser.THIS, 0); }
		public AccessContext access() {
			return getRuleContext(AccessContext.class,0);
		}
		public TerminalNode DOT() { return getToken(WynnScriptParser.DOT, 0); }
		public AccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access; }
	}

	public final AccessContext access() throws RecognitionException {
		return access(0);
	}

	private AccessContext access(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AccessContext _localctx = new AccessContext(_ctx, _parentState);
		AccessContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_access, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(225);
				operation();
				}
				break;
			case 2:
				{
				setState(226);
				primary_expression();
				}
				break;
			case 3:
				{
				setState(227);
				match(THIS);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(235);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AccessContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_access);
					setState(230);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(231);
					match(DOT);
					setState(232);
					operation();
					}
					} 
				}
				setState(237);
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

	public static class OperationContext extends ParserRuleContext {
		public Simple_idContext simple_id() {
			return getRuleContext(Simple_idContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(WynnScriptParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(WynnScriptParser.RPAREN, 0); }
		public List<ArgsContext> args() {
			return getRuleContexts(ArgsContext.class);
		}
		public ArgsContext args(int i) {
			return getRuleContext(ArgsContext.class,i);
		}
		public List<TerminalNode> LSQUARE() { return getTokens(WynnScriptParser.LSQUARE); }
		public TerminalNode LSQUARE(int i) {
			return getToken(WynnScriptParser.LSQUARE, i);
		}
		public List<TerminalNode> RSQUARE() { return getTokens(WynnScriptParser.RSQUARE); }
		public TerminalNode RSQUARE(int i) {
			return getToken(WynnScriptParser.RSQUARE, i);
		}
		public Assign_operatorContext assign_operator() {
			return getRuleContext(Assign_operatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_operation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			simple_id();
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(240);
				match(LPAREN);
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (ELLIPSIS - 10)) | (1L << (PLUS - 10)) | (1L << (DASH - 10)) | (1L << (LPAREN - 10)) | (1L << (BANG - 10)) | (1L << (TILDE - 10)) | (1L << (INC - 10)) | (1L << (DEC - 10)) | (1L << (TRUE - 10)) | (1L << (FALSE - 10)) | (1L << (NULL - 10)) | (1L << (THIS - 10)) | (1L << (StringLiteral - 10)) | (1L << (NumberLiteral - 10)) | (1L << (HexLiteral - 10)) | (1L << (BinLiteral - 10)) | (1L << (Identifier - 10)))) != 0)) {
					{
					setState(241);
					args();
					}
				}

				setState(244);
				match(RPAREN);
				}
				break;
			case 3:
				{
				setState(249); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(245);
						match(LSQUARE);
						setState(246);
						args();
						setState(247);
						match(RSQUARE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(251); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(256);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(253);
					assign_operator();
					setState(254);
					expression();
					}
					break;
				}
				}
				break;
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
		enterRule(_localctx, 34, RULE_args);
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
	public static class ThisContext extends Primary_expressionContext {
		public TerminalNode THIS() { return getToken(WynnScriptParser.THIS, 0); }
		public ThisContext(Primary_expressionContext ctx) { copyFrom(ctx); }
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_primary_expression);
		try {
			setState(275);
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
			case THIS:
				_localctx = new ThisContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(274);
				match(THIS);
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
		enterRule(_localctx, 38, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_la = _input.LA(1);
			if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (TRUE - 63)) | (1L << (FALSE - 63)) | (1L << (NULL - 63)) | (1L << (StringLiteral - 63)) | (1L << (NumberLiteral - 63)) | (1L << (HexLiteral - 63)) | (1L << (BinLiteral - 63)))) != 0)) ) {
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
		enterRule(_localctx, 40, RULE_simple_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
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
		enterRule(_localctx, 42, RULE_id);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			simple_id();
			setState(286);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(282);
					match(COLONCOLON);
					setState(283);
					simple_id();
					}
					} 
				}
				setState(288);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
		case 13:
			return operator_expression_sempred((Operator_expressionContext)_localctx, predIndex);
		case 15:
			return access_sempred((AccessContext)_localctx, predIndex);
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
	private boolean access_sempred(AccessContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3I\u0124\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\5\2\60\n\2\3\2"+
		"\7\2\63\n\2\f\2\16\2\66\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4A"+
		"\n\4\3\4\3\4\3\4\3\5\3\5\3\5\7\5I\n\5\f\5\16\5L\13\5\3\6\3\6\7\6P\n\6"+
		"\f\6\16\6S\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\5\7g\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n}\n\n\f\n\16\n\u0080\13\n\3"+
		"\n\3\n\5\n\u0084\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13\u0094\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\5\r\u00a2\n\r\3\r\3\r\5\r\u00a6\n\r\5\r\u00a8\n\r\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u00bd\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00dc\n\17\f\17\16\17\u00df"+
		"\13\17\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u00e7\n\21\3\21\3\21\3\21\7"+
		"\21\u00ec\n\21\f\21\16\21\u00ef\13\21\3\22\3\22\3\22\3\22\5\22\u00f5\n"+
		"\22\3\22\3\22\3\22\3\22\3\22\6\22\u00fc\n\22\r\22\16\22\u00fd\3\22\3\22"+
		"\3\22\5\22\u0103\n\22\5\22\u0105\n\22\3\23\3\23\3\23\7\23\u010a\n\23\f"+
		"\23\16\23\u010d\13\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0116\n"+
		"\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\7\27\u011f\n\27\f\27\16\27\u0122"+
		"\13\27\3\27\2\4\34 \30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"+
		"\2\n\6\2\r\16\"\"$$-.\4\2\17\17\21\22\3\2\r\16\5\2\31\32\36\37\67:\3\2"+
		"\34\35\3\2-.\4\2\33\33\',\4\2ACEH\2\u013c\2/\3\2\2\2\49\3\2\2\2\6<\3\2"+
		"\2\2\bE\3\2\2\2\nM\3\2\2\2\ff\3\2\2\2\16h\3\2\2\2\20m\3\2\2\2\22p\3\2"+
		"\2\2\24\u0093\3\2\2\2\26\u0095\3\2\2\2\30\u00a7\3\2\2\2\32\u00a9\3\2\2"+
		"\2\34\u00bc\3\2\2\2\36\u00e0\3\2\2\2 \u00e6\3\2\2\2\"\u00f0\3\2\2\2$\u0106"+
		"\3\2\2\2&\u0115\3\2\2\2(\u0117\3\2\2\2*\u0119\3\2\2\2,\u011b\3\2\2\2."+
		"\60\5\4\3\2/.\3\2\2\2/\60\3\2\2\2\60\64\3\2\2\2\61\63\5\6\4\2\62\61\3"+
		"\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\67\3\2\2\2\66\64\3"+
		"\2\2\2\678\7\2\2\38\3\3\2\2\29:\7#\2\2:;\5,\27\2;\5\3\2\2\2<=\7/\2\2="+
		">\5,\27\2>@\7\23\2\2?A\5\b\5\2@?\3\2\2\2@A\3\2\2\2AB\3\2\2\2BC\7\24\2"+
		"\2CD\5\n\6\2D\7\3\2\2\2EJ\5*\26\2FG\7\t\2\2GI\5*\26\2HF\3\2\2\2IL\3\2"+
		"\2\2JH\3\2\2\2JK\3\2\2\2K\t\3\2\2\2LJ\3\2\2\2MQ\7\27\2\2NP\5\f\7\2ON\3"+
		"\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RT\3\2\2\2SQ\3\2\2\2TU\7\30\2\2U\13"+
		"\3\2\2\2VW\5\16\b\2WX\7\7\2\2Xg\3\2\2\2YZ\5\20\t\2Z[\7\7\2\2[g\3\2\2\2"+
		"\\g\5\22\n\2]g\5\24\13\2^g\5\26\f\2_`\5\30\r\2`a\7\7\2\2ag\3\2\2\2bc\5"+
		"\32\16\2cd\7\7\2\2dg\3\2\2\2eg\7\7\2\2fV\3\2\2\2fY\3\2\2\2f\\\3\2\2\2"+
		"f]\3\2\2\2f^\3\2\2\2f_\3\2\2\2fb\3\2\2\2fe\3\2\2\2g\r\3\2\2\2hi\7\60\2"+
		"\2ij\5*\26\2jk\7\33\2\2kl\5\32\16\2l\17\3\2\2\2mn\7\61\2\2no\5*\26\2o"+
		"\21\3\2\2\2pq\7\62\2\2qr\7\23\2\2rs\5\32\16\2st\7\24\2\2t~\5\n\6\2uv\7"+
		"\63\2\2vw\7\62\2\2wx\7\23\2\2xy\5\32\16\2yz\7\24\2\2z{\5\n\6\2{}\3\2\2"+
		"\2|u\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0083\3\2\2\2\u0080"+
		"~\3\2\2\2\u0081\u0082\7\63\2\2\u0082\u0084\5\n\6\2\u0083\u0081\3\2\2\2"+
		"\u0083\u0084\3\2\2\2\u0084\23\3\2\2\2\u0085\u0086\7\64\2\2\u0086\u0087"+
		"\7\23\2\2\u0087\u0088\5\32\16\2\u0088\u0089\7\24\2\2\u0089\u008a\5\n\6"+
		"\2\u008a\u0094\3\2\2\2\u008b\u008c\7\65\2\2\u008c\u008d\5\n\6\2\u008d"+
		"\u008e\7\64\2\2\u008e\u008f\7\23\2\2\u008f\u0090\5\32\16\2\u0090\u0091"+
		"\7\24\2\2\u0091\u0092\7\7\2\2\u0092\u0094\3\2\2\2\u0093\u0085\3\2\2\2"+
		"\u0093\u008b\3\2\2\2\u0094\25\3\2\2\2\u0095\u0096\7\66\2\2\u0096\u0097"+
		"\7\23\2\2\u0097\u0098\5*\26\2\u0098\u0099\7\67\2\2\u0099\u009a\5\32\16"+
		"\2\u009a\u009b\7\24\2\2\u009b\u009c\5\n\6\2\u009c\27\3\2\2\2\u009d\u00a8"+
		"\7<\2\2\u009e\u00a8\7;\2\2\u009f\u00a1\7=\2\2\u00a0\u00a2\5\32\16\2\u00a1"+
		"\u00a0\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a8\3\2\2\2\u00a3\u00a5\7>"+
		"\2\2\u00a4\u00a6\5\32\16\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\u00a8\3\2\2\2\u00a7\u009d\3\2\2\2\u00a7\u009e\3\2\2\2\u00a7\u009f\3\2"+
		"\2\2\u00a7\u00a3\3\2\2\2\u00a8\31\3\2\2\2\u00a9\u00aa\5\34\17\2\u00aa"+
		"\33\3\2\2\2\u00ab\u00ac\b\17\1\2\u00ac\u00bd\5&\24\2\u00ad\u00bd\5 \21"+
		"\2\u00ae\u00af\t\2\2\2\u00af\u00bd\5\34\17\16\u00b0\u00b1\5,\27\2\u00b1"+
		"\u00b2\5\36\20\2\u00b2\u00b3\5\34\17\5\u00b3\u00bd\3\2\2\2\u00b4\u00b5"+
		"\5 \21\2\u00b5\u00b6\7\n\2\2\u00b6\u00b7\5*\26\2\u00b7\u00b8\5\36\20\2"+
		"\u00b8\u00b9\5\32\16\2\u00b9\u00bd\3\2\2\2\u00ba\u00bb\7\f\2\2\u00bb\u00bd"+
		"\5\34\17\3\u00bc\u00ab\3\2\2\2\u00bc\u00ad\3\2\2\2\u00bc\u00ae\3\2\2\2"+
		"\u00bc\u00b0\3\2\2\2\u00bc\u00b4\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00dd"+
		"\3\2\2\2\u00be\u00bf\f\r\2\2\u00bf\u00c0\7\20\2\2\u00c0\u00dc\5\34\17"+
		"\16\u00c1\u00c2\f\f\2\2\u00c2\u00c3\t\3\2\2\u00c3\u00dc\5\34\17\r\u00c4"+
		"\u00c5\f\13\2\2\u00c5\u00c6\t\4\2\2\u00c6\u00dc\5\34\17\f\u00c7\u00c8"+
		"\f\n\2\2\u00c8\u00c9\t\5\2\2\u00c9\u00dc\5\34\17\13\u00ca\u00cb\f\t\2"+
		"\2\u00cb\u00cc\t\6\2\2\u00cc\u00dc\5\34\17\n\u00cd\u00ce\f\b\2\2\u00ce"+
		"\u00cf\7 \2\2\u00cf\u00dc\5\34\17\t\u00d0\u00d1\f\7\2\2\u00d1\u00d2\7"+
		"!\2\2\u00d2\u00dc\5\34\17\b\u00d3\u00d4\f\6\2\2\u00d4\u00d5\7%\2\2\u00d5"+
		"\u00d6\5\34\17\2\u00d6\u00d7\7\b\2\2\u00d7\u00d8\5\34\17\6\u00d8\u00dc"+
		"\3\2\2\2\u00d9\u00da\f\17\2\2\u00da\u00dc\t\7\2\2\u00db\u00be\3\2\2\2"+
		"\u00db\u00c1\3\2\2\2\u00db\u00c4\3\2\2\2\u00db\u00c7\3\2\2\2\u00db\u00ca"+
		"\3\2\2\2\u00db\u00cd\3\2\2\2\u00db\u00d0\3\2\2\2\u00db\u00d3\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2"+
		"\2\2\u00de\35\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e1\t\b\2\2\u00e1\37"+
		"\3\2\2\2\u00e2\u00e3\b\21\1\2\u00e3\u00e7\5\"\22\2\u00e4\u00e7\5&\24\2"+
		"\u00e5\u00e7\7D\2\2\u00e6\u00e2\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e5"+
		"\3\2\2\2\u00e7\u00ed\3\2\2\2\u00e8\u00e9\f\6\2\2\u00e9\u00ea\7\n\2\2\u00ea"+
		"\u00ec\5\"\22\2\u00eb\u00e8\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3"+
		"\2\2\2\u00ed\u00ee\3\2\2\2\u00ee!\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u0104"+
		"\5*\26\2\u00f1\u0105\3\2\2\2\u00f2\u00f4\7\23\2\2\u00f3\u00f5\5$\23\2"+
		"\u00f4\u00f3\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u0105"+
		"\7\24\2\2\u00f7\u00f8\7\25\2\2\u00f8\u00f9\5$\23\2\u00f9\u00fa\7\26\2"+
		"\2\u00fa\u00fc\3\2\2\2\u00fb\u00f7\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fb"+
		"\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0102\3\2\2\2\u00ff\u0100\5\36\20\2"+
		"\u0100\u0101\5\32\16\2\u0101\u0103\3\2\2\2\u0102\u00ff\3\2\2\2\u0102\u0103"+
		"\3\2\2\2\u0103\u0105\3\2\2\2\u0104\u00f1\3\2\2\2\u0104\u00f2\3\2\2\2\u0104"+
		"\u00fb\3\2\2\2\u0105#\3\2\2\2\u0106\u010b\5\32\16\2\u0107\u0108\7\t\2"+
		"\2\u0108\u010a\5\32\16\2\u0109\u0107\3\2\2\2\u010a\u010d\3\2\2\2\u010b"+
		"\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c%\3\2\2\2\u010d\u010b\3\2\2\2"+
		"\u010e\u010f\7\23\2\2\u010f\u0110\5\32\16\2\u0110\u0111\7\24\2\2\u0111"+
		"\u0116\3\2\2\2\u0112\u0116\5(\25\2\u0113\u0116\5,\27\2\u0114\u0116\7D"+
		"\2\2\u0115\u010e\3\2\2\2\u0115\u0112\3\2\2\2\u0115\u0113\3\2\2\2\u0115"+
		"\u0114\3\2\2\2\u0116\'\3\2\2\2\u0117\u0118\t\t\2\2\u0118)\3\2\2\2\u0119"+
		"\u011a\7I\2\2\u011a+\3\2\2\2\u011b\u0120\5*\26\2\u011c\u011d\7\13\2\2"+
		"\u011d\u011f\5*\26\2\u011e\u011c\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e"+
		"\3\2\2\2\u0120\u0121\3\2\2\2\u0121-\3\2\2\2\u0122\u0120\3\2\2\2\32/\64"+
		"@JQf~\u0083\u0093\u00a1\u00a5\u00a7\u00bc\u00db\u00dd\u00e6\u00ed\u00f4"+
		"\u00fd\u0102\u0104\u010b\u0115\u0120";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}