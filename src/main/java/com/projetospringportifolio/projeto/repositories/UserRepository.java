package com.projetospringportifolio.projeto.repositories;

import com.projetospringportifolio.projeto.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
