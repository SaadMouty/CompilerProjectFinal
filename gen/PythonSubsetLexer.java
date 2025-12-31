// Generated from C:/Users/ASUSD/CompilerCourse/CompilerProject5/src/main/antlr4/com/compiler/shop/grammars/PythonSubset.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PythonSubsetLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ADD_PRODUCT=1, GET_PRODUCTS=2, GET_PRODUCT_DETAILS=3, DELETE_PRODUCT=4, 
		LPAREN=5, RPAREN=6, COMMA=7, SEMI=8, ASSIGN=9, NUMBER=10, STRING=11, IDENTIFIER=12, 
		COMMENT=13, WS=14, NEWLINE=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ADD_PRODUCT", "GET_PRODUCTS", "GET_PRODUCT_DETAILS", "DELETE_PRODUCT", 
			"LPAREN", "RPAREN", "COMMA", "SEMI", "ASSIGN", "NUMBER", "STRING", "ESC", 
			"HEX", "DIGIT", "IDENTIFIER", "COMMENT", "WS", "NEWLINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'add_product'", "'get_products'", "'get_product_details'", "'delete_product'", 
			"'('", "')'", "','", "';'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ADD_PRODUCT", "GET_PRODUCTS", "GET_PRODUCT_DETAILS", "DELETE_PRODUCT", 
			"LPAREN", "RPAREN", "COMMA", "SEMI", "ASSIGN", "NUMBER", "STRING", "IDENTIFIER", 
			"COMMENT", "WS", "NEWLINE"
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


	public PythonSubsetLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PythonSubset.g4"; }

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
		"\u0004\u0000\u000f\u00b7\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0004\tm\b\t\u000b\t"+
		"\f\tn\u0001\t\u0001\t\u0004\ts\b\t\u000b\t\f\tt\u0003\tw\b\t\u0001\n\u0001"+
		"\n\u0001\n\u0005\n|\b\n\n\n\f\n\u007f\t\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0005\n\u0085\b\n\n\n\f\n\u0088\t\n\u0001\n\u0003\n\u008b\b\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0096\b\u000b\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0005\u000e\u009e\b\u000e\n"+
		"\u000e\f\u000e\u00a1\t\u000e\u0001\u000f\u0001\u000f\u0005\u000f\u00a5"+
		"\b\u000f\n\u000f\f\u000f\u00a8\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0004\u0010\u00ad\b\u0010\u000b\u0010\f\u0010\u00ae\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0003\u0011\u00b4\b\u0011\u0001\u0011\u0001\u0011\u0000"+
		"\u0000\u0012\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\u0000\u0019\u0000"+
		"\u001b\u0000\u001d\f\u001f\r!\u000e#\u000f\u0001\u0000\t\u0004\u0000\n"+
		"\n\r\r\"\"\\\\\u0004\u0000\n\n\r\r\'\'\\\\\u0007\u0000\"\"\\\\bbffnnr"+
		"rtt\u0003\u000009AFaf\u0001\u000009\u0003\u0000AZ__az\u0004\u000009AZ"+
		"__az\u0002\u0000\n\n\r\r\u0002\u0000\t\t  \u00c0\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0001%"+
		"\u0001\u0000\u0000\u0000\u00031\u0001\u0000\u0000\u0000\u0005>\u0001\u0000"+
		"\u0000\u0000\u0007R\u0001\u0000\u0000\u0000\ta\u0001\u0000\u0000\u0000"+
		"\u000bc\u0001\u0000\u0000\u0000\re\u0001\u0000\u0000\u0000\u000fg\u0001"+
		"\u0000\u0000\u0000\u0011i\u0001\u0000\u0000\u0000\u0013l\u0001\u0000\u0000"+
		"\u0000\u0015\u008a\u0001\u0000\u0000\u0000\u0017\u0095\u0001\u0000\u0000"+
		"\u0000\u0019\u0097\u0001\u0000\u0000\u0000\u001b\u0099\u0001\u0000\u0000"+
		"\u0000\u001d\u009b\u0001\u0000\u0000\u0000\u001f\u00a2\u0001\u0000\u0000"+
		"\u0000!\u00ac\u0001\u0000\u0000\u0000#\u00b3\u0001\u0000\u0000\u0000%"+
		"&\u0005a\u0000\u0000&\'\u0005d\u0000\u0000\'(\u0005d\u0000\u0000()\u0005"+
		"_\u0000\u0000)*\u0005p\u0000\u0000*+\u0005r\u0000\u0000+,\u0005o\u0000"+
		"\u0000,-\u0005d\u0000\u0000-.\u0005u\u0000\u0000./\u0005c\u0000\u0000"+
		"/0\u0005t\u0000\u00000\u0002\u0001\u0000\u0000\u000012\u0005g\u0000\u0000"+
		"23\u0005e\u0000\u000034\u0005t\u0000\u000045\u0005_\u0000\u000056\u0005"+
		"p\u0000\u000067\u0005r\u0000\u000078\u0005o\u0000\u000089\u0005d\u0000"+
		"\u00009:\u0005u\u0000\u0000:;\u0005c\u0000\u0000;<\u0005t\u0000\u0000"+
		"<=\u0005s\u0000\u0000=\u0004\u0001\u0000\u0000\u0000>?\u0005g\u0000\u0000"+
		"?@\u0005e\u0000\u0000@A\u0005t\u0000\u0000AB\u0005_\u0000\u0000BC\u0005"+
		"p\u0000\u0000CD\u0005r\u0000\u0000DE\u0005o\u0000\u0000EF\u0005d\u0000"+
		"\u0000FG\u0005u\u0000\u0000GH\u0005c\u0000\u0000HI\u0005t\u0000\u0000"+
		"IJ\u0005_\u0000\u0000JK\u0005d\u0000\u0000KL\u0005e\u0000\u0000LM\u0005"+
		"t\u0000\u0000MN\u0005a\u0000\u0000NO\u0005i\u0000\u0000OP\u0005l\u0000"+
		"\u0000PQ\u0005s\u0000\u0000Q\u0006\u0001\u0000\u0000\u0000RS\u0005d\u0000"+
		"\u0000ST\u0005e\u0000\u0000TU\u0005l\u0000\u0000UV\u0005e\u0000\u0000"+
		"VW\u0005t\u0000\u0000WX\u0005e\u0000\u0000XY\u0005_\u0000\u0000YZ\u0005"+
		"p\u0000\u0000Z[\u0005r\u0000\u0000[\\\u0005o\u0000\u0000\\]\u0005d\u0000"+
		"\u0000]^\u0005u\u0000\u0000^_\u0005c\u0000\u0000_`\u0005t\u0000\u0000"+
		"`\b\u0001\u0000\u0000\u0000ab\u0005(\u0000\u0000b\n\u0001\u0000\u0000"+
		"\u0000cd\u0005)\u0000\u0000d\f\u0001\u0000\u0000\u0000ef\u0005,\u0000"+
		"\u0000f\u000e\u0001\u0000\u0000\u0000gh\u0005;\u0000\u0000h\u0010\u0001"+
		"\u0000\u0000\u0000ij\u0005=\u0000\u0000j\u0012\u0001\u0000\u0000\u0000"+
		"km\u0003\u001b\r\u0000lk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000"+
		"nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000ov\u0001\u0000\u0000"+
		"\u0000pr\u0005.\u0000\u0000qs\u0003\u001b\r\u0000rq\u0001\u0000\u0000"+
		"\u0000st\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000"+
		"\u0000\u0000uw\u0001\u0000\u0000\u0000vp\u0001\u0000\u0000\u0000vw\u0001"+
		"\u0000\u0000\u0000w\u0014\u0001\u0000\u0000\u0000x}\u0005\"\u0000\u0000"+
		"y|\u0003\u0017\u000b\u0000z|\b\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000"+
		"{z\u0001\u0000\u0000\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000"+
		"\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0080\u0001\u0000\u0000\u0000"+
		"\u007f}\u0001\u0000\u0000\u0000\u0080\u008b\u0005\"\u0000\u0000\u0081"+
		"\u0086\u0005\'\u0000\u0000\u0082\u0085\u0003\u0017\u000b\u0000\u0083\u0085"+
		"\b\u0001\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0083\u0001"+
		"\u0000\u0000\u0000\u0085\u0088\u0001\u0000\u0000\u0000\u0086\u0084\u0001"+
		"\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0089\u0001"+
		"\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089\u008b\u0005"+
		"\'\u0000\u0000\u008ax\u0001\u0000\u0000\u0000\u008a\u0081\u0001\u0000"+
		"\u0000\u0000\u008b\u0016\u0001\u0000\u0000\u0000\u008c\u008d\u0005\\\u0000"+
		"\u0000\u008d\u0096\u0007\u0002\u0000\u0000\u008e\u008f\u0005\\\u0000\u0000"+
		"\u008f\u0090\u0005u\u0000\u0000\u0090\u0091\u0003\u0019\f\u0000\u0091"+
		"\u0092\u0003\u0019\f\u0000\u0092\u0093\u0003\u0019\f\u0000\u0093\u0094"+
		"\u0003\u0019\f\u0000\u0094\u0096\u0001\u0000\u0000\u0000\u0095\u008c\u0001"+
		"\u0000\u0000\u0000\u0095\u008e\u0001\u0000\u0000\u0000\u0096\u0018\u0001"+
		"\u0000\u0000\u0000\u0097\u0098\u0007\u0003\u0000\u0000\u0098\u001a\u0001"+
		"\u0000\u0000\u0000\u0099\u009a\u0007\u0004\u0000\u0000\u009a\u001c\u0001"+
		"\u0000\u0000\u0000\u009b\u009f\u0007\u0005\u0000\u0000\u009c\u009e\u0007"+
		"\u0006\u0000\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009e\u00a1\u0001"+
		"\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001"+
		"\u0000\u0000\u0000\u00a0\u001e\u0001\u0000\u0000\u0000\u00a1\u009f\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a6\u0005#\u0000\u0000\u00a3\u00a5\b\u0007"+
		"\u0000\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a8\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a9\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a9\u00aa\u0006\u000f\u0000\u0000\u00aa \u0001\u0000\u0000"+
		"\u0000\u00ab\u00ad\u0007\b\u0000\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000"+
		"\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000"+
		"\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b1\u0006\u0010\u0000\u0000\u00b1\"\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b4\u0005\r\u0000\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b3\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b6"+
		"\u0005\n\u0000\u0000\u00b6$\u0001\u0000\u0000\u0000\u000e\u0000ntv{}\u0084"+
		"\u0086\u008a\u0095\u009f\u00a6\u00ae\u00b3\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}