// Generated from C:/Users/ASUSD/CompilerCourse/CompilerProject5/src/main/antlr4/com/compiler/shop/grammars/HtmlSubset.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HtmlSubsetParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HtmlSubsetVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HtmlSubsetParser#document}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocument(HtmlSubsetParser.DocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlSubsetParser#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNode(HtmlSubsetParser.NodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlSubsetParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(HtmlSubsetParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlSubsetParser#emptyElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyElement(HtmlSubsetParser.EmptyElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlSubsetParser#normalElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalElement(HtmlSubsetParser.NormalElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlSubsetParser#startTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartTag(HtmlSubsetParser.StartTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlSubsetParser#endTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndTag(HtmlSubsetParser.EndTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlSubsetParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(HtmlSubsetParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlSubsetParser#attrValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrValue(HtmlSubsetParser.AttrValueContext ctx);
}