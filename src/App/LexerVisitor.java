// Generated from /home/zumakiem/Documentos/TPFinal/src/App/Lexer.g4 by ANTLR 4.8

    package App;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LexerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LexerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LexerParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(LexerParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexerParser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(LexerParser.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexerParser#keyinst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyinst(LexerParser.KeyinstContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexerParser#exp_a}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_a(LexerParser.Exp_aContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexerParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(LexerParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexerParser#declaracion_sola}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion_sola(LexerParser.Declaracion_solaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexerParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(LexerParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexerParser#listaID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaID(LexerParser.ListaIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexerParser#exp_l}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_l(LexerParser.Exp_lContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexerParser#if_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_(LexerParser.If_Context ctx);
	/**
	 * Visit a parse tree produced by {@link LexerParser#functionAux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionAux(LexerParser.FunctionAuxContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexerParser#else_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_(LexerParser.Else_Context ctx);
	/**
	 * Visit a parse tree produced by {@link LexerParser#function_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_(LexerParser.Function_Context ctx);
	/**
	 * Visit a parse tree produced by {@link LexerParser#for_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_(LexerParser.For_Context ctx);
	/**
	 * Visit a parse tree produced by {@link LexerParser#list_exp_l}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_exp_l(LexerParser.List_exp_lContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexerParser#while_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_(LexerParser.While_Context ctx);
	/**
	 * Visit a parse tree produced by {@link LexerParser#estructuras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstructuras(LexerParser.EstructurasContext ctx);
}