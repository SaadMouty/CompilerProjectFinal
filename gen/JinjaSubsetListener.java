// Generated from C:/Users/ASUSD/CompilerCourse/CompilerProject5/src/main/antlr4/com/compiler/shop/grammars/JinjaSubset.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JinjaSubsetParser}.
 */
public interface JinjaSubsetListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JinjaSubsetParser#template}.
	 * @param ctx the parse tree
	 */
	void enterTemplate(JinjaSubsetParser.TemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaSubsetParser#template}.
	 * @param ctx the parse tree
	 */
	void exitTemplate(JinjaSubsetParser.TemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaSubsetParser#part}.
	 * @param ctx the parse tree
	 */
	void enterPart(JinjaSubsetParser.PartContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaSubsetParser#part}.
	 * @param ctx the parse tree
	 */
	void exitPart(JinjaSubsetParser.PartContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaSubsetParser#printExpr}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(JinjaSubsetParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaSubsetParser#printExpr}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(JinjaSubsetParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaSubsetParser#forBlock}.
	 * @param ctx the parse tree
	 */
	void enterForBlock(JinjaSubsetParser.ForBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaSubsetParser#forBlock}.
	 * @param ctx the parse tree
	 */
	void exitForBlock(JinjaSubsetParser.ForBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaSubsetParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(JinjaSubsetParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaSubsetParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(JinjaSubsetParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(JinjaSubsetParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(JinjaSubsetParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaSubsetParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(JinjaSubsetParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaSubsetParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(JinjaSubsetParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaSubsetParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(JinjaSubsetParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaSubsetParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(JinjaSubsetParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaSubsetParser#equalityExpr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(JinjaSubsetParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaSubsetParser#equalityExpr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(JinjaSubsetParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaSubsetParser#relationalExpr}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(JinjaSubsetParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaSubsetParser#relationalExpr}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(JinjaSubsetParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaSubsetParser#additiveExpr}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(JinjaSubsetParser.AdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaSubsetParser#additiveExpr}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(JinjaSubsetParser.AdditiveExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaSubsetParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(JinjaSubsetParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaSubsetParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(JinjaSubsetParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaSubsetParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(JinjaSubsetParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaSubsetParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(JinjaSubsetParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaSubsetParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(JinjaSubsetParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaSubsetParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(JinjaSubsetParser.LiteralContext ctx);
}