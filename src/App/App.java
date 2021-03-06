package App;

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
        LexerLexer lexer = new LexerLexer(input);
        
        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        // create a parser that feeds off the tokens buffer
        LexerParser parser = new LexerParser(tokens);
                
        // Solicito al parser que comience indicando una regla gramatical
        // En este caso la regla es el simbolo inicial
        // parser.programa();

        /* CODIGO CORRESPONDIENTE AL USO DE LISTENER */
        // Creo el objeto que tiene los Listeners
        LexerBaseListener escucha = new MiListener();

        // Conecto el objeto con Listeners al parser
        parser.addParseListener(escucha);

        // Solicito al parser que comience indicando una regla gramatical
        // En este caso la regla es el simbolo inicial
        ParseTree tree = parser.programa();

        // Imprime estadisticas
        System.out.println(escucha);

        // Imprime el arbol obtenido
        System.out.println(tree.toStringTree(parser));

    }
}
