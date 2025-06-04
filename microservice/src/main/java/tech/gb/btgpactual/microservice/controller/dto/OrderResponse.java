package tech.gb.btgpactual.microservice.controller.dto;

import java.math.BigDecimal;
import tech.gb.btgpactual.microservice.entity.OrderEntity;

public record OrderResponse(Long orderId, Long customerId, BigDecimal total) {

    public static OrderResponse fromEntity(OrderEntity entity) {
        return new OrderResponse(entity.getOrderId(), entity.getCustomerId(), entity.getTotal());
    }
}
