package com.example.astened.mercedesamg_petronas_f1.services;

import com.example.astened.mercedesamg_petronas_f1.entity.Drivers;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DriverServices {

    Drivers createDriver(Drivers drivers);

    Drivers getById(Long id);

    List<Drivers> getAll();

    Drivers updateDriver(Drivers drivers);

    Drivers getByDriverId(String driverId);

    void deleteById(Long id);

}
