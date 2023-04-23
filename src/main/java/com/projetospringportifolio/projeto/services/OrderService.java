package com.projetospringportifolio.projeto.services;

import com.projetospringportifolio.projeto.entities.Order;
import com.projetospringportifolio.projeto.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
  @Autowired
  private OrderRepository repository;

  public List<Order> findAll(){
    return repository.findAll();
  }

  public Order findById(Long id){
    Optional<Order> obj = repository.findById(id);
    return obj.get();
  }

}
