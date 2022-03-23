package com.backend.cursospringboot.repository;

import com.backend.cursospringboot.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
