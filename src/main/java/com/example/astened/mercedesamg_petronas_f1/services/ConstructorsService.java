package com.example.astened.mercedesamg_petronas_f1.services;

import com.example.astened.mercedesamg_petronas_f1.entity.Constructors;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ConstructorsService {

    Constructors create(Constructors constructors);

    Constructors getById(long id);

    List<Constructors> getAll();

    void deleteById(Long id);

    Constructors update(Constructors constructors);

}
