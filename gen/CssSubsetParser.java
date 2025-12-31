// Generated from C:/Users/ASUSD/CompilerCourse/CompilerProject5/src/main/antlr4/com/compiler/shop/grammars/CssSubset.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CssSubsetParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CSS_COMMENT=1, WS=2, LBRACE=3, RBRACE=4, COLON=5, SEMI=6, COMMA=7, COMBINATOR=8, 
		STAR=9, DOT=10, HASH=11, SLASH=12, LPAREN=13, RPAREN=14, PERCENT=15, MINUS=16, 
		PLUS=17, COLOR=18, NUMBER=19, STRING=20, IDENT=21;
	public static final int
		RULE_stylesheet = 0, RULE_rule = 1, RULE_selectorGroup = 2, RULE_selector = 3, 
		RULE_simpleSelector = 4, RULE_declaration = 5, RULE_value = 6, RULE_valueAtom = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"stylesheet", "rule", "selectorGroup", "selector", "simpleSelector", 
			"declaration", "value", "valueAtom"
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

	@Override
	public String getGrammarFileName() { return "CssSubset.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CssSubsetParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StylesheetContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CssSubsetParser.EOF, 0); }
		public List<RuleContext> rule_() {
			return getRuleContexts(RuleContext.class);
		}
		public RuleContext rule_(int i) {
			return getRuleContext(RuleContext.class,i);
		}
		public StylesheetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stylesheet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssSubsetListener ) ((CssSubsetListener)listener).enterStylesheet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssSubsetListener ) ((CssSubsetListener)listener).exitStylesheet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssSubsetVisitor ) return ((CssSubsetVisitor<? extends T>)visitor).visitStylesheet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StylesheetContext stylesheet() throws RecognitionException {
		StylesheetContext _localctx = new StylesheetContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stylesheet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2101128L) != 0)) {
				{
				{
				setState(16);
				rule_();
				}
				}
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(22);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RuleContext extends ParserRuleContext {
		public SelectorGroupContext selectorGroup() {
			return getRuleContext(SelectorGroupContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(CssSubsetParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CssSubsetParser.RBRACE, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public RuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssSubsetListener ) ((CssSubsetListener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssSubsetListener ) ((CssSubsetListener)listener).exitRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssSubsetVisitor ) return ((CssSubsetVisitor<? extends T>)visitor).visitRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleContext rule_() throws RecognitionException {
		RuleContext _localctx = new RuleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			selectorGroup();
			setState(25);
			match(LBRACE);
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(26);
				declaration();
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorGroupContext extends ParserRuleContext {
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CssSubsetParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CssSubsetParser.COMMA, i);
		}
		public SelectorGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssSubsetListener ) ((CssSubsetListener)listener).enterSelectorGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssSubsetListener ) ((CssSubsetListener)listener).exitSelectorGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssSubsetVisitor ) return ((CssSubsetVisitor<? extends T>)visitor).visitSelectorGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorGroupContext selectorGroup() throws RecognitionException {
		SelectorGroupContext _localctx = new SelectorGroupContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_selectorGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			selector();
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(35);
				match(COMMA);
				setState(36);
				selector();
				}
				}
				setState(41);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorContext extends ParserRuleContext {
		public List<SimpleSelectorContext> simpleSelector() {
			return getRuleContexts(SimpleSelectorContext.class);
		}
		public SimpleSelectorContext simpleSelector(int i) {
			return getRuleContext(SimpleSelectorContext.class,i);
		}
		public List<TerminalNode> COMBINATOR() { return getTokens(CssSubsetParser.COMBINATOR); }
		public TerminalNode COMBINATOR(int i) {
			return getToken(CssSubsetParser.COMBINATOR, i);
		}
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssSubsetListener ) ((CssSubsetListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssSubsetListener ) ((CssSubsetListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssSubsetVisitor ) return ((CssSubsetVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_selector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			simpleSelector();
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMBINATOR) {
				{
				{
				setState(43);
				match(COMBINATOR);
				setState(44);
				simpleSelector();
				}
				}
				setState(49);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleSelectorContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(CssSubsetParser.STAR, 0); }
		public List<TerminalNode> IDENT() { return getTokens(CssSubsetParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(CssSubsetParser.IDENT, i);
		}
		public List<TerminalNode> DOT() { return getTokens(CssSubsetParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(CssSubsetParser.DOT, i);
		}
		public List<TerminalNode> HASH() { return getTokens(CssSubsetParser.HASH); }
		public TerminalNode HASH(int i) {
			return getToken(CssSubsetParser.HASH, i);
		}
		public SimpleSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssSubsetListener ) ((CssSubsetListener)listener).enterSimpleSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssSubsetListener ) ((CssSubsetListener)listener).exitSimpleSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssSubsetVisitor ) return ((CssSubsetVisitor<? extends T>)visitor).visitSimpleSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleSelectorContext simpleSelector() throws RecognitionException {
		SimpleSelectorContext _localctx = new SimpleSelectorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_simpleSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STAR || _la==IDENT) {
				{
				setState(50);
				_la = _input.LA(1);
				if ( !(_la==STAR || _la==IDENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT || _la==HASH) {
				{
				setState(57);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DOT:
					{
					{
					setState(53);
					match(DOT);
					setState(54);
					match(IDENT);
					}
					}
					break;
				case HASH:
					{
					{
					setState(55);
					match(HASH);
					setState(56);
					match(IDENT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(61);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(CssSubsetParser.IDENT, 0); }
		public TerminalNode COLON() { return getToken(CssSubsetParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CssSubsetParser.SEMI, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssSubsetListener ) ((CssSubsetListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssSubsetListener ) ((CssSubsetListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssSubsetVisitor ) return ((CssSubsetVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(IDENT);
			setState(63);
			match(COLON);
			setState(64);
			value();
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(65);
				match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public List<ValueAtomContext> valueAtom() {
			return getRuleContexts(ValueAtomContext.class);
		}
		public ValueAtomContext valueAtom(int i) {
			return getRuleContext(ValueAtomContext.class,i);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssSubsetListener ) ((CssSubsetListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssSubsetListener ) ((CssSubsetListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssSubsetVisitor ) return ((CssSubsetVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_value);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(69); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(68);
					valueAtom();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(71); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueAtomContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(CssSubsetParser.IDENT, 0); }
		public TerminalNode NUMBER() { return getToken(CssSubsetParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(CssSubsetParser.STRING, 0); }
		public TerminalNode COLOR() { return getToken(CssSubsetParser.COLOR, 0); }
		public TerminalNode HASH() { return getToken(CssSubsetParser.HASH, 0); }
		public TerminalNode LPAREN() { return getToken(CssSubsetParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CssSubsetParser.RPAREN, 0); }
		public TerminalNode COMMA() { return getToken(CssSubsetParser.COMMA, 0); }
		public TerminalNode DOT() { return getToken(CssSubsetParser.DOT, 0); }
		public TerminalNode MINUS() { return getToken(CssSubsetParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(CssSubsetParser.PLUS, 0); }
		public TerminalNode PERCENT() { return getToken(CssSubsetParser.PERCENT, 0); }
		public TerminalNode SLASH() { return getToken(CssSubsetParser.SLASH, 0); }
		public ValueAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueAtom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssSubsetListener ) ((CssSubsetListener)listener).enterValueAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssSubsetListener ) ((CssSubsetListener)listener).exitValueAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssSubsetVisitor ) return ((CssSubsetVisitor<? extends T>)visitor).visitValueAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueAtomContext valueAtom() throws RecognitionException {
		ValueAtomContext _localctx = new ValueAtomContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_valueAtom);
		try {
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(IDENT);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				match(STRING);
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(76);
				match(COLOR);
				}
				break;
			case HASH:
				enterOuterAlt(_localctx, 5);
				{
				setState(77);
				match(HASH);
				setState(78);
				match(IDENT);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 6);
				{
				setState(79);
				match(LPAREN);
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 7);
				{
				setState(80);
				match(RPAREN);
				}
				break;
			case COMMA:
				enterOuterAlt(_localctx, 8);
				{
				setState(81);
				match(COMMA);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 9);
				{
				setState(82);
				match(DOT);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 10);
				{
				setState(83);
				match(MINUS);
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 11);
				{
				setState(84);
				match(PLUS);
				}
				break;
			case PERCENT:
				enterOuterAlt(_localctx, 12);
				{
				setState(85);
				match(PERCENT);
				}
				break;
			case SLASH:
				enterOuterAlt(_localctx, 13);
				{
				setState(86);
				match(SLASH);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0015Z\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0005\u0000\u0012\b\u0000\n\u0000\f\u0000\u0015\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u001c\b\u0001"+
		"\n\u0001\f\u0001\u001f\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002&\b\u0002\n\u0002\f\u0002)\t\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u0003.\b\u0003\n\u0003\f\u00031\t"+
		"\u0003\u0001\u0004\u0003\u00044\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004:\b\u0004\n\u0004\f\u0004=\t\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005C\b\u0005\u0001"+
		"\u0006\u0004\u0006F\b\u0006\u000b\u0006\f\u0006G\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007X\b\u0007\u0001\u0007\u0000\u0000\b\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0000\u0001\u0002\u0000\t\t\u0015\u0015f\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0002\u0018\u0001\u0000\u0000\u0000\u0004\"\u0001\u0000"+
		"\u0000\u0000\u0006*\u0001\u0000\u0000\u0000\b3\u0001\u0000\u0000\u0000"+
		"\n>\u0001\u0000\u0000\u0000\fE\u0001\u0000\u0000\u0000\u000eW\u0001\u0000"+
		"\u0000\u0000\u0010\u0012\u0003\u0002\u0001\u0000\u0011\u0010\u0001\u0000"+
		"\u0000\u0000\u0012\u0015\u0001\u0000\u0000\u0000\u0013\u0011\u0001\u0000"+
		"\u0000\u0000\u0013\u0014\u0001\u0000\u0000\u0000\u0014\u0016\u0001\u0000"+
		"\u0000\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0016\u0017\u0005\u0000"+
		"\u0000\u0001\u0017\u0001\u0001\u0000\u0000\u0000\u0018\u0019\u0003\u0004"+
		"\u0002\u0000\u0019\u001d\u0005\u0003\u0000\u0000\u001a\u001c\u0003\n\u0005"+
		"\u0000\u001b\u001a\u0001\u0000\u0000\u0000\u001c\u001f\u0001\u0000\u0000"+
		"\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000"+
		"\u0000\u001e \u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000"+
		" !\u0005\u0004\u0000\u0000!\u0003\u0001\u0000\u0000\u0000\"\'\u0003\u0006"+
		"\u0003\u0000#$\u0005\u0007\u0000\u0000$&\u0003\u0006\u0003\u0000%#\u0001"+
		"\u0000\u0000\u0000&)\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000"+
		"\'(\u0001\u0000\u0000\u0000(\u0005\u0001\u0000\u0000\u0000)\'\u0001\u0000"+
		"\u0000\u0000*/\u0003\b\u0004\u0000+,\u0005\b\u0000\u0000,.\u0003\b\u0004"+
		"\u0000-+\u0001\u0000\u0000\u0000.1\u0001\u0000\u0000\u0000/-\u0001\u0000"+
		"\u0000\u0000/0\u0001\u0000\u0000\u00000\u0007\u0001\u0000\u0000\u0000"+
		"1/\u0001\u0000\u0000\u000024\u0007\u0000\u0000\u000032\u0001\u0000\u0000"+
		"\u000034\u0001\u0000\u0000\u00004;\u0001\u0000\u0000\u000056\u0005\n\u0000"+
		"\u00006:\u0005\u0015\u0000\u000078\u0005\u000b\u0000\u00008:\u0005\u0015"+
		"\u0000\u000095\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u0000:=\u0001"+
		"\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000"+
		"<\t\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000>?\u0005\u0015\u0000"+
		"\u0000?@\u0005\u0005\u0000\u0000@B\u0003\f\u0006\u0000AC\u0005\u0006\u0000"+
		"\u0000BA\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000C\u000b\u0001"+
		"\u0000\u0000\u0000DF\u0003\u000e\u0007\u0000ED\u0001\u0000\u0000\u0000"+
		"FG\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000"+
		"\u0000H\r\u0001\u0000\u0000\u0000IX\u0005\u0015\u0000\u0000JX\u0005\u0013"+
		"\u0000\u0000KX\u0005\u0014\u0000\u0000LX\u0005\u0012\u0000\u0000MN\u0005"+
		"\u000b\u0000\u0000NX\u0005\u0015\u0000\u0000OX\u0005\r\u0000\u0000PX\u0005"+
		"\u000e\u0000\u0000QX\u0005\u0007\u0000\u0000RX\u0005\n\u0000\u0000SX\u0005"+
		"\u0010\u0000\u0000TX\u0005\u0011\u0000\u0000UX\u0005\u000f\u0000\u0000"+
		"VX\u0005\f\u0000\u0000WI\u0001\u0000\u0000\u0000WJ\u0001\u0000\u0000\u0000"+
		"WK\u0001\u0000\u0000\u0000WL\u0001\u0000\u0000\u0000WM\u0001\u0000\u0000"+
		"\u0000WO\u0001\u0000\u0000\u0000WP\u0001\u0000\u0000\u0000WQ\u0001\u0000"+
		"\u0000\u0000WR\u0001\u0000\u0000\u0000WS\u0001\u0000\u0000\u0000WT\u0001"+
		"\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WV\u0001\u0000\u0000\u0000"+
		"X\u000f\u0001\u0000\u0000\u0000\n\u0013\u001d\'/39;BGW";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}