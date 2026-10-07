package semana09.ejercicios.ejercicio3.model;

public class PedidoDetalle {

    private Producto producto;
    private int cantidad;
    private double importe;

    public PedidoDetalle() {
    }

    public PedidoDetalle(Producto producto, int cantidad) {

        this.producto = producto;
        this.cantidad = cantidad;

        this.importe =
                producto.getPrecio() * cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;

        if (producto != null) {
            importe = producto.getPrecio() * cantidad;
        }
    }

    public double getImporte() {
        return importe;
    }
}