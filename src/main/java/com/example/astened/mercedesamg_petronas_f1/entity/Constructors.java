package com.example.astened.mercedesamg_petronas_f1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "constructors")
@Builder
public class Constructors {

    @Id
            @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name = "constructor_id")
    String consId;

    @Column(name = "constructor_name")
    String name;

    @Column(name = "points")
    Integer points;
}
