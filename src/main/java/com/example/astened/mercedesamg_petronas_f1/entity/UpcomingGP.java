package com.example.astened.mercedesamg_petronas_f1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "upcoming_gp")
public class UpcomingGP {
    @Id
            @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name = "gp_name")
    String name;

    @Column(name = "circuit_name")
    String circuit_name;

    @Column(name = "gp_date")
    String gpDate;

    @Column(name = "event_date")
    String event_date;
}
