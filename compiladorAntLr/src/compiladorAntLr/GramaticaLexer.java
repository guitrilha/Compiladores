// Generated from Gramatica.g4 by ANTLR 4.4
package compiladorAntLr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, FUNCTION_W=2, WHILE_W=3, IF_W=4, ELSE_W=5, FOR_W=6, CONST=7, 
		MAIN=8, CHAR_TYPE=9, INT_TYPE=10, REAL_TYPE=11, STRING_TYPE=12, BOOL_TYPE=13, 
		STRING_ID=14, CHAR_ID=15, ID=16, LETTER=17, NUM=18, REAL=19, BOOL_ID=20, 
		SEMICOLON=21, OPEN_KEY=22, CLOSE_KEY=23, OPEN_PARENT=24, CLOSE_PARENT=25, 
		OPEN_BRACKET=26, CLOSE_BRACKET=27, COMMA=28, DOT=29, SIMPLE_Q_MARK=30, 
		DOUBLE_Q_MARK=31, MATH_PLUS_OP=32, EQUALS=33, MATH_LESS_OP=34, MATH_DIV_OP=35, 
		MATH_MULT_OP=36, MATH_MOD_OP=37, BOOL_SMALLER_OP=38, BOOL_BIGGER_OP=39, 
		BOOL_BIGGER_EQUALS_OP=40, BOOL_SMALLER_EQUALS_OP=41, BOOL_EQUALS_OP=42, 
		BOOL_DIFFERENT_OP=43, BOOL_CALC_DIFF_OP=44, BOOL_CALC_OR_OP=45, BOOL_CALC_AND_OP=46, 
		SINGLELINE_COMMENT=47, WHITE_SPACE=48;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "'0'"
	};
	public static final String[] ruleNames = {
		"PROGRAM", "FUNCTION_W", "WHILE_W", "IF_W", "ELSE_W", "FOR_W", "CONST", 
		"MAIN", "CHAR_TYPE", "INT_TYPE", "REAL_TYPE", "STRING_TYPE", "BOOL_TYPE", 
		"STRING_ID", "CHAR_ID", "ID", "LETTER", "NUM", "REAL", "BOOL_ID", "SEMICOLON", 
		"OPEN_KEY", "CLOSE_KEY", "OPEN_PARENT", "CLOSE_PARENT", "OPEN_BRACKET", 
		"CLOSE_BRACKET", "COMMA", "DOT", "SIMPLE_Q_MARK", "DOUBLE_Q_MARK", "MATH_PLUS_OP", 
		"EQUALS", "MATH_LESS_OP", "MATH_DIV_OP", "MATH_MULT_OP", "MATH_MOD_OP", 
		"BOOL_SMALLER_OP", "BOOL_BIGGER_OP", "BOOL_BIGGER_EQUALS_OP", "BOOL_SMALLER_EQUALS_OP", 
		"BOOL_EQUALS_OP", "BOOL_DIFFERENT_OP", "BOOL_CALC_DIFF_OP", "BOOL_CALC_OR_OP", 
		"BOOL_CALC_AND_OP", "SINGLELINE_COMMENT", "WHITE_SPACE"
	};


	public GramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Gramatica.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\62\u0128\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\7\17\u00ae\n\17\f\17\16\17\u00b1\13\17\3\17\3\17\3\20\3\20\5\20\u00b7"+
		"\n\20\3\20\3\20\3\21\5\21\u00bc\n\21\3\21\6\21\u00bf\n\21\r\21\16\21\u00c0"+
		"\3\22\3\22\3\22\7\22\u00c6\n\22\f\22\16\22\u00c9\13\22\3\23\6\23\u00cc"+
		"\n\23\r\23\16\23\u00cd\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\5\25\u00dd\n\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3"+
		" \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3"+
		"*\3+\3+\3+\3,\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60\3\60\7\60\u011b\n"+
		"\60\f\60\16\60\u011e\13\60\3\60\3\60\3\61\6\61\u0123\n\61\r\61\16\61\u0124"+
		"\3\61\3\61\2\2\62\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62\3\2\6"+
		"\4\2C\\c|\3\2\62;\4\2\f\f\17\17\5\2\13\f\17\17\"\"\u0131\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\3c\3\2\2"+
		"\2\5k\3\2\2\2\7t\3\2\2\2\tz\3\2\2\2\13}\3\2\2\2\r\u0082\3\2\2\2\17\u0086"+
		"\3\2\2\2\21\u008c\3\2\2\2\23\u0091\3\2\2\2\25\u0096\3\2\2\2\27\u009a\3"+
		"\2\2\2\31\u009f\3\2\2\2\33\u00a6\3\2\2\2\35\u00ab\3\2\2\2\37\u00b4\3\2"+
		"\2\2!\u00bb\3\2\2\2#\u00c2\3\2\2\2%\u00cb\3\2\2\2\'\u00cf\3\2\2\2)\u00dc"+
		"\3\2\2\2+\u00de\3\2\2\2-\u00e0\3\2\2\2/\u00e2\3\2\2\2\61\u00e4\3\2\2\2"+
		"\63\u00e6\3\2\2\2\65\u00e8\3\2\2\2\67\u00ea\3\2\2\29\u00ec\3\2\2\2;\u00ee"+
		"\3\2\2\2=\u00f0\3\2\2\2?\u00f2\3\2\2\2A\u00f4\3\2\2\2C\u00f6\3\2\2\2E"+
		"\u00f8\3\2\2\2G\u00fa\3\2\2\2I\u00fc\3\2\2\2K\u00fe\3\2\2\2M\u0100\3\2"+
		"\2\2O\u0102\3\2\2\2Q\u0104\3\2\2\2S\u0107\3\2\2\2U\u010a\3\2\2\2W\u010d"+
		"\3\2\2\2Y\u0110\3\2\2\2[\u0112\3\2\2\2]\u0114\3\2\2\2_\u0116\3\2\2\2a"+
		"\u0122\3\2\2\2cd\7r\2\2de\7t\2\2ef\7q\2\2fg\7i\2\2gh\7t\2\2hi\7c\2\2i"+
		"j\7o\2\2j\4\3\2\2\2kl\7h\2\2lm\7w\2\2mn\7p\2\2no\7e\2\2op\7v\2\2pq\7k"+
		"\2\2qr\7q\2\2rs\7p\2\2s\6\3\2\2\2tu\7y\2\2uv\7j\2\2vw\7k\2\2wx\7n\2\2"+
		"xy\7g\2\2y\b\3\2\2\2z{\7k\2\2{|\7h\2\2|\n\3\2\2\2}~\7g\2\2~\177\7n\2\2"+
		"\177\u0080\7u\2\2\u0080\u0081\7g\2\2\u0081\f\3\2\2\2\u0082\u0083\7h\2"+
		"\2\u0083\u0084\7q\2\2\u0084\u0085\7t\2\2\u0085\16\3\2\2\2\u0086\u0087"+
		"\7e\2\2\u0087\u0088\7q\2\2\u0088\u0089\7p\2\2\u0089\u008a\7u\2\2\u008a"+
		"\u008b\7v\2\2\u008b\20\3\2\2\2\u008c\u008d\7o\2\2\u008d\u008e\7c\2\2\u008e"+
		"\u008f\7k\2\2\u008f\u0090\7p\2\2\u0090\22\3\2\2\2\u0091\u0092\7e\2\2\u0092"+
		"\u0093\7j\2\2\u0093\u0094\7c\2\2\u0094\u0095\7t\2\2\u0095\24\3\2\2\2\u0096"+
		"\u0097\7k\2\2\u0097\u0098\7p\2\2\u0098\u0099\7v\2\2\u0099\26\3\2\2\2\u009a"+
		"\u009b\7t\2\2\u009b\u009c\7g\2\2\u009c\u009d\7c\2\2\u009d\u009e\7n\2\2"+
		"\u009e\30\3\2\2\2\u009f\u00a0\7u\2\2\u00a0\u00a1\7v\2\2\u00a1\u00a2\7"+
		"t\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7p\2\2\u00a4\u00a5\7i\2\2\u00a5\32"+
		"\3\2\2\2\u00a6\u00a7\7d\2\2\u00a7\u00a8\7q\2\2\u00a8\u00a9\7q\2\2\u00a9"+
		"\u00aa\7n\2\2\u00aa\34\3\2\2\2\u00ab\u00af\5? \2\u00ac\u00ae\5#\22\2\u00ad"+
		"\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2"+
		"\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\5? \2\u00b3\36"+
		"\3\2\2\2\u00b4\u00b6\5=\37\2\u00b5\u00b7\5#\22\2\u00b6\u00b5\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\5=\37\2\u00b9 \3\2\2\2"+
		"\u00ba\u00bc\7a\2\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be"+
		"\3\2\2\2\u00bd\u00bf\5#\22\2\u00be\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\"\3\2\2\2\u00c2\u00c7\t\2\2\2"+
		"\u00c3\u00c6\t\2\2\2\u00c4\u00c6\5%\23\2\u00c5\u00c3\3\2\2\2\u00c5\u00c4"+
		"\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"$\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cc\t\3\2\2\u00cb\u00ca\3\2\2\2"+
		"\u00cc\u00cd\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce&\3"+
		"\2\2\2\u00cf\u00d0\5%\23\2\u00d0\u00d1\5;\36\2\u00d1\u00d2\5%\23\2\u00d2"+
		"(\3\2\2\2\u00d3\u00d4\7v\2\2\u00d4\u00d5\7t\2\2\u00d5\u00d6\7w\2\2\u00d6"+
		"\u00dd\7g\2\2\u00d7\u00d8\7h\2\2\u00d8\u00d9\7c\2\2\u00d9\u00da\7n\2\2"+
		"\u00da\u00db\7u\2\2\u00db\u00dd\7g\2\2\u00dc\u00d3\3\2\2\2\u00dc\u00d7"+
		"\3\2\2\2\u00dd*\3\2\2\2\u00de\u00df\7=\2\2\u00df,\3\2\2\2\u00e0\u00e1"+
		"\7}\2\2\u00e1.\3\2\2\2\u00e2\u00e3\7\177\2\2\u00e3\60\3\2\2\2\u00e4\u00e5"+
		"\7*\2\2\u00e5\62\3\2\2\2\u00e6\u00e7\7+\2\2\u00e7\64\3\2\2\2\u00e8\u00e9"+
		"\7]\2\2\u00e9\66\3\2\2\2\u00ea\u00eb\7_\2\2\u00eb8\3\2\2\2\u00ec\u00ed"+
		"\7.\2\2\u00ed:\3\2\2\2\u00ee\u00ef\7\60\2\2\u00ef<\3\2\2\2\u00f0\u00f1"+
		"\7)\2\2\u00f1>\3\2\2\2\u00f2\u00f3\7$\2\2\u00f3@\3\2\2\2\u00f4\u00f5\7"+
		"-\2\2\u00f5B\3\2\2\2\u00f6\u00f7\7?\2\2\u00f7D\3\2\2\2\u00f8\u00f9\7/"+
		"\2\2\u00f9F\3\2\2\2\u00fa\u00fb\7\61\2\2\u00fbH\3\2\2\2\u00fc\u00fd\7"+
		",\2\2\u00fdJ\3\2\2\2\u00fe\u00ff\7\'\2\2\u00ffL\3\2\2\2\u0100\u0101\7"+
		">\2\2\u0101N\3\2\2\2\u0102\u0103\7@\2\2\u0103P\3\2\2\2\u0104\u0105\7@"+
		"\2\2\u0105\u0106\7?\2\2\u0106R\3\2\2\2\u0107\u0108\7>\2\2\u0108\u0109"+
		"\7?\2\2\u0109T\3\2\2\2\u010a\u010b\7?\2\2\u010b\u010c\7?\2\2\u010cV\3"+
		"\2\2\2\u010d\u010e\7#\2\2\u010e\u010f\7?\2\2\u010fX\3\2\2\2\u0110\u0111"+
		"\7#\2\2\u0111Z\3\2\2\2\u0112\u0113\7~\2\2\u0113\\\3\2\2\2\u0114\u0115"+
		"\7(\2\2\u0115^\3\2\2\2\u0116\u0117\7\61\2\2\u0117\u0118\7\61\2\2\u0118"+
		"\u011c\3\2\2\2\u0119\u011b\n\4\2\2\u011a\u0119\3\2\2\2\u011b\u011e\3\2"+
		"\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011f\3\2\2\2\u011e"+
		"\u011c\3\2\2\2\u011f\u0120\b\60\2\2\u0120`\3\2\2\2\u0121\u0123\t\5\2\2"+
		"\u0122\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125"+
		"\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\b\61\2\2\u0127b\3\2\2\2\r\2\u00af"+
		"\u00b6\u00bb\u00c0\u00c5\u00c7\u00cd\u00dc\u011c\u0124\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}