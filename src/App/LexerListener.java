// Generated from /home/zumakiem/Documentos/TPFinal/src/App/Lexer.g4 by ANTLR 4.8

    package App;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LexerParser}.
 */
public interface LexerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LexerParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(LexerParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexerParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(LexerParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexerParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(LexerParser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexerParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(LexerParser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexerParser#keyinst}.
	 * @param ctx the parse tree
	 */
	void enterKeyinst(LexerParser.KeyinstContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexerParser#keyinst}.
	 * @param ctx the parse tree
	 */
	void exitKeyinst(LexerParser.KeyinstContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexerParser#exp_a}.
	 * @param ctx the parse tree
	 */
	void enterExp_a(LexerParser.Exp_aContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexerParser#exp_a}.
	 * @param ctx the parse tree
	 */
	void exitExp_a(LexerParser.Exp_aContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexerParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(LexerParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexerParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(LexerParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexerParser#declaracion_sola}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_sola(LexerParser.Declaracion_solaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexerParser#declaracion_sola}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_sola(LexerParser.Declaracion_solaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexerParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(LexerParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexerParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(LexerParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexerParser#listaID}.
	 * @param ctx the parse tree
	 */
	void enterListaID(LexerParser.ListaIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexerParser#listaID}.
	 * @param ctx the parse tree
	 */
	void exitListaID(LexerParser.ListaIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexerParser#exp_l}.
	 * @param ctx the parse tree
	 */
	void enterExp_l(LexerParser.Exp_lContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexerParser#exp_l}.
	 * @param ctx the parse tree
	 */
	void exitExp_l(LexerParser.Exp_lContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexerParser#if_}.
	 * @param ctx the parse tree
	 */
	void enterIf_(LexerParser.If_Context ctx);
	/**
	 * Exit a parse tree produced by {@link LexerParser#if_}.
	 * @param ctx the parse tree
	 */
	void exitIf_(LexerParser.If_Context ctx);
	/**
	 * Enter a parse tree produced by {@link LexerParser#functionAux}.
	 * @param ctx the parse tree
	 */
	void enterFunctionAux(LexerParser.FunctionAuxContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexerParser#functionAux}.
	 * @param ctx the parse tree
	 */
	void exitFunctionAux(LexerParser.FunctionAuxContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexerParser#else_}.
	 * @param ctx the parse tree
	 */
	void enterElse_(LexerParser.Else_Context ctx);
	/**
	 * Exit a parse tree produced by {@link LexerParser#else_}.
	 * @param ctx the parse tree
	 */
	void exitElse_(LexerParser.Else_Context ctx);
	/**
	 * Enter a parse tree produced by {@link LexerParser#function_}.
	 * @param ctx the parse tree
	 */
	void enterFunction_(LexerParser.Function_Context ctx);
	/**
	 * Exit a parse tree produced by {@link LexerParser#function_}.
	 * @param ctx the parse tree
	 */
	void exitFunction_(LexerParser.Function_Context ctx);
	/**
	 * Enter a parse tree produced by {@link LexerParser#for_}.
	 * @param ctx the parse tree
	 */
	void enterFor_(LexerParser.For_Context ctx);
	/**
	 * Exit a parse tree produced by {@link LexerParser#for_}.
	 * @param ctx the parse tree
	 */
	void exitFor_(LexerParser.For_Context ctx);
	/**
	 * Enter a parse tree produced by {@link LexerParser#list_exp_l}.
	 * @param ctx the parse tree
	 */
	void enterList_exp_l(LexerParser.List_exp_lContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexerParser#list_exp_l}.
	 * @param ctx the parse tree
	 */
	void exitList_exp_l(LexerParser.List_exp_lContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexerParser#while_}.
	 * @param ctx the parse tree
	 */
	void enterWhile_(LexerParser.While_Context ctx);
	/**
	 * Exit a parse tree produced by {@link LexerParser#while_}.
	 * @param ctx the parse tree
	 */
	void exitWhile_(LexerParser.While_Context ctx);
	/**
	 * Enter a parse tree produced by {@link LexerParser#estructuras}.
	 * @param ctx the parse tree
	 */
	void enterEstructuras(LexerParser.EstructurasContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexerParser#estructuras}.
	 * @param ctx the parse tree
	 */
	void exitEstructuras(LexerParser.EstructurasContext ctx);
}