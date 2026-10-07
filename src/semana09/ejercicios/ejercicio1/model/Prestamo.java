package semana09.ejercicios.ejercicio1.model;

public class Prestamo {

    private int idPrestamo;
    private double importe;
    private String fecha;

    private Cliente cliente;

    public Prestamo() {
    }

    public Prestamo(int idPrestamo, double importe,
                    String fecha, Cliente cliente) {

        this.idPrestamo = idPrestamo;
        this.importe = importe;
        this.fecha = fecha;
        this.cliente = cliente;
    }

    public int getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}