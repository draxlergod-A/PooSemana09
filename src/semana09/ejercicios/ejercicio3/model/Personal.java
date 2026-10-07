package semana09.ejercicios.ejercicio3.model;

import java.util.ArrayList;

public class Personal {

    private int idPersonal;
    private String apellido;
    private String nombre;
    private String dni;
    private String fechaNacimiento;

    private Puesto puesto;

    private Personal jefe;

    private ArrayList<Personal> subordinados;

    public Personal() {
        subordinados = new ArrayList<>();
    }

    public Personal(
            int idPersonal,
            String apellido,
            String nombre,
            String dni,
            String fechaNacimiento,
            Puesto puesto) {

        this.idPersonal = idPersonal;
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.puesto = puesto;

        subordinados = new ArrayList<>();
    }

    public int getIdPersonal() {
        return idPersonal;
    }

    public void setIdPersonal(int idPersonal) {
        this.idPersonal = idPersonal;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    public Personal getJefe() {
        return jefe;
    }

    public void setJefe(Personal jefe) {
        this.jefe = jefe;
    }

    public ArrayList<Personal> getSubordinados() {
        return subordinados;
    }

    public void agregarSubordinado(Personal personal) {
        subordinados.add(personal);
        personal.setJefe(this);
    }

    @Override
    public String toString() {
        return idPersonal + " - " + nombre + " " + apellido;
    }
}