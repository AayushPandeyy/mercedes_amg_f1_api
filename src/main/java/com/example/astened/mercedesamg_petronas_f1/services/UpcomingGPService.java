package com.example.astened.mercedesamg_petronas_f1.services;

import com.example.astened.mercedesamg_petronas_f1.entity.UpcomingGP;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UpcomingGPService {

    UpcomingGP createGP(UpcomingGP upcomingGP);

    List<UpcomingGP> getAll();

    UpcomingGP getById(Long id);

    UpcomingGP update(UpcomingGP upcomingGP);

    void deleteById(Long id);

}
