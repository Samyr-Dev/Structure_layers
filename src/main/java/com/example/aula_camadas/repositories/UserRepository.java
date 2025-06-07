package com.example.aula_camadas.repositories;

import com.example.aula_camadas.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
