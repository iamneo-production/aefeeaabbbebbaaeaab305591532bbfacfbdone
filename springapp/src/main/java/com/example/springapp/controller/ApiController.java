package com.example.springapp.controller;

import com.example.springapp.model.Marathon;
import com.example.springapp.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class ApiController {

    @Autowired
    public ApiService apiService;

    

    @PostMapping("/")
    public boolean createMarathon(@RequestBody Marathon marathon) {
        return apiService.createMarathon(marathon);
    }

    @GetMapping("/{id}")
    public Marathon getMarathonById(@PathVariable int id) {
        return apiService.getMarathonById(id);
    }

    @GetMapping("/")
    public List<Marathon> getAllMarathons() {
        return apiService.getAllMarathons();
    }
}
