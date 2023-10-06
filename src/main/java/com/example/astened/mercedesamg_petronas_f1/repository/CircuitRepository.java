package com.example.astened.mercedesamg_petronas_f1.repository;

import com.example.astened.mercedesamg_petronas_f1.entity.Circuit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CircuitRepository extends JpaRepository<Circuit , Long> {
}
