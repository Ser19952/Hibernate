package com.example.demo.controller;

import com.example.demo.entity.Person;
import com.example.demo.service.Service;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
public class Controller {

    @Autowired
    private final Service service;

    @PostMapping("/create")
    public Person createPerson (@RequestBody Person person) {
        return service.create(person);
    }

    @PutMapping("/update /{id}")
    public Optional<Person> updatePerson (@PathVariable Long id , @RequestBody Person person ) {
        return service.updatePerson(id, person);
    }

    @GetMapping ("/{id}")
    private Optional<Person> findById (@PathVariable Long id) {
        return service.getPersonById(id);
    }

    @DeleteMapping ("/delete/ {id}")
    public void deleteById (@PathVariable Long id) {
        service.deleteById(id);
    }

    @GetMapping ("/by- city")
    public List<Person> findByCity (@RequestParam String city) {
        return service.getPersonByCity(city);
    }

    @GetMapping("/age-less-than")
    public List<Person> getPersonByAgeLessThanOrderBy(@RequestParam int age) {
        return service.getPersonsByAgeLessThanOrderBy(age);
    }

    @GetMapping("/by-name-and-surname")
    public Optional<Person> getPersonByNameAndSurname(@RequestParam String name, @RequestParam String surname) {
        return service.getPersonByNameAndSurname(name, surname);
    }

}





}
