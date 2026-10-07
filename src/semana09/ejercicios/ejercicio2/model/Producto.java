package semana09.ejercicios.ejercicio2.model;

import java.util.ArrayList;

public class Producto {

    private int idProducto;
    private String nombre;
    private int cantidadFabricada;
    private double costoFabricacion;

    private ArrayList<DetalleProducto> detalles;

    public Producto() {
        detalles = new ArrayList<>();
    }

    public Producto(int idProducto, String nombre,
                    int cantidadFabricada,
                    double costoFabricacion) {

        this.idProducto = idProducto;
        this.nombre = nombre;
        this.cantidadFabricada = cantidadFabricada;
        this.costoFabricacion = costoFabricacion;

        detalles = new ArrayList<>();
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

    public int getCantidadFabricada() {
        return cantidadFabricada;
    }

    public void setCantidadFabricada(int cantidadFabricada) {
        this.cantidadFabricada = cantidadFabricada;
    }

    public double getCostoFabricacion() {
        return costoFabricacion;
    }

    public void setCostoFabricacion(double costoFabricacion) {
        this.costoFabricacion = costoFabricacion;
    }

    public ArrayList<DetalleProducto> getDetalles() {
        return detalles;
    }

    public void agregarDetalle(DetalleProducto detalle) {
        detalles.add(detalle);
    }

    @Override
    public String toString() {
        return idProducto + " - " + nombre;
    }
}