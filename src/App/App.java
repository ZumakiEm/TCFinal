//package App;

import org.antlr.runtime.tree.TreeWizard.Visitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // create a CharStream that reads from file
        CharStream input = CharStreams.fromFileName("src/App/codigoEjemplo.txt");

        // create a lexer that feeds off of input CharStream
        RulesLexer lexer = new RulesLexer(input);
        
        // genera los tokens sacados del lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        // toma los tokens del codigo
        RulesParser parser = new RulesParser(tokens);
                
        // Solicito al parser que comience indicando una regla gramatical
        // En este caso la regla es el simbolo inicial
        //parser.programa();

        /* CODIGO CORRESPONDIENTE AL USO DE LISTENER */
        // Creo el objeto que tiene los Listeners
        RulesBaseListener escucha = new MiListener(parser);

        // Conecto el objeto con Listeners al parser
        parser.addParseListener(escucha);

        // Solicito al parser que comience indicando una regla gramatical
        // En este caso la regla es el simbolo inicial
        ParseTree tree = parser.programa();

        // Imprime tabla de simbolos
        System.out.println(escucha);

        MiVisitor visitor = new MiVisitor();
        if (!ErrorReporter.getInstance().thereIsError()){
            // codigo de 3 direccion
            visitor.visit(tree);
            visitor.printCode();
        }
        // Imprime el arbol obtenido
        //System.out.println(tree.toStringTree(parser));

    }
}
