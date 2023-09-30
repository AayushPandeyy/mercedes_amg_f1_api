package com.example.astened.mercedesamg_petronas_f1.services;

import com.example.astened.mercedesamg_petronas_f1.entity.Constructors;
import com.example.astened.mercedesamg_petronas_f1.repository.ConstructorsRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ConstructorsServiceImpl implements ConstructorsService{

    private final ConstructorsRepo constructorsRepo;

    public ConstructorsServiceImpl(ConstructorsRepo constructorsRepo) {
        this.constructorsRepo = constructorsRepo;
    }

    @Override
    public Constructors create(Constructors constructors) {
        constructors = constructorsRepo.save(constructors);
        return constructors;
    }

    @Override
    public Constructors getById(long id) {
        Constructors constructors = constructorsRepo.findById(id).orElseThrow(()->new RuntimeException("Constructor Not Found"));
        return constructors;
    }

    @Override
    public List<Constructors> getAll() {
        List<Constructors> constructors = constructorsRepo.findAll().stream().collect(Collectors.toList());
        return constructors;
    }

    @Override
    public void deleteById(Long id) {
                constructorsRepo.deleteById(id);
    }

    @Override
    public Constructors update(Constructors constructors) {
        Constructors cons = getById(constructors.getId());
        cons.setId(cons.getId());
        constructorsRepo.save(constructors);
        return cons;
    }
}
