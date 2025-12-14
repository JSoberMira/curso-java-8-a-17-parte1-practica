package com.cursojava.parte1;

public class Pedido {

    private Long id;
    private String cliente;
    private double importe;
    private EstadoPedido estado;

    public Pedido(Long id, String cliente, double importe, EstadoPedido estado) {
        this.id = id;
        this.cliente = cliente;
        this.importe = importe;
        this.estado = estado;
    }

    public Long getId() { return id; }
    public String getCliente() { return cliente; }
    public double getImporte() { return importe; }
    public EstadoPedido getEstado() { return estado; }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", cliente='" + cliente + '\'' +
                ", importe=" + importe +
                ", estado=" + estado +
                '}';
    }
}
