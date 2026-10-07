package semana09.ejercicios.ejercicio3.model;

public abstract class Cliente {

    private int idCliente;
    private String direccion;
    private String telefono;
    private String email;

    public Cliente() {
    }

    public Cliente(int idCliente, String direccion,
                   String telefono, String email) {

        this.idCliente = idCliente;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract String getNombreCompleto();
}