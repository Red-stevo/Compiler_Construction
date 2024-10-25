// Generated from /home/mirowe/Project/Compiler_Construction/zaraSymbolTable/src/main/ANTLR/ZaraParser.g4 by ANTLR 4.13.2

    package red.stevo.code.Lexer;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ZaraParserParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ZaraParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ZaraParserParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(ZaraParserParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZaraParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ZaraParserParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZaraParserParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(ZaraParserParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZaraParserParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(ZaraParserParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZaraParserParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(ZaraParserParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZaraParserParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(ZaraParserParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZaraParserParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(ZaraParserParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZaraParserParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(ZaraParserParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZaraParserParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(ZaraParserParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZaraParserParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ZaraParserParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZaraParserParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(ZaraParserParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZaraParserParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ZaraParserParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZaraParserParser#orExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpression(ZaraParserParser.OrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZaraParserParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(ZaraParserParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZaraParserParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(ZaraParserParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZaraParserParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(ZaraParserParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZaraParserParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(ZaraParserParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZaraParserParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(ZaraParserParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZaraParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(ZaraParserParser.PrimaryExpressionContext ctx);
}