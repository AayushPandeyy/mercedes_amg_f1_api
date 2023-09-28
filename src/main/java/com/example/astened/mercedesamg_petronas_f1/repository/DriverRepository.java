package com.example.astened.mercedesamg_petronas_f1.repository;

import com.example.astened.mercedesamg_petronas_f1.entity.Drivers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends JpaRepository<Drivers,Long> {

    Drivers getDriversByDriverId(String driver_id);

}
