package semana09.ejercicios.ejercicio3.model;

public class Producto {

    private int idProducto;
    private String nombre;
    private double precio;
    private String estado;

    private Categoria categoria;

    public Producto() {
    }

    public Producto(
            int idProducto,
            String nombre,
            double precio,
            String estado,
            Categoria categoria) {

        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.estado = estado;
        this.categoria = categoria;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return idProducto + " - " + nombre;
    }
}