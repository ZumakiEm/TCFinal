package SimbolTable;

import java.util.HashMap;
import java.util.LinkedList;

public class TablaSimbolos
{
    private LinkedList<HashMap<String, Id>> tablaSimbolos;
    private LinkedList<HashMap<String, Id>> tablaSimbolosHistorica;
    private static TablaSimbolos instance;

    public static TablaSimbolos getInstance() {
        if(instance == null)
            instance = new TablaSimbolos();

        return instance;
    }
    
    public TablaSimbolos() {
        this.tablaSimbolos = new LinkedList<HashMap<String, Id>>();
        this.tablaSimbolosHistorica = new LinkedList<HashMap<String, Id>>();
        this.addContext();
    }

    public void addContext() {
        HashMap<String, Id> context = new HashMap<String, Id>();        
        this.tablaSimbolos.add(context);
        this.tablaSimbolosHistorica.add(context);
    }

    public int getContext() {
        return this.tablaSimbolos.size();
    }

    public void removeContext() {
        this.tablaSimbolos.removeLast();
    }

    public Id searchId(final Id id) {
        for(int i = 0; i < this.tablaSimbolos.size(); i++) {
            if(this.tablaSimbolos.get(i).containsKey(id.getNombre()))
                return this.tablaSimbolos.get(i).get(id.getNombre());
        }

        return null;
    }
    
    public Id searchVariable(final String nombre) {
        for(int i = 0; i < this.tablaSimbolos.size(); i++) {
            if(this.tablaSimbolos.get(i).containsKey(nombre))
                return this.tablaSimbolos.get(i).get(nombre);
        }

        return null;
    }

    public void addId(final Id id) {
        this.tablaSimbolos.getLast().put(id.getNombre(), id);
        System.out.println("ID con el nombre: " + id.getNombre() + " fue agregado a la tabla en el contexto: " + this.tablaSimbolos.size());
        int idx = this.tablaSimbolosHistorica.size() - 1;
        this.tablaSimbolosHistorica.get(idx).put(id.getNombre(), id);
    }
    
    public Boolean asignacionId(final Id id) {
        for(int i = this.tablaSimbolos.size() - 1; i >= 0; i--) {
            if(this.tablaSimbolos.get(i).containsKey(id.getNombre())) {
                this.tablaSimbolos.get(i).replace(id.getNombre(), id);
                this.tablaSimbolosHistorica.get(i).replace(id.getNombre(), id);
                return true;
            }
        }
        return false;
    }

    public void addFuncion(final Funcion funcion) {
        this.tablaSimbolos.getLast().put(funcion.getNombre(), funcion);
        System.out.println("FUNCION con el nombre: " + funcion.getNombre() + " fue agregada a la tabla en el contexto: " + this.tablaSimbolos.size());
        if (this.tablaSimbolos.size() == 0){
            if (this.tablaSimbolosHistorica.size() > 1){
                this.tablaSimbolosHistorica.get(this.tablaSimbolosHistorica.size() - 2).put(funcion.getNombre(), funcion);
            }
            else {
                this.tablaSimbolosHistorica.get(this.tablaSimbolosHistorica.size() - 1).put(funcion.getNombre(), funcion);
            }
        }
    }

    public void addParamFuncion(final Id id) {
        // antes se tiene que agregar un contexto para la funcion
        this.tablaSimbolos.getLast().put(id.getNombre(), id);
    }

    public boolean isVariableDeclared(final Id id) {
        for(int i = this.tablaSimbolos.size() - 1; i >= 0; i--) {
            if (this.tablaSimbolos.get(i).containsKey(id.getNombre())) {
                return true;
            }
        }
        return false;
    }

    public boolean isVariableDeclared(final String nombre) {
        for(int i = this.tablaSimbolos.size() - 1; i >= 0; i--) {
            if (this.tablaSimbolos.get(i).containsKey(nombre)) {
                return true;
            }
        }
        return false;
    }

    public void setUsedId(final String nombre) {
        for (HashMap<String, Id> contexto : this.tablaSimbolos) {
            for (Id id : contexto.values()) {
                if (id.getNombre().equals(nombre))
                    id.setUsado(true);
            }
        }
    }

    public Funcion getFirmaFuncion(final Funcion function) {
        Id id = this.tablaSimbolos.getFirst().get(function.getNombre());
        
        if (id instanceof Funcion)
            return (Funcion) id;
        else
            return null; 
    }

    public void print() {
        int ctx = 1;
        System.out.println("\n=== SYMBOL TABLE ===");
        for (HashMap<String, Id> contexto : this.tablaSimbolos) {
            System.out.println("Contexto: " + ctx++ + " {");
            for (Id id : contexto.values()) {
                System.out.println("    " + id.toString());
            }
            System.out.println("}");
        }
        
        ctx = 1;
        System.out.println("\n=== HISTORICAL SYMBOL TABLE ===");
        for (HashMap<String, Id> contexto : this.tablaSimbolosHistorica) {
            System.out.println("Contexto: " + ctx++ + " {");
            for (Id id : contexto.values()) {
                System.out.println("    " + id.toString());
            }
            System.out.println("}");
        }       
    }
}