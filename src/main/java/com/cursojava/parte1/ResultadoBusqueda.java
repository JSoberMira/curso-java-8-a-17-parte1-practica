package com.cursojava.parte1;

public class ResultadoBusqueda {

    private Pedido pedido;
    private String mensajeError;

    public ResultadoBusqueda(Pedido pedido) {
        this.pedido = pedido;
    }

    public ResultadoBusqueda(String mensajeError) {
        this.mensajeError = mensajeError;
    }

    public Pedido getPedido() { return pedido; }
    public String getMensajeError() { return mensajeError; }
}
