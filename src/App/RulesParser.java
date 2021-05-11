// Generated from /home/zumakiem/Documentos/TPFinal/src/App/Rules.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RulesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PA=1, PC=2, LA=3, LC=4, INT=5, FLOAT=6, DOUBLE=7, CHAR=8, FOR=9, WHILE=10, 
		DO=11, IF=12, ELSE=13, ELSE_IF=14, CARACTER=15, NUMERO=16, FLOTANTE=17, 
		SUMA=18, RESTA=19, MULTI=20, DIV=21, RESTO=22, INC=23, DEC=24, NOT=25, 
		PYC=26, COMA=27, MAYOR=28, MAYORIGUAL=29, MENOR=30, MENORIGUAL=31, DISTINTO=32, 
		IGUAL=33, AND=34, OR=35, RETORNO=36, ID=37, ASIGN=38, AC_POS=39, AC_NEG=40, 
		WS=41;
	public static final int
		RULE_tipos = 0, RULE_constante = 1, RULE_comparacion = 2, RULE_programa = 3, 
		RULE_instrucciones = 4, RULE_instruccion = 5, RULE_declaracion_funcion = 6, 
		RULE_param_declaracion = 7, RULE_definicion_funcion = 8, RULE_param_definicion = 9, 
		RULE_funcion = 10, RULE_parametros = 11, RULE_retorno = 12, RULE_declaracion = 13, 
		RULE_lista_declaracion = 14, RULE_asignacion = 15, RULE_acumulacion = 16, 
		RULE_operaciones = 17, RULE_disyuncion = 18, RULE_conjuncion = 19, RULE_igualdad = 20, 
		RULE_expresion = 21, RULE_exp = 22, RULE_termino = 23, RULE_term = 24, 
		RULE_factor = 25, RULE_prefix = 26, RULE_postfix = 27, RULE_if_condicional = 28, 
		RULE_else_condicional = 29, RULE_ciclo_for = 30, RULE_ciclo_while = 31, 
		RULE_ciclo_do = 32, RULE_ambito = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"tipos", "constante", "comparacion", "programa", "instrucciones", "instruccion", 
			"declaracion_funcion", "param_declaracion", "definicion_funcion", "param_definicion", 
			"funcion", "parametros", "retorno", "declaracion", "lista_declaracion", 
			"asignacion", "acumulacion", "operaciones", "disyuncion", "conjuncion", 
			"igualdad", "expresion", "exp", "termino", "term", "factor", "prefix", 
			"postfix", "if_condicional", "else_condicional", "ciclo_for", "ciclo_while", 
			"ciclo_do", "ambito"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "'int'", "'float'", "'double'", "'char'", 
			"'for'", "'while'", "'do'", "'if'", "'else'", "'else if'", null, null, 
			null, "'+'", "'-'", "'*'", "'/'", "'%'", "'++'", "'--'", "'!'", "';'", 
			"','", "'>'", "'>='", "'<'", "'<='", "'!='", "'=='", "'&&'", "'||'", 
			"'return'", null, "'='", "'+='", "'-='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PA", "PC", "LA", "LC", "INT", "FLOAT", "DOUBLE", "CHAR", "FOR", 
			"WHILE", "DO", "IF", "ELSE", "ELSE_IF", "CARACTER", "NUMERO", "FLOTANTE", 
			"SUMA", "RESTA", "MULTI", "DIV", "RESTO", "INC", "DEC", "NOT", "PYC", 
			"COMA", "MAYOR", "MAYORIGUAL", "MENOR", "MENORIGUAL", "DISTINTO", "IGUAL", 
			"AND", "OR", "RETORNO", "ID", "ASIGN", "AC_POS", "AC_NEG", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Rules.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RulesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class TiposContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(RulesParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(RulesParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(RulesParser.DOUBLE, 0); }
		public TerminalNode CHAR() { return getToken(RulesParser.CHAR, 0); }
		public TiposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterTipos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitTipos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RulesVisitor ) return ((RulesVisitor<? extends T>)visitor).visitTipos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TiposContext tipos() throws RecognitionException {
		TiposContext _localctx = new TiposContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_tipos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << CHAR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstanteContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(RulesParser.NUMERO, 0); }
		public TerminalNode FLOTANTE() { return getToken(RulesParser.FLOTANTE, 0); }
		public TerminalNode CARACTER() { return getToken(RulesParser.CARACTER, 0); }
		public ConstanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterConstante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitConstante(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RulesVisitor ) return ((RulesVisitor<? extends T>)visitor).visitConstante(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstanteContext constante() throws RecognitionException {
		ConstanteContext _localctx = new ConstanteContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_constante);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CARACTER) | (1L << NUMERO) | (1L << FLOTANTE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparacionContext extends ParserRuleContext {
		public TerminalNode MAYOR() { return getToken(RulesParser.MAYOR, 0); }
		public TerminalNode MAYORIGUAL() { return getToken(RulesParser.MAYORIGUAL, 0); }
		public TerminalNode MENOR() { return getToken(RulesParser.MENOR, 0); }
		public TerminalNode MENORIGUAL() { return getToken(RulesParser.MENORIGUAL, 0); }
		public TerminalNode DISTINTO() { return getToken(RulesParser.DISTINTO, 0); }
		public TerminalNode IGUAL() { return getToken(RulesParser.IGUAL, 0); }
		public ComparacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterComparacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitComparacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RulesVisitor ) return ((RulesVisitor<? extends T>)visitor).visitComparacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparacionContext comparacion() throws RecognitionException {
		ComparacionContext _localctx = new ComparacionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comparacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAYOR) | (1L << MAYORIGUAL) | (1L << MENOR) | (1L << MENORIGUAL) | (1L << DISTINTO) | (1L << IGUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramaContext extends ParserRuleContext {
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(RulesParser.EOF, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RulesVisitor ) return ((RulesVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			instrucciones();
			setState(75);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstruccionesContext extends ParserRuleContext {
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterInstrucciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitInstrucciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RulesVisitor ) return ((RulesVisitor<? extends T>)visitor).visitInstrucciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_instrucciones);
		try {
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PA:
			case LA:
			case INT:
			case FLOAT:
			case DOUBLE:
			case CHAR:
			case FOR:
			case WHILE:
			case DO:
			case IF:
			case CARACTER:
			case NUMERO:
			case FLOTANTE:
			case SUMA:
			case RESTA:
			case INC:
			case DEC:
			case NOT:
			case RETORNO:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				instruccion();
				setState(78);
				instrucciones();
				}
				break;
			case EOF:
			case LC:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstruccionContext extends ParserRuleContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public TerminalNode PYC() { return getToken(RulesParser.PYC, 0); }
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public AcumulacionContext acumulacion() {
			return getRuleContext(AcumulacionContext.class,0);
		}
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
		public If_condicionalContext if_condicional() {
			return getRuleContext(If_condicionalContext.class,0);
		}
		public AmbitoContext ambito() {
			return getRuleContext(AmbitoContext.class,0);
		}
		public Ciclo_forContext ciclo_for() {
			return getRuleContext(Ciclo_forContext.class,0);
		}
		public Ciclo_whileContext ciclo_while() {
			return getRuleContext(Ciclo_whileContext.class,0);
		}
		public Ciclo_doContext ciclo_do() {
			return getRuleContext(Ciclo_doContext.class,0);
		}
		public Declaracion_funcionContext declaracion_funcion() {
			return getRuleContext(Declaracion_funcionContext.class,0);
		}
		public Definicion_funcionContext definicion_funcion() {
			return getRuleContext(Definicion_funcionContext.class,0);
		}
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
		}
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitInstruccion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RulesVisitor ) return ((RulesVisitor<? extends T>)visitor).visitInstruccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_instruccion);
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				declaracion();
				setState(84);
				match(PYC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				asignacion();
				setState(87);
				match(PYC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				acumulacion();
				setState(90);
				match(PYC);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(92);
				operaciones();
				setState(93);
				match(PYC);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(95);
				if_condicional();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(96);
				ambito();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(97);
				ciclo_for();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(98);
				ciclo_while();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(99);
				ciclo_do();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(100);
				declaracion_funcion();
				setState(101);
				match(PYC);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(103);
				definicion_funcion();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(104);
				funcion();
				setState(105);
				match(PYC);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(107);
				retorno();
				setState(108);
				match(PYC);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaracion_funcionContext extends ParserRuleContext {
		public TiposContext tipos() {
			return getRuleContext(TiposContext.class,0);
		}
		public TerminalNode ID() { return getToken(RulesParser.ID, 0); }
		public TerminalNode PA() { return getToken(RulesParser.PA, 0); }
		public Param_declaracionContext param_declaracion() {
			return getRuleContext(Param_declaracionContext.class,0);
		}
		public TerminalNode PC() { return getToken(RulesParser.PC, 0); }
		public Declaracion_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterDeclaracion_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitDeclaracion_funcion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RulesVisitor ) return ((RulesVisitor<? extends T>)visitor).visitDeclaracion_funcion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracion_funcionContext declaracion_funcion() throws RecognitionException {
		Declaracion_funcionContext _localctx = new Declaracion_funcionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaracion_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			tipos();
			setState(113);
			match(ID);
			setState(114);
			match(PA);
			setState(115);
			param_declaracion();
			setState(116);
			match(PC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_declaracionContext extends ParserRuleContext {
		public TiposContext tipos() {
			return getRuleContext(TiposContext.class,0);
		}
		public TerminalNode ID() { return getToken(RulesParser.ID, 0); }
		public TerminalNode COMA() { return getToken(RulesParser.COMA, 0); }
		public Param_declaracionContext param_declaracion() {
			return getRuleContext(Param_declaracionContext.class,0);
		}
		public Param_declaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterParam_declaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitParam_declaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RulesVisitor ) return ((RulesVisitor<? extends T>)visitor).visitParam_declaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_declaracionContext param_declaracion() throws RecognitionException {
		Param_declaracionContext _localctx = new Param_declaracionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_param_declaracion);
		try {
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				tipos();
				setState(121);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(119);
					match(ID);
					}
					break;
				case PC:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				tipos();
				setState(126);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(124);
					match(ID);
					}
					break;
				case COMA:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(128);
				match(COMA);
				setState(129);
				param_declaracion();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Definicion_funcionContext extends ParserRuleContext {
		public TiposContext tipos() {
			return getRuleContext(TiposContext.class,0);
		}
		public TerminalNode ID() { return getToken(RulesParser.ID, 0); }
		public TerminalNode PA() { return getToken(RulesParser.PA, 0); }
		public Param_definicionContext param_definicion() {
			return getRuleContext(Param_definicionContext.class,0);
		}
		public TerminalNode PC() { return getToken(RulesParser.PC, 0); }
		public AmbitoContext ambito() {
			return getRuleContext(AmbitoContext.class,0);
		}
		public Definicion_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicion_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterDefinicion_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitDefinicion_funcion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RulesVisitor ) return ((RulesVisitor<? extends T>)visitor).visitDefinicion_funcion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definicion_funcionContext definicion_funcion() throws RecognitionException {
		Definicion_funcionContext _localctx = new Definicion_funcionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_definicion_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			tipos();
			setState(134);
			match(ID);
			setState(135);
			match(PA);
			setState(136);
			param_definicion();
			setState(137);
			match(PC);
			setState(138);
			ambito();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_definicionContext extends ParserRuleContext {
		public TiposContext tipos() {
			return getRuleContext(TiposContext.class,0);
		}
		public TerminalNode ID() { return getToken(RulesParser.ID, 0); }
		public TerminalNode COMA() { return getToken(RulesParser.COMA, 0); }
		public Param_definicionContext param_definicion() {
			return getRuleContext(Param_definicionContext.class,0);
		}
		public Param_definicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_definicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterParam_definicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitParam_definicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RulesVisitor ) return ((RulesVisitor<? extends T>)visitor).visitParam_definicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_definicionContext param_definicion() throws RecognitionException {
		Param_definicionContext _localctx = new Param_definicionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_param_definicion);
		try {
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				tipos();
				setState(141);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				tipos();
				setState(144);
				match(ID);
				setState(145);
				match(COMA);
				setState(146);
				param_definicion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RulesParser.ID, 0); }
		public TerminalNode PA() { return getToken(RulesParser.PA, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode PC() { return getToken(RulesParser.PC, 0); }
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RulesVisitor ) return ((RulesVisitor<? extends T>)visitor).visitFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(ID);
			setState(152);
			match(PA);
			setState(153);
			parametros();
			setState(154);
			match(PC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametrosContext extends ParserRuleContext {
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
		public TerminalNode COMA() { return getToken(RulesParser.COMA, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RulesVisitor ) return ((RulesVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_parametros);
		try {
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				operaciones();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				operaciones();
				setState(158);
				match(COMA);
				setState(159);
				parametros();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RetornoContext extends ParserRuleContext {
		public TerminalNode RETORNO() { return getToken(RulesParser.RETORNO, 0); }
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitRetorno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RulesVisitor ) return ((RulesVisitor<? extends T>)visitor).visitRetorno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(RETORNO);
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PA:
			case CARACTER:
			case NUMERO:
			case FLOTANTE:
			case SUMA:
			case RESTA:
			case INC:
			case DEC:
			case NOT:
			case ID:
				{
				setState(165);
				operaciones();
				}
				break;
			case PYC:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracionContext extends ParserRuleContext {
		public TiposContext tipos() {
			return getRuleContext(TiposContext.class,0);
		}
		public Lista_declaracionContext lista_declaracion() {
			return getRuleContext(Lista_declaracionContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RulesVisitor ) return ((RulesVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			tipos();
			setState(170);
			lista_declaracion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lista_declaracionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RulesParser.ID, 0); }
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public TerminalNode COMA() { return getToken(RulesParser.COMA, 0); }
		public Lista_declaracionContext lista_declaracion() {
			return getRuleContext(Lista_declaracionContext.class,0);
		}
		public Lista_declaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterLista_declaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitLista_declaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RulesVisitor ) return ((RulesVisitor<? extends T>)visitor).visitLista_declaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_declaracionContext lista_declaracion() throws RecognitionException {
		Lista_declaracionContext _localctx = new Lista_declaracionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_lista_declaracion);
		try {
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				asignacion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				asignacion();
				setState(175);
				match(COMA);
				setState(176);
				lista_declaracion();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(178);
				match(ID);
				setState(179);
				match(COMA);
				setState(180);
				lista_declaracion();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RulesParser.ID, 0); }
		public TerminalNode ASIGN() { return getToken(RulesParser.ASIGN, 0); }
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RulesVisitor ) return ((RulesVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(ID);
			setState(184);
			match(ASIGN);
			setState(185);
			operaciones();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AcumulacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RulesParser.ID, 0); }
		public TerminalNode AC_POS() { return getToken(RulesParser.AC_POS, 0); }
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
		public TerminalNode AC_NEG() { return getToken(RulesParser.AC_NEG, 0); }
		public AcumulacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_acumulacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterAcumulacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitAcumulacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RulesVisitor ) return ((RulesVisitor<? extends T>)visitor).visitAcumulacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AcumulacionContext acumulacion() throws RecognitionException {
		AcumulacionContext _localctx = new AcumulacionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_acumulacion);
		try {
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				match(ID);
				setState(188);
				match(AC_POS);
				setState(189);
				operaciones();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				match(ID);
				setState(191);
				match(AC_NEG);
				setState(192);
				operaciones();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperacionesContext extends ParserRuleContext {
		public DisyuncionContext disyuncion() {
			return getRuleContext(DisyuncionContext.class,0);
		}
		public OperacionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operaciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterOperaciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitOperaciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RulesVisitor ) return ((RulesVisitor<? extends T>)visitor).visitOperaciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionesContext operaciones() throws RecognitionException {
		OperacionesContext _localctx = new OperacionesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_operaciones);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			disyuncion(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DisyuncionContext extends ParserRuleContext {
		public ConjuncionContext conjuncion() {
			return getRuleContext(ConjuncionContext.class,0);
		}
		public DisyuncionContext disyuncion() {
			return getRuleContext(DisyuncionContext.class,0);
		}
		public TerminalNode OR() { return getToken(RulesParser.OR, 0); }
		public DisyuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disyuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterDisyuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitDisyuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RulesVisitor ) return ((RulesVisitor<? extends T>)visitor).visitDisyuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DisyuncionContext disyuncion() throws RecognitionException {
		return disyuncion(0);
	}

	private DisyuncionContext disyuncion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DisyuncionContext _localctx = new DisyuncionContext(_ctx, _parentState);
		DisyuncionContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_disyuncion, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(198);
			conjuncion(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DisyuncionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_disyuncion);
					setState(200);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(201);
					match(OR);
					setState(202);
					conjuncion(0);
					}
					} 
				}
				setState(207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConjuncionContext extends ParserRuleContext {
		public IgualdadContext igualdad() {
			return getRuleContext(IgualdadContext.class,0);
		}
		public ConjuncionContext conjuncion() {
			return getRuleContext(ConjuncionContext.class,0);
		}
		public TerminalNode AND() { return getToken(RulesParser.AND, 0); }
		public ConjuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterConjuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitConjuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RulesVisitor ) return ((RulesVisitor<? extends T>)visitor).visitConjuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConjuncionContext conjuncion() throws RecognitionException {
		return conjuncion(0);
	}

	private ConjuncionContext conjuncion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConjuncionContext _localctx = new ConjuncionContext(_ctx, _parentState);
		ConjuncionContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_conjuncion, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(209);
			igualdad(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConjuncionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conjuncion);
					setState(211);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(212);
					match(AND);
					setState(213);
					igualdad(0);
					}
					} 
				}
				setState(218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class IgualdadContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public IgualdadContext igualdad() {
			return getRuleContext(IgualdadContext.class,0);
		}
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public IgualdadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_igualdad; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterIgualdad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitIgualdad(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RulesVisitor ) return ((RulesVisitor<? extends T>)visitor).visitIgualdad(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IgualdadContext igualdad() throws RecognitionException {
		return igualdad(0);
	}

	private IgualdadContext igualdad(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IgualdadContext _localctx = new IgualdadContext(_ctx, _parentState);
		IgualdadContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_igualdad, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(220);
			expresion();
			}
			_ctx.stop = _input.LT(-1);
			setState(228);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new IgualdadContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_igualdad);
					setState(222);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(223);
					comparacion();
					setState(224);
					expresion();
					}
					} 
				}
				setState(230);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpresionContext extends ParserRuleContext {
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RulesVisitor ) return ((RulesVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			termino();
			setState(232);
			exp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public TerminalNode SUMA() { return getToken(RulesParser.SUMA, 0); }
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RESTA() { return getToken(RulesParser.RESTA, 0); }
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RulesVisitor ) return ((RulesVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_exp);
		try {
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				match(SUMA);
				setState(235);
				termino();
				setState(236);
				exp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				match(RESTA);
				setState(239);
				termino();
				setState(240);
				exp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TerminoContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterTermino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitTermino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RulesVisitor ) return ((RulesVisitor<? extends T>)visitor).visitTermino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_termino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			factor();
			setState(246);
			term();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public TerminalNode MULTI() { return getToken(RulesParser.MULTI, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode DIV() { return getToken(RulesParser.DIV, 0); }
		public TerminalNode RESTO() { return getToken(RulesParser.RESTO, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RulesVisitor ) return ((RulesVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_term);
		try {
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				match(MULTI);
				setState(249);
				factor();
				setState(250);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				match(DIV);
				setState(253);
				factor();
				setState(254);
				term();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(256);
				match(RESTO);
				setState(257);
				factor();
				setState(258);
				term();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public PrefixContext prefix() {
			return getRuleContext(PrefixContext.class,0);
		}
		public TerminalNode PA() { return getToken(RulesParser.PA, 0); }
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
		public TerminalNode PC() { return getToken(RulesParser.PC, 0); }
		public TerminalNode NUMERO() { return getToken(RulesParser.NUMERO, 0); }
		public TerminalNode ID() { return getToken(RulesParser.ID, 0); }
		public PostfixContext postfix() {
			return getRuleContext(PostfixContext.class,0);
		}
		public TerminalNode FLOTANTE() { return getToken(RulesParser.FLOTANTE, 0); }
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
		}
		public TerminalNode CARACTER() { return getToken(RulesParser.CARACTER, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RulesVisitor ) return ((RulesVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_factor);
		try {
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				prefix();
				setState(264);
				match(PA);
				setState(265);
				operaciones();
				setState(266);
				match(PC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				prefix();
				setState(269);
				match(NUMERO);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(271);
				prefix();
				setState(272);
				match(ID);
				setState(273);
				postfix();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(275);
				prefix();
				setState(276);
				match(FLOTANTE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(278);
				prefix();
				setState(279);
				funcion();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(281);
				prefix();
				setState(282);
				match(CARACTER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrefixContext extends ParserRuleContext {
		public TerminalNode INC() { return getToken(RulesParser.INC, 0); }
		public TerminalNode DEC() { return getToken(RulesParser.DEC, 0); }
		public TerminalNode SUMA() { return getToken(RulesParser.SUMA, 0); }
		public TerminalNode RESTA() { return getToken(RulesParser.RESTA, 0); }
		public TerminalNode NOT() { return getToken(RulesParser.NOT, 0); }
		public PrefixContext prefix() {
			return getRuleContext(PrefixContext.class,0);
		}
		public PrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RulesVisitor ) return ((RulesVisitor<? extends T>)visitor).visitPrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixContext prefix() throws RecognitionException {
		PrefixContext _localctx = new PrefixContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_prefix);
		try {
			setState(293);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INC:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				match(INC);
				}
				break;
			case DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				match(DEC);
				}
				break;
			case SUMA:
				enterOuterAlt(_localctx, 3);
				{
				setState(288);
				match(SUMA);
				}
				break;
			case RESTA:
				enterOuterAlt(_localctx, 4);
				{
				setState(289);
				match(RESTA);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 5);
				{
				setState(290);
				match(NOT);
				setState(291);
				prefix();
				}
				break;
			case PA:
			case CARACTER:
			case NUMERO:
			case FLOTANTE:
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixContext extends ParserRuleContext {
		public TerminalNode INC() { return getToken(RulesParser.INC, 0); }
		public TerminalNode DEC() { return getToken(RulesParser.DEC, 0); }
		public PostfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitPostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RulesVisitor ) return ((RulesVisitor<? extends T>)visitor).visitPostfix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixContext postfix() throws RecognitionException {
		PostfixContext _localctx = new PostfixContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_postfix);
		try {
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				match(INC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				match(DEC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_condicionalContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(RulesParser.IF, 0); }
		public TerminalNode PA() { return getToken(RulesParser.PA, 0); }
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
		public TerminalNode PC() { return getToken(RulesParser.PC, 0); }
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public Else_condicionalContext else_condicional() {
			return getRuleContext(Else_condicionalContext.class,0);
		}
		public If_condicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterIf_condicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitIf_condicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RulesVisitor ) return ((RulesVisitor<? extends T>)visitor).visitIf_condicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_condicionalContext if_condicional() throws RecognitionException {
		If_condicionalContext _localctx = new If_condicionalContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_if_condicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(IF);
			setState(301);
			match(PA);
			setState(302);
			operaciones();
			setState(303);
			match(PC);
			setState(304);
			instruccion();
			setState(305);
			else_condicional();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_condicionalContext extends ParserRuleContext {
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(RulesParser.ELSE, 0); }
		public TerminalNode ELSE_IF() { return getToken(RulesParser.ELSE_IF, 0); }
		public TerminalNode PA() { return getToken(RulesParser.PA, 0); }
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
		public TerminalNode PC() { return getToken(RulesParser.PC, 0); }
		public Else_condicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterElse_condicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitElse_condicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RulesVisitor ) return ((RulesVisitor<? extends T>)visitor).visitElse_condicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_condicionalContext else_condicional() throws RecognitionException {
		Else_condicionalContext _localctx = new Else_condicionalContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_else_condicional);
		try {
			setState(317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ELSE:
					{
					setState(307);
					match(ELSE);
					}
					break;
				case ELSE_IF:
					{
					setState(308);
					match(ELSE_IF);
					setState(309);
					match(PA);
					setState(310);
					operaciones();
					setState(311);
					match(PC);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(315);
				instruccion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ciclo_forContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(RulesParser.FOR, 0); }
		public TerminalNode PA() { return getToken(RulesParser.PA, 0); }
		public List<TerminalNode> PYC() { return getTokens(RulesParser.PYC); }
		public TerminalNode PYC(int i) {
			return getToken(RulesParser.PYC, i);
		}
		public TerminalNode PC() { return getToken(RulesParser.PC, 0); }
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public List<AsignacionContext> asignacion() {
			return getRuleContexts(AsignacionContext.class);
		}
		public AsignacionContext asignacion(int i) {
			return getRuleContext(AsignacionContext.class,i);
		}
		public Lista_declaracionContext lista_declaracion() {
			return getRuleContext(Lista_declaracionContext.class,0);
		}
		public List<OperacionesContext> operaciones() {
			return getRuleContexts(OperacionesContext.class);
		}
		public OperacionesContext operaciones(int i) {
			return getRuleContext(OperacionesContext.class,i);
		}
		public Ciclo_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterCiclo_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitCiclo_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RulesVisitor ) return ((RulesVisitor<? extends T>)visitor).visitCiclo_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ciclo_forContext ciclo_for() throws RecognitionException {
		Ciclo_forContext _localctx = new Ciclo_forContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_ciclo_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(FOR);
			setState(320);
			match(PA);
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(321);
				asignacion();
				}
				break;
			case 2:
				{
				setState(322);
				lista_declaracion();
				}
				break;
			case 3:
				{
				}
				break;
			}
			setState(326);
			match(PYC);
			setState(329);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PA:
			case CARACTER:
			case NUMERO:
			case FLOTANTE:
			case SUMA:
			case RESTA:
			case INC:
			case DEC:
			case NOT:
			case ID:
				{
				setState(327);
				operaciones();
				}
				break;
			case PYC:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(331);
			match(PYC);
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(332);
				operaciones();
				}
				break;
			case 2:
				{
				setState(333);
				asignacion();
				}
				break;
			case 3:
				{
				}
				break;
			}
			setState(337);
			match(PC);
			setState(338);
			instruccion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ciclo_whileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(RulesParser.WHILE, 0); }
		public TerminalNode PA() { return getToken(RulesParser.PA, 0); }
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
		public TerminalNode PC() { return getToken(RulesParser.PC, 0); }
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public Ciclo_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterCiclo_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitCiclo_while(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RulesVisitor ) return ((RulesVisitor<? extends T>)visitor).visitCiclo_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ciclo_whileContext ciclo_while() throws RecognitionException {
		Ciclo_whileContext _localctx = new Ciclo_whileContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_ciclo_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(WHILE);
			setState(341);
			match(PA);
			setState(342);
			operaciones();
			setState(343);
			match(PC);
			setState(344);
			instruccion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ciclo_doContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(RulesParser.DO, 0); }
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(RulesParser.WHILE, 0); }
		public TerminalNode PA() { return getToken(RulesParser.PA, 0); }
		public TerminalNode PC() { return getToken(RulesParser.PC, 0); }
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
		public Ciclo_doContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo_do; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterCiclo_do(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitCiclo_do(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RulesVisitor ) return ((RulesVisitor<? extends T>)visitor).visitCiclo_do(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ciclo_doContext ciclo_do() throws RecognitionException {
		Ciclo_doContext _localctx = new Ciclo_doContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_ciclo_do);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(DO);
			setState(347);
			instruccion();
			setState(348);
			match(WHILE);
			setState(349);
			match(PA);
			setState(352);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PA:
			case CARACTER:
			case NUMERO:
			case FLOTANTE:
			case SUMA:
			case RESTA:
			case INC:
			case DEC:
			case NOT:
			case ID:
				{
				setState(350);
				operaciones();
				}
				break;
			case PC:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(354);
			match(PC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AmbitoContext extends ParserRuleContext {
		public TerminalNode LA() { return getToken(RulesParser.LA, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode LC() { return getToken(RulesParser.LC, 0); }
		public AmbitoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ambito; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterAmbito(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitAmbito(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RulesVisitor ) return ((RulesVisitor<? extends T>)visitor).visitAmbito(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AmbitoContext ambito() throws RecognitionException {
		AmbitoContext _localctx = new AmbitoContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_ambito);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(LA);
			setState(357);
			instrucciones();
			setState(358);
			match(LC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return disyuncion_sempred((DisyuncionContext)_localctx, predIndex);
		case 19:
			return conjuncion_sempred((ConjuncionContext)_localctx, predIndex);
		case 20:
			return igualdad_sempred((IgualdadContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean disyuncion_sempred(DisyuncionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conjuncion_sempred(ConjuncionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean igualdad_sempred(IgualdadContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u016b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\5\6T\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7q\n\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\5\t|\n\t\3\t\3\t\3\t\5\t\u0081\n\t\3\t\3\t\3"+
		"\t\5\t\u0086\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13\u0098\n\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u00a5\n\r\3\16\3\16\3\16\5\16\u00aa\n\16\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00b8\n\20\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00c4\n\22\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\7\24\u00ce\n\24\f\24\16\24\u00d1\13\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\7\25\u00d9\n\25\f\25\16\25\u00dc\13\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u00e5\n\26\f\26\16\26\u00e8\13\26"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00f6"+
		"\n\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\5\32\u0108\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33"+
		"\u011f\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0128\n\34\3\35\3"+
		"\35\3\35\5\35\u012d\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\5\37\u013c\n\37\3\37\3\37\5\37\u0140\n\37\3 \3 \3"+
		" \3 \3 \5 \u0147\n \3 \3 \3 \5 \u014c\n \3 \3 \3 \3 \5 \u0152\n \3 \3"+
		" \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0163\n\"\3\"\3\"\3"+
		"#\3#\3#\3#\3#\2\5&(*$\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,."+
		"\60\62\64\668:<>@BD\2\5\3\2\7\n\3\2\21\23\3\2\36#\2\u017d\2F\3\2\2\2\4"+
		"H\3\2\2\2\6J\3\2\2\2\bL\3\2\2\2\nS\3\2\2\2\fp\3\2\2\2\16r\3\2\2\2\20\u0085"+
		"\3\2\2\2\22\u0087\3\2\2\2\24\u0097\3\2\2\2\26\u0099\3\2\2\2\30\u00a4\3"+
		"\2\2\2\32\u00a6\3\2\2\2\34\u00ab\3\2\2\2\36\u00b7\3\2\2\2 \u00b9\3\2\2"+
		"\2\"\u00c3\3\2\2\2$\u00c5\3\2\2\2&\u00c7\3\2\2\2(\u00d2\3\2\2\2*\u00dd"+
		"\3\2\2\2,\u00e9\3\2\2\2.\u00f5\3\2\2\2\60\u00f7\3\2\2\2\62\u0107\3\2\2"+
		"\2\64\u011e\3\2\2\2\66\u0127\3\2\2\28\u012c\3\2\2\2:\u012e\3\2\2\2<\u013f"+
		"\3\2\2\2>\u0141\3\2\2\2@\u0156\3\2\2\2B\u015c\3\2\2\2D\u0166\3\2\2\2F"+
		"G\t\2\2\2G\3\3\2\2\2HI\t\3\2\2I\5\3\2\2\2JK\t\4\2\2K\7\3\2\2\2LM\5\n\6"+
		"\2MN\7\2\2\3N\t\3\2\2\2OP\5\f\7\2PQ\5\n\6\2QT\3\2\2\2RT\3\2\2\2SO\3\2"+
		"\2\2SR\3\2\2\2T\13\3\2\2\2UV\5\34\17\2VW\7\34\2\2Wq\3\2\2\2XY\5 \21\2"+
		"YZ\7\34\2\2Zq\3\2\2\2[\\\5\"\22\2\\]\7\34\2\2]q\3\2\2\2^_\5$\23\2_`\7"+
		"\34\2\2`q\3\2\2\2aq\5:\36\2bq\5D#\2cq\5> \2dq\5@!\2eq\5B\"\2fg\5\16\b"+
		"\2gh\7\34\2\2hq\3\2\2\2iq\5\22\n\2jk\5\26\f\2kl\7\34\2\2lq\3\2\2\2mn\5"+
		"\32\16\2no\7\34\2\2oq\3\2\2\2pU\3\2\2\2pX\3\2\2\2p[\3\2\2\2p^\3\2\2\2"+
		"pa\3\2\2\2pb\3\2\2\2pc\3\2\2\2pd\3\2\2\2pe\3\2\2\2pf\3\2\2\2pi\3\2\2\2"+
		"pj\3\2\2\2pm\3\2\2\2q\r\3\2\2\2rs\5\2\2\2st\7\'\2\2tu\7\3\2\2uv\5\20\t"+
		"\2vw\7\4\2\2w\17\3\2\2\2x{\5\2\2\2y|\7\'\2\2z|\3\2\2\2{y\3\2\2\2{z\3\2"+
		"\2\2|\u0086\3\2\2\2}\u0080\5\2\2\2~\u0081\7\'\2\2\177\u0081\3\2\2\2\u0080"+
		"~\3\2\2\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\7\35\2\2\u0083"+
		"\u0084\5\20\t\2\u0084\u0086\3\2\2\2\u0085x\3\2\2\2\u0085}\3\2\2\2\u0086"+
		"\21\3\2\2\2\u0087\u0088\5\2\2\2\u0088\u0089\7\'\2\2\u0089\u008a\7\3\2"+
		"\2\u008a\u008b\5\24\13\2\u008b\u008c\7\4\2\2\u008c\u008d\5D#\2\u008d\23"+
		"\3\2\2\2\u008e\u008f\5\2\2\2\u008f\u0090\7\'\2\2\u0090\u0098\3\2\2\2\u0091"+
		"\u0092\5\2\2\2\u0092\u0093\7\'\2\2\u0093\u0094\7\35\2\2\u0094\u0095\5"+
		"\24\13\2\u0095\u0098\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u008e\3\2\2\2\u0097"+
		"\u0091\3\2\2\2\u0097\u0096\3\2\2\2\u0098\25\3\2\2\2\u0099\u009a\7\'\2"+
		"\2\u009a\u009b\7\3\2\2\u009b\u009c\5\30\r\2\u009c\u009d\7\4\2\2\u009d"+
		"\27\3\2\2\2\u009e\u00a5\5$\23\2\u009f\u00a0\5$\23\2\u00a0\u00a1\7\35\2"+
		"\2\u00a1\u00a2\5\30\r\2\u00a2\u00a5\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4"+
		"\u009e\3\2\2\2\u00a4\u009f\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\31\3\2\2"+
		"\2\u00a6\u00a9\7&\2\2\u00a7\u00aa\5$\23\2\u00a8\u00aa\3\2\2\2\u00a9\u00a7"+
		"\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\33\3\2\2\2\u00ab\u00ac\5\2\2\2\u00ac"+
		"\u00ad\5\36\20\2\u00ad\35\3\2\2\2\u00ae\u00b8\7\'\2\2\u00af\u00b8\5 \21"+
		"\2\u00b0\u00b1\5 \21\2\u00b1\u00b2\7\35\2\2\u00b2\u00b3\5\36\20\2\u00b3"+
		"\u00b8\3\2\2\2\u00b4\u00b5\7\'\2\2\u00b5\u00b6\7\35\2\2\u00b6\u00b8\5"+
		"\36\20\2\u00b7\u00ae\3\2\2\2\u00b7\u00af\3\2\2\2\u00b7\u00b0\3\2\2\2\u00b7"+
		"\u00b4\3\2\2\2\u00b8\37\3\2\2\2\u00b9\u00ba\7\'\2\2\u00ba\u00bb\7(\2\2"+
		"\u00bb\u00bc\5$\23\2\u00bc!\3\2\2\2\u00bd\u00be\7\'\2\2\u00be\u00bf\7"+
		")\2\2\u00bf\u00c4\5$\23\2\u00c0\u00c1\7\'\2\2\u00c1\u00c2\7*\2\2\u00c2"+
		"\u00c4\5$\23\2\u00c3\u00bd\3\2\2\2\u00c3\u00c0\3\2\2\2\u00c4#\3\2\2\2"+
		"\u00c5\u00c6\5&\24\2\u00c6%\3\2\2\2\u00c7\u00c8\b\24\1\2\u00c8\u00c9\5"+
		"(\25\2\u00c9\u00cf\3\2\2\2\u00ca\u00cb\f\3\2\2\u00cb\u00cc\7%\2\2\u00cc"+
		"\u00ce\5(\25\2\u00cd\u00ca\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2"+
		"\2\2\u00cf\u00d0\3\2\2\2\u00d0\'\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3"+
		"\b\25\1\2\u00d3\u00d4\5*\26\2\u00d4\u00da\3\2\2\2\u00d5\u00d6\f\3\2\2"+
		"\u00d6\u00d7\7$\2\2\u00d7\u00d9\5*\26\2\u00d8\u00d5\3\2\2\2\u00d9\u00dc"+
		"\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db)\3\2\2\2\u00dc"+
		"\u00da\3\2\2\2\u00dd\u00de\b\26\1\2\u00de\u00df\5,\27\2\u00df\u00e6\3"+
		"\2\2\2\u00e0\u00e1\f\3\2\2\u00e1\u00e2\5\6\4\2\u00e2\u00e3\5,\27\2\u00e3"+
		"\u00e5\3\2\2\2\u00e4\u00e0\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2"+
		"\2\2\u00e6\u00e7\3\2\2\2\u00e7+\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea"+
		"\5\60\31\2\u00ea\u00eb\5.\30\2\u00eb-\3\2\2\2\u00ec\u00ed\7\24\2\2\u00ed"+
		"\u00ee\5\60\31\2\u00ee\u00ef\5.\30\2\u00ef\u00f6\3\2\2\2\u00f0\u00f1\7"+
		"\25\2\2\u00f1\u00f2\5\60\31\2\u00f2\u00f3\5.\30\2\u00f3\u00f6\3\2\2\2"+
		"\u00f4\u00f6\3\2\2\2\u00f5\u00ec\3\2\2\2\u00f5\u00f0\3\2\2\2\u00f5\u00f4"+
		"\3\2\2\2\u00f6/\3\2\2\2\u00f7\u00f8\5\64\33\2\u00f8\u00f9\5\62\32\2\u00f9"+
		"\61\3\2\2\2\u00fa\u00fb\7\26\2\2\u00fb\u00fc\5\64\33\2\u00fc\u00fd\5\62"+
		"\32\2\u00fd\u0108\3\2\2\2\u00fe\u00ff\7\27\2\2\u00ff\u0100\5\64\33\2\u0100"+
		"\u0101\5\62\32\2\u0101\u0108\3\2\2\2\u0102\u0103\7\30\2\2\u0103\u0104"+
		"\5\64\33\2\u0104\u0105\5\62\32\2\u0105\u0108\3\2\2\2\u0106\u0108\3\2\2"+
		"\2\u0107\u00fa\3\2\2\2\u0107\u00fe\3\2\2\2\u0107\u0102\3\2\2\2\u0107\u0106"+
		"\3\2\2\2\u0108\63\3\2\2\2\u0109\u010a\5\66\34\2\u010a\u010b\7\3\2\2\u010b"+
		"\u010c\5$\23\2\u010c\u010d\7\4\2\2\u010d\u011f\3\2\2\2\u010e\u010f\5\66"+
		"\34\2\u010f\u0110\7\22\2\2\u0110\u011f\3\2\2\2\u0111\u0112\5\66\34\2\u0112"+
		"\u0113\7\'\2\2\u0113\u0114\58\35\2\u0114\u011f\3\2\2\2\u0115\u0116\5\66"+
		"\34\2\u0116\u0117\7\23\2\2\u0117\u011f\3\2\2\2\u0118\u0119\5\66\34\2\u0119"+
		"\u011a\5\26\f\2\u011a\u011f\3\2\2\2\u011b\u011c\5\66\34\2\u011c\u011d"+
		"\7\21\2\2\u011d\u011f\3\2\2\2\u011e\u0109\3\2\2\2\u011e\u010e\3\2\2\2"+
		"\u011e\u0111\3\2\2\2\u011e\u0115\3\2\2\2\u011e\u0118\3\2\2\2\u011e\u011b"+
		"\3\2\2\2\u011f\65\3\2\2\2\u0120\u0128\7\31\2\2\u0121\u0128\7\32\2\2\u0122"+
		"\u0128\7\24\2\2\u0123\u0128\7\25\2\2\u0124\u0125\7\33\2\2\u0125\u0128"+
		"\5\66\34\2\u0126\u0128\3\2\2\2\u0127\u0120\3\2\2\2\u0127\u0121\3\2\2\2"+
		"\u0127\u0122\3\2\2\2\u0127\u0123\3\2\2\2\u0127\u0124\3\2\2\2\u0127\u0126"+
		"\3\2\2\2\u0128\67\3\2\2\2\u0129\u012d\7\31\2\2\u012a\u012d\7\32\2\2\u012b"+
		"\u012d\3\2\2\2\u012c\u0129\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012b\3\2"+
		"\2\2\u012d9\3\2\2\2\u012e\u012f\7\16\2\2\u012f\u0130\7\3\2\2\u0130\u0131"+
		"\5$\23\2\u0131\u0132\7\4\2\2\u0132\u0133\5\f\7\2\u0133\u0134\5<\37\2\u0134"+
		";\3\2\2\2\u0135\u013c\7\17\2\2\u0136\u0137\7\20\2\2\u0137\u0138\7\3\2"+
		"\2\u0138\u0139\5$\23\2\u0139\u013a\7\4\2\2\u013a\u013c\3\2\2\2\u013b\u0135"+
		"\3\2\2\2\u013b\u0136\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u0140\5\f\7\2\u013e"+
		"\u0140\3\2\2\2\u013f\u013b\3\2\2\2\u013f\u013e\3\2\2\2\u0140=\3\2\2\2"+
		"\u0141\u0142\7\13\2\2\u0142\u0146\7\3\2\2\u0143\u0147\5 \21\2\u0144\u0147"+
		"\5\36\20\2\u0145\u0147\3\2\2\2\u0146\u0143\3\2\2\2\u0146\u0144\3\2\2\2"+
		"\u0146\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014b\7\34\2\2\u0149\u014c"+
		"\5$\23\2\u014a\u014c\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014a\3\2\2\2\u014c"+
		"\u014d\3\2\2\2\u014d\u0151\7\34\2\2\u014e\u0152\5$\23\2\u014f\u0152\5"+
		" \21\2\u0150\u0152\3\2\2\2\u0151\u014e\3\2\2\2\u0151\u014f\3\2\2\2\u0151"+
		"\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\7\4\2\2\u0154\u0155\5\f"+
		"\7\2\u0155?\3\2\2\2\u0156\u0157\7\f\2\2\u0157\u0158\7\3\2\2\u0158\u0159"+
		"\5$\23\2\u0159\u015a\7\4\2\2\u015a\u015b\5\f\7\2\u015bA\3\2\2\2\u015c"+
		"\u015d\7\r\2\2\u015d\u015e\5\f\7\2\u015e\u015f\7\f\2\2\u015f\u0162\7\3"+
		"\2\2\u0160\u0163\5$\23\2\u0161\u0163\3\2\2\2\u0162\u0160\3\2\2\2\u0162"+
		"\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\7\4\2\2\u0165C\3\2\2\2"+
		"\u0166\u0167\7\5\2\2\u0167\u0168\5\n\6\2\u0168\u0169\7\6\2\2\u0169E\3"+
		"\2\2\2\32Sp{\u0080\u0085\u0097\u00a4\u00a9\u00b7\u00c3\u00cf\u00da\u00e6"+
		"\u00f5\u0107\u011e\u0127\u012c\u013b\u013f\u0146\u014b\u0151\u0162";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}