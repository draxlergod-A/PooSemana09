package semana09.ejercicios.ejercicio3.model;

public class Categoria {

    private int idCategoria;
    private String tipo;

    public Categoria() {
    }

    public Categoria(int idCategoria, String tipo) {
        this.idCategoria = idCategoria;
        this.tipo = tipo;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return idCategoria + " - " + tipo;
    }
}