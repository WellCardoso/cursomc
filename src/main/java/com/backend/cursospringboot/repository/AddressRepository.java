package com.backend.cursospringboot.repository;

import com.backend.cursospringboot.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
