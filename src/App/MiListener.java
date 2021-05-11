//package App;

import SimbolTable.*;
import org.antlr.v4.runtime.tree.TerminalNode;

public class MiListener extends RulesBaseListener {
    private TablaSimbolos tablaSimbolos = TablaSimbolos.getInstance();
    private int cantidadNodos;

    public MiListener() {
        cantidadNodos = 0;
    }

    @Override
    public void enterInstruccion(RulesParser.InstruccionContext ctx) {
        // cantidadNodos++;
        // System.out.println("Encontre una instruccion " + ctx.getText() );
    }

    @Override
    public void enterAmbito(RulesParser.AmbitoContext ctx) {
        cantidadNodos++;
        // System.out.println("contexto nuevo " + ctx.getParent() );
        // System.out.println(" --> " + ctx.getParent().getText() );
        // System.out.println("\r\n");

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
    public void visitTerminal(TerminalNode node) {
        // System.out.println("Info del token: " + node.getSymbol() );
        // System.out.println(" '--> Token: " + node.getSymbol().getText() );
        // System.out.println(" '--> N° token: " + node.getSymbol().getType() );
        // System.out.println("\r\n");
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
