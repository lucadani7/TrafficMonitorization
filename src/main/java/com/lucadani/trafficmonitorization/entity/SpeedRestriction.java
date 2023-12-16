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
@Entity(name = "speed_restrictions")
public class SpeedRestriction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "car_id", nullable = false)
    private Car carID;

    @NotNull
    @Column(name = "speed_limit")
    @Min(value = 0)
    private int speedLimit;

    @NotNull
    @Column(name = "date")
    private LocalDate date;
}
