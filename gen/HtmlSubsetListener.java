// Generated from C:/Users/ASUSD/CompilerCourse/CompilerProject5/src/main/antlr4/com/compiler/shop/grammars/HtmlSubset.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HtmlSubsetParser}.
 */
public interface HtmlSubsetListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HtmlSubsetParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(HtmlSubsetParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlSubsetParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(HtmlSubsetParser.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlSubsetParser#node}.
	 * @param ctx the parse tree
	 */
	void enterNode(HtmlSubsetParser.NodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlSubsetParser#node}.
	 * @param ctx the parse tree
	 */
	void exitNode(HtmlSubsetParser.NodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlSubsetParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(HtmlSubsetParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlSubsetParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(HtmlSubsetParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlSubsetParser#emptyElement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyElement(HtmlSubsetParser.EmptyElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlSubsetParser#emptyElement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyElement(HtmlSubsetParser.EmptyElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlSubsetParser#normalElement}.
	 * @param ctx the parse tree
	 */
	void enterNormalElement(HtmlSubsetParser.NormalElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlSubsetParser#normalElement}.
	 * @param ctx the parse tree
	 */
	void exitNormalElement(HtmlSubsetParser.NormalElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlSubsetParser#startTag}.
	 * @param ctx the parse tree
	 */
	void enterStartTag(HtmlSubsetParser.StartTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlSubsetParser#startTag}.
	 * @param ctx the parse tree
	 */
	void exitStartTag(HtmlSubsetParser.StartTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlSubsetParser#endTag}.
	 * @param ctx the parse tree
	 */
	void enterEndTag(HtmlSubsetParser.EndTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlSubsetParser#endTag}.
	 * @param ctx the parse tree
	 */
	void exitEndTag(HtmlSubsetParser.EndTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlSubsetParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(HtmlSubsetParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlSubsetParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(HtmlSubsetParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlSubsetParser#attrValue}.
	 * @param ctx the parse tree
	 */
	void enterAttrValue(HtmlSubsetParser.AttrValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlSubsetParser#attrValue}.
	 * @param ctx the parse tree
	 */
	void exitAttrValue(HtmlSubsetParser.AttrValueContext ctx);
}