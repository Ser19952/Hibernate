package com.example.demo.service;

import com.example.demo.entity.Person;
import com.example.demo.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class Service {
@Autowired
    private Repository repository;

    public Person create(Person persons ) {
      return repository.save(persons);
    }

    public Optional<Person> getPersonById (Long id) {
        Optional<Person> optional = repository.findById(id);
        return optional;
    }

    public Optional<Person> updatePerson (Long id, Person persons) {
        Optional<Person> persons1 = repository.findById(id);
        persons.setId(id);
        return Optional.of(repository.save(persons));

    }

    public void deleteById (Long id) {
        repository.deleteById(id);
    }
    public List<Person> getPersonByCity (String city) {
        return repository.findByCity(city);
    }

    public List<Person> getPersonsByAgeLessThanOrderBy(int age) {
        return repository.findByAgeLessThanOrderByAge(age);
    }

    public Optional<Person>getPersonByNameAndSurname(String name, String surname) {
        Optional<Person> optionalPerson = repository.findByNameAndSurname(name,surname);
        return optionalPerson;
    }

}
