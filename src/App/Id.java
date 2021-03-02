package App;

public class Id {
    private String nombre;
    private Boolean inicializado;
    private Boolean usado;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean isInicializado() {
        return this.inicializado;
    }

    public Boolean getInicializado() {
        return this.inicializado;
    }

    public void setInicializado(Boolean inicializado) {
        this.inicializado = inicializado;
    }

    public Boolean isUsado() {
        return this.usado;
    }

    public Boolean getUsado() {
        return this.usado;
    }

    public void setUsado(Boolean usado) {
        this.usado = usado;
    }
}
