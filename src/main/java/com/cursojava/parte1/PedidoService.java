package com.cursojava.parte1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PedidoService {

    private List<Pedido> pedidos = new ArrayList<>();

    public PedidoService() {
        pedidos.add(new Pedido(1L, "Juan", 120.50, EstadoPedido.PAGADO));
        pedidos.add(new Pedido(2L, "Ana", 75.00, EstadoPedido.PENDIENTE));
        pedidos.add(new Pedido(3L, "Luis", 210.30, EstadoPedido.CANCELADO));
    }

    public List<Pedido> listarTodos() {
        return pedidos;
    }

    public Optional<Pedido> buscarPorId(Long id) {
        for (Pedido p : pedidos) {
            if (p.getId().equals(id)) {
                return Optional.of(p);
            }
        }
        return Optional.empty();
    }

    public ResultadoBusqueda buscarDetalle(Long id) {
        Optional<Pedido> pedido = buscarPorId(id);

        if (pedido.isPresent()) {
            return new ResultadoBusqueda(pedido.get());
        }
        return new ResultadoBusqueda("Pedido no encontrado");
    }
}
