package com.example.astened.mercedesamg_petronas_f1.controller;

import com.example.astened.mercedesamg_petronas_f1.entity.Circuit;
import com.example.astened.mercedesamg_petronas_f1.services.CircuitService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/circuit")
public class CircuitController {

    private final CircuitService circuitService;

    public CircuitController(CircuitService circuitService) {
        this.circuitService = circuitService;
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Circuit circuit){
        circuit = circuitService.create(circuit);
        return ResponseEntity.ok(circuit);
    }

    @GetMapping
    public ResponseEntity<?> getAll(){
        List<Circuit> circuits = circuitService.getAll();
        return ResponseEntity.ok(circuits);
    }

    @GetMapping("id/{id}")
    public ResponseEntity<?> getById(@PathVariable("id") Long id){
        Circuit circuit = circuitService.getById(id);
        return ResponseEntity.ok(circuit);
    }

    @DeleteMapping("/id/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id){
        circuitService.deleteById(id);
        return ResponseEntity.ok("Deleted");
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody Circuit circuit){
        Circuit cir = circuitService.update(circuit);
        return ResponseEntity.ok(cir);
    }
}
