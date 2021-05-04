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
		DOT=8, COLONCOLON=9, ELLIPSIS=10, PLUS=11, DASH=12, STAR=13, POW=14, SLASH=15, 
		PERCENT=16, LPAREN=17, RPAREN=18, LSQUARE=19, RSQUARE=20, LCURL=21, RCURL=22, 
		LANGLE=23, RANGLE=24, EQ=25, EQEQ=26, NEQ=27, LE=28, GE=29, AND=30, OR=31, 
		BANG=32, HASH=33, TILDE=34, QUEST=35, AT=36, PLUS_EQ=37, MINUS_EQ=38, 
		TIMES_EQ=39, POW_EQ=40, DIV_EQ=41, MOD_EQ=42, INC=43, DEC=44, FUNCTION=45, 
		VAR=46, DEL=47, IF=48, ELSE=49, WHILE=50, DO=51, FOR=52, IN=53, IS=54, 
		NOT_IN=55, NOT_IS=56, CONTINUE=57, BREAK=58, RETURN=59, YIELD=60, ASYNC=61, 
		AWAIT=62, TRUE=63, FALSE=64, NULL=65, THIS=66, StringLiteral=67, NumberLiteral=68, 
		HexLiteral=69, BinLiteral=70, Identifier=71;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NL", "Space", "LineComment", "BlockComment", "SEMI", "COLON", "COMMA", 
			"DOT", "COLONCOLON", "ELLIPSIS", "PLUS", "DASH", "STAR", "POW", "SLASH", 
			"PERCENT", "LPAREN", "RPAREN", "LSQUARE", "RSQUARE", "LCURL", "RCURL", 
			"LANGLE", "RANGLE", "EQ", "EQEQ", "NEQ", "LE", "GE", "AND", "OR", "BANG", 
			"HASH", "TILDE", "QUEST", "AT", "PLUS_EQ", "MINUS_EQ", "TIMES_EQ", "POW_EQ", 
			"DIV_EQ", "MOD_EQ", "INC", "DEC", "FUNCTION", "VAR", "DEL", "IF", "ELSE", 
			"WHILE", "DO", "FOR", "IN", "IS", "NOT_IN", "NOT_IS", "CONTINUE", "BREAK", 
			"RETURN", "YIELD", "ASYNC", "AWAIT", "TRUE", "FALSE", "NULL", "THIS", 
			"StringLiteral", "EscapeSeq", "NumberLiteral", "DecimalLiteral", "RealLiteral", 
			"Exponent", "HexLiteral", "BinLiteral", "Letter", "StartLetter", "Identifier"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2I\u021f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\3\2\3\2\3\2\5\2\u00a1\n\2\3\2\3\2\3"+
		"\3\6\3\u00a6\n\3\r\3\16\3\u00a7\3\3\3\3\3\4\3\4\3\4\3\4\7\4\u00b0\n\4"+
		"\f\4\16\4\u00b3\13\4\3\4\3\4\5\4\u00b7\n\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5"+
		"\u00bf\n\5\f\5\16\5\u00c2\13\5\3\5\3\5\3\5\5\5\u00c7\n\5\3\5\3\5\3\6\3"+
		"\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3\'\3"+
		"(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3.\3"+
		".\3.\3.\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62"+
		"\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65"+
		"\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38\38\39\39\39\39\3:\3"+
		":\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3=\3=\3"+
		"=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3A\3A\3"+
		"A\3A\3A\3A\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\7D\u01a4\nD\f"+
		"D\16D\u01a7\13D\3D\3D\3D\3D\3D\3D\7D\u01af\nD\fD\16D\u01b2\13D\3D\5D\u01b5"+
		"\nD\3E\3E\3E\3E\3E\3E\3E\5E\u01be\nE\3F\3F\5F\u01c2\nF\3G\3G\5G\u01c6"+
		"\nG\3G\3G\7G\u01ca\nG\fG\16G\u01cd\13G\5G\u01cf\nG\3H\5H\u01d2\nH\3H\3"+
		"H\3H\7H\u01d7\nH\fH\16H\u01da\13H\5H\u01dc\nH\3H\3H\5H\u01e0\nH\3H\5H"+
		"\u01e3\nH\3H\3H\7H\u01e7\nH\fH\16H\u01ea\13H\5H\u01ec\nH\3H\3H\6H\u01f0"+
		"\nH\rH\16H\u01f1\3H\5H\u01f5\nH\3H\5H\u01f8\nH\5H\u01fa\nH\3I\3I\5I\u01fe"+
		"\nI\3I\3I\7I\u0202\nI\fI\16I\u0205\13I\3J\3J\3J\6J\u020a\nJ\rJ\16J\u020b"+
		"\3K\3K\3K\6K\u0211\nK\rK\16K\u0212\3L\3L\3M\3M\3N\3N\7N\u021b\nN\fN\16"+
		"N\u021e\13N\4\u00b1\u00c0\2O\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61"+
		"a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087"+
		"E\u0089\2\u008bF\u008d\2\u008f\2\u0091\2\u0093G\u0095H\u0097\2\u0099\2"+
		"\u009bI\3\2\22\4\2\f\f\17\17\5\2\13\13\16\16\"\"\6\2\f\f\17\17$$^^\6\2"+
		"\f\f\17\17))^^\5\2ppttvv\5\2\62;CHch\4\2--//\3\2\63;\3\2\62;\4\2HHhh\4"+
		"\2GGgg\4\2ZZzz\4\2DDdd\3\2\62\63\6\2\62;C\\aac|\5\2C\\aac|\2\u023a\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3"+
		"\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2"+
		"\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2"+
		"o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3"+
		"\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u008b\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2"+
		"\2\2\u009b\3\2\2\2\3\u00a0\3\2\2\2\5\u00a5\3\2\2\2\7\u00ab\3\2\2\2\t\u00ba"+
		"\3\2\2\2\13\u00ca\3\2\2\2\r\u00cc\3\2\2\2\17\u00ce\3\2\2\2\21\u00d0\3"+
		"\2\2\2\23\u00d2\3\2\2\2\25\u00d5\3\2\2\2\27\u00d9\3\2\2\2\31\u00db\3\2"+
		"\2\2\33\u00dd\3\2\2\2\35\u00df\3\2\2\2\37\u00e2\3\2\2\2!\u00e4\3\2\2\2"+
		"#\u00e6\3\2\2\2%\u00e8\3\2\2\2\'\u00ea\3\2\2\2)\u00ec\3\2\2\2+\u00ee\3"+
		"\2\2\2-\u00f0\3\2\2\2/\u00f2\3\2\2\2\61\u00f4\3\2\2\2\63\u00f6\3\2\2\2"+
		"\65\u00f8\3\2\2\2\67\u00fb\3\2\2\29\u00fe\3\2\2\2;\u0101\3\2\2\2=\u0104"+
		"\3\2\2\2?\u0107\3\2\2\2A\u010a\3\2\2\2C\u010c\3\2\2\2E\u010e\3\2\2\2G"+
		"\u0110\3\2\2\2I\u0112\3\2\2\2K\u0114\3\2\2\2M\u0117\3\2\2\2O\u011a\3\2"+
		"\2\2Q\u011d\3\2\2\2S\u0121\3\2\2\2U\u0124\3\2\2\2W\u0127\3\2\2\2Y\u012a"+
		"\3\2\2\2[\u012d\3\2\2\2]\u0136\3\2\2\2_\u013a\3\2\2\2a\u013e\3\2\2\2c"+
		"\u0141\3\2\2\2e\u0146\3\2\2\2g\u014c\3\2\2\2i\u014f\3\2\2\2k\u0153\3\2"+
		"\2\2m\u0156\3\2\2\2o\u0159\3\2\2\2q\u015d\3\2\2\2s\u0161\3\2\2\2u\u016a"+
		"\3\2\2\2w\u0170\3\2\2\2y\u0177\3\2\2\2{\u017d\3\2\2\2}\u0183\3\2\2\2\177"+
		"\u0189\3\2\2\2\u0081\u018e\3\2\2\2\u0083\u0194\3\2\2\2\u0085\u0199\3\2"+
		"\2\2\u0087\u01b4\3\2\2\2\u0089\u01b6\3\2\2\2\u008b\u01c1\3\2\2\2\u008d"+
		"\u01ce\3\2\2\2\u008f\u01f9\3\2\2\2\u0091\u01fb\3\2\2\2\u0093\u0206\3\2"+
		"\2\2\u0095\u020d\3\2\2\2\u0097\u0214\3\2\2\2\u0099\u0216\3\2\2\2\u009b"+
		"\u0218\3\2\2\2\u009d\u00a1\t\2\2\2\u009e\u009f\7\17\2\2\u009f\u00a1\7"+
		"\f\2\2\u00a0\u009d\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a3\b\2\2\2\u00a3\4\3\2\2\2\u00a4\u00a6\t\3\2\2\u00a5\u00a4\3\2\2\2"+
		"\u00a6\u00a7\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9"+
		"\3\2\2\2\u00a9\u00aa\b\3\2\2\u00aa\6\3\2\2\2\u00ab\u00ac\7\61\2\2\u00ac"+
		"\u00ad\7\61\2\2\u00ad\u00b1\3\2\2\2\u00ae\u00b0\13\2\2\2\u00af\u00ae\3"+
		"\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2"+
		"\u00b6\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b7\5\3\2\2\u00b5\u00b7\7\2"+
		"\2\3\u00b6\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"\u00b9\b\4\2\2\u00b9\b\3\2\2\2\u00ba\u00bb\7\61\2\2\u00bb\u00bc\7,\2\2"+
		"\u00bc\u00c0\3\2\2\2\u00bd\u00bf\13\2\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c2"+
		"\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c6\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c3\u00c4\7,\2\2\u00c4\u00c7\7\61\2\2\u00c5\u00c7\7\2"+
		"\2\3\u00c6\u00c3\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\u00c9\b\5\2\2\u00c9\n\3\2\2\2\u00ca\u00cb\7=\2\2\u00cb\f\3\2\2\2\u00cc"+
		"\u00cd\7<\2\2\u00cd\16\3\2\2\2\u00ce\u00cf\7.\2\2\u00cf\20\3\2\2\2\u00d0"+
		"\u00d1\7\60\2\2\u00d1\22\3\2\2\2\u00d2\u00d3\7<\2\2\u00d3\u00d4\7<\2\2"+
		"\u00d4\24\3\2\2\2\u00d5\u00d6\7\60\2\2\u00d6\u00d7\7\60\2\2\u00d7\u00d8"+
		"\7\60\2\2\u00d8\26\3\2\2\2\u00d9\u00da\7-\2\2\u00da\30\3\2\2\2\u00db\u00dc"+
		"\7/\2\2\u00dc\32\3\2\2\2\u00dd\u00de\7,\2\2\u00de\34\3\2\2\2\u00df\u00e0"+
		"\7,\2\2\u00e0\u00e1\7,\2\2\u00e1\36\3\2\2\2\u00e2\u00e3\7\61\2\2\u00e3"+
		" \3\2\2\2\u00e4\u00e5\7\'\2\2\u00e5\"\3\2\2\2\u00e6\u00e7\7*\2\2\u00e7"+
		"$\3\2\2\2\u00e8\u00e9\7+\2\2\u00e9&\3\2\2\2\u00ea\u00eb\7]\2\2\u00eb("+
		"\3\2\2\2\u00ec\u00ed\7_\2\2\u00ed*\3\2\2\2\u00ee\u00ef\7}\2\2\u00ef,\3"+
		"\2\2\2\u00f0\u00f1\7\177\2\2\u00f1.\3\2\2\2\u00f2\u00f3\7>\2\2\u00f3\60"+
		"\3\2\2\2\u00f4\u00f5\7@\2\2\u00f5\62\3\2\2\2\u00f6\u00f7\7?\2\2\u00f7"+
		"\64\3\2\2\2\u00f8\u00f9\7?\2\2\u00f9\u00fa\7?\2\2\u00fa\66\3\2\2\2\u00fb"+
		"\u00fc\7#\2\2\u00fc\u00fd\7?\2\2\u00fd8\3\2\2\2\u00fe\u00ff\7>\2\2\u00ff"+
		"\u0100\7?\2\2\u0100:\3\2\2\2\u0101\u0102\7@\2\2\u0102\u0103\7?\2\2\u0103"+
		"<\3\2\2\2\u0104\u0105\7(\2\2\u0105\u0106\7(\2\2\u0106>\3\2\2\2\u0107\u0108"+
		"\7~\2\2\u0108\u0109\7~\2\2\u0109@\3\2\2\2\u010a\u010b\7#\2\2\u010bB\3"+
		"\2\2\2\u010c\u010d\7%\2\2\u010dD\3\2\2\2\u010e\u010f\7\u0080\2\2\u010f"+
		"F\3\2\2\2\u0110\u0111\7A\2\2\u0111H\3\2\2\2\u0112\u0113\7B\2\2\u0113J"+
		"\3\2\2\2\u0114\u0115\7-\2\2\u0115\u0116\7?\2\2\u0116L\3\2\2\2\u0117\u0118"+
		"\7/\2\2\u0118\u0119\7?\2\2\u0119N\3\2\2\2\u011a\u011b\7,\2\2\u011b\u011c"+
		"\7?\2\2\u011cP\3\2\2\2\u011d\u011e\7,\2\2\u011e\u011f\7,\2\2\u011f\u0120"+
		"\7?\2\2\u0120R\3\2\2\2\u0121\u0122\7\61\2\2\u0122\u0123\7?\2\2\u0123T"+
		"\3\2\2\2\u0124\u0125\7\'\2\2\u0125\u0126\7?\2\2\u0126V\3\2\2\2\u0127\u0128"+
		"\7-\2\2\u0128\u0129\7-\2\2\u0129X\3\2\2\2\u012a\u012b\7/\2\2\u012b\u012c"+
		"\7/\2\2\u012cZ\3\2\2\2\u012d\u012e\7h\2\2\u012e\u012f\7w\2\2\u012f\u0130"+
		"\7p\2\2\u0130\u0131\7e\2\2\u0131\u0132\7v\2\2\u0132\u0133\7k\2\2\u0133"+
		"\u0134\7q\2\2\u0134\u0135\7p\2\2\u0135\\\3\2\2\2\u0136\u0137\7x\2\2\u0137"+
		"\u0138\7c\2\2\u0138\u0139\7t\2\2\u0139^\3\2\2\2\u013a\u013b\7f\2\2\u013b"+
		"\u013c\7g\2\2\u013c\u013d\7n\2\2\u013d`\3\2\2\2\u013e\u013f\7k\2\2\u013f"+
		"\u0140\7h\2\2\u0140b\3\2\2\2\u0141\u0142\7g\2\2\u0142\u0143\7n\2\2\u0143"+
		"\u0144\7u\2\2\u0144\u0145\7g\2\2\u0145d\3\2\2\2\u0146\u0147\7y\2\2\u0147"+
		"\u0148\7j\2\2\u0148\u0149\7k\2\2\u0149\u014a\7n\2\2\u014a\u014b\7g\2\2"+
		"\u014bf\3\2\2\2\u014c\u014d\7f\2\2\u014d\u014e\7q\2\2\u014eh\3\2\2\2\u014f"+
		"\u0150\7h\2\2\u0150\u0151\7q\2\2\u0151\u0152\7t\2\2\u0152j\3\2\2\2\u0153"+
		"\u0154\7k\2\2\u0154\u0155\7p\2\2\u0155l\3\2\2\2\u0156\u0157\7k\2\2\u0157"+
		"\u0158\7u\2\2\u0158n\3\2\2\2\u0159\u015a\7#\2\2\u015a\u015b\7k\2\2\u015b"+
		"\u015c\7p\2\2\u015cp\3\2\2\2\u015d\u015e\7#\2\2\u015e\u015f\7k\2\2\u015f"+
		"\u0160\7u\2\2\u0160r\3\2\2\2\u0161\u0162\7e\2\2\u0162\u0163\7q\2\2\u0163"+
		"\u0164\7p\2\2\u0164\u0165\7v\2\2\u0165\u0166\7k\2\2\u0166\u0167\7p\2\2"+
		"\u0167\u0168\7w\2\2\u0168\u0169\7g\2\2\u0169t\3\2\2\2\u016a\u016b\7d\2"+
		"\2\u016b\u016c\7t\2\2\u016c\u016d\7g\2\2\u016d\u016e\7c\2\2\u016e\u016f"+
		"\7m\2\2\u016fv\3\2\2\2\u0170\u0171\7t\2\2\u0171\u0172\7g\2\2\u0172\u0173"+
		"\7v\2\2\u0173\u0174\7w\2\2\u0174\u0175\7t\2\2\u0175\u0176\7p\2\2\u0176"+
		"x\3\2\2\2\u0177\u0178\7{\2\2\u0178\u0179\7k\2\2\u0179\u017a\7g\2\2\u017a"+
		"\u017b\7n\2\2\u017b\u017c\7f\2\2\u017cz\3\2\2\2\u017d\u017e\7c\2\2\u017e"+
		"\u017f\7u\2\2\u017f\u0180\7{\2\2\u0180\u0181\7p\2\2\u0181\u0182\7e\2\2"+
		"\u0182|\3\2\2\2\u0183\u0184\7c\2\2\u0184\u0185\7y\2\2\u0185\u0186\7c\2"+
		"\2\u0186\u0187\7k\2\2\u0187\u0188\7v\2\2\u0188~\3\2\2\2\u0189\u018a\7"+
		"v\2\2\u018a\u018b\7t\2\2\u018b\u018c\7w\2\2\u018c\u018d\7g\2\2\u018d\u0080"+
		"\3\2\2\2\u018e\u018f\7h\2\2\u018f\u0190\7c\2\2\u0190\u0191\7n\2\2\u0191"+
		"\u0192\7u\2\2\u0192\u0193\7g\2\2\u0193\u0082\3\2\2\2\u0194\u0195\7p\2"+
		"\2\u0195\u0196\7w\2\2\u0196\u0197\7n\2\2\u0197\u0198\7n\2\2\u0198\u0084"+
		"\3\2\2\2\u0199\u019a\7v\2\2\u019a\u019b\7j\2\2\u019b\u019c\7k\2\2\u019c"+
		"\u019d\7u\2\2\u019d\u0086\3\2\2\2\u019e\u01a5\7$\2\2\u019f\u01a4\n\4\2"+
		"\2\u01a0\u01a4\5\u0089E\2\u01a1\u01a2\7^\2\2\u01a2\u01a4\7$\2\2\u01a3"+
		"\u019f\3\2\2\2\u01a3\u01a0\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4\u01a7\3\2"+
		"\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a8\3\2\2\2\u01a7"+
		"\u01a5\3\2\2\2\u01a8\u01b5\7$\2\2\u01a9\u01b0\7)\2\2\u01aa\u01af\n\5\2"+
		"\2\u01ab\u01af\5\u0089E\2\u01ac\u01ad\7^\2\2\u01ad\u01af\7)\2\2\u01ae"+
		"\u01aa\3\2\2\2\u01ae\u01ab\3\2\2\2\u01ae\u01ac\3\2\2\2\u01af\u01b2\3\2"+
		"\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b3\3\2\2\2\u01b2"+
		"\u01b0\3\2\2\2\u01b3\u01b5\7)\2\2\u01b4\u019e\3\2\2\2\u01b4\u01a9\3\2"+
		"\2\2\u01b5\u0088\3\2\2\2\u01b6\u01bd\7^\2\2\u01b7\u01be\t\6\2\2\u01b8"+
		"\u01b9\7w\2\2\u01b9\u01ba\t\7\2\2\u01ba\u01bb\t\7\2\2\u01bb\u01bc\t\7"+
		"\2\2\u01bc\u01be\t\7\2\2\u01bd\u01b7\3\2\2\2\u01bd\u01b8\3\2\2\2\u01be"+
		"\u008a\3\2\2\2\u01bf\u01c2\5\u008dG\2\u01c0\u01c2\5\u008fH\2\u01c1\u01bf"+
		"\3\2\2\2\u01c1\u01c0\3\2\2\2\u01c2\u008c\3\2\2\2\u01c3\u01cf\7\62\2\2"+
		"\u01c4\u01c6\t\b\2\2\u01c5\u01c4\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7"+
		"\3\2\2\2\u01c7\u01cb\t\t\2\2\u01c8\u01ca\t\n\2\2\u01c9\u01c8\3\2\2\2\u01ca"+
		"\u01cd\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cf\3\2"+
		"\2\2\u01cd\u01cb\3\2\2\2\u01ce\u01c3\3\2\2\2\u01ce\u01c5\3\2\2\2\u01cf"+
		"\u008e\3\2\2\2\u01d0\u01d2\t\b\2\2\u01d1\u01d0\3\2\2\2\u01d1\u01d2\3\2"+
		"\2\2\u01d2\u01db\3\2\2\2\u01d3\u01dc\7\62\2\2\u01d4\u01d8\t\t\2\2\u01d5"+
		"\u01d7\t\n\2\2\u01d6\u01d5\3\2\2\2\u01d7\u01da\3\2\2\2\u01d8\u01d6\3\2"+
		"\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01dc\3\2\2\2\u01da\u01d8\3\2\2\2\u01db"+
		"\u01d3\3\2\2\2\u01db\u01d4\3\2\2\2\u01dc\u01e2\3\2\2\2\u01dd\u01e3\t\13"+
		"\2\2\u01de\u01e0\t\13\2\2\u01df\u01de\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0"+
		"\u01e1\3\2\2\2\u01e1\u01e3\5\u0091I\2\u01e2\u01dd\3\2\2\2\u01e2\u01df"+
		"\3\2\2\2\u01e3\u01fa\3\2\2\2\u01e4\u01e8\t\t\2\2\u01e5\u01e7\t\n\2\2\u01e6"+
		"\u01e5\3\2\2\2\u01e7\u01ea\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e9\3\2"+
		"\2\2\u01e9\u01ec\3\2\2\2\u01ea\u01e8\3\2\2\2\u01eb\u01e4\3\2\2\2\u01eb"+
		"\u01ec\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ef\7\60\2\2\u01ee\u01f0\t"+
		"\n\2\2\u01ef\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1"+
		"\u01f2\3\2\2\2\u01f2\u01f4\3\2\2\2\u01f3\u01f5\t\13\2\2\u01f4\u01f3\3"+
		"\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f7\3\2\2\2\u01f6\u01f8\5\u0091I\2"+
		"\u01f7\u01f6\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01fa\3\2\2\2\u01f9\u01d1"+
		"\3\2\2\2\u01f9\u01eb\3\2\2\2\u01fa\u0090\3\2\2\2\u01fb\u01fd\t\f\2\2\u01fc"+
		"\u01fe\t\b\2\2\u01fd\u01fc\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01ff\3\2"+
		"\2\2\u01ff\u0203\t\t\2\2\u0200\u0202\t\n\2\2\u0201\u0200\3\2\2\2\u0202"+
		"\u0205\3\2\2\2\u0203\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0092\3\2"+
		"\2\2\u0205\u0203\3\2\2\2\u0206\u0207\7\62\2\2\u0207\u0209\t\r\2\2\u0208"+
		"\u020a\t\7\2\2\u0209\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u0209\3\2"+
		"\2\2\u020b\u020c\3\2\2\2\u020c\u0094\3\2\2\2\u020d\u020e\7\62\2\2\u020e"+
		"\u0210\t\16\2\2\u020f\u0211\t\17\2\2\u0210\u020f\3\2\2\2\u0211\u0212\3"+
		"\2\2\2\u0212\u0210\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0096\3\2\2\2\u0214"+
		"\u0215\t\20\2\2\u0215\u0098\3\2\2\2\u0216\u0217\t\21\2\2\u0217\u009a\3"+
		"\2\2\2\u0218\u021c\5\u0099M\2\u0219\u021b\5\u0097L\2\u021a\u0219\3\2\2"+
		"\2\u021b\u021e\3\2\2\2\u021c\u021a\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u009c"+
		"\3\2\2\2\u021e\u021c\3\2\2\2#\2\u00a0\u00a7\u00b1\u00b6\u00c0\u00c6\u01a3"+
		"\u01a5\u01ae\u01b0\u01b4\u01bd\u01c1\u01c5\u01cb\u01ce\u01d1\u01d8\u01db"+
		"\u01df\u01e2\u01e8\u01eb\u01f1\u01f4\u01f7\u01f9\u01fd\u0203\u020b\u0212"+
		"\u021c\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}