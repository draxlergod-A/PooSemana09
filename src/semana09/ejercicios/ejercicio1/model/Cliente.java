package semana09.ejercicios.ejercicio1.model;

import java.util.ArrayList;

public class Cliente {

    private int idCliente;
    private String apellidos;
    private String nombres;
    private String direccion;
    private String telefono;

    private ArrayList<Prestamo> prestamos;

    public Cliente() {
        prestamos = new ArrayList<>();
    }

    public Cliente(int idCliente, String apellidos, String nombres,
                   String direccion, String telefono) {

        this.idCliente = idCliente;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.direccion = direccion;
        this.telefono = telefono;

        prestamos = new ArrayList<>();
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void agregarPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
    }

    @Override
    public String toString() {
        return idCliente + " - " + nombres + " " + apellidos;
    }
}