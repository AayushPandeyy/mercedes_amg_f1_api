package com.example.astened.mercedesamg_petronas_f1.services;

import com.example.astened.mercedesamg_petronas_f1.entity.Drivers;
import com.example.astened.mercedesamg_petronas_f1.repository.DriverRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DriverServicesImpl implements DriverServices{

    private final DriverRepository driverRepository;

    public DriverServicesImpl(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }

    @Override
    public Drivers createDriver(Drivers drivers) {
        drivers = driverRepository.save(drivers);
        return drivers;
    }

    @Override
    public Drivers getById(Long id) {
        Drivers drivers = driverRepository.findById(id).orElseThrow(()->new RuntimeException("Driver Not Found"));
        return drivers;
    }

    @Override
    public List<Drivers> getAll() {
        List<Drivers> driversList= driverRepository.findAll(Sort.by("points").descending()).stream().collect(Collectors.toList());
        return driversList;
    }

    @Override
    public Drivers updateDriver(Drivers drivers) {
        Drivers driver = getById(drivers.getId());
        driver.setId(drivers.getId());
        driverRepository.save(drivers);
        return driver;
    }

    @Override
    public Drivers getByDriverId(String driverId) {
        Drivers drivers = driverRepository.getDriversByDriverId(driverId);
        return drivers;
    }

    @Override
    public void deleteById(Long id) {
            driverRepository.deleteById(id);
    }
}
