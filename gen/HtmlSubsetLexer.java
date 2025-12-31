// Generated from C:/Users/ASUSD/CompilerCourse/CompilerProject5/src/main/antlr4/com/compiler/shop/grammars/HtmlSubset.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class HtmlSubsetLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HTML_COMMENT=1, LT_SLASH=2, SLASH_GT=3, LT=4, GT=5, EQ=6, NAME=7, STRING=8, 
		WS=9, TEXT=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"HTML_COMMENT", "LT_SLASH", "SLASH_GT", "LT", "GT", "EQ", "NAME", "STRING", 
			"ESC", "HEX", "WS", "TEXT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'</'", "'/>'", "'<'", "'>'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "HTML_COMMENT", "LT_SLASH", "SLASH_GT", "LT", "GT", "EQ", "NAME", 
			"STRING", "WS", "TEXT"
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


	public HtmlSubsetLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "HtmlSubset.g4"; }

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
		"\u0004\u0000\nj\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000 \b\u0000\n\u0000\f\u0000#\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0005\u00069\b\u0006\n\u0006\f\u0006<\t\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007A\b\u0007\n\u0007\f\u0007D\t\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007J\b\u0007"+
		"\n\u0007\f\u0007M\t\u0007\u0001\u0007\u0003\u0007P\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b[\b"+
		"\b\u0001\t\u0001\t\u0001\n\u0004\n`\b\n\u000b\n\f\na\u0001\n\u0001\n\u0001"+
		"\u000b\u0004\u000bg\b\u000b\u000b\u000b\f\u000bh\u0001!\u0000\f\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\u0000\u0013\u0000\u0015\t\u0017\n\u0001\u0000\b\u0003\u0000"+
		"AZ__az\u0005\u0000--09AZ__az\u0004\u0000\n\n\r\r\"\"\\\\\u0004\u0000\n"+
		"\n\r\r\'\'\\\\\u0007\u0000\"\"\\\\bbffnnrrtt\u0003\u000009AFaf\u0003\u0000"+
		"\t\n\r\r  \u0001\u0000<<q\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0001\u0019\u0001\u0000\u0000\u0000\u0003*\u0001\u0000\u0000"+
		"\u0000\u0005-\u0001\u0000\u0000\u0000\u00070\u0001\u0000\u0000\u0000\t"+
		"2\u0001\u0000\u0000\u0000\u000b4\u0001\u0000\u0000\u0000\r6\u0001\u0000"+
		"\u0000\u0000\u000fO\u0001\u0000\u0000\u0000\u0011Z\u0001\u0000\u0000\u0000"+
		"\u0013\\\u0001\u0000\u0000\u0000\u0015_\u0001\u0000\u0000\u0000\u0017"+
		"f\u0001\u0000\u0000\u0000\u0019\u001a\u0005<\u0000\u0000\u001a\u001b\u0005"+
		"!\u0000\u0000\u001b\u001c\u0005-\u0000\u0000\u001c\u001d\u0005-\u0000"+
		"\u0000\u001d!\u0001\u0000\u0000\u0000\u001e \t\u0000\u0000\u0000\u001f"+
		"\u001e\u0001\u0000\u0000\u0000 #\u0001\u0000\u0000\u0000!\"\u0001\u0000"+
		"\u0000\u0000!\u001f\u0001\u0000\u0000\u0000\"$\u0001\u0000\u0000\u0000"+
		"#!\u0001\u0000\u0000\u0000$%\u0005-\u0000\u0000%&\u0005-\u0000\u0000&"+
		"\'\u0005>\u0000\u0000\'(\u0001\u0000\u0000\u0000()\u0006\u0000\u0000\u0000"+
		")\u0002\u0001\u0000\u0000\u0000*+\u0005<\u0000\u0000+,\u0005/\u0000\u0000"+
		",\u0004\u0001\u0000\u0000\u0000-.\u0005/\u0000\u0000./\u0005>\u0000\u0000"+
		"/\u0006\u0001\u0000\u0000\u000001\u0005<\u0000\u00001\b\u0001\u0000\u0000"+
		"\u000023\u0005>\u0000\u00003\n\u0001\u0000\u0000\u000045\u0005=\u0000"+
		"\u00005\f\u0001\u0000\u0000\u00006:\u0007\u0000\u0000\u000079\u0007\u0001"+
		"\u0000\u000087\u0001\u0000\u0000\u00009<\u0001\u0000\u0000\u0000:8\u0001"+
		"\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;\u000e\u0001\u0000\u0000"+
		"\u0000<:\u0001\u0000\u0000\u0000=B\u0005\"\u0000\u0000>A\u0003\u0011\b"+
		"\u0000?A\b\u0002\u0000\u0000@>\u0001\u0000\u0000\u0000@?\u0001\u0000\u0000"+
		"\u0000AD\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000BC\u0001\u0000"+
		"\u0000\u0000CE\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000EP\u0005"+
		"\"\u0000\u0000FK\u0005\'\u0000\u0000GJ\u0003\u0011\b\u0000HJ\b\u0003\u0000"+
		"\u0000IG\u0001\u0000\u0000\u0000IH\u0001\u0000\u0000\u0000JM\u0001\u0000"+
		"\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LN\u0001"+
		"\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000NP\u0005\'\u0000\u0000O=\u0001"+
		"\u0000\u0000\u0000OF\u0001\u0000\u0000\u0000P\u0010\u0001\u0000\u0000"+
		"\u0000QR\u0005\\\u0000\u0000R[\u0007\u0004\u0000\u0000ST\u0005\\\u0000"+
		"\u0000TU\u0005u\u0000\u0000UV\u0003\u0013\t\u0000VW\u0003\u0013\t\u0000"+
		"WX\u0003\u0013\t\u0000XY\u0003\u0013\t\u0000Y[\u0001\u0000\u0000\u0000"+
		"ZQ\u0001\u0000\u0000\u0000ZS\u0001\u0000\u0000\u0000[\u0012\u0001\u0000"+
		"\u0000\u0000\\]\u0007\u0005\u0000\u0000]\u0014\u0001\u0000\u0000\u0000"+
		"^`\u0007\u0006\u0000\u0000_^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000"+
		"\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0001\u0000"+
		"\u0000\u0000cd\u0006\n\u0000\u0000d\u0016\u0001\u0000\u0000\u0000eg\b"+
		"\u0007\u0000\u0000fe\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000"+
		"hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000i\u0018\u0001\u0000"+
		"\u0000\u0000\u000b\u0000!:@BIKOZah\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}