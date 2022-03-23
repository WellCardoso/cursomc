package com.backend.cursospringboot.repository;

import com.backend.cursospringboot.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
