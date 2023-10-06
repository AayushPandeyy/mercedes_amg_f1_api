package com.example.astened.mercedesamg_petronas_f1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Table(name = "circuit_table")
public class Circuit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String name;
    String image;
    String firstGp;
    String noOfLaps;
    String length;
    String raceDistance;
    String lapRecord;
    String lrHolder;
    String lapRecordDate;

}
