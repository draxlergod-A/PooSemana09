package semana09.ejercicios.ejercicio2.model;

public class DetalleProducto {

    private Producto producto;
    private MateriaPrima materiaPrima;
    private double cantidadUsada;

    public DetalleProducto() {
    }

    public DetalleProducto(Producto producto,
                           MateriaPrima materiaPrima,
                           double cantidadUsada) {

        this.producto = producto;
        this.materiaPrima = materiaPrima;
        this.cantidadUsada = cantidadUsada;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public MateriaPrima getMateriaPrima() {
        return materiaPrima;
    }

    public void setMateriaPrima(MateriaPrima materiaPrima) {
        this.materiaPrima = materiaPrima;
    }

    public double getCantidadUsada() {
        return cantidadUsada;
    }

    public void setCantidadUsada(double cantidadUsada) {
        this.cantidadUsada = cantidadUsada;
    }
}