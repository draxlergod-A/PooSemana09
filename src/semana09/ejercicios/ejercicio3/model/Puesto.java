package semana09.ejercicios.ejercicio3.model;

public class Puesto {

    private int idPuesto;
    private String descripcion;
    private double sueldo;

    public Puesto() {
    }

    public Puesto(int idPuesto, String descripcion, double sueldo) {
        this.idPuesto = idPuesto;
        this.descripcion = descripcion;
        this.sueldo = sueldo;
    }

    public int getIdPuesto() {
        return idPuesto;
    }

    public void setIdPuesto(int idPuesto) {
        this.idPuesto = idPuesto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return idPuesto + " - " + descripcion;
    }
    
}