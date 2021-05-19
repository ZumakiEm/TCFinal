package app;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Trees;

public class Visitor extends RuleBaseVisitor<String> {
    private int count_label;
    private int count_tmp;
    private String tmp_previous;
    private String tmp_current;
    private String code;
    private boolean tmp_add;
    private HashMap<String, String> opposites;
    private String[] operators_logical;

    public Visitor() {
        this.oppositeComp = new HashMap<String, String>() {{
            put("!=", "==");
            put("==", "!=")
            put("<", ">=");
            put(">=", "<");
            put("<=", ">");
            put(">", "<=");
            ;
        }};
        this.operators_logical = new String[]{"&&", "||"};
        this.tmp_add = false;
        this.count_label = 0;
        this.count_tmp = 0;
        this.code = "";
        this.tmp_previous = "";
        this.tmp_current = "";

    }

    private List<ParseTree> getNodes(ParseTree ctx, int idx_rule) {
        return new ArrayList<ParseTree>(Trees.findAllRuleNodes(ctx, idx_rule));
    }


    private List<ParseTree> separateOR(ParseTree t) {
        List<ParseTree> nodes = new ArrayList<ParseTree>();
        List<ParseTree> aux = this.getNodes(t, RulesParser.RULE_disyuncion);
        List<ParseTree> operations = this.getNodes(t, RulesParser.RULE_factor);
        int count = 0;
        for (int i = 0; i < operations.size(); i++){
            if((FactorContext) operations.get(i).PA() != null){
                count++;
            }
        }
        int params = Trees.findAllRuleNodes(t, RulesParser.RULE_parametros).size();
        params = aux.size() == params ? 0 : params;
        for (int i = 0; i < aux.size() - params - count; i++) {
            if(aux.get(i).getChild(0) instanceof DisyuncionContext){
                nodes.add(((DisyuncionContext) aux.get(i)).conjuncion());
            }
            else {
                nodes.add(aux.get(i));
            }
        }
        Collections.reverse(nodes);
        return nodes;        
    }

    private void processOperacion(OperacionContext ctx) {
        String operator = "||";
        List<ParseTree> terminos; // separateOR
    }

    @Override
    public String visitAsignacion(RulesParser.AsignacionContext ctx) {
        List<ParseTree> fact = this.getNodes(ctx, RulesParser.RULE_factor);
        if(fact.size() == 1){
            this.code += ctx.ID.getText() + " = " + fact.get(0).getText() + "\n";
        }
        else {
            // aca cambia el codigo porque
            // en el g4 no tenemos una regla opal
            // de operacion pasamos directamente a disyuncion
            OperacionContext ctx_opal = ctx.operacion()
        }
    }
}