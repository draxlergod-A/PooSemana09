package semana09.ejercicios.ejercicio3.model;

public class ClienteJuridico extends Cliente {

    private String ruc;
    private String razonSocial;
    private String fax;
    private String contacto;

    public ClienteJuridico() {
    }

    public ClienteJuridico(
            int idCliente,
            String direccion,
            String telefono,
            String email,
            String ruc,
            String razonSocial,
            String fax,
            String contacto) {

        super(idCliente, direccion, telefono, email);

        this.ruc = ruc;
        this.razonSocial = razonSocial;
        this.fax = fax;
        this.contacto = contacto;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    @Override
    public String getNombreCompleto() {
        return razonSocial;
    }

    @Override
    public String toString() {
        return getIdCliente() + " - " + razonSocial;
    }
}