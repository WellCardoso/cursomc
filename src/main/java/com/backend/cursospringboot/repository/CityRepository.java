package com.backend.cursospringboot.repository;

import com.backend.cursospringboot.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
