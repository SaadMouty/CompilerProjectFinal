// Generated from C:/Users/ASUSD/CompilerCourse/CompilerProject5/src/main/antlr4/com/compiler/shop/grammars/CssSubset.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CssSubsetParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CssSubsetVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CssSubsetParser#stylesheet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStylesheet(CssSubsetParser.StylesheetContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssSubsetParser#rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule(CssSubsetParser.RuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssSubsetParser#selectorGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorGroup(CssSubsetParser.SelectorGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssSubsetParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(CssSubsetParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssSubsetParser#simpleSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleSelector(CssSubsetParser.SimpleSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssSubsetParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(CssSubsetParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssSubsetParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(CssSubsetParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssSubsetParser#valueAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueAtom(CssSubsetParser.ValueAtomContext ctx);
}