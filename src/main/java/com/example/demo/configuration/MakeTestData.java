package com.example.demo.configuration;

import com.example.demo.entity.Animal;
import com.example.demo.repositories.AnimalRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Controller;


@Controller
public class MakeTestData implements ApplicationRunner {
    public MakeTestData(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    AnimalRepository animalRepository;



    @Override
    public void run(ApplicationArguments args) throws Exception {
        animalRepository.save(new Animal("ko"));
        animalRepository.save(new Animal("tiger"));
    }


}
