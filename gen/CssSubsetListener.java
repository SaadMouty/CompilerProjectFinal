// Generated from C:/Users/ASUSD/CompilerCourse/CompilerProject5/src/main/antlr4/com/compiler/shop/grammars/CssSubset.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CssSubsetParser}.
 */
public interface CssSubsetListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CssSubsetParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void enterStylesheet(CssSubsetParser.StylesheetContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssSubsetParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void exitStylesheet(CssSubsetParser.StylesheetContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssSubsetParser#rule}.
	 * @param ctx the parse tree
	 */
	void enterRule(CssSubsetParser.RuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssSubsetParser#rule}.
	 * @param ctx the parse tree
	 */
	void exitRule(CssSubsetParser.RuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssSubsetParser#selectorGroup}.
	 * @param ctx the parse tree
	 */
	void enterSelectorGroup(CssSubsetParser.SelectorGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssSubsetParser#selectorGroup}.
	 * @param ctx the parse tree
	 */
	void exitSelectorGroup(CssSubsetParser.SelectorGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssSubsetParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(CssSubsetParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssSubsetParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(CssSubsetParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssSubsetParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void enterSimpleSelector(CssSubsetParser.SimpleSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssSubsetParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void exitSimpleSelector(CssSubsetParser.SimpleSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssSubsetParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CssSubsetParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssSubsetParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CssSubsetParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssSubsetParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(CssSubsetParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssSubsetParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(CssSubsetParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssSubsetParser#valueAtom}.
	 * @param ctx the parse tree
	 */
	void enterValueAtom(CssSubsetParser.ValueAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssSubsetParser#valueAtom}.
	 * @param ctx the parse tree
	 */
	void exitValueAtom(CssSubsetParser.ValueAtomContext ctx);
}