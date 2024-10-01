package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Person {
    @EmbeddedId
    private PersonPrimaryKey personPrimaryKey;
    private int phoneNumber;
    private String cityOfLiving;
    @Setter
    private Long id;


}
