package tech.gb.btgpactual.microservice.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.repository.MongoRepository;
import tech.gb.btgpactual.microservice.entity.OrderEntity;

public interface OrderRepository extends MongoRepository<OrderEntity, Long>{

    Page<OrderEntity> findAllByCustomerId(Long customerId, PageRequest pageRequest);
}
    