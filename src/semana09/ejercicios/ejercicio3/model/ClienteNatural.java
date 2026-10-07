package semana09.ejercicios.ejercicio3.model;

public class ClienteNatural extends Cliente {

    private String apellidos;
    private String nombres;
    private String dni;
    private String fechaNacimiento;
    private String sexo;

    public ClienteNatural() {
    }

    public ClienteNatural(
            int idCliente,
            String direccion,
            String telefono,
            String email,
            String apellidos,
            String nombres,
            String dni,
            String fechaNacimiento,
            String sexo) {

        super(idCliente, direccion, telefono, email);

        this.apellidos = apellidos;
        this.nombres = nombres;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String getNombreCompleto() {
        return nombres + " " + apellidos;
    }

    @Override
    public String toString() {
        return getIdCliente() + " - " + getNombreCompleto();
    }
}