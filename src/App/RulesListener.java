// Generated from /home/zumakiem/Documentos/TPFinal/src/App/Rules.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RulesParser}.
 */
public interface RulesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RulesParser#tipos}.
	 * @param ctx the parse tree
	 */
	void enterTipos(RulesParser.TiposContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#tipos}.
	 * @param ctx the parse tree
	 */
	void exitTipos(RulesParser.TiposContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#tipo_void}.
	 * @param ctx the parse tree
	 */
	void enterTipo_void(RulesParser.Tipo_voidContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#tipo_void}.
	 * @param ctx the parse tree
	 */
	void exitTipo_void(RulesParser.Tipo_voidContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#constante}.
	 * @param ctx the parse tree
	 */
	void enterConstante(RulesParser.ConstanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#constante}.
	 * @param ctx the parse tree
	 */
	void exitConstante(RulesParser.ConstanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#comparacion}.
	 * @param ctx the parse tree
	 */
	void enterComparacion(RulesParser.ComparacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#comparacion}.
	 * @param ctx the parse tree
	 */
	void exitComparacion(RulesParser.ComparacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(RulesParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(RulesParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(RulesParser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(RulesParser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(RulesParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(RulesParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#declaracion_funcion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_funcion(RulesParser.Declaracion_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#declaracion_funcion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_funcion(RulesParser.Declaracion_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#param_declaracion}.
	 * @param ctx the parse tree
	 */
	void enterParam_declaracion(RulesParser.Param_declaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#param_declaracion}.
	 * @param ctx the parse tree
	 */
	void exitParam_declaracion(RulesParser.Param_declaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#definicion_funcion}.
	 * @param ctx the parse tree
	 */
	void enterDefinicion_funcion(RulesParser.Definicion_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#definicion_funcion}.
	 * @param ctx the parse tree
	 */
	void exitDefinicion_funcion(RulesParser.Definicion_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#param_definicion}.
	 * @param ctx the parse tree
	 */
	void enterParam_definicion(RulesParser.Param_definicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#param_definicion}.
	 * @param ctx the parse tree
	 */
	void exitParam_definicion(RulesParser.Param_definicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(RulesParser.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(RulesParser.FuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(RulesParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(RulesParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#retorno}.
	 * @param ctx the parse tree
	 */
	void enterRetorno(RulesParser.RetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#retorno}.
	 * @param ctx the parse tree
	 */
	void exitRetorno(RulesParser.RetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(RulesParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(RulesParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#lista_declaracion}.
	 * @param ctx the parse tree
	 */
	void enterLista_declaracion(RulesParser.Lista_declaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#lista_declaracion}.
	 * @param ctx the parse tree
	 */
	void exitLista_declaracion(RulesParser.Lista_declaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(RulesParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(RulesParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#acumulacion}.
	 * @param ctx the parse tree
	 */
	void enterAcumulacion(RulesParser.AcumulacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#acumulacion}.
	 * @param ctx the parse tree
	 */
	void exitAcumulacion(RulesParser.AcumulacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#operaciones}.
	 * @param ctx the parse tree
	 */
	void enterOperaciones(RulesParser.OperacionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#operaciones}.
	 * @param ctx the parse tree
	 */
	void exitOperaciones(RulesParser.OperacionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#disyuncion}.
	 * @param ctx the parse tree
	 */
	void enterDisyuncion(RulesParser.DisyuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#disyuncion}.
	 * @param ctx the parse tree
	 */
	void exitDisyuncion(RulesParser.DisyuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#conjuncion}.
	 * @param ctx the parse tree
	 */
	void enterConjuncion(RulesParser.ConjuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#conjuncion}.
	 * @param ctx the parse tree
	 */
	void exitConjuncion(RulesParser.ConjuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#igualdad}.
	 * @param ctx the parse tree
	 */
	void enterIgualdad(RulesParser.IgualdadContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#igualdad}.
	 * @param ctx the parse tree
	 */
	void exitIgualdad(RulesParser.IgualdadContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(RulesParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(RulesParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(RulesParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(RulesParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#termino}.
	 * @param ctx the parse tree
	 */
	void enterTermino(RulesParser.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#termino}.
	 * @param ctx the parse tree
	 */
	void exitTermino(RulesParser.TerminoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(RulesParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(RulesParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(RulesParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(RulesParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#prefix}.
	 * @param ctx the parse tree
	 */
	void enterPrefix(RulesParser.PrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#prefix}.
	 * @param ctx the parse tree
	 */
	void exitPrefix(RulesParser.PrefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#postfix}.
	 * @param ctx the parse tree
	 */
	void enterPostfix(RulesParser.PostfixContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#postfix}.
	 * @param ctx the parse tree
	 */
	void exitPostfix(RulesParser.PostfixContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#if_condicional}.
	 * @param ctx the parse tree
	 */
	void enterIf_condicional(RulesParser.If_condicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#if_condicional}.
	 * @param ctx the parse tree
	 */
	void exitIf_condicional(RulesParser.If_condicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#else_condicional}.
	 * @param ctx the parse tree
	 */
	void enterElse_condicional(RulesParser.Else_condicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#else_condicional}.
	 * @param ctx the parse tree
	 */
	void exitElse_condicional(RulesParser.Else_condicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#ciclo_for}.
	 * @param ctx the parse tree
	 */
	void enterCiclo_for(RulesParser.Ciclo_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#ciclo_for}.
	 * @param ctx the parse tree
	 */
	void exitCiclo_for(RulesParser.Ciclo_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#ciclo_while}.
	 * @param ctx the parse tree
	 */
	void enterCiclo_while(RulesParser.Ciclo_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#ciclo_while}.
	 * @param ctx the parse tree
	 */
	void exitCiclo_while(RulesParser.Ciclo_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#ciclo_do}.
	 * @param ctx the parse tree
	 */
	void enterCiclo_do(RulesParser.Ciclo_doContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#ciclo_do}.
	 * @param ctx the parse tree
	 */
	void exitCiclo_do(RulesParser.Ciclo_doContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#ambito}.
	 * @param ctx the parse tree
	 */
	void enterAmbito(RulesParser.AmbitoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#ambito}.
	 * @param ctx the parse tree
	 */
	void exitAmbito(RulesParser.AmbitoContext ctx);
}