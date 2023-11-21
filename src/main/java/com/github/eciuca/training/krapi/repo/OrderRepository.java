package com.github.eciuca.training.krapi.repo;

import com.github.eciuca.training.krapi.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RepositoryRestResource(path = "agents")
public interface OrderRepository extends JpaRepository<Order, Long> {

    @RestResource(path = "by-customer-id", rel = "by-customer-id")
    List<Order> findAllByCustomerId(@Param("customerId") String customerId);
    @RestResource(path = "by-agent-id", rel = "by-agent-id")
    List<Order> findAllByAgentId(@Param("agentId") String agentId);
}
