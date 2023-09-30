package com.example.astened.mercedesamg_petronas_f1.repository;

import com.example.astened.mercedesamg_petronas_f1.entity.Constructors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConstructorsRepo extends JpaRepository<Constructors,Long> {


}
