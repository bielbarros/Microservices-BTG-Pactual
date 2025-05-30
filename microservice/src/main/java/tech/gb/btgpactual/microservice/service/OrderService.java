package tech.gb.btgpactual.microservice.service;

import org.springframework.stereotype.Service;
import tech.gb.btgpactual.microservice.entity.OrderEntity;
import tech.gb.btgpactual.microservice.repository.OrderRepository;
import tech.gb.btgpactual.microservice.dto.OrderCreatedEvent;
import tech.gb.btgpactual.microservice.entity.OrderItem;
import java.util.List;
import java.math.BigDecimal;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void save(OrderCreatedEvent event) {

        var entity = new OrderEntity();
        entity.setOrderId(event.codigoPedido());
        entity.setCustomerId(event.codigoCliente());
        entity.setItems(getOrderItems(event));
        entity.setTotal(getTotal(event));
        
        orderRepository.save(entity);
    }
    
    private BigDecimal getTotal(OrderCreatedEvent event) {
        return event.itens().stream()
        .map(item -> item.preco().multiply(BigDecimal.valueOf(item.quantidade())))
        .reduce(BigDecimal::add)
        .orElse(BigDecimal.ZERO);
    }

    private static List<OrderItem> getOrderItems(OrderCreatedEvent event) {
        return event.itens().stream()
        .map(item -> new OrderItem(item.produto(), item.quantidade(), item.preco()))
        .toList();
    }
    
}
