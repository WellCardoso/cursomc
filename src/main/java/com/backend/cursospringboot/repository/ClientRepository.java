package com.backend.cursospringboot.repository;

import com.backend.cursospringboot.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
