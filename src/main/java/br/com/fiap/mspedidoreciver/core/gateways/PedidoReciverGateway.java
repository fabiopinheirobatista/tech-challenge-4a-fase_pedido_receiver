package br.com.fiap.mspedidoreciver.core.gateways;

import br.com.fiap.mspedidoreciver.core.domain.Pedido;

public interface PedidoReciverGateway {

    void processarPedidoReciver(Pedido pedido);

}
