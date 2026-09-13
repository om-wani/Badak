// Generated from E:/Om_Project_Files/Badak/src/main/antlr/BadakLang.g4 by ANTLR 4.13.2
package main.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BadakLangParser}.
 */
public interface BadakLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BadakLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(BadakLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link BadakLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(BadakLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link BadakLangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(BadakLangParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BadakLangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(BadakLangParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BadakLangParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(BadakLangParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BadakLangParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(BadakLangParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BadakLangParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaration(BadakLangParser.ConstantDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BadakLangParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaration(BadakLangParser.ConstantDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BadakLangParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(BadakLangParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BadakLangParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(BadakLangParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BadakLangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(BadakLangParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BadakLangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(BadakLangParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BadakLangParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(BadakLangParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BadakLangParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(BadakLangParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BadakLangParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(BadakLangParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BadakLangParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(BadakLangParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BadakLangParser#dictionaryType}.
	 * @param ctx the parse tree
	 */
	void enterDictionaryType(BadakLangParser.DictionaryTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BadakLangParser#dictionaryType}.
	 * @param ctx the parse tree
	 */
	void exitDictionaryType(BadakLangParser.DictionaryTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BadakLangParser#returnType}.
	 * @param ctx the parse tree
	 */
	void enterReturnType(BadakLangParser.ReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BadakLangParser#returnType}.
	 * @param ctx the parse tree
	 */
	void exitReturnType(BadakLangParser.ReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BadakLangParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(BadakLangParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link BadakLangParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(BadakLangParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link BadakLangParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(BadakLangParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link BadakLangParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(BadakLangParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link BadakLangParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(BadakLangParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BadakLangParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(BadakLangParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link BadakLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(BadakLangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BadakLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(BadakLangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BadakLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(BadakLangParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BadakLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(BadakLangParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link BadakLangParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(BadakLangParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BadakLangParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(BadakLangParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BadakLangParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(BadakLangParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BadakLangParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(BadakLangParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BadakLangParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(BadakLangParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BadakLangParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(BadakLangParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BadakLangParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(BadakLangParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BadakLangParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(BadakLangParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BadakLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(BadakLangParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BadakLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(BadakLangParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BadakLangParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(BadakLangParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link BadakLangParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(BadakLangParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link BadakLangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(BadakLangParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link BadakLangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(BadakLangParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link BadakLangParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(BadakLangParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link BadakLangParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(BadakLangParser.ArgumentListContext ctx);
}