// Generated from /home/zumakiem/Documentos/TPFinal/src/App/Lexer.g4 by ANTLR 4.8

    package App;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LexerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, INT=6, FLOAT=7, SEMICOLON=8, COMMA=9, 
		ASSIGN=10, COMP=11, ARITH=12, LOGIC=13, DATATYPE=14, IF=15, ELSE=16, FOR=17, 
		WHILE=18, INC_DEC=19, INC_DEC_REC=20, ID=21, WS=22;
	public static final int
		RULE_programa = 0, RULE_instrucciones = 1, RULE_keyinst = 2, RULE_exp_a = 3, 
		RULE_declaracion = 4, RULE_declaracion_sola = 5, RULE_asignacion = 6, 
		RULE_listaID = 7, RULE_exp_l = 8, RULE_if_ = 9, RULE_functionAux = 10, 
		RULE_else_ = 11, RULE_function_ = 12, RULE_for_ = 13, RULE_list_exp_l = 14, 
		RULE_while_ = 15, RULE_estructuras = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "instrucciones", "keyinst", "exp_a", "declaracion", "declaracion_sola", 
			"asignacion", "listaID", "exp_l", "if_", "functionAux", "else_", "function_", 
			"for_", "list_exp_l", "while_", "estructuras"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'return'", "'('", "')'", null, null, "';'", "','", 
			null, null, null, null, null, "'if'", "'else'", "'for'", "'while'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "INT", "FLOAT", "SEMICOLON", "COMMA", 
			"ASSIGN", "COMP", "ARITH", "LOGIC", "DATATYPE", "IF", "ELSE", "FOR", 
			"WHILE", "INC_DEC", "INC_DEC_REC", "ID", "WS"
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
	public String getGrammarFileName() { return "Lexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LexerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexerListener ) ((LexerListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexerListener ) ((LexerListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexerVisitor ) return ((LexerVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			instrucciones();
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
		public EstructurasContext estructuras() {
			return getRuleContext(EstructurasContext.class,0);
		}
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public ListaIDContext listaID() {
			return getRuleContext(ListaIDContext.class,0);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexerListener ) ((LexerListener)listener).enterInstrucciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexerListener ) ((LexerListener)listener).exitInstrucciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexerVisitor ) return ((LexerVisitor<? extends T>)visitor).visitInstrucciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instrucciones);
		try {
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				estructuras();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				estructuras();
				setState(38);
				instrucciones();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				listaID();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(41);
				listaID();
				setState(42);
				instrucciones();
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

	public static class KeyinstContext extends ParserRuleContext {
		public ListaIDContext listaID() {
			return getRuleContext(ListaIDContext.class,0);
		}
		public List<InstruccionesContext> instrucciones() {
			return getRuleContexts(InstruccionesContext.class);
		}
		public InstruccionesContext instrucciones(int i) {
			return getRuleContext(InstruccionesContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(LexerParser.SEMICOLON, 0); }
		public TerminalNode ID() { return getToken(LexerParser.ID, 0); }
		public TerminalNode FLOAT() { return getToken(LexerParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(LexerParser.INT, 0); }
		public KeyinstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyinst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexerListener ) ((LexerListener)listener).enterKeyinst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexerListener ) ((LexerListener)listener).exitKeyinst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexerVisitor ) return ((LexerVisitor<? extends T>)visitor).visitKeyinst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyinstContext keyinst() throws RecognitionException {
		KeyinstContext _localctx = new KeyinstContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_keyinst);
		int _la;
		try {
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				listaID();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				match(T__0);
				setState(48);
				instrucciones();
				setState(49);
				match(T__1);
				setState(50);
				instrucciones();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				match(T__0);
				setState(53);
				instrucciones();
				setState(59);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(54);
					match(T__2);
					setState(55);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << ID))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(56);
					match(SEMICOLON);
					}
					break;
				case 2:
					{
					setState(57);
					match(T__2);
					setState(58);
					match(SEMICOLON);
					}
					break;
				}
				setState(61);
				match(T__1);
				setState(62);
				instrucciones();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(65);
				match(T__0);
				setState(66);
				instrucciones();
				setState(72);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(67);
					match(T__2);
					setState(68);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << ID))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(69);
					match(SEMICOLON);
					}
					break;
				case 2:
					{
					setState(70);
					match(T__2);
					setState(71);
					match(SEMICOLON);
					}
					break;
				}
				setState(74);
				match(T__1);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(76);
				match(T__0);
				setState(77);
				instrucciones();
				setState(78);
				match(T__1);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(80);
				match(T__0);
				setState(81);
				match(T__1);
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

	public static class Exp_aContext extends ParserRuleContext {
		public TerminalNode ARITH() { return getToken(LexerParser.ARITH, 0); }
		public TerminalNode ASSIGN() { return getToken(LexerParser.ASSIGN, 0); }
		public List<TerminalNode> ID() { return getTokens(LexerParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LexerParser.ID, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(LexerParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(LexerParser.FLOAT, i);
		}
		public List<TerminalNode> INT() { return getTokens(LexerParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(LexerParser.INT, i);
		}
		public List<FunctionAuxContext> functionAux() {
			return getRuleContexts(FunctionAuxContext.class);
		}
		public FunctionAuxContext functionAux(int i) {
			return getRuleContext(FunctionAuxContext.class,i);
		}
		public Exp_aContext exp_a() {
			return getRuleContext(Exp_aContext.class,0);
		}
		public TerminalNode INC_DEC() { return getToken(LexerParser.INC_DEC, 0); }
		public TerminalNode INC_DEC_REC() { return getToken(LexerParser.INC_DEC_REC, 0); }
		public Exp_aContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_a; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexerListener ) ((LexerListener)listener).enterExp_a(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexerListener ) ((LexerListener)listener).exitExp_a(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexerVisitor ) return ((LexerVisitor<? extends T>)visitor).visitExp_a(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_aContext exp_a() throws RecognitionException {
		Exp_aContext _localctx = new Exp_aContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_exp_a);
		int _la;
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(84);
					match(ID);
					}
					break;
				case 2:
					{
					setState(85);
					match(FLOAT);
					}
					break;
				case 3:
					{
					setState(86);
					match(INT);
					}
					break;
				case 4:
					{
					setState(87);
					match(ID);
					setState(88);
					match(T__3);
					setState(89);
					functionAux();
					setState(90);
					match(T__4);
					}
					break;
				}
				setState(94);
				_la = _input.LA(1);
				if ( !(_la==ASSIGN || _la==ARITH) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(104);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(95);
					exp_a();
					}
					break;
				case 2:
					{
					setState(96);
					match(ID);
					}
					break;
				case 3:
					{
					setState(97);
					match(FLOAT);
					}
					break;
				case 4:
					{
					setState(98);
					match(INT);
					}
					break;
				case 5:
					{
					setState(99);
					match(ID);
					setState(100);
					match(T__3);
					setState(101);
					functionAux();
					setState(102);
					match(T__4);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(106);
				match(ID);
				}
				setState(107);
				match(INC_DEC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				match(ID);
				setState(109);
				match(INC_DEC_REC);
				setState(110);
				match(ID);
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

	public static class DeclaracionContext extends ParserRuleContext {
		public TerminalNode DATATYPE() { return getToken(LexerParser.DATATYPE, 0); }
		public List<TerminalNode> ID() { return getTokens(LexerParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LexerParser.ID, i);
		}
		public TerminalNode ASSIGN() { return getToken(LexerParser.ASSIGN, 0); }
		public TerminalNode FLOAT() { return getToken(LexerParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(LexerParser.INT, 0); }
		public Exp_aContext exp_a() {
			return getRuleContext(Exp_aContext.class,0);
		}
		public FunctionAuxContext functionAux() {
			return getRuleContext(FunctionAuxContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexerListener ) ((LexerListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexerListener ) ((LexerListener)listener).exitDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexerVisitor ) return ((LexerVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaracion);
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				match(DATATYPE);
				setState(114);
				match(ID);
				setState(115);
				match(ASSIGN);
				setState(120);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(116);
					match(FLOAT);
					}
					break;
				case 2:
					{
					setState(117);
					match(INT);
					}
					break;
				case 3:
					{
					setState(118);
					match(ID);
					}
					break;
				case 4:
					{
					setState(119);
					exp_a();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				match(DATATYPE);
				setState(123);
				match(ID);
				setState(124);
				match(ASSIGN);
				setState(125);
				match(ID);
				setState(126);
				match(T__3);
				setState(127);
				functionAux();
				setState(128);
				match(T__4);
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

	public static class Declaracion_solaContext extends ParserRuleContext {
		public TerminalNode DATATYPE() { return getToken(LexerParser.DATATYPE, 0); }
		public TerminalNode ID() { return getToken(LexerParser.ID, 0); }
		public TerminalNode COMMA() { return getToken(LexerParser.COMMA, 0); }
		public Declaracion_solaContext declaracion_sola() {
			return getRuleContext(Declaracion_solaContext.class,0);
		}
		public Exp_aContext exp_a() {
			return getRuleContext(Exp_aContext.class,0);
		}
		public Declaracion_solaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_sola; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexerListener ) ((LexerListener)listener).enterDeclaracion_sola(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexerListener ) ((LexerListener)listener).exitDeclaracion_sola(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexerVisitor ) return ((LexerVisitor<? extends T>)visitor).visitDeclaracion_sola(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracion_solaContext declaracion_sola() throws RecognitionException {
		Declaracion_solaContext _localctx = new Declaracion_solaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaracion_sola);
		try {
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(DATATYPE);
				setState(133);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(DATATYPE);
				setState(135);
				match(ID);
				setState(136);
				match(COMMA);
				setState(137);
				declaracion_sola();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				exp_a();
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

	public static class AsignacionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(LexerParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LexerParser.ID, i);
		}
		public TerminalNode ASSIGN() { return getToken(LexerParser.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(LexerParser.SEMICOLON, 0); }
		public TerminalNode FLOAT() { return getToken(LexerParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(LexerParser.INT, 0); }
		public Exp_aContext exp_a() {
			return getRuleContext(Exp_aContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LexerParser.COMMA, 0); }
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexerListener ) ((LexerListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexerListener ) ((LexerListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexerVisitor ) return ((LexerVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_asignacion);
		try {
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				match(ID);
				setState(143);
				match(ASSIGN);
				setState(148);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(144);
					match(FLOAT);
					}
					break;
				case 2:
					{
					setState(145);
					match(ID);
					}
					break;
				case 3:
					{
					setState(146);
					match(INT);
					}
					break;
				case 4:
					{
					setState(147);
					exp_a();
					}
					break;
				}
				setState(150);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				match(ID);
				setState(152);
				match(ASSIGN);
				setState(157);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(153);
					match(FLOAT);
					}
					break;
				case 2:
					{
					setState(154);
					match(ID);
					}
					break;
				case 3:
					{
					setState(155);
					match(INT);
					}
					break;
				case 4:
					{
					setState(156);
					exp_a();
					}
					break;
				}
				setState(159);
				match(COMMA);
				setState(160);
				asignacion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				match(ID);
				setState(162);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(163);
				match(ID);
				setState(164);
				match(COMMA);
				setState(165);
				asignacion();
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

	public static class ListaIDContext extends ParserRuleContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LexerParser.SEMICOLON, 0); }
		public TerminalNode COMMA() { return getToken(LexerParser.COMMA, 0); }
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public Declaracion_solaContext declaracion_sola() {
			return getRuleContext(Declaracion_solaContext.class,0);
		}
		public ListaIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexerListener ) ((LexerListener)listener).enterListaID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexerListener ) ((LexerListener)listener).exitListaID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexerVisitor ) return ((LexerVisitor<? extends T>)visitor).visitListaID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaIDContext listaID() throws RecognitionException {
		ListaIDContext _localctx = new ListaIDContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_listaID);
		try {
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				declaracion();
				setState(169);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				declaracion();
				setState(172);
				match(COMMA);
				setState(173);
				asignacion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				declaracion_sola();
				setState(176);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(178);
				declaracion_sola();
				setState(179);
				asignacion();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(181);
				asignacion();
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

	public static class Exp_lContext extends ParserRuleContext {
		public TerminalNode LOGIC() { return getToken(LexerParser.LOGIC, 0); }
		public List<TerminalNode> ID() { return getTokens(LexerParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LexerParser.ID, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(LexerParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(LexerParser.FLOAT, i);
		}
		public List<TerminalNode> INT() { return getTokens(LexerParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(LexerParser.INT, i);
		}
		public Exp_lContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_l; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexerListener ) ((LexerListener)listener).enterExp_l(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexerListener ) ((LexerListener)listener).exitExp_l(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexerVisitor ) return ((LexerVisitor<? extends T>)visitor).visitExp_l(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_lContext exp_l() throws RecognitionException {
		Exp_lContext _localctx = new Exp_lContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_exp_l);
		int _la;
		try {
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << ID))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(185);
				match(LOGIC);
				setState(186);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << ID))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				match(T__3);
				setState(188);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << ID))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(189);
				match(LOGIC);
				setState(190);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << ID))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(191);
				match(T__4);
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

	public static class If_Context extends ParserRuleContext {
		public TerminalNode IF() { return getToken(LexerParser.IF, 0); }
		public Exp_lContext exp_l() {
			return getRuleContext(Exp_lContext.class,0);
		}
		public KeyinstContext keyinst() {
			return getRuleContext(KeyinstContext.class,0);
		}
		public Else_Context else_() {
			return getRuleContext(Else_Context.class,0);
		}
		public If_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexerListener ) ((LexerListener)listener).enterIf_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexerListener ) ((LexerListener)listener).exitIf_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexerVisitor ) return ((LexerVisitor<? extends T>)visitor).visitIf_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_Context if_() throws RecognitionException {
		If_Context _localctx = new If_Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_if_);
		try {
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				match(IF);
				setState(195);
				match(T__3);
				setState(196);
				exp_l();
				setState(197);
				match(T__4);
				setState(198);
				keyinst();
				setState(199);
				else_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				match(IF);
				setState(202);
				match(T__3);
				setState(203);
				exp_l();
				setState(204);
				match(T__4);
				setState(205);
				keyinst();
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

	public static class FunctionAuxContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LexerParser.ID, 0); }
		public TerminalNode COMMA() { return getToken(LexerParser.COMMA, 0); }
		public FunctionAuxContext functionAux() {
			return getRuleContext(FunctionAuxContext.class,0);
		}
		public FunctionAuxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionAux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexerListener ) ((LexerListener)listener).enterFunctionAux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexerListener ) ((LexerListener)listener).exitFunctionAux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexerVisitor ) return ((LexerVisitor<? extends T>)visitor).visitFunctionAux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionAuxContext functionAux() throws RecognitionException {
		FunctionAuxContext _localctx = new FunctionAuxContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionAux);
		try {
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				match(ID);
				setState(211);
				match(COMMA);
				setState(212);
				functionAux();
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

	public static class Else_Context extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(LexerParser.ELSE, 0); }
		public KeyinstContext keyinst() {
			return getRuleContext(KeyinstContext.class,0);
		}
		public Else_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexerListener ) ((LexerListener)listener).enterElse_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexerListener ) ((LexerListener)listener).exitElse_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexerVisitor ) return ((LexerVisitor<? extends T>)visitor).visitElse_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_Context else_() throws RecognitionException {
		Else_Context _localctx = new Else_Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_else_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(ELSE);
			setState(217);
			keyinst();
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

	public static class Function_Context extends ParserRuleContext {
		public List<Declaracion_solaContext> declaracion_sola() {
			return getRuleContexts(Declaracion_solaContext.class);
		}
		public Declaracion_solaContext declaracion_sola(int i) {
			return getRuleContext(Declaracion_solaContext.class,i);
		}
		public KeyinstContext keyinst() {
			return getRuleContext(KeyinstContext.class,0);
		}
		public TerminalNode ID() { return getToken(LexerParser.ID, 0); }
		public FunctionAuxContext functionAux() {
			return getRuleContext(FunctionAuxContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LexerParser.SEMICOLON, 0); }
		public Function_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexerListener ) ((LexerListener)listener).enterFunction_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexerListener ) ((LexerListener)listener).exitFunction_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexerVisitor ) return ((LexerVisitor<? extends T>)visitor).visitFunction_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_Context function_() throws RecognitionException {
		Function_Context _localctx = new Function_Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_function_);
		try {
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				declaracion_sola();
				setState(220);
				match(T__3);
				setState(221);
				match(T__4);
				setState(222);
				keyinst();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				declaracion_sola();
				setState(225);
				match(T__3);
				setState(226);
				declaracion_sola();
				setState(227);
				match(T__4);
				setState(228);
				keyinst();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				declaracion_sola();
				setState(231);
				match(T__3);
				setState(232);
				declaracion_sola();
				setState(233);
				match(T__4);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(235);
				match(ID);
				setState(236);
				match(T__3);
				setState(237);
				functionAux();
				setState(238);
				match(T__4);
				setState(239);
				match(SEMICOLON);
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

	public static class For_Context extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(LexerParser.FOR, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(LexerParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(LexerParser.SEMICOLON, i);
		}
		public KeyinstContext keyinst() {
			return getRuleContext(KeyinstContext.class,0);
		}
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(LexerParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LexerParser.ID, i);
		}
		public TerminalNode ASSIGN() { return getToken(LexerParser.ASSIGN, 0); }
		public Exp_lContext exp_l() {
			return getRuleContext(Exp_lContext.class,0);
		}
		public Exp_aContext exp_a() {
			return getRuleContext(Exp_aContext.class,0);
		}
		public TerminalNode FLOAT() { return getToken(LexerParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(LexerParser.INT, 0); }
		public For_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexerListener ) ((LexerListener)listener).enterFor_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexerListener ) ((LexerListener)listener).exitFor_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexerVisitor ) return ((LexerVisitor<? extends T>)visitor).visitFor_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_Context for_() throws RecognitionException {
		For_Context _localctx = new For_Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_for_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(FOR);
			setState(244);
			match(T__3);
			setState(250);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMICOLON:
				{
				}
				break;
			case DATATYPE:
				{
				setState(246);
				declaracion();
				}
				break;
			case ID:
				{
				setState(247);
				match(ID);
				setState(248);
				match(ASSIGN);
				setState(249);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << ID))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(252);
			match(SEMICOLON);
			setState(255);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case INT:
			case FLOAT:
			case ID:
				{
				setState(253);
				exp_l();
				}
				break;
			case SEMICOLON:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(257);
			match(SEMICOLON);
			setState(260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case ID:
				{
				setState(258);
				exp_a();
				}
				break;
			case T__4:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(262);
			match(T__4);
			setState(263);
			keyinst();
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

	public static class List_exp_lContext extends ParserRuleContext {
		public Exp_lContext exp_l() {
			return getRuleContext(Exp_lContext.class,0);
		}
		public TerminalNode COMP() { return getToken(LexerParser.COMP, 0); }
		public List_exp_lContext list_exp_l() {
			return getRuleContext(List_exp_lContext.class,0);
		}
		public TerminalNode ID() { return getToken(LexerParser.ID, 0); }
		public TerminalNode INT() { return getToken(LexerParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(LexerParser.FLOAT, 0); }
		public List_exp_lContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_exp_l; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexerListener ) ((LexerListener)listener).enterList_exp_l(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexerListener ) ((LexerListener)listener).exitList_exp_l(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexerVisitor ) return ((LexerVisitor<? extends T>)visitor).visitList_exp_l(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_exp_lContext list_exp_l() throws RecognitionException {
		List_exp_lContext _localctx = new List_exp_lContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_list_exp_l);
		try {
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				exp_l();
				setState(266);
				match(COMP);
				setState(267);
				list_exp_l();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(269);
					exp_l();
					}
					break;
				case 2:
					{
					setState(270);
					match(ID);
					}
					break;
				case 3:
					{
					setState(271);
					match(INT);
					}
					break;
				case 4:
					{
					setState(272);
					match(FLOAT);
					}
					break;
				}
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

	public static class While_Context extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(LexerParser.WHILE, 0); }
		public List_exp_lContext list_exp_l() {
			return getRuleContext(List_exp_lContext.class,0);
		}
		public KeyinstContext keyinst() {
			return getRuleContext(KeyinstContext.class,0);
		}
		public While_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexerListener ) ((LexerListener)listener).enterWhile_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexerListener ) ((LexerListener)listener).exitWhile_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexerVisitor ) return ((LexerVisitor<? extends T>)visitor).visitWhile_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_Context while_() throws RecognitionException {
		While_Context _localctx = new While_Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_while_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(WHILE);
			setState(278);
			match(T__3);
			setState(279);
			list_exp_l();
			setState(280);
			match(T__4);
			setState(281);
			keyinst();
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

	public static class EstructurasContext extends ParserRuleContext {
		public If_Context if_() {
			return getRuleContext(If_Context.class,0);
		}
		public For_Context for_() {
			return getRuleContext(For_Context.class,0);
		}
		public Function_Context function_() {
			return getRuleContext(Function_Context.class,0);
		}
		public While_Context while_() {
			return getRuleContext(While_Context.class,0);
		}
		public EstructurasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estructuras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexerListener ) ((LexerListener)listener).enterEstructuras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexerListener ) ((LexerListener)listener).exitEstructuras(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexerVisitor ) return ((LexerVisitor<? extends T>)visitor).visitEstructuras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EstructurasContext estructuras() throws RecognitionException {
		EstructurasContext _localctx = new EstructurasContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_estructuras);
		try {
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				if_();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				for_();
				}
				break;
			case T__3:
			case INT:
			case FLOAT:
			case DATATYPE:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(285);
				function_();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(286);
				while_();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30\u0124\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3/\n\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4>\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\5\4K\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4U\n\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5_\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5k\n\5\3\5\3\5\3\5\3\5\3\5\5\5r\n\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6{\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0085\n\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\5\7\u008f\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0097"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a0\n\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\b\u00a9\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t\u00b9\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00c3\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00d2"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\5\f\u00d9\n\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u00f4\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u00fd\n\17\3\17\3\17\3\17\5\17\u0102\n\17\3\17\3\17\3\17\5\17\u0107"+
		"\n\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0114"+
		"\n\20\5\20\u0116\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\5\22\u0122\n\22\3\22\2\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"\2\4\4\2\b\t\27\27\4\2\f\f\16\16\2\u014c\2$\3\2\2\2\4.\3\2\2\2\6T\3\2"+
		"\2\2\bq\3\2\2\2\n\u0084\3\2\2\2\f\u008e\3\2\2\2\16\u00a8\3\2\2\2\20\u00b8"+
		"\3\2\2\2\22\u00c2\3\2\2\2\24\u00d1\3\2\2\2\26\u00d8\3\2\2\2\30\u00da\3"+
		"\2\2\2\32\u00f3\3\2\2\2\34\u00f5\3\2\2\2\36\u0115\3\2\2\2 \u0117\3\2\2"+
		"\2\"\u0121\3\2\2\2$%\5\4\3\2%\3\3\2\2\2&/\5\"\22\2\'(\5\"\22\2()\5\4\3"+
		"\2)/\3\2\2\2*/\5\20\t\2+,\5\20\t\2,-\5\4\3\2-/\3\2\2\2.&\3\2\2\2.\'\3"+
		"\2\2\2.*\3\2\2\2.+\3\2\2\2/\5\3\2\2\2\60U\5\20\t\2\61\62\7\3\2\2\62\63"+
		"\5\4\3\2\63\64\7\4\2\2\64\65\5\4\3\2\65U\3\2\2\2\66\67\7\3\2\2\67=\5\4"+
		"\3\289\7\5\2\29:\t\2\2\2:>\7\n\2\2;<\7\5\2\2<>\7\n\2\2=8\3\2\2\2=;\3\2"+
		"\2\2>?\3\2\2\2?@\7\4\2\2@A\5\4\3\2AU\3\2\2\2BU\3\2\2\2CD\7\3\2\2DJ\5\4"+
		"\3\2EF\7\5\2\2FG\t\2\2\2GK\7\n\2\2HI\7\5\2\2IK\7\n\2\2JE\3\2\2\2JH\3\2"+
		"\2\2KL\3\2\2\2LM\7\4\2\2MU\3\2\2\2NO\7\3\2\2OP\5\4\3\2PQ\7\4\2\2QU\3\2"+
		"\2\2RS\7\3\2\2SU\7\4\2\2T\60\3\2\2\2T\61\3\2\2\2T\66\3\2\2\2TB\3\2\2\2"+
		"TC\3\2\2\2TN\3\2\2\2TR\3\2\2\2U\7\3\2\2\2V_\7\27\2\2W_\7\t\2\2X_\7\b\2"+
		"\2YZ\7\27\2\2Z[\7\6\2\2[\\\5\26\f\2\\]\7\7\2\2]_\3\2\2\2^V\3\2\2\2^W\3"+
		"\2\2\2^X\3\2\2\2^Y\3\2\2\2_`\3\2\2\2`j\t\3\2\2ak\5\b\5\2bk\7\27\2\2ck"+
		"\7\t\2\2dk\7\b\2\2ef\7\27\2\2fg\7\6\2\2gh\5\26\f\2hi\7\7\2\2ik\3\2\2\2"+
		"ja\3\2\2\2jb\3\2\2\2jc\3\2\2\2jd\3\2\2\2je\3\2\2\2kr\3\2\2\2lm\7\27\2"+
		"\2mr\7\25\2\2no\7\27\2\2op\7\26\2\2pr\7\27\2\2q^\3\2\2\2ql\3\2\2\2qn\3"+
		"\2\2\2r\t\3\2\2\2st\7\20\2\2tu\7\27\2\2uz\7\f\2\2v{\7\t\2\2w{\7\b\2\2"+
		"x{\7\27\2\2y{\5\b\5\2zv\3\2\2\2zw\3\2\2\2zx\3\2\2\2zy\3\2\2\2{\u0085\3"+
		"\2\2\2|}\7\20\2\2}~\7\27\2\2~\177\7\f\2\2\177\u0080\7\27\2\2\u0080\u0081"+
		"\7\6\2\2\u0081\u0082\5\26\f\2\u0082\u0083\7\7\2\2\u0083\u0085\3\2\2\2"+
		"\u0084s\3\2\2\2\u0084|\3\2\2\2\u0085\13\3\2\2\2\u0086\u0087\7\20\2\2\u0087"+
		"\u008f\7\27\2\2\u0088\u0089\7\20\2\2\u0089\u008a\7\27\2\2\u008a\u008b"+
		"\7\13\2\2\u008b\u008f\5\f\7\2\u008c\u008f\5\b\5\2\u008d\u008f\3\2\2\2"+
		"\u008e\u0086\3\2\2\2\u008e\u0088\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008d"+
		"\3\2\2\2\u008f\r\3\2\2\2\u0090\u0091\7\27\2\2\u0091\u0096\7\f\2\2\u0092"+
		"\u0097\7\t\2\2\u0093\u0097\7\27\2\2\u0094\u0097\7\b\2\2\u0095\u0097\5"+
		"\b\5\2\u0096\u0092\3\2\2\2\u0096\u0093\3\2\2\2\u0096\u0094\3\2\2\2\u0096"+
		"\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u00a9\7\n\2\2\u0099\u009a\7\27"+
		"\2\2\u009a\u009f\7\f\2\2\u009b\u00a0\7\t\2\2\u009c\u00a0\7\27\2\2\u009d"+
		"\u00a0\7\b\2\2\u009e\u00a0\5\b\5\2\u009f\u009b\3\2\2\2\u009f\u009c\3\2"+
		"\2\2\u009f\u009d\3\2\2\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a2\7\13\2\2\u00a2\u00a9\5\16\b\2\u00a3\u00a4\7\27\2\2\u00a4\u00a9"+
		"\7\n\2\2\u00a5\u00a6\7\27\2\2\u00a6\u00a7\7\13\2\2\u00a7\u00a9\5\16\b"+
		"\2\u00a8\u0090\3\2\2\2\u00a8\u0099\3\2\2\2\u00a8\u00a3\3\2\2\2\u00a8\u00a5"+
		"\3\2\2\2\u00a9\17\3\2\2\2\u00aa\u00ab\5\n\6\2\u00ab\u00ac\7\n\2\2\u00ac"+
		"\u00b9\3\2\2\2\u00ad\u00ae\5\n\6\2\u00ae\u00af\7\13\2\2\u00af\u00b0\5"+
		"\16\b\2\u00b0\u00b9\3\2\2\2\u00b1\u00b2\5\f\7\2\u00b2\u00b3\7\n\2\2\u00b3"+
		"\u00b9\3\2\2\2\u00b4\u00b5\5\f\7\2\u00b5\u00b6\5\16\b\2\u00b6\u00b9\3"+
		"\2\2\2\u00b7\u00b9\5\16\b\2\u00b8\u00aa\3\2\2\2\u00b8\u00ad\3\2\2\2\u00b8"+
		"\u00b1\3\2\2\2\u00b8\u00b4\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\21\3\2\2"+
		"\2\u00ba\u00bb\t\2\2\2\u00bb\u00bc\7\17\2\2\u00bc\u00c3\t\2\2\2\u00bd"+
		"\u00be\7\6\2\2\u00be\u00bf\t\2\2\2\u00bf\u00c0\7\17\2\2\u00c0\u00c1\t"+
		"\2\2\2\u00c1\u00c3\7\7\2\2\u00c2\u00ba\3\2\2\2\u00c2\u00bd\3\2\2\2\u00c3"+
		"\23\3\2\2\2\u00c4\u00c5\7\21\2\2\u00c5\u00c6\7\6\2\2\u00c6\u00c7\5\22"+
		"\n\2\u00c7\u00c8\7\7\2\2\u00c8\u00c9\5\6\4\2\u00c9\u00ca\5\30\r\2\u00ca"+
		"\u00d2\3\2\2\2\u00cb\u00cc\7\21\2\2\u00cc\u00cd\7\6\2\2\u00cd\u00ce\5"+
		"\22\n\2\u00ce\u00cf\7\7\2\2\u00cf\u00d0\5\6\4\2\u00d0\u00d2\3\2\2\2\u00d1"+
		"\u00c4\3\2\2\2\u00d1\u00cb\3\2\2\2\u00d2\25\3\2\2\2\u00d3\u00d9\7\27\2"+
		"\2\u00d4\u00d5\7\27\2\2\u00d5\u00d6\7\13\2\2\u00d6\u00d9\5\26\f\2\u00d7"+
		"\u00d9\3\2\2\2\u00d8\u00d3\3\2\2\2\u00d8\u00d4\3\2\2\2\u00d8\u00d7\3\2"+
		"\2\2\u00d9\27\3\2\2\2\u00da\u00db\7\22\2\2\u00db\u00dc\5\6\4\2\u00dc\31"+
		"\3\2\2\2\u00dd\u00de\5\f\7\2\u00de\u00df\7\6\2\2\u00df\u00e0\7\7\2\2\u00e0"+
		"\u00e1\5\6\4\2\u00e1\u00f4\3\2\2\2\u00e2\u00e3\5\f\7\2\u00e3\u00e4\7\6"+
		"\2\2\u00e4\u00e5\5\f\7\2\u00e5\u00e6\7\7\2\2\u00e6\u00e7\5\6\4\2\u00e7"+
		"\u00f4\3\2\2\2\u00e8\u00e9\5\f\7\2\u00e9\u00ea\7\6\2\2\u00ea\u00eb\5\f"+
		"\7\2\u00eb\u00ec\7\7\2\2\u00ec\u00f4\3\2\2\2\u00ed\u00ee\7\27\2\2\u00ee"+
		"\u00ef\7\6\2\2\u00ef\u00f0\5\26\f\2\u00f0\u00f1\7\7\2\2\u00f1\u00f2\7"+
		"\n\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00dd\3\2\2\2\u00f3\u00e2\3\2\2\2\u00f3"+
		"\u00e8\3\2\2\2\u00f3\u00ed\3\2\2\2\u00f4\33\3\2\2\2\u00f5\u00f6\7\23\2"+
		"\2\u00f6\u00fc\7\6\2\2\u00f7\u00fd\3\2\2\2\u00f8\u00fd\5\n\6\2\u00f9\u00fa"+
		"\7\27\2\2\u00fa\u00fb\7\f\2\2\u00fb\u00fd\t\2\2\2\u00fc\u00f7\3\2\2\2"+
		"\u00fc\u00f8\3\2\2\2\u00fc\u00f9\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0101"+
		"\7\n\2\2\u00ff\u0102\5\22\n\2\u0100\u0102\3\2\2\2\u0101\u00ff\3\2\2\2"+
		"\u0101\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0106\7\n\2\2\u0104\u0107"+
		"\5\b\5\2\u0105\u0107\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0105\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108\u0109\7\7\2\2\u0109\u010a\5\6\4\2\u010a\35\3\2\2"+
		"\2\u010b\u010c\5\22\n\2\u010c\u010d\7\r\2\2\u010d\u010e\5\36\20\2\u010e"+
		"\u0116\3\2\2\2\u010f\u0114\5\22\n\2\u0110\u0114\7\27\2\2\u0111\u0114\7"+
		"\b\2\2\u0112\u0114\7\t\2\2\u0113\u010f\3\2\2\2\u0113\u0110\3\2\2\2\u0113"+
		"\u0111\3\2\2\2\u0113\u0112\3\2\2\2\u0114\u0116\3\2\2\2\u0115\u010b\3\2"+
		"\2\2\u0115\u0113\3\2\2\2\u0116\37\3\2\2\2\u0117\u0118\7\24\2\2\u0118\u0119"+
		"\7\6\2\2\u0119\u011a\5\36\20\2\u011a\u011b\7\7\2\2\u011b\u011c\5\6\4\2"+
		"\u011c!\3\2\2\2\u011d\u0122\5\24\13\2\u011e\u0122\5\34\17\2\u011f\u0122"+
		"\5\32\16\2\u0120\u0122\5 \21\2\u0121\u011d\3\2\2\2\u0121\u011e\3\2\2\2"+
		"\u0121\u011f\3\2\2\2\u0121\u0120\3\2\2\2\u0122#\3\2\2\2\32.=JT^jqz\u0084"+
		"\u008e\u0096\u009f\u00a8\u00b8\u00c2\u00d1\u00d8\u00f3\u00fc\u0101\u0106"+
		"\u0113\u0115\u0121";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}