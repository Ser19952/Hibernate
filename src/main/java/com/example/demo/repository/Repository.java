package com.example.demo.repository;

import com.example.demo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Person, Long> {

     List<Person> findByCity(String city);

     List<Person> findByAgeLessThanOrderByAge(int age);

     Optional<Person> findByNameAndSurname(String name, String surname);

}
