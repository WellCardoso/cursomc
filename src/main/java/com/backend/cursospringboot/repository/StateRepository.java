package com.backend.cursospringboot.repository;

import com.backend.cursospringboot.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
