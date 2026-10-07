package semana09.ejercicios.ejercicio2.model;

public class MateriaPrima {

    private int idMateriaPrima;
    private String nombre;

    public MateriaPrima() {
    }

    public MateriaPrima(int idMateriaPrima, String nombre) {
        this.idMateriaPrima = idMateriaPrima;
        this.nombre = nombre;
    }

    public int getIdMateriaPrima() {
        return idMateriaPrima;
    }

    public void setIdMateriaPrima(int idMateriaPrima) {
        this.idMateriaPrima = idMateriaPrima;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return idMateriaPrima + " - " + nombre;
    }
}