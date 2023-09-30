package com.example.astened.mercedesamg_petronas_f1.controller;

import com.example.astened.mercedesamg_petronas_f1.entity.Constructors;
import com.example.astened.mercedesamg_petronas_f1.services.ConstructorsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/constructor")
public class ConstructorsController {

    private final ConstructorsService constructorsService;

    public ConstructorsController(ConstructorsService constructorsService) {
        this.constructorsService = constructorsService;
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Constructors constructors){
        Constructors c = constructorsService.create(constructors);
        return ResponseEntity.ok(c);

    }

    @GetMapping
    public ResponseEntity<?> getAll(){
        List<Constructors> constructors = constructorsService.getAll();
        return ResponseEntity.ok(constructors);
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<?> getById(@PathVariable("id") Long id){
        Constructors constructors = constructorsService.getById(id);
        return ResponseEntity.ok(constructors);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody Constructors constructors){
        Constructors c = constructorsService.update(constructors);
        return ResponseEntity.ok(c);
    }

    @DeleteMapping("/id/{id}")
    public ResponseEntity<?> deleteById(Long id){
        constructorsService.deleteById(id);
        return ResponseEntity.ok("Deleted");
    }
}
