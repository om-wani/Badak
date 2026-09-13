// Generated from E:/Om_Project_Files/Badak/src/main/antlr/BadakLang.g4 by ANTLR 4.13.2
package main.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BadakLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BadakLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BadakLangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(BadakLangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link BadakLangParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(BadakLangParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BadakLangParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(BadakLangParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BadakLangParser#constantDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclaration(BadakLangParser.ConstantDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BadakLangParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(BadakLangParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BadakLangParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(BadakLangParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BadakLangParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(BadakLangParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BadakLangParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(BadakLangParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BadakLangParser#dictionaryType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionaryType(BadakLangParser.DictionaryTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BadakLangParser#returnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnType(BadakLangParser.ReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BadakLangParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(BadakLangParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link BadakLangParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(BadakLangParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link BadakLangParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(BadakLangParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link BadakLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(BadakLangParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BadakLangParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(BadakLangParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link BadakLangParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(BadakLangParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BadakLangParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(BadakLangParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BadakLangParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(BadakLangParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BadakLangParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(BadakLangParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BadakLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(BadakLangParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BadakLangParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(BadakLangParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link BadakLangParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(BadakLangParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link BadakLangParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(BadakLangParser.ArgumentListContext ctx);
}