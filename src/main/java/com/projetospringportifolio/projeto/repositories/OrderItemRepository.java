package com.projetospringportifolio.projeto.repositories;

import com.projetospringportifolio.projeto.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
