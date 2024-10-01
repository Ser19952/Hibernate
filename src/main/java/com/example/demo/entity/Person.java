package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Person {
    @EmbeddedId
    PersonPrimaryKey personPrimaryKey;
    private int phoneNumber;
    private String cityOfLiving;
    private Long id;


}
