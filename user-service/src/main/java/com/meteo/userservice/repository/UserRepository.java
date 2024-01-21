package com.meteo.userservice.repository;

import com.meteo.userservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // Méthodes personnalisées si nécessaire
}
