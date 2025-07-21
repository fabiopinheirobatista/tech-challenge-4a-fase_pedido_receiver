package br.com.fiap.mspedidoreciver.adapter.controller;

import br.com.fiap.mspedidoreciver.adapter.controller.request.PedidoReciverResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

public interface PedidoReciverController {

    public ResponseEntity<Void> criarPedido(@RequestBody PedidoReciverResponseDTO pedido);

}
