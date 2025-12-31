// Generated from C:/Users/ASUSD/CompilerCourse/CompilerProject5/src/main/antlr4/com/compiler/shop/grammars/CssSubset.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CssSubsetLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CSS_COMMENT=1, WS=2, LBRACE=3, RBRACE=4, COLON=5, SEMI=6, COMMA=7, COMBINATOR=8, 
		STAR=9, DOT=10, HASH=11, SLASH=12, LPAREN=13, RPAREN=14, PERCENT=15, MINUS=16, 
		PLUS=17, COLOR=18, NUMBER=19, STRING=20, IDENT=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CSS_COMMENT", "WS", "LBRACE", "RBRACE", "COLON", "SEMI", "COMMA", "COMBINATOR", 
			"STAR", "DOT", "HASH", "SLASH", "LPAREN", "RPAREN", "PERCENT", "MINUS", 
			"PLUS", "COLOR", "HEXDIGIT", "NUMBER", "DIGIT", "STRING", "ESC", "HEX", 
			"IDENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'{'", "'}'", "':'", "';'", "','", null, "'*'", "'.'", 
			"'#'", "'/'", "'('", "')'", "'%'", "'-'", "'+'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CSS_COMMENT", "WS", "LBRACE", "RBRACE", "COLON", "SEMI", "COMMA", 
			"COMBINATOR", "STAR", "DOT", "HASH", "SLASH", "LPAREN", "RPAREN", "PERCENT", 
			"MINUS", "PLUS", "COLOR", "NUMBER", "STRING", "IDENT"
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


	public CssSubsetLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CssSubset.g4"; }

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
		"\u0004\u0000\u0015\u00a9\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u00008\b\u0000\n\u0000\f\u0000;\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u0001C\b\u0001"+
		"\u000b\u0001\f\u0001D\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011o\b\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0004\u0013t\b\u0013\u000b\u0013\f\u0013u\u0001"+
		"\u0013\u0001\u0013\u0004\u0013z\b\u0013\u000b\u0013\f\u0013{\u0003\u0013"+
		"~\b\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0005\u0015\u0085\b\u0015\n\u0015\f\u0015\u0088\t\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u008e\b\u0015\n\u0015\f\u0015"+
		"\u0091\t\u0015\u0001\u0015\u0003\u0015\u0094\b\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u009f\b\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0005\u0018\u00a5\b\u0018\n\u0018\f\u0018\u00a8\t\u0018"+
		"\u00019\u0000\u0019\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t"+
		"\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f"+
		"\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0000\'\u0013"+
		")\u0000+\u0014-\u0000/\u00001\u0015\u0001\u0000\t\u0003\u0000\t\n\r\r"+
		"  \u0003\u0000++>>~~\u0003\u000009AFaf\u0001\u000009\u0004\u0000\n\n\r"+
		"\r\"\"\\\\\u0004\u0000\n\n\r\r\'\'\\\\\u0007\u0000\"\"\\\\bbffnnrrtt\u0003"+
		"\u0000AZ__az\u0005\u0000--09AZ__az\u00b1\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001"+
		"\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000+\u0001\u0000"+
		"\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00013\u0001\u0000\u0000\u0000"+
		"\u0003B\u0001\u0000\u0000\u0000\u0005H\u0001\u0000\u0000\u0000\u0007J"+
		"\u0001\u0000\u0000\u0000\tL\u0001\u0000\u0000\u0000\u000bN\u0001\u0000"+
		"\u0000\u0000\rP\u0001\u0000\u0000\u0000\u000fR\u0001\u0000\u0000\u0000"+
		"\u0011T\u0001\u0000\u0000\u0000\u0013V\u0001\u0000\u0000\u0000\u0015X"+
		"\u0001\u0000\u0000\u0000\u0017Z\u0001\u0000\u0000\u0000\u0019\\\u0001"+
		"\u0000\u0000\u0000\u001b^\u0001\u0000\u0000\u0000\u001d`\u0001\u0000\u0000"+
		"\u0000\u001fb\u0001\u0000\u0000\u0000!d\u0001\u0000\u0000\u0000#f\u0001"+
		"\u0000\u0000\u0000%p\u0001\u0000\u0000\u0000\'s\u0001\u0000\u0000\u0000"+
		")\u007f\u0001\u0000\u0000\u0000+\u0093\u0001\u0000\u0000\u0000-\u009e"+
		"\u0001\u0000\u0000\u0000/\u00a0\u0001\u0000\u0000\u00001\u00a2\u0001\u0000"+
		"\u0000\u000034\u0005/\u0000\u000045\u0005*\u0000\u000059\u0001\u0000\u0000"+
		"\u000068\t\u0000\u0000\u000076\u0001\u0000\u0000\u00008;\u0001\u0000\u0000"+
		"\u00009:\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u0000:<\u0001\u0000"+
		"\u0000\u0000;9\u0001\u0000\u0000\u0000<=\u0005*\u0000\u0000=>\u0005/\u0000"+
		"\u0000>?\u0001\u0000\u0000\u0000?@\u0006\u0000\u0000\u0000@\u0002\u0001"+
		"\u0000\u0000\u0000AC\u0007\u0000\u0000\u0000BA\u0001\u0000\u0000\u0000"+
		"CD\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000"+
		"\u0000EF\u0001\u0000\u0000\u0000FG\u0006\u0001\u0000\u0000G\u0004\u0001"+
		"\u0000\u0000\u0000HI\u0005{\u0000\u0000I\u0006\u0001\u0000\u0000\u0000"+
		"JK\u0005}\u0000\u0000K\b\u0001\u0000\u0000\u0000LM\u0005:\u0000\u0000"+
		"M\n\u0001\u0000\u0000\u0000NO\u0005;\u0000\u0000O\f\u0001\u0000\u0000"+
		"\u0000PQ\u0005,\u0000\u0000Q\u000e\u0001\u0000\u0000\u0000RS\u0007\u0001"+
		"\u0000\u0000S\u0010\u0001\u0000\u0000\u0000TU\u0005*\u0000\u0000U\u0012"+
		"\u0001\u0000\u0000\u0000VW\u0005.\u0000\u0000W\u0014\u0001\u0000\u0000"+
		"\u0000XY\u0005#\u0000\u0000Y\u0016\u0001\u0000\u0000\u0000Z[\u0005/\u0000"+
		"\u0000[\u0018\u0001\u0000\u0000\u0000\\]\u0005(\u0000\u0000]\u001a\u0001"+
		"\u0000\u0000\u0000^_\u0005)\u0000\u0000_\u001c\u0001\u0000\u0000\u0000"+
		"`a\u0005%\u0000\u0000a\u001e\u0001\u0000\u0000\u0000bc\u0005-\u0000\u0000"+
		"c \u0001\u0000\u0000\u0000de\u0005+\u0000\u0000e\"\u0001\u0000\u0000\u0000"+
		"fg\u0005#\u0000\u0000gh\u0003%\u0012\u0000hi\u0003%\u0012\u0000in\u0003"+
		"%\u0012\u0000jk\u0003%\u0012\u0000kl\u0003%\u0012\u0000lm\u0003%\u0012"+
		"\u0000mo\u0001\u0000\u0000\u0000nj\u0001\u0000\u0000\u0000no\u0001\u0000"+
		"\u0000\u0000o$\u0001\u0000\u0000\u0000pq\u0007\u0002\u0000\u0000q&\u0001"+
		"\u0000\u0000\u0000rt\u0003)\u0014\u0000sr\u0001\u0000\u0000\u0000tu\u0001"+
		"\u0000\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000"+
		"v}\u0001\u0000\u0000\u0000wy\u0005.\u0000\u0000xz\u0003)\u0014\u0000y"+
		"x\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000"+
		"\u0000{|\u0001\u0000\u0000\u0000|~\u0001\u0000\u0000\u0000}w\u0001\u0000"+
		"\u0000\u0000}~\u0001\u0000\u0000\u0000~(\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0007\u0003\u0000\u0000\u0080*\u0001\u0000\u0000\u0000\u0081\u0086"+
		"\u0005\"\u0000\u0000\u0082\u0085\u0003-\u0016\u0000\u0083\u0085\b\u0004"+
		"\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0083\u0001\u0000"+
		"\u0000\u0000\u0085\u0088\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000"+
		"\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0089\u0001\u0000"+
		"\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089\u0094\u0005\"\u0000"+
		"\u0000\u008a\u008f\u0005\'\u0000\u0000\u008b\u008e\u0003-\u0016\u0000"+
		"\u008c\u008e\b\u0005\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d"+
		"\u008c\u0001\u0000\u0000\u0000\u008e\u0091\u0001\u0000\u0000\u0000\u008f"+
		"\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090"+
		"\u0092\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0092"+
		"\u0094\u0005\'\u0000\u0000\u0093\u0081\u0001\u0000\u0000\u0000\u0093\u008a"+
		"\u0001\u0000\u0000\u0000\u0094,\u0001\u0000\u0000\u0000\u0095\u0096\u0005"+
		"\\\u0000\u0000\u0096\u009f\u0007\u0006\u0000\u0000\u0097\u0098\u0005\\"+
		"\u0000\u0000\u0098\u0099\u0005u\u0000\u0000\u0099\u009a\u0003/\u0017\u0000"+
		"\u009a\u009b\u0003/\u0017\u0000\u009b\u009c\u0003/\u0017\u0000\u009c\u009d"+
		"\u0003/\u0017\u0000\u009d\u009f\u0001\u0000\u0000\u0000\u009e\u0095\u0001"+
		"\u0000\u0000\u0000\u009e\u0097\u0001\u0000\u0000\u0000\u009f.\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a1\u0007\u0002\u0000\u0000\u00a10\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a6\u0007\u0007\u0000\u0000\u00a3\u00a5\u0007\b\u0000\u0000"+
		"\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a8\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000"+
		"\u00a72\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u000e"+
		"\u00009Dnu{}\u0084\u0086\u008d\u008f\u0093\u009e\u00a6\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}