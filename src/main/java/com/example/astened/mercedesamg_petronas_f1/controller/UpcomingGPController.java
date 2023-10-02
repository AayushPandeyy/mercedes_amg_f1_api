package com.example.astened.mercedesamg_petronas_f1.controller;

import com.example.astened.mercedesamg_petronas_f1.entity.UpcomingGP;
import com.example.astened.mercedesamg_petronas_f1.services.UpcomingGPService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/upcomingGp")
public class UpcomingGPController {
            private final UpcomingGPService upcomingGPService;

    public UpcomingGPController(UpcomingGPService upcomingGPService) {
        this.upcomingGPService = upcomingGPService;
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody UpcomingGP upcomingGP){
        UpcomingGP gp = upcomingGPService.createGP(upcomingGP);
        return ResponseEntity.ok(gp);
    }

    @GetMapping
    public ResponseEntity<?> getAll(){
        List<UpcomingGP> gpList = upcomingGPService.getAll();
        return ResponseEntity.ok(gpList);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody UpcomingGP upcomingGP){
        upcomingGP = upcomingGPService.update(upcomingGP);
        return ResponseEntity.ok(upcomingGP);
    }

    @DeleteMapping("/id/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id){
        upcomingGPService.deleteById(id);
        return ResponseEntity.ok("Deleted");
    }
}
