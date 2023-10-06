package com.example.astened.mercedesamg_petronas_f1.services;

import com.example.astened.mercedesamg_petronas_f1.entity.Circuit;
import com.example.astened.mercedesamg_petronas_f1.entity.Constructors;
import com.example.astened.mercedesamg_petronas_f1.repository.CircuitRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CircuitServiceImpl implements CircuitService{

    private final CircuitRepository circuitRepository;

    public CircuitServiceImpl(CircuitRepository circuitRepository) {
        this.circuitRepository = circuitRepository;
    }

    @Override
    public Circuit create(Circuit circuit) {
        circuit = circuitRepository.save(circuit);
        return circuit;
    }

    @Override
    public List<Circuit> getAll() {
        return circuitRepository.findAll().stream().collect(Collectors.toList());
    }

    @Override
    public Circuit getById(Long id) {
        return circuitRepository.findById(id).orElseThrow(()->new RuntimeException("Not Found"));
    }

    @Override
    public void deleteById(Long id) {

        circuitRepository.deleteById(id);

    }

    @Override
    public Circuit update(Circuit circuit) {
        Circuit circ = getById(circuit.getId());
        circ.setId(circ.getId());
        circuitRepository.save(circuit);
        return circ;
    }
}
