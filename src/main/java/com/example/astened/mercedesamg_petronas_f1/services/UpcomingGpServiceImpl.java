package com.example.astened.mercedesamg_petronas_f1.services;

import com.example.astened.mercedesamg_petronas_f1.entity.UpcomingGP;
import com.example.astened.mercedesamg_petronas_f1.repository.UpcomingGPRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UpcomingGpServiceImpl implements UpcomingGPService{
    private final UpcomingGPRepo upcomingGPRepo;

    public UpcomingGpServiceImpl(UpcomingGPRepo upcomingGPRepo) {
        this.upcomingGPRepo = upcomingGPRepo;
    }

    @Override
    public UpcomingGP createGP(UpcomingGP upcomingGP) {
        upcomingGP = upcomingGPRepo.save(upcomingGP);
        return upcomingGP;
    }

    @Override
    public List<UpcomingGP> getAll() {
        return upcomingGPRepo.findAll().stream().collect(Collectors.toList());
    }

    @Override
    public UpcomingGP getById(Long id) {
        return upcomingGPRepo.findById(id).orElseThrow(()->new RuntimeException("Not Found"));
    }

    @Override
    public UpcomingGP update(UpcomingGP upcomingGP) {

        UpcomingGP gp = getById(upcomingGP.getId());
        gp.setId(upcomingGP.getId());
        upcomingGPRepo.save(upcomingGP);
        return gp;


    }

    @Override
    public void deleteById(Long id) {
        upcomingGPRepo.deleteById(id);
    }
}
