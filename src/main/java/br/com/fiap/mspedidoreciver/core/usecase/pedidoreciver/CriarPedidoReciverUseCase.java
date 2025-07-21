package br.com.fiap.mspedidoreciver.core.usecase.pedidoreciver;

import br.com.fiap.mspedidoreciver.adapter.mapper.PedidoMapper;
import br.com.fiap.mspedidoreciver.adapter.persistence.entity.PedidoEntity;
import br.com.fiap.mspedidoreciver.core.domain.Pedido;
import br.com.fiap.mspedidoreciver.core.gateways.PedidoReciverGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class CriarPedidoReciverUseCase {

    private final PedidoReciverGateway pedidoReciverGateway;
    private final PedidoMapper pedidoMapper;

    public void execute(Pedido pedido) {

        pedido.setDataCriacao(LocalDateTime.now());
        PedidoEntity pedidoEntity = pedidoMapper.toPedidoEntity(pedido);
        pedidoReciverGateway.processarPedidoReciver(pedido);
    }
}
