package tech.gb.btgpactual.microservice.dto;

import java.math.BigDecimal;
import java.util.List;

public record OrderCreatedEvent(Long codigoPedido, Long codigoCliente, BigDecimal valorTotal, List<OrderItemEvent> itens) {

}
