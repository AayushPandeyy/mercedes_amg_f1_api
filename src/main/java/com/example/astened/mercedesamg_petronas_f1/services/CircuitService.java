package com.example.astened.mercedesamg_petronas_f1.services;

import com.example.astened.mercedesamg_petronas_f1.entity.Circuit;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CircuitService {

    Circuit create(Circuit circuit);

    List<Circuit> getAll();

    Circuit getById(Long id);

    void deleteById(Long id);

    Circuit update(Circuit circuit);

}
