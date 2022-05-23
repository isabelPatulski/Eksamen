package com.example.demo.api;


import com.example.demo.entity.Animal;
import com.example.demo.repositories.AnimalRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/animals")
public class Controller {
    public Controller(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    AnimalRepository animalRepository;

    @GetMapping
    public List<Animal> getAnimals() {
        return animalRepository.findAll();
    }
}
