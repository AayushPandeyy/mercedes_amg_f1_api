package com.example.astened.mercedesamg_petronas_f1.controller;

import com.example.astened.mercedesamg_petronas_f1.entity.Drivers;
import com.example.astened.mercedesamg_petronas_f1.services.DriverServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/drivers")
public class DriverController {

    private final DriverServices driverServices;

    public DriverController(DriverServices driverServices) {
        this.driverServices = driverServices;
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Drivers drivers){
        Drivers d = driverServices.createDriver(drivers);
        return ResponseEntity.ok(d);
    }

    @GetMapping
    public ResponseEntity<?> getAll(){
        List<Drivers> driversList = driverServices.getAll();
        return ResponseEntity.ok(driversList);
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<?> getById(@PathVariable("id") Long id){
        Drivers drivers = driverServices.getById(id);
        return ResponseEntity.ok(drivers);
    }

    @PutMapping
    public ResponseEntity<?> updateDrivers(@RequestBody Drivers drivers){
        Drivers d = driverServices.updateDriver(drivers);
        return ResponseEntity.ok(d);

    }

    @GetMapping("/did/{driverId}")
    public ResponseEntity<?> getByDriverId(@PathVariable("driverId") String driverId){
        Drivers drivers = driverServices.getByDriverId(driverId);
        return ResponseEntity.ok(drivers);
    }

    @DeleteMapping("/id/{id}")
    public ResponseEntity<?> deleteDriver(@PathVariable("id") Long id){
        driverServices.deleteById(id);
        return ResponseEntity.ok("Deleted.");
    }
}
