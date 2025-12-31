// Generated from C:/Users/ASUSD/CompilerCourse/CompilerProject5/src/main/antlr4/com/compiler/shop/grammars/PythonSubset.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PythonSubsetParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PythonSubsetVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PythonSubsetParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PythonSubsetParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#simpleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStatement(PythonSubsetParser.SimpleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(PythonSubsetParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#exprStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStmt(PythonSubsetParser.ExprStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#commandStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandStmt(PythonSubsetParser.CommandStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(PythonSubsetParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgList(PythonSubsetParser.ArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(PythonSubsetParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(PythonSubsetParser.LiteralContext ctx);
}