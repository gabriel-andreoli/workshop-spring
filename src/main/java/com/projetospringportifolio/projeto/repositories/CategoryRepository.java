package com.projetospringportifolio.projeto.repositories;

import com.projetospringportifolio.projeto.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
