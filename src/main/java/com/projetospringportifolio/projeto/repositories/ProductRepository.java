package com.projetospringportifolio.projeto.repositories;

import com.projetospringportifolio.projeto.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
