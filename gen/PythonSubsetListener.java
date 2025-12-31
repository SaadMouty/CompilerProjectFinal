// Generated from C:/Users/ASUSD/CompilerCourse/CompilerProject5/src/main/antlr4/com/compiler/shop/grammars/PythonSubset.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PythonSubsetParser}.
 */
public interface PythonSubsetListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PythonSubsetParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PythonSubsetParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PythonSubsetParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PythonSubsetParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatement(PythonSubsetParser.SimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatement(PythonSubsetParser.SimpleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(PythonSubsetParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(PythonSubsetParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#exprStmt}.
	 * @param ctx the parse tree
	 */
	void enterExprStmt(PythonSubsetParser.ExprStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#exprStmt}.
	 * @param ctx the parse tree
	 */
	void exitExprStmt(PythonSubsetParser.ExprStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#commandStmt}.
	 * @param ctx the parse tree
	 */
	void enterCommandStmt(PythonSubsetParser.CommandStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#commandStmt}.
	 * @param ctx the parse tree
	 */
	void exitCommandStmt(PythonSubsetParser.CommandStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(PythonSubsetParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(PythonSubsetParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(PythonSubsetParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(PythonSubsetParser.ArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(PythonSubsetParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(PythonSubsetParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(PythonSubsetParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(PythonSubsetParser.LiteralContext ctx);
}