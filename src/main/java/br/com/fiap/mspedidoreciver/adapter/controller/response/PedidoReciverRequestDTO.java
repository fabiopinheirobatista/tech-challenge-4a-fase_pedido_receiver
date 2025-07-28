package br.com.fiap.mspedidoreciver.adapter.controller.response;

import br.com.fiap.mspedidoreciver.core.domain.ItemPedido;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PedidoReciverRequestDTO {
    private Long id;
    private Long clienteId;
    private String numeroCartao;
    private String status;
    private LocalDateTime dataCriacao;
}
