package App;

import java.util.LinkedList;

public class Funcion extends Id {
    private String tipoRetornado;
    private LinkedList<String> parametros;

    public Funcion() {
        this.parametros = new LinkedList<String>();
    }

    public String getTipoRetornado() {
        return this.tipoRetornado;
    }

    public void setTipoRetornado(String tipoRetornado) {
        this.tipoRetornado = tipoRetornado;
    }

    public LinkedList<String> getParametros() {
        return this.parametros;
    }

    public void setParametros(LinkedList<String> parametros) {
        this.parametros = parametros;
    }

    public Boolean addParametro(String parametro) {
        return this.parametros.add(parametro);
    }

    public Boolean deleteParametro(String parametro) {
        return this.parametros.remove(parametro);
    }
}
