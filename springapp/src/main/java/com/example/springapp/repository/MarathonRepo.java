package com.example.springapp.repository;

import com.example.springapp.model.Marathon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarathonRepo extends JpaRepository<Marathon, Integer> {
}
