package semana09.ejercicios.ejercicio3.model;

import java.util.ArrayList;

public class Pedido {

    private int idPedido;
    private String fecha;
    private boolean estado;

    private Cliente cliente;
    private Personal personal;

    private ArrayList<PedidoDetalle> detalles;

    public Pedido() {
        detalles = new ArrayList<>();
    }

    public Pedido(
            int idPedido,
            String fecha,
            boolean estado,
            Cliente cliente,
            Personal personal) {

        this.idPedido = idPedido;
        this.fecha = fecha;
        this.estado = estado;
        this.cliente = cliente;
        this.personal = personal;

        detalles = new ArrayList<>();
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Personal getPersonal() {
        return personal;
    }

    public ArrayList<PedidoDetalle> getDetalles() {
        return detalles;
    }

    public void agregarDetalle(PedidoDetalle detalle) {
        detalles.add(detalle);
    }

    public double calcularTotal() {

        double total = 0;

        for (PedidoDetalle detalle : detalles) {
            total += detalle.getImporte();
        }

        return total;
    }
}