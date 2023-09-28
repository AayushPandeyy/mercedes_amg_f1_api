package com.example.astened.mercedesamg_petronas_f1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
@Table(name = "drivers")
public class Drivers {

    @Id
            @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name = "driver_id")
    String driverId;

    @Column(name = "driver_name")
    String driverName;

    @Column(name = "permanent_number")
    Integer permanentNumber;

    @Column(name = "driver_country")
    String driverCountry;

    @Column(name = "points")
    Integer points;

    @Column(name = "driver_country_shorts")
    String countryShorts;

    @Column(name = "driver_shorts")
    String driverShorts;
}
