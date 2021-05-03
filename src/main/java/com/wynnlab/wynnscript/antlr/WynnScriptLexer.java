// Generated from D:/IdeaProjects/WynnScript2/src/main/antlr\WynnScriptLexer.g4 by ANTLR 4.9.1
package com.wynnlab.wynnscript.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WynnScriptLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NL", "Space", "LineComment", "BlockComment", "SEMI", "COLON", "COMMA", 
			"DOT", "ELLIPSIS", "PLUS", "DASH", "STAR", "POW", "SLASH", "PERCENT", 
			"LPAREN", "RPAREN", "LSQUARE", "RSQUARE", "LCURL", "RCURL", "LANGLE", 
			"RANGLE", "EQ", "EQEQ", "NEQ", "LE", "GE", "AND", "OR", "BANG", "HASH", 
			"TILDE", "QUEST", "AT", "PLUS_EQ", "MINUS_EQ", "TIMES_EQ", "POW_EQ", 
			"DIV_EQ", "MOD_EQ", "INC", "DEC", "FUNCTION", "VAR", "IF", "ELSE", "WHILE", 
			"DO", "FOR", "IN", "IS", "NOT_IN", "NOT_IS", "CONTINUE", "BREAK", "RETURN", 
			"YIELD", "ASYNC", "AWAIT", "TRUE", "FALSE", "NULL", "StringLiteral", 
			"EscapeSeq", "NumberLiteral", "DecimalLiteral", "RealLiteral", "Exponent", 
			"HexLiteral", "BinLiteral", "Letter", "StartLetter", "Identifier"
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


	public WynnScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "WynnScriptLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2F\u0207\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\3\2\3\2\3\2\5\2\u009b\n\2\3\2\3\2\3\3\6\3\u00a0\n\3\r"+
		"\3\16\3\u00a1\3\3\3\3\3\4\3\4\3\4\3\4\7\4\u00aa\n\4\f\4\16\4\u00ad\13"+
		"\4\3\4\3\4\5\4\u00b1\n\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5\u00b9\n\5\f\5\16"+
		"\5\u00bc\13\5\3\5\3\5\3\5\5\5\u00c1\n\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3"+
		"\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3"+
		"!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)"+
		"\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3."+
		"\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\62"+
		"\3\62\3\62\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66"+
		"\3\66\3\66\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\38\38\39\39\39\39"+
		"\39\39\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3=\3="+
		"\3=\3=\3=\3=\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3A\3A\3A"+
		"\3A\3A\7A\u0192\nA\fA\16A\u0195\13A\3A\3A\3A\3A\3A\3A\7A\u019d\nA\fA\16"+
		"A\u01a0\13A\3A\5A\u01a3\nA\3B\3B\3B\3B\3B\3B\3B\5B\u01ac\nB\3C\3C\5C\u01b0"+
		"\nC\3D\3D\3D\7D\u01b5\nD\fD\16D\u01b8\13D\5D\u01ba\nD\3E\3E\3E\7E\u01bf"+
		"\nE\fE\16E\u01c2\13E\5E\u01c4\nE\3E\3E\5E\u01c8\nE\3E\5E\u01cb\nE\3E\3"+
		"E\7E\u01cf\nE\fE\16E\u01d2\13E\5E\u01d4\nE\3E\3E\6E\u01d8\nE\rE\16E\u01d9"+
		"\3E\5E\u01dd\nE\3E\5E\u01e0\nE\5E\u01e2\nE\3F\3F\5F\u01e6\nF\3F\3F\7F"+
		"\u01ea\nF\fF\16F\u01ed\13F\3G\3G\3G\6G\u01f2\nG\rG\16G\u01f3\3H\3H\3H"+
		"\6H\u01f9\nH\rH\16H\u01fa\3I\3I\3J\3J\3K\3K\7K\u0203\nK\fK\16K\u0206\13"+
		"K\4\u00ab\u00ba\2L\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083\2\u0085C\u0087\2"+
		"\u0089\2\u008b\2\u008dD\u008fE\u0091\2\u0093\2\u0095F\3\2\22\4\2\f\f\17"+
		"\17\5\2\13\13\16\16\"\"\6\2\f\f\17\17$$^^\6\2\f\f\17\17))^^\5\2ppttvv"+
		"\5\2\62;CHch\3\2\63;\3\2\62;\4\2HHhh\4\2GGgg\4\2--//\4\2ZZzz\4\2DDdd\3"+
		"\2\62\63\6\2\62;C\\aac|\5\2C\\aac|\2\u0220\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M"+
		"\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2"+
		"\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2"+
		"\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s"+
		"\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177"+
		"\3\2\2\2\2\u0081\3\2\2\2\2\u0085\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2"+
		"\2\2\u0095\3\2\2\2\3\u009a\3\2\2\2\5\u009f\3\2\2\2\7\u00a5\3\2\2\2\t\u00b4"+
		"\3\2\2\2\13\u00c4\3\2\2\2\r\u00c6\3\2\2\2\17\u00c8\3\2\2\2\21\u00ca\3"+
		"\2\2\2\23\u00cc\3\2\2\2\25\u00d0\3\2\2\2\27\u00d2\3\2\2\2\31\u00d4\3\2"+
		"\2\2\33\u00d6\3\2\2\2\35\u00d9\3\2\2\2\37\u00db\3\2\2\2!\u00dd\3\2\2\2"+
		"#\u00df\3\2\2\2%\u00e1\3\2\2\2\'\u00e3\3\2\2\2)\u00e5\3\2\2\2+\u00e7\3"+
		"\2\2\2-\u00e9\3\2\2\2/\u00eb\3\2\2\2\61\u00ed\3\2\2\2\63\u00ef\3\2\2\2"+
		"\65\u00f2\3\2\2\2\67\u00f5\3\2\2\29\u00f8\3\2\2\2;\u00fb\3\2\2\2=\u00fe"+
		"\3\2\2\2?\u0101\3\2\2\2A\u0103\3\2\2\2C\u0105\3\2\2\2E\u0107\3\2\2\2G"+
		"\u0109\3\2\2\2I\u010b\3\2\2\2K\u010e\3\2\2\2M\u0111\3\2\2\2O\u0114\3\2"+
		"\2\2Q\u0118\3\2\2\2S\u011b\3\2\2\2U\u011e\3\2\2\2W\u0121\3\2\2\2Y\u0124"+
		"\3\2\2\2[\u012d\3\2\2\2]\u0131\3\2\2\2_\u0134\3\2\2\2a\u0139\3\2\2\2c"+
		"\u013f\3\2\2\2e\u0142\3\2\2\2g\u0146\3\2\2\2i\u0149\3\2\2\2k\u014c\3\2"+
		"\2\2m\u0150\3\2\2\2o\u0154\3\2\2\2q\u015d\3\2\2\2s\u0163\3\2\2\2u\u016a"+
		"\3\2\2\2w\u0170\3\2\2\2y\u0176\3\2\2\2{\u017c\3\2\2\2}\u0181\3\2\2\2\177"+
		"\u0187\3\2\2\2\u0081\u01a2\3\2\2\2\u0083\u01a4\3\2\2\2\u0085\u01af\3\2"+
		"\2\2\u0087\u01b9\3\2\2\2\u0089\u01e1\3\2\2\2\u008b\u01e3\3\2\2\2\u008d"+
		"\u01ee\3\2\2\2\u008f\u01f5\3\2\2\2\u0091\u01fc\3\2\2\2\u0093\u01fe\3\2"+
		"\2\2\u0095\u0200\3\2\2\2\u0097\u009b\t\2\2\2\u0098\u0099\7\17\2\2\u0099"+
		"\u009b\7\f\2\2\u009a\u0097\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009c\3\2"+
		"\2\2\u009c\u009d\b\2\2\2\u009d\4\3\2\2\2\u009e\u00a0\t\3\2\2\u009f\u009e"+
		"\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00a4\b\3\2\2\u00a4\6\3\2\2\2\u00a5\u00a6\7\61\2"+
		"\2\u00a6\u00a7\7\61\2\2\u00a7\u00ab\3\2\2\2\u00a8\u00aa\13\2\2\2\u00a9"+
		"\u00a8\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ab\u00a9\3\2"+
		"\2\2\u00ac\u00b0\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00b1\5\3\2\2\u00af"+
		"\u00b1\7\2\2\3\u00b0\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b2\3\2"+
		"\2\2\u00b2\u00b3\b\4\2\2\u00b3\b\3\2\2\2\u00b4\u00b5\7\61\2\2\u00b5\u00b6"+
		"\7,\2\2\u00b6\u00ba\3\2\2\2\u00b7\u00b9\13\2\2\2\u00b8\u00b7\3\2\2\2\u00b9"+
		"\u00bc\3\2\2\2\u00ba\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00c0\3\2"+
		"\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00be\7,\2\2\u00be\u00c1\7\61\2\2\u00bf"+
		"\u00c1\7\2\2\3\u00c0\u00bd\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c2\3\2"+
		"\2\2\u00c2\u00c3\b\5\2\2\u00c3\n\3\2\2\2\u00c4\u00c5\7=\2\2\u00c5\f\3"+
		"\2\2\2\u00c6\u00c7\7<\2\2\u00c7\16\3\2\2\2\u00c8\u00c9\7.\2\2\u00c9\20"+
		"\3\2\2\2\u00ca\u00cb\7\60\2\2\u00cb\22\3\2\2\2\u00cc\u00cd\7\60\2\2\u00cd"+
		"\u00ce\7\60\2\2\u00ce\u00cf\7\60\2\2\u00cf\24\3\2\2\2\u00d0\u00d1\7-\2"+
		"\2\u00d1\26\3\2\2\2\u00d2\u00d3\7/\2\2\u00d3\30\3\2\2\2\u00d4\u00d5\7"+
		",\2\2\u00d5\32\3\2\2\2\u00d6\u00d7\7,\2\2\u00d7\u00d8\7,\2\2\u00d8\34"+
		"\3\2\2\2\u00d9\u00da\7\61\2\2\u00da\36\3\2\2\2\u00db\u00dc\7\'\2\2\u00dc"+
		" \3\2\2\2\u00dd\u00de\7*\2\2\u00de\"\3\2\2\2\u00df\u00e0\7+\2\2\u00e0"+
		"$\3\2\2\2\u00e1\u00e2\7]\2\2\u00e2&\3\2\2\2\u00e3\u00e4\7_\2\2\u00e4("+
		"\3\2\2\2\u00e5\u00e6\7}\2\2\u00e6*\3\2\2\2\u00e7\u00e8\7\177\2\2\u00e8"+
		",\3\2\2\2\u00e9\u00ea\7>\2\2\u00ea.\3\2\2\2\u00eb\u00ec\7@\2\2\u00ec\60"+
		"\3\2\2\2\u00ed\u00ee\7?\2\2\u00ee\62\3\2\2\2\u00ef\u00f0\7?\2\2\u00f0"+
		"\u00f1\7?\2\2\u00f1\64\3\2\2\2\u00f2\u00f3\7#\2\2\u00f3\u00f4\7?\2\2\u00f4"+
		"\66\3\2\2\2\u00f5\u00f6\7>\2\2\u00f6\u00f7\7?\2\2\u00f78\3\2\2\2\u00f8"+
		"\u00f9\7@\2\2\u00f9\u00fa\7?\2\2\u00fa:\3\2\2\2\u00fb\u00fc\7(\2\2\u00fc"+
		"\u00fd\7(\2\2\u00fd<\3\2\2\2\u00fe\u00ff\7~\2\2\u00ff\u0100\7~\2\2\u0100"+
		">\3\2\2\2\u0101\u0102\7#\2\2\u0102@\3\2\2\2\u0103\u0104\7%\2\2\u0104B"+
		"\3\2\2\2\u0105\u0106\7\u0080\2\2\u0106D\3\2\2\2\u0107\u0108\7A\2\2\u0108"+
		"F\3\2\2\2\u0109\u010a\7B\2\2\u010aH\3\2\2\2\u010b\u010c\7-\2\2\u010c\u010d"+
		"\7?\2\2\u010dJ\3\2\2\2\u010e\u010f\7/\2\2\u010f\u0110\7?\2\2\u0110L\3"+
		"\2\2\2\u0111\u0112\7,\2\2\u0112\u0113\7?\2\2\u0113N\3\2\2\2\u0114\u0115"+
		"\7,\2\2\u0115\u0116\7,\2\2\u0116\u0117\7?\2\2\u0117P\3\2\2\2\u0118\u0119"+
		"\7\61\2\2\u0119\u011a\7?\2\2\u011aR\3\2\2\2\u011b\u011c\7\'\2\2\u011c"+
		"\u011d\7?\2\2\u011dT\3\2\2\2\u011e\u011f\7-\2\2\u011f\u0120\7-\2\2\u0120"+
		"V\3\2\2\2\u0121\u0122\7/\2\2\u0122\u0123\7/\2\2\u0123X\3\2\2\2\u0124\u0125"+
		"\7h\2\2\u0125\u0126\7w\2\2\u0126\u0127\7p\2\2\u0127\u0128\7e\2\2\u0128"+
		"\u0129\7v\2\2\u0129\u012a\7k\2\2\u012a\u012b\7q\2\2\u012b\u012c\7p\2\2"+
		"\u012cZ\3\2\2\2\u012d\u012e\7x\2\2\u012e\u012f\7c\2\2\u012f\u0130\7t\2"+
		"\2\u0130\\\3\2\2\2\u0131\u0132\7k\2\2\u0132\u0133\7h\2\2\u0133^\3\2\2"+
		"\2\u0134\u0135\7g\2\2\u0135\u0136\7n\2\2\u0136\u0137\7u\2\2\u0137\u0138"+
		"\7g\2\2\u0138`\3\2\2\2\u0139\u013a\7y\2\2\u013a\u013b\7j\2\2\u013b\u013c"+
		"\7k\2\2\u013c\u013d\7n\2\2\u013d\u013e\7g\2\2\u013eb\3\2\2\2\u013f\u0140"+
		"\7f\2\2\u0140\u0141\7q\2\2\u0141d\3\2\2\2\u0142\u0143\7h\2\2\u0143\u0144"+
		"\7q\2\2\u0144\u0145\7t\2\2\u0145f\3\2\2\2\u0146\u0147\7k\2\2\u0147\u0148"+
		"\7p\2\2\u0148h\3\2\2\2\u0149\u014a\7k\2\2\u014a\u014b\7u\2\2\u014bj\3"+
		"\2\2\2\u014c\u014d\7#\2\2\u014d\u014e\7k\2\2\u014e\u014f\7p\2\2\u014f"+
		"l\3\2\2\2\u0150\u0151\7#\2\2\u0151\u0152\7k\2\2\u0152\u0153\7u\2\2\u0153"+
		"n\3\2\2\2\u0154\u0155\7e\2\2\u0155\u0156\7q\2\2\u0156\u0157\7p\2\2\u0157"+
		"\u0158\7v\2\2\u0158\u0159\7k\2\2\u0159\u015a\7p\2\2\u015a\u015b\7w\2\2"+
		"\u015b\u015c\7g\2\2\u015cp\3\2\2\2\u015d\u015e\7d\2\2\u015e\u015f\7t\2"+
		"\2\u015f\u0160\7g\2\2\u0160\u0161\7c\2\2\u0161\u0162\7m\2\2\u0162r\3\2"+
		"\2\2\u0163\u0164\7t\2\2\u0164\u0165\7g\2\2\u0165\u0166\7v\2\2\u0166\u0167"+
		"\7w\2\2\u0167\u0168\7t\2\2\u0168\u0169\7p\2\2\u0169t\3\2\2\2\u016a\u016b"+
		"\7{\2\2\u016b\u016c\7k\2\2\u016c\u016d\7g\2\2\u016d\u016e\7n\2\2\u016e"+
		"\u016f\7f\2\2\u016fv\3\2\2\2\u0170\u0171\7c\2\2\u0171\u0172\7u\2\2\u0172"+
		"\u0173\7{\2\2\u0173\u0174\7p\2\2\u0174\u0175\7e\2\2\u0175x\3\2\2\2\u0176"+
		"\u0177\7c\2\2\u0177\u0178\7y\2\2\u0178\u0179\7c\2\2\u0179\u017a\7k\2\2"+
		"\u017a\u017b\7v\2\2\u017bz\3\2\2\2\u017c\u017d\7v\2\2\u017d\u017e\7t\2"+
		"\2\u017e\u017f\7w\2\2\u017f\u0180\7g\2\2\u0180|\3\2\2\2\u0181\u0182\7"+
		"h\2\2\u0182\u0183\7c\2\2\u0183\u0184\7n\2\2\u0184\u0185\7u\2\2\u0185\u0186"+
		"\7g\2\2\u0186~\3\2\2\2\u0187\u0188\7p\2\2\u0188\u0189\7w\2\2\u0189\u018a"+
		"\7n\2\2\u018a\u018b\7n\2\2\u018b\u0080\3\2\2\2\u018c\u0193\7$\2\2\u018d"+
		"\u0192\n\4\2\2\u018e\u0192\5\u0083B\2\u018f\u0190\7^\2\2\u0190\u0192\7"+
		"$\2\2\u0191\u018d\3\2\2\2\u0191\u018e\3\2\2\2\u0191\u018f\3\2\2\2\u0192"+
		"\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0196\3\2"+
		"\2\2\u0195\u0193\3\2\2\2\u0196\u01a3\7$\2\2\u0197\u019e\7)\2\2\u0198\u019d"+
		"\n\5\2\2\u0199\u019d\5\u0083B\2\u019a\u019b\7^\2\2\u019b\u019d\7)\2\2"+
		"\u019c\u0198\3\2\2\2\u019c\u0199\3\2\2\2\u019c\u019a\3\2\2\2\u019d\u01a0"+
		"\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a1\3\2\2\2\u01a0"+
		"\u019e\3\2\2\2\u01a1\u01a3\7)\2\2\u01a2\u018c\3\2\2\2\u01a2\u0197\3\2"+
		"\2\2\u01a3\u0082\3\2\2\2\u01a4\u01ab\7^\2\2\u01a5\u01ac\t\6\2\2\u01a6"+
		"\u01a7\7w\2\2\u01a7\u01a8\t\7\2\2\u01a8\u01a9\t\7\2\2\u01a9\u01aa\t\7"+
		"\2\2\u01aa\u01ac\t\7\2\2\u01ab\u01a5\3\2\2\2\u01ab\u01a6\3\2\2\2\u01ac"+
		"\u0084\3\2\2\2\u01ad\u01b0\5\u0087D\2\u01ae\u01b0\5\u0089E\2\u01af\u01ad"+
		"\3\2\2\2\u01af\u01ae\3\2\2\2\u01b0\u0086\3\2\2\2\u01b1\u01ba\7\62\2\2"+
		"\u01b2\u01b6\t\b\2\2\u01b3\u01b5\t\t\2\2\u01b4\u01b3\3\2\2\2\u01b5\u01b8"+
		"\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8"+
		"\u01b6\3\2\2\2\u01b9\u01b1\3\2\2\2\u01b9\u01b2\3\2\2\2\u01ba\u0088\3\2"+
		"\2\2\u01bb\u01c4\7\62\2\2\u01bc\u01c0\t\b\2\2\u01bd\u01bf\t\t\2\2\u01be"+
		"\u01bd\3\2\2\2\u01bf\u01c2\3\2\2\2\u01c0\u01be\3\2\2\2\u01c0\u01c1\3\2"+
		"\2\2\u01c1\u01c4\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c3\u01bb\3\2\2\2\u01c3"+
		"\u01bc\3\2\2\2\u01c4\u01ca\3\2\2\2\u01c5\u01cb\t\n\2\2\u01c6\u01c8\t\n"+
		"\2\2\u01c7\u01c6\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9"+
		"\u01cb\5\u008bF\2\u01ca\u01c5\3\2\2\2\u01ca\u01c7\3\2\2\2\u01cb\u01e2"+
		"\3\2\2\2\u01cc\u01d0\t\b\2\2\u01cd\u01cf\t\t\2\2\u01ce\u01cd\3\2\2\2\u01cf"+
		"\u01d2\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d4\3\2"+
		"\2\2\u01d2\u01d0\3\2\2\2\u01d3\u01cc\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4"+
		"\u01d5\3\2\2\2\u01d5\u01d7\7\60\2\2\u01d6\u01d8\t\t\2\2\u01d7\u01d6\3"+
		"\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da"+
		"\u01dc\3\2\2\2\u01db\u01dd\t\n\2\2\u01dc\u01db\3\2\2\2\u01dc\u01dd\3\2"+
		"\2\2\u01dd\u01df\3\2\2\2\u01de\u01e0\5\u008bF\2\u01df\u01de\3\2\2\2\u01df"+
		"\u01e0\3\2\2\2\u01e0\u01e2\3\2\2\2\u01e1\u01c3\3\2\2\2\u01e1\u01d3\3\2"+
		"\2\2\u01e2\u008a\3\2\2\2\u01e3\u01e5\t\13\2\2\u01e4\u01e6\t\f\2\2\u01e5"+
		"\u01e4\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01eb\t\b"+
		"\2\2\u01e8\u01ea\t\t\2\2\u01e9\u01e8\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb"+
		"\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u008c\3\2\2\2\u01ed\u01eb\3\2"+
		"\2\2\u01ee\u01ef\7\62\2\2\u01ef\u01f1\t\r\2\2\u01f0\u01f2\t\7\2\2\u01f1"+
		"\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f3\u01f4\3\2"+
		"\2\2\u01f4\u008e\3\2\2\2\u01f5\u01f6\7\62\2\2\u01f6\u01f8\t\16\2\2\u01f7"+
		"\u01f9\t\17\2\2\u01f8\u01f7\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01f8\3"+
		"\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u0090\3\2\2\2\u01fc\u01fd\t\20\2\2\u01fd"+
		"\u0092\3\2\2\2\u01fe\u01ff\t\21\2\2\u01ff\u0094\3\2\2\2\u0200\u0204\5"+
		"\u0093J\2\u0201\u0203\5\u0091I\2\u0202\u0201\3\2\2\2\u0203\u0206\3\2\2"+
		"\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0096\3\2\2\2\u0206\u0204"+
		"\3\2\2\2!\2\u009a\u00a1\u00ab\u00b0\u00ba\u00c0\u0191\u0193\u019c\u019e"+
		"\u01a2\u01ab\u01af\u01b6\u01b9\u01c0\u01c3\u01c7\u01ca\u01d0\u01d3\u01d9"+
		"\u01dc\u01df\u01e1\u01e5\u01eb\u01f3\u01fa\u0204\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}