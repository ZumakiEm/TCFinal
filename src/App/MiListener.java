//package App;

import SimbolTable.*;
import java.util.LinkedList;

public class MiListener extends RulesBaseListener {
    private TablaSimbolos tablaSimbolos = TablaSimbolos.getInstance();
    private int cantidadNodos;

    public MiListener() {
        cantidadNodos = 0;
    }
    @Override
    public void enterInstruccion(RulesParser.InstruccionContext ctx) {
        //cantidadNodos++;
        //System.out.println("Encontre una instruccion " + ctx.getText() );
    }

    @Override 
    public void enterAmbito(RulesParser.AmbitoContext ctx) {
        cantidadNodos++;
        //System.out.println("contexto nuevo " + ctx.getParent() );
        //System.out.println("    --> " + ctx.getParent().getText() );
        //System.out.println("\r\n");

        this.tablaSimbolos.addContext();

        if (ctx.getParent().getClass().equals(RulesParser.Definicion_funcionContext.class)) {
            RulesParser.Definicion_funcionContext fnctx = (RulesParser.Definicion_funcionContext) ctx.getParent();
            Funcion funcion = ProcessDataParser.getDataFuncion(fnctx);
            
            this.tablaSimbolos.addFuncion(funcion);

            if (fnctx.param_definicion().getChildCount() != 0) {
                for (Id param : funcion.getParametros()) {
                    this.tablaSimbolos.addId(param);
                }
            }
        }
    }

    @Override
    public void exitAmbito(RulesParser.AmbitoContext ctx) {
        this.tablaSimbolos.removeContext();
    }

    @Override
    public void exitDeclaracion(RulesParser.DeclaracionContext ctx) {
        RulesParser.Lista_declaracionContext lista = ctx.lista_declaracion();
        while (lista != null) {
            if (lista.asignacion() == null) {
                Id id = new Variable(lista.ID().getText(), ctx.tipos().getText());
                if (!this.tablaSimbolos.isVariableDeclared(id)) {
                    this.tablaSimbolos.addId(id);
                }
                else {
                    // aca va el error
                }
            }
            lista = lista.lista_declaracion();
        }
    }

    @Override
    public void exitLista_declaracion(RulesParser.Lista_declaracionContext ctx) {
        System.out.println("\nlistas-> " + (ctx.lista_declaracion() == null));
    }

    @Override
    public void exitAsignacion(RulesParser.AsignacionContext ctx) {
        Id variable = this.tablaSimbolos.searchVariable(ctx.ID().getText());
        int linea = ctx.getStart().getLine(); // el numero de linea es para el parser error

        if (ctx.getParent().getClass().equals(RulesParser.Lista_declaracionContext.class)) {
            RulesParser.Lista_declaracionContext lista = (RulesParser.Lista_declaracionContext) ctx.getParent();
            
            while(lista.getParent().getClass().equals(RulesParser.Lista_declaracionContext.class)) {
                lista = (RulesParser.Lista_declaracionContext) lista.getParent();
            }

            if (lista.getParent().getClass().equals(RulesParser.DeclaracionContext.class)) {
                String nombreVariable = ctx.ID().getText();
                String tipoVariable = ((RulesParser.DeclaracionContext) lista.getParent()).tipos().getText();
                variable = new Variable(nombreVariable, tipoVariable);
                
                if (!this.tablaSimbolos.isVariableDeclared(variable)) {
                    this.tablaSimbolos.addId(variable);
                }
                else {
                    //parser de error
                }
            }    
        }
        else if (this.tablaSimbolos.isVariableDeclared(ctx.ID().getText())) {
            this.tablaSimbolos.setUsedId(ctx.ID().getText());
        }
        else {
            //parser de error
        }
    }

    @Override 
    public void exitDeclaracion_funcion(RulesParser.Declaracion_funcionContext ctx) {
        Funcion funcion = new Funcion(ctx.tipos().getText(), ctx.ID().getText());
        LinkedList<Id> paramFuncion = new LinkedList<Id>();

        if (ProcessDataParser.validarFuncion(funcion, ctx)) {
            if(!ctx.param_declaracion().isEmpty()) {
                this.tablaSimbolos.addContext();
                paramFuncion = ProcessDataParser.getParametros(ctx.param_declaracion(), paramFuncion);
                
                for (Id id : paramFuncion) {
                    if (id.getNombre() != "") {
                        if (this.tablaSimbolos.isVariableDeclared(id)) {}//parser de error

                        this.tablaSimbolos.addId(id);
                    }
                }

                this.tablaSimbolos.removeContext();
            }

            funcion.setParametros(paramFuncion);
            this.tablaSimbolos.addFuncion(funcion);
        }
    }

    @Override
    public void exitDefinicion_funcion(RulesParser.Definicion_funcionContext ctx) {
        if (!ctx.ID().getText().equals("main")){

            if (ctx.ambito().instrucciones() != null) {
                if (ctx.ambito().instrucciones().instruccion().retorno() == null) {
                    // parser de error
                }
                else if (!ctx.tipos().getText().equals("void")){
                        //parser de error
                    }
                }
            }
    } 

    @Override
    public String toString() {
        return "soy MiListener y recorrí " + cantidadNodos + " nodos";
    }

    @Override
    public void exitPrograma(RulesParser.ProgramaContext ctx) {
        this.tablaSimbolos.print();
    }
}
