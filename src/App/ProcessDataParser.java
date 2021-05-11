import java.util.LinkedList;
import org.antlr.v4.runtime.ParserRuleContext;

import SimbolTable.*;

public class ProcessDataParser {
    
    public static Funcion getDataFuncion(RulesParser.Definicion_funcionContext ctx) {
        TablaSimbolos tablaSimbolos = TablaSimbolos.getInstance();

        String tipo = ctx.tipos().getText();
        String nombre = ctx.ID().getText();

        Funcion funcion = new Funcion(tipo, nombre);

        LinkedList<Id> parametros = new LinkedList<>();

        //si tiene parametros declarados
        if (ctx.param_definicion().getChildCount() != 0) {
            tablaSimbolos.addContext();
            parametros = getParametros(ctx.param_definicion(), parametros);

            for (int i = 0; i < parametros.size(); i++) {
                if (tablaSimbolos.isVariableDeclared(parametros.get(i)))
                    System.out.println(" Variable declarada!!!!! \r\n");
                
                tablaSimbolos.addParamFuncion(parametros.get(i));
            }
        }

        funcion.setParametros(parametros);

        //contexto global
        if (tablaSimbolos.getContext() == 1) {
            Id aux = tablaSimbolos.searchId(funcion);
            System.out.println(" ->"+ (aux != null) +"<-");
        }

        //System.out.println(" -> ("+(ctx.param_definicion().children == null)+") <- ");
        //System.out.println(" -> "+ctx.param_definicion().children+" <- ");
        return funcion;
        //if(ctx.param_definicion())
    }

    public static LinkedList<Id> getParametros(ParserRuleContext ruleCtx, LinkedList<Id> parametros) {
        //si es una definicion de una funcion
        if(ruleCtx.getClass().equals(RulesParser.Param_definicionContext.class)) {
            RulesParser.Param_definicionContext paramDefCtx = (RulesParser.Param_definicionContext) ruleCtx;
            
            // si hay al menos 2 parametros en la funcion definida
            if (paramDefCtx.param_definicion() != null) {
                Id param = new Variable(paramDefCtx.ID().getText(), paramDefCtx.tipos().getText());
                parametros.add(param);

                return getParametros(paramDefCtx.param_definicion(), parametros);
            }
            // si no hay otra regla ParamDefinicion (es el ultimo parametro de la funcion definida)
            // ej: int suma(int x, int y) -> (int y) es el ultimo parametro que se guardaria en la tabla
            else {
                Id param = new Variable(paramDefCtx.ID().getText(), paramDefCtx.tipos().getText());
                parametros.add(param);
                return parametros;
            }
        }
        // sino, por descarte es una declaracion de una funcion
        else {
            RulesParser.Param_declaracionContext paramDeclCtx = (RulesParser.Param_declaracionContext) ruleCtx;
            
            // si hay al menos 2 parametros en la funcion declarada
            if (paramDeclCtx.param_declaracion() != null) {
                Id param = new Variable(paramDeclCtx.tipos().getText(), paramDeclCtx.ID().getText());
                parametros.add(param);

                return getParametros(paramDeclCtx.param_declaracion(), parametros);
            }
            // si no hay otra regla ParamDeclaracion (es el ultimo parametro de la funcion definida)
            // ej: int suma(int x, int y) -> (int y) es el ultimo parametro que se guardaria en la tabla
            else {
                Id param = new Variable(paramDeclCtx.tipos().getText(), paramDeclCtx.ID().getText());
                parametros.add(param);

                return parametros;
            }
        }
    }
}