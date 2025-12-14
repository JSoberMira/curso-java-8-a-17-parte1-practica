package com.cursojava.parte1;

import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        PedidoService service = new PedidoService();

        System.out.println("=== LISTADO DE PEDIDOS ===");
        List<Pedido> pedidos = service.listarTodos();
        for (Pedido p : pedidos) {
            System.out.println(p);
        }

        System.out.println("\n=== BUSCAR PEDIDO EXISTENTE ===");
        Optional<Pedido> pedido = service.buscarPorId(1L);
        if (pedido.isPresent()) {
            System.out.println("Encontrado: " + pedido.get());
        } else {
            System.out.println("No encontrado");
        }

        System.out.println("\n=== BUSCAR PEDIDO INEXISTENTE ===");
        ResultadoBusqueda res = service.buscarDetalle(99L);
        if (res.getPedido() != null) {
            System.out.println("Detalle: " + res.getPedido());
        } else {
            System.out.println("Error: " + res.getMensajeError());
        }

        double total = 0;
        for (Pedido p : pedidos) {
            total += p.getImporte();
        }

        String informe = "==== INFORME ====\n" +
                "Total pedidos: " + pedidos.size() + "\n" +
                "Importe total: " + total + "\n";

        System.out.println("\n" + informe);
    }
}
