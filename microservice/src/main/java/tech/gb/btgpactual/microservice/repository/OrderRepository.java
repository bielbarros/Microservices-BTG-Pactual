package tech.gb.btgpactual.microservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import tech.gb.btgpactual.microservice.entity.OrderEntity;

public interface OrderRepository extends MongoRepository<OrderEntity, Long>{

    
}
