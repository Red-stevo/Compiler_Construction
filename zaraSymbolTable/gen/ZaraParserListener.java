// Generated from /home/mirowe/Project/Compiler_Construction/zaraSymbolTable/src/main/ANTLR/ZaraParser.g4 by ANTLR 4.13.2

    package red.stevo.code.Lexer;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ZaraParserParser}.
 */
public interface ZaraParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ZaraParserParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(ZaraParserParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZaraParserParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(ZaraParserParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZaraParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ZaraParserParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZaraParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ZaraParserParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZaraParserParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(ZaraParserParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZaraParserParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(ZaraParserParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZaraParserParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(ZaraParserParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZaraParserParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(ZaraParserParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZaraParserParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(ZaraParserParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZaraParserParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(ZaraParserParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZaraParserParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(ZaraParserParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZaraParserParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(ZaraParserParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZaraParserParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(ZaraParserParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZaraParserParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(ZaraParserParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZaraParserParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(ZaraParserParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZaraParserParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(ZaraParserParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZaraParserParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(ZaraParserParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZaraParserParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(ZaraParserParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZaraParserParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ZaraParserParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZaraParserParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ZaraParserParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZaraParserParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(ZaraParserParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZaraParserParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(ZaraParserParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZaraParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ZaraParserParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZaraParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ZaraParserParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZaraParserParser#orExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(ZaraParserParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZaraParserParser#orExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(ZaraParserParser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZaraParserParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(ZaraParserParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZaraParserParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(ZaraParserParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZaraParserParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(ZaraParserParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZaraParserParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(ZaraParserParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZaraParserParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(ZaraParserParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZaraParserParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(ZaraParserParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZaraParserParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(ZaraParserParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZaraParserParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(ZaraParserParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZaraParserParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(ZaraParserParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZaraParserParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(ZaraParserParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZaraParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(ZaraParserParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZaraParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(ZaraParserParser.PrimaryExpressionContext ctx);
}