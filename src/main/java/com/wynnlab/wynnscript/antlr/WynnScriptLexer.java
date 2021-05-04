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
		VAR=46, IF=47, ELSE=48, WHILE=49, DO=50, FOR=51, IN=52, IS=53, NOT_IN=54, 
		NOT_IS=55, CONTINUE=56, BREAK=57, RETURN=58, YIELD=59, ASYNC=60, AWAIT=61, 
		TRUE=62, FALSE=63, NULL=64, THIS=65, StringLiteral=66, NumberLiteral=67, 
		HexLiteral=68, BinLiteral=69, Identifier=70;
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
			"DIV_EQ", "MOD_EQ", "INC", "DEC", "FUNCTION", "VAR", "IF", "ELSE", "WHILE", 
			"DO", "FOR", "IN", "IS", "NOT_IN", "NOT_IS", "CONTINUE", "BREAK", "RETURN", 
			"YIELD", "ASYNC", "AWAIT", "TRUE", "FALSE", "NULL", "THIS", "StringLiteral", 
			"EscapeSeq", "NumberLiteral", "DecimalLiteral", "RealLiteral", "Exponent", 
			"HexLiteral", "BinLiteral", "Letter", "StartLetter", "Identifier"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2H\u0219\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\3\2\3\2\3\2\5\2\u009f\n\2\3\2\3\2\3\3\6\3"+
		"\u00a4\n\3\r\3\16\3\u00a5\3\3\3\3\3\4\3\4\3\4\3\4\7\4\u00ae\n\4\f\4\16"+
		"\4\u00b1\13\4\3\4\3\4\5\4\u00b5\n\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5\u00bd"+
		"\n\5\f\5\16\5\u00c0\13\5\3\5\3\5\3\5\5\5\u00c5\n\5\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3"+
		"\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3"+
		"\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3"+
		" \3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3("+
		"\3)\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3"+
		"\66\3\66\3\66\3\67\3\67\3\67\3\67\38\38\38\38\39\39\39\39\39\39\39\39"+
		"\39\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3=\3=\3="+
		"\3=\3=\3=\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3A\3A\3A"+
		"\3A\3A\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\7C\u019e\nC\fC\16C\u01a1\13C\3C\3"+
		"C\3C\3C\3C\3C\7C\u01a9\nC\fC\16C\u01ac\13C\3C\5C\u01af\nC\3D\3D\3D\3D"+
		"\3D\3D\3D\5D\u01b8\nD\3E\3E\5E\u01bc\nE\3F\3F\5F\u01c0\nF\3F\3F\7F\u01c4"+
		"\nF\fF\16F\u01c7\13F\5F\u01c9\nF\3G\5G\u01cc\nG\3G\3G\3G\7G\u01d1\nG\f"+
		"G\16G\u01d4\13G\5G\u01d6\nG\3G\3G\5G\u01da\nG\3G\5G\u01dd\nG\3G\3G\7G"+
		"\u01e1\nG\fG\16G\u01e4\13G\5G\u01e6\nG\3G\3G\6G\u01ea\nG\rG\16G\u01eb"+
		"\3G\5G\u01ef\nG\3G\5G\u01f2\nG\5G\u01f4\nG\3H\3H\5H\u01f8\nH\3H\3H\7H"+
		"\u01fc\nH\fH\16H\u01ff\13H\3I\3I\3I\6I\u0204\nI\rI\16I\u0205\3J\3J\3J"+
		"\6J\u020b\nJ\rJ\16J\u020c\3K\3K\3L\3L\3M\3M\7M\u0215\nM\fM\16M\u0218\13"+
		"M\4\u00af\u00be\2N\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087\2\u0089"+
		"E\u008b\2\u008d\2\u008f\2\u0091F\u0093G\u0095\2\u0097\2\u0099H\3\2\22"+
		"\4\2\f\f\17\17\5\2\13\13\16\16\"\"\6\2\f\f\17\17$$^^\6\2\f\f\17\17))^"+
		"^\5\2ppttvv\5\2\62;CHch\4\2--//\3\2\63;\3\2\62;\4\2HHhh\4\2GGgg\4\2ZZ"+
		"zz\4\2DDdd\3\2\62\63\6\2\62;C\\aac|\5\2C\\aac|\2\u0234\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2"+
		"\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2"+
		"\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q"+
		"\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2"+
		"\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0089"+
		"\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0099\3\2\2\2\3\u009e\3\2\2"+
		"\2\5\u00a3\3\2\2\2\7\u00a9\3\2\2\2\t\u00b8\3\2\2\2\13\u00c8\3\2\2\2\r"+
		"\u00ca\3\2\2\2\17\u00cc\3\2\2\2\21\u00ce\3\2\2\2\23\u00d0\3\2\2\2\25\u00d3"+
		"\3\2\2\2\27\u00d7\3\2\2\2\31\u00d9\3\2\2\2\33\u00db\3\2\2\2\35\u00dd\3"+
		"\2\2\2\37\u00e0\3\2\2\2!\u00e2\3\2\2\2#\u00e4\3\2\2\2%\u00e6\3\2\2\2\'"+
		"\u00e8\3\2\2\2)\u00ea\3\2\2\2+\u00ec\3\2\2\2-\u00ee\3\2\2\2/\u00f0\3\2"+
		"\2\2\61\u00f2\3\2\2\2\63\u00f4\3\2\2\2\65\u00f6\3\2\2\2\67\u00f9\3\2\2"+
		"\29\u00fc\3\2\2\2;\u00ff\3\2\2\2=\u0102\3\2\2\2?\u0105\3\2\2\2A\u0108"+
		"\3\2\2\2C\u010a\3\2\2\2E\u010c\3\2\2\2G\u010e\3\2\2\2I\u0110\3\2\2\2K"+
		"\u0112\3\2\2\2M\u0115\3\2\2\2O\u0118\3\2\2\2Q\u011b\3\2\2\2S\u011f\3\2"+
		"\2\2U\u0122\3\2\2\2W\u0125\3\2\2\2Y\u0128\3\2\2\2[\u012b\3\2\2\2]\u0134"+
		"\3\2\2\2_\u0138\3\2\2\2a\u013b\3\2\2\2c\u0140\3\2\2\2e\u0146\3\2\2\2g"+
		"\u0149\3\2\2\2i\u014d\3\2\2\2k\u0150\3\2\2\2m\u0153\3\2\2\2o\u0157\3\2"+
		"\2\2q\u015b\3\2\2\2s\u0164\3\2\2\2u\u016a\3\2\2\2w\u0171\3\2\2\2y\u0177"+
		"\3\2\2\2{\u017d\3\2\2\2}\u0183\3\2\2\2\177\u0188\3\2\2\2\u0081\u018e\3"+
		"\2\2\2\u0083\u0193\3\2\2\2\u0085\u01ae\3\2\2\2\u0087\u01b0\3\2\2\2\u0089"+
		"\u01bb\3\2\2\2\u008b\u01c8\3\2\2\2\u008d\u01f3\3\2\2\2\u008f\u01f5\3\2"+
		"\2\2\u0091\u0200\3\2\2\2\u0093\u0207\3\2\2\2\u0095\u020e\3\2\2\2\u0097"+
		"\u0210\3\2\2\2\u0099\u0212\3\2\2\2\u009b\u009f\t\2\2\2\u009c\u009d\7\17"+
		"\2\2\u009d\u009f\7\f\2\2\u009e\u009b\3\2\2\2\u009e\u009c\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u00a1\b\2\2\2\u00a1\4\3\2\2\2\u00a2\u00a4\t\3\2\2"+
		"\u00a3\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6"+
		"\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\b\3\2\2\u00a8\6\3\2\2\2\u00a9"+
		"\u00aa\7\61\2\2\u00aa\u00ab\7\61\2\2\u00ab\u00af\3\2\2\2\u00ac\u00ae\13"+
		"\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00b0\3\2\2\2\u00af"+
		"\u00ad\3\2\2\2\u00b0\u00b4\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b5\5\3"+
		"\2\2\u00b3\u00b5\7\2\2\3\u00b4\u00b2\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\u00b7\b\4\2\2\u00b7\b\3\2\2\2\u00b8\u00b9\7\61\2"+
		"\2\u00b9\u00ba\7,\2\2\u00ba\u00be\3\2\2\2\u00bb\u00bd\13\2\2\2\u00bc\u00bb"+
		"\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bf\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf"+
		"\u00c4\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2\7,\2\2\u00c2\u00c5\7\61"+
		"\2\2\u00c3\u00c5\7\2\2\3\u00c4\u00c1\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\u00c7\b\5\2\2\u00c7\n\3\2\2\2\u00c8\u00c9\7=\2\2"+
		"\u00c9\f\3\2\2\2\u00ca\u00cb\7<\2\2\u00cb\16\3\2\2\2\u00cc\u00cd\7.\2"+
		"\2\u00cd\20\3\2\2\2\u00ce\u00cf\7\60\2\2\u00cf\22\3\2\2\2\u00d0\u00d1"+
		"\7<\2\2\u00d1\u00d2\7<\2\2\u00d2\24\3\2\2\2\u00d3\u00d4\7\60\2\2\u00d4"+
		"\u00d5\7\60\2\2\u00d5\u00d6\7\60\2\2\u00d6\26\3\2\2\2\u00d7\u00d8\7-\2"+
		"\2\u00d8\30\3\2\2\2\u00d9\u00da\7/\2\2\u00da\32\3\2\2\2\u00db\u00dc\7"+
		",\2\2\u00dc\34\3\2\2\2\u00dd\u00de\7,\2\2\u00de\u00df\7,\2\2\u00df\36"+
		"\3\2\2\2\u00e0\u00e1\7\61\2\2\u00e1 \3\2\2\2\u00e2\u00e3\7\'\2\2\u00e3"+
		"\"\3\2\2\2\u00e4\u00e5\7*\2\2\u00e5$\3\2\2\2\u00e6\u00e7\7+\2\2\u00e7"+
		"&\3\2\2\2\u00e8\u00e9\7]\2\2\u00e9(\3\2\2\2\u00ea\u00eb\7_\2\2\u00eb*"+
		"\3\2\2\2\u00ec\u00ed\7}\2\2\u00ed,\3\2\2\2\u00ee\u00ef\7\177\2\2\u00ef"+
		".\3\2\2\2\u00f0\u00f1\7>\2\2\u00f1\60\3\2\2\2\u00f2\u00f3\7@\2\2\u00f3"+
		"\62\3\2\2\2\u00f4\u00f5\7?\2\2\u00f5\64\3\2\2\2\u00f6\u00f7\7?\2\2\u00f7"+
		"\u00f8\7?\2\2\u00f8\66\3\2\2\2\u00f9\u00fa\7#\2\2\u00fa\u00fb\7?\2\2\u00fb"+
		"8\3\2\2\2\u00fc\u00fd\7>\2\2\u00fd\u00fe\7?\2\2\u00fe:\3\2\2\2\u00ff\u0100"+
		"\7@\2\2\u0100\u0101\7?\2\2\u0101<\3\2\2\2\u0102\u0103\7(\2\2\u0103\u0104"+
		"\7(\2\2\u0104>\3\2\2\2\u0105\u0106\7~\2\2\u0106\u0107\7~\2\2\u0107@\3"+
		"\2\2\2\u0108\u0109\7#\2\2\u0109B\3\2\2\2\u010a\u010b\7%\2\2\u010bD\3\2"+
		"\2\2\u010c\u010d\7\u0080\2\2\u010dF\3\2\2\2\u010e\u010f\7A\2\2\u010fH"+
		"\3\2\2\2\u0110\u0111\7B\2\2\u0111J\3\2\2\2\u0112\u0113\7-\2\2\u0113\u0114"+
		"\7?\2\2\u0114L\3\2\2\2\u0115\u0116\7/\2\2\u0116\u0117\7?\2\2\u0117N\3"+
		"\2\2\2\u0118\u0119\7,\2\2\u0119\u011a\7?\2\2\u011aP\3\2\2\2\u011b\u011c"+
		"\7,\2\2\u011c\u011d\7,\2\2\u011d\u011e\7?\2\2\u011eR\3\2\2\2\u011f\u0120"+
		"\7\61\2\2\u0120\u0121\7?\2\2\u0121T\3\2\2\2\u0122\u0123\7\'\2\2\u0123"+
		"\u0124\7?\2\2\u0124V\3\2\2\2\u0125\u0126\7-\2\2\u0126\u0127\7-\2\2\u0127"+
		"X\3\2\2\2\u0128\u0129\7/\2\2\u0129\u012a\7/\2\2\u012aZ\3\2\2\2\u012b\u012c"+
		"\7h\2\2\u012c\u012d\7w\2\2\u012d\u012e\7p\2\2\u012e\u012f\7e\2\2\u012f"+
		"\u0130\7v\2\2\u0130\u0131\7k\2\2\u0131\u0132\7q\2\2\u0132\u0133\7p\2\2"+
		"\u0133\\\3\2\2\2\u0134\u0135\7x\2\2\u0135\u0136\7c\2\2\u0136\u0137\7t"+
		"\2\2\u0137^\3\2\2\2\u0138\u0139\7k\2\2\u0139\u013a\7h\2\2\u013a`\3\2\2"+
		"\2\u013b\u013c\7g\2\2\u013c\u013d\7n\2\2\u013d\u013e\7u\2\2\u013e\u013f"+
		"\7g\2\2\u013fb\3\2\2\2\u0140\u0141\7y\2\2\u0141\u0142\7j\2\2\u0142\u0143"+
		"\7k\2\2\u0143\u0144\7n\2\2\u0144\u0145\7g\2\2\u0145d\3\2\2\2\u0146\u0147"+
		"\7f\2\2\u0147\u0148\7q\2\2\u0148f\3\2\2\2\u0149\u014a\7h\2\2\u014a\u014b"+
		"\7q\2\2\u014b\u014c\7t\2\2\u014ch\3\2\2\2\u014d\u014e\7k\2\2\u014e\u014f"+
		"\7p\2\2\u014fj\3\2\2\2\u0150\u0151\7k\2\2\u0151\u0152\7u\2\2\u0152l\3"+
		"\2\2\2\u0153\u0154\7#\2\2\u0154\u0155\7k\2\2\u0155\u0156\7p\2\2\u0156"+
		"n\3\2\2\2\u0157\u0158\7#\2\2\u0158\u0159\7k\2\2\u0159\u015a\7u\2\2\u015a"+
		"p\3\2\2\2\u015b\u015c\7e\2\2\u015c\u015d\7q\2\2\u015d\u015e\7p\2\2\u015e"+
		"\u015f\7v\2\2\u015f\u0160\7k\2\2\u0160\u0161\7p\2\2\u0161\u0162\7w\2\2"+
		"\u0162\u0163\7g\2\2\u0163r\3\2\2\2\u0164\u0165\7d\2\2\u0165\u0166\7t\2"+
		"\2\u0166\u0167\7g\2\2\u0167\u0168\7c\2\2\u0168\u0169\7m\2\2\u0169t\3\2"+
		"\2\2\u016a\u016b\7t\2\2\u016b\u016c\7g\2\2\u016c\u016d\7v\2\2\u016d\u016e"+
		"\7w\2\2\u016e\u016f\7t\2\2\u016f\u0170\7p\2\2\u0170v\3\2\2\2\u0171\u0172"+
		"\7{\2\2\u0172\u0173\7k\2\2\u0173\u0174\7g\2\2\u0174\u0175\7n\2\2\u0175"+
		"\u0176\7f\2\2\u0176x\3\2\2\2\u0177\u0178\7c\2\2\u0178\u0179\7u\2\2\u0179"+
		"\u017a\7{\2\2\u017a\u017b\7p\2\2\u017b\u017c\7e\2\2\u017cz\3\2\2\2\u017d"+
		"\u017e\7c\2\2\u017e\u017f\7y\2\2\u017f\u0180\7c\2\2\u0180\u0181\7k\2\2"+
		"\u0181\u0182\7v\2\2\u0182|\3\2\2\2\u0183\u0184\7v\2\2\u0184\u0185\7t\2"+
		"\2\u0185\u0186\7w\2\2\u0186\u0187\7g\2\2\u0187~\3\2\2\2\u0188\u0189\7"+
		"h\2\2\u0189\u018a\7c\2\2\u018a\u018b\7n\2\2\u018b\u018c\7u\2\2\u018c\u018d"+
		"\7g\2\2\u018d\u0080\3\2\2\2\u018e\u018f\7p\2\2\u018f\u0190\7w\2\2\u0190"+
		"\u0191\7n\2\2\u0191\u0192\7n\2\2\u0192\u0082\3\2\2\2\u0193\u0194\7v\2"+
		"\2\u0194\u0195\7j\2\2\u0195\u0196\7k\2\2\u0196\u0197\7u\2\2\u0197\u0084"+
		"\3\2\2\2\u0198\u019f\7$\2\2\u0199\u019e\n\4\2\2\u019a\u019e\5\u0087D\2"+
		"\u019b\u019c\7^\2\2\u019c\u019e\7$\2\2\u019d\u0199\3\2\2\2\u019d\u019a"+
		"\3\2\2\2\u019d\u019b\3\2\2\2\u019e\u01a1\3\2\2\2\u019f\u019d\3\2\2\2\u019f"+
		"\u01a0\3\2\2\2\u01a0\u01a2\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2\u01af\7$"+
		"\2\2\u01a3\u01aa\7)\2\2\u01a4\u01a9\n\5\2\2\u01a5\u01a9\5\u0087D\2\u01a6"+
		"\u01a7\7^\2\2\u01a7\u01a9\7)\2\2\u01a8\u01a4\3\2\2\2\u01a8\u01a5\3\2\2"+
		"\2\u01a8\u01a6\3\2\2\2\u01a9\u01ac\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab"+
		"\3\2\2\2\u01ab\u01ad\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ad\u01af\7)\2\2\u01ae"+
		"\u0198\3\2\2\2\u01ae\u01a3\3\2\2\2\u01af\u0086\3\2\2\2\u01b0\u01b7\7^"+
		"\2\2\u01b1\u01b8\t\6\2\2\u01b2\u01b3\7w\2\2\u01b3\u01b4\t\7\2\2\u01b4"+
		"\u01b5\t\7\2\2\u01b5\u01b6\t\7\2\2\u01b6\u01b8\t\7\2\2\u01b7\u01b1\3\2"+
		"\2\2\u01b7\u01b2\3\2\2\2\u01b8\u0088\3\2\2\2\u01b9\u01bc\5\u008bF\2\u01ba"+
		"\u01bc\5\u008dG\2\u01bb\u01b9\3\2\2\2\u01bb\u01ba\3\2\2\2\u01bc\u008a"+
		"\3\2\2\2\u01bd\u01c9\7\62\2\2\u01be\u01c0\t\b\2\2\u01bf\u01be\3\2\2\2"+
		"\u01bf\u01c0\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c5\t\t\2\2\u01c2\u01c4"+
		"\t\n\2\2\u01c3\u01c2\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5"+
		"\u01c6\3\2\2\2\u01c6\u01c9\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01bd\3\2"+
		"\2\2\u01c8\u01bf\3\2\2\2\u01c9\u008c\3\2\2\2\u01ca\u01cc\t\b\2\2\u01cb"+
		"\u01ca\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01d5\3\2\2\2\u01cd\u01d6\7\62"+
		"\2\2\u01ce\u01d2\t\t\2\2\u01cf\u01d1\t\n\2\2\u01d0\u01cf\3\2\2\2\u01d1"+
		"\u01d4\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d6\3\2"+
		"\2\2\u01d4\u01d2\3\2\2\2\u01d5\u01cd\3\2\2\2\u01d5\u01ce\3\2\2\2\u01d6"+
		"\u01dc\3\2\2\2\u01d7\u01dd\t\13\2\2\u01d8\u01da\t\13\2\2\u01d9\u01d8\3"+
		"\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dd\5\u008fH\2"+
		"\u01dc\u01d7\3\2\2\2\u01dc\u01d9\3\2\2\2\u01dd\u01f4\3\2\2\2\u01de\u01e2"+
		"\t\t\2\2\u01df\u01e1\t\n\2\2\u01e0\u01df\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2"+
		"\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4\u01e2\3\2"+
		"\2\2\u01e5\u01de\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7"+
		"\u01e9\7\60\2\2\u01e8\u01ea\t\n\2\2\u01e9\u01e8\3\2\2\2\u01ea\u01eb\3"+
		"\2\2\2\u01eb\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ee\3\2\2\2\u01ed"+
		"\u01ef\t\13\2\2\u01ee\u01ed\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f1\3"+
		"\2\2\2\u01f0\u01f2\5\u008fH\2\u01f1\u01f0\3\2\2\2\u01f1\u01f2\3\2\2\2"+
		"\u01f2\u01f4\3\2\2\2\u01f3\u01cb\3\2\2\2\u01f3\u01e5\3\2\2\2\u01f4\u008e"+
		"\3\2\2\2\u01f5\u01f7\t\f\2\2\u01f6\u01f8\t\b\2\2\u01f7\u01f6\3\2\2\2\u01f7"+
		"\u01f8\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fd\t\t\2\2\u01fa\u01fc\t\n"+
		"\2\2\u01fb\u01fa\3\2\2\2\u01fc\u01ff\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd"+
		"\u01fe\3\2\2\2\u01fe\u0090\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200\u0201\7\62"+
		"\2\2\u0201\u0203\t\r\2\2\u0202\u0204\t\7\2\2\u0203\u0202\3\2\2\2\u0204"+
		"\u0205\3\2\2\2\u0205\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0092\3\2"+
		"\2\2\u0207\u0208\7\62\2\2\u0208\u020a\t\16\2\2\u0209\u020b\t\17\2\2\u020a"+
		"\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2"+
		"\2\2\u020d\u0094\3\2\2\2\u020e\u020f\t\20\2\2\u020f\u0096\3\2\2\2\u0210"+
		"\u0211\t\21\2\2\u0211\u0098\3\2\2\2\u0212\u0216\5\u0097L\2\u0213\u0215"+
		"\5\u0095K\2\u0214\u0213\3\2\2\2\u0215\u0218\3\2\2\2\u0216\u0214\3\2\2"+
		"\2\u0216\u0217\3\2\2\2\u0217\u009a\3\2\2\2\u0218\u0216\3\2\2\2#\2\u009e"+
		"\u00a5\u00af\u00b4\u00be\u00c4\u019d\u019f\u01a8\u01aa\u01ae\u01b7\u01bb"+
		"\u01bf\u01c5\u01c8\u01cb\u01d2\u01d5\u01d9\u01dc\u01e2\u01e5\u01eb\u01ee"+
		"\u01f1\u01f3\u01f7\u01fd\u0205\u020c\u0216\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}