package com.lucadani.trafficmonitorization.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity(name = "fuel_prices")
public class FuelPrice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User userID;

    @NotNull
    @Column(name = "fuel_type")
    private String fuelType;

    @NotNull
    @Column(name = "unity_price")
    @Min(value = 0)
    private double unityPrice;

    @NotNull
    @Column(name = "update_time")
    private LocalDate updateTime;
}
