// Generated from /home/zumakiem/Documentos/TPFinal/src/App/Rules.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RulesParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RulesVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RulesParser#tipos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipos(RulesParser.TiposContext ctx);
	/**
	 * Visit a parse tree produced by {@link RulesParser#tipo_void}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_void(RulesParser.Tipo_voidContext ctx);
	/**
	 * Visit a parse tree produced by {@link RulesParser#constante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstante(RulesParser.ConstanteContext ctx);
	/**
	 * Visit a parse tree produced by {@link RulesParser#comparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparacion(RulesParser.ComparacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RulesParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(RulesParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link RulesParser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(RulesParser.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link RulesParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(RulesParser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RulesParser#declaracion_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion_funcion(RulesParser.Declaracion_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RulesParser#param_declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_declaracion(RulesParser.Param_declaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RulesParser#definicion_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinicion_funcion(RulesParser.Definicion_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RulesParser#param_definicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_definicion(RulesParser.Param_definicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RulesParser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(RulesParser.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RulesParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(RulesParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link RulesParser#retorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetorno(RulesParser.RetornoContext ctx);
	/**
	 * Visit a parse tree produced by {@link RulesParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(RulesParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RulesParser#lista_declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_declaracion(RulesParser.Lista_declaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RulesParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(RulesParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RulesParser#acumulacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcumulacion(RulesParser.AcumulacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RulesParser#operaciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperaciones(RulesParser.OperacionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link RulesParser#disyuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisyuncion(RulesParser.DisyuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RulesParser#conjuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConjuncion(RulesParser.ConjuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RulesParser#igualdad}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgualdad(RulesParser.IgualdadContext ctx);
	/**
	 * Visit a parse tree produced by {@link RulesParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(RulesParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RulesParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(RulesParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link RulesParser#termino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermino(RulesParser.TerminoContext ctx);
	/**
	 * Visit a parse tree produced by {@link RulesParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(RulesParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link RulesParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(RulesParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link RulesParser#prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefix(RulesParser.PrefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link RulesParser#postfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfix(RulesParser.PostfixContext ctx);
	/**
	 * Visit a parse tree produced by {@link RulesParser#if_condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_condicional(RulesParser.If_condicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link RulesParser#else_condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_condicional(RulesParser.Else_condicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link RulesParser#ciclo_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclo_for(RulesParser.Ciclo_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link RulesParser#ciclo_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclo_while(RulesParser.Ciclo_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link RulesParser#ciclo_do}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclo_do(RulesParser.Ciclo_doContext ctx);
	/**
	 * Visit a parse tree produced by {@link RulesParser#ambito}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmbito(RulesParser.AmbitoContext ctx);
}