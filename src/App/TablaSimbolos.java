package App;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class TablaSimbolos
{
    private LinkedList<HashMap<String, Id>> tablaSimbolos;
    private LinkedList<String> contextos;
    //private HashMap<String, String> variables;
    
    public TablaSimbolos() {
        this.tablaSimbolos = new LinkedList<HashMap<String, Id>>();
        this.contextos = new LinkedList<String>();
    }

    public void addEnvironment(final String nameEnvironment) {
        this.contextos.add(nameEnvironment);
        this.tablaSimbolos.add(new HashMap<String, Id>());
    }

    public Id searchId(final Id id) {
        Iterator<HashMap<String, Id>> it = this.tablaSimbolos.descendingIterator();
        while(it.hasNext()) {
            if(it.next().containsKey(id.getNombre())) {
                return it.next().get(id.getNombre());
            }
        }
        return null;
    }
    
    public Id searchId(final String nombre) {
        Iterator<HashMap<String, Id>> it = this.tablaSimbolos.descendingIterator();
        while(it.hasNext()) {
            if(it.next().containsKey(nombre)) {
                return it.next().get(nombre);
            }
        }
        return null;
    }

    public Boolean agregarVariable(final Id id, final String contexto) {
        int indexContexto = this.contextos.indexOf(contexto);
        if(indexContexto == -1) {
            System.out.println(" Contexto " + contexto + " inexistente.");
            return false;
        }            

        // no existe el nombre del id en ese contexto?
        if(!this.tablaSimbolos.get(indexContexto).containsKey(id.getNombre())) {
            this.tablaSimbolos.get(indexContexto).put(id.getNombre(), id);
            System.out.println(" Id " + id.getNombre() + " agregada al contexto " + contexto);
            return true;
        }
        else {
            System.out.println(" Id " + id.getNombre() + " duplicada.");
            return false;
        }
    }
    
    public void asignacion(final String nombre, final String valor) {
        Id id = this.searchId(nombre);
        if(id == null) {
            System.out.println(" Variable inexistente.");
            //return false;
        }
        
        //aqui hay que validar segun el tipo de dato que sea la variable
        ArrayList<String> tiposDato = new ArrayList<String>();
        tiposDato.add("int"); 
        tiposDato.add("float"); 
        tiposDato.add("string"); 
        tiposDato.add("double"); 
        tiposDato.add("void");

        Iterator<String> it = tiposDato.iterator();
        while(it.hasNext()) {
            //if(id.getClass())
        }
    }

    /*public void asignacion(final String nombre, Object valor, final String tipoVariable) {
        boolean correcto = false;
        if (tipoVariable == null) {
            if (this.tablaSimbolos.get(nombre) == null) {
                System.out.println(" Variable " + nombre + " inexistente.");
                System.exit(1);
            }
            else {
                final String tipo = this.tablaSimbolos.get(nombre);
                if (valor.getClass() == Integer.class && tipo == "int") {
                    correcto = true;
                }
                else if (valor.getClass() == String.class && tipo == "char") {
                    correcto = true;
                }
                else if ((valor.getClass() == Float.class | valor.getClass() == Double.class) && (tipo == "double" | tipo == "float")) {
                    correcto = true;
                }
            }
        }
        else if (this.tablaSimbolos.get(nombre) == tipoVariable) {
            correcto = true;
        }
        else {
            valor = this.tablaSimbolos.get(nombre);
        }
        if (!correcto) {
            System.out.println(" Asignacion incorrecta de " + nombre + " a tipo " + valor.getClass().toString().substring(16));
            System.exit(1);
        }
    }
    
    public String getTipo(final String nombreVariable) {
        String tipo = null;
        if (this.tablaSimbolos.get(nombreVariable) == null) {
            System.out.println(" Variable " + nombreVariable + " inexistente.");
            System.exit(1);
        }
        else {
            tipo = this.tablaSimbolos.get(nombreVariable);
        }
        return tipo;
    }*/
}