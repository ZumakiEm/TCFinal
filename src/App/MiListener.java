package App;

import org.antlr.v4.runtime.tree.TerminalNode;

public class MiListener extends LexerBaseListener {
    private int cantidadNodos;

    public MiListener() {
        cantidadNodos = 0;
    }
    
    @Override public void enterPrograma(LexerParser.ProgramaContext ctx) { }

    @Override 
    public void visitTerminal(TerminalNode node) {
        System.out.println("Encontre el terminal " + node.getSymbol() );
        System.out.println("    '--> Texto del terminal " + node.getSymbol().getText() );
        System.out.println("    '--> Tipo de terminal " + node.getSymbol().getType() );
    }

    @Override
    public String toString() {
        return "soy MiListener y visité " + cantidadNodos + " nodos";
    }
}
