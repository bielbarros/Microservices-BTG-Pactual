package tech.gb.btgpactual.microservice.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;
import tech.gb.btgpactual.microservice.config.RabbitMqConfig;
import tech.gb.btgpactual.microservice.dto.OrderCreatedEvent;
import tech.gb.btgpactual.microservice.service.OrderService;

@Component
public class OrderCreatedListener {

    private final Logger logger = LoggerFactory.getLogger(OrderCreatedListener.class);

    private final OrderService orderService;

    public OrderCreatedListener(OrderService orderService) {
        this.orderService = orderService;
    }

    @RabbitListener(queues = RabbitMqConfig.ORDER_CREATED_QUEUE)
    public void listen(Message<OrderCreatedEvent> message) {
        logger.info("Received message: {}", message);
        orderService.save(message.getPayload());
    }
}
