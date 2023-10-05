package com.example.springapp.service;

import com.example.springapp.model.Marathon;
import com.example.springapp.repository.MarathonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApiService {

    @Autowired
    public MarathonRepo marathonRepo;

    public boolean createMarathon(Marathon marathon) {
        return marathonRepo.save(marathon) !=null?true:false;
    }

    public Marathon getMarathonById(int id) {
        return marathonRepo.findById(id).orElse(null);
    }

    public List<Marathon> getAllMarathons() {
        return marathonRepo.findAll();
    }
    
}
