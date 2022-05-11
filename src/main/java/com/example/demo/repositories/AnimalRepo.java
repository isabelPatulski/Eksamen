package com.example.demo.repositories;

import com.example.demo.entity.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepo extends JpaRepository <Animal, Integer>{

}
