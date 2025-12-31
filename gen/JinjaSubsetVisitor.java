// Generated from C:/Users/ASUSD/CompilerCourse/CompilerProject5/src/main/antlr4/com/compiler/shop/grammars/JinjaSubset.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JinjaSubsetParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JinjaSubsetVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JinjaSubsetParser#template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate(JinjaSubsetParser.TemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaSubsetParser#part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPart(JinjaSubsetParser.PartContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaSubsetParser#printExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpr(JinjaSubsetParser.PrintExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaSubsetParser#forBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForBlock(JinjaSubsetParser.ForBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaSubsetParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(JinjaSubsetParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaSubsetParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(JinjaSubsetParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaSubsetParser#orExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(JinjaSubsetParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaSubsetParser#andExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(JinjaSubsetParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaSubsetParser#equalityExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(JinjaSubsetParser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaSubsetParser#relationalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpr(JinjaSubsetParser.RelationalExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaSubsetParser#additiveExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpr(JinjaSubsetParser.AdditiveExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaSubsetParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(JinjaSubsetParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaSubsetParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(JinjaSubsetParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaSubsetParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(JinjaSubsetParser.LiteralContext ctx);
}