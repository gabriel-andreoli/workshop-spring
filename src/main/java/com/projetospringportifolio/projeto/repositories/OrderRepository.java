package com.projetospringportifolio.projeto.repositories;

import com.projetospringportifolio.projeto.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
