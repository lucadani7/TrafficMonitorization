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
@Entity(name = "weather_updates")
public class WeatherUpdate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User userID;

    @NotNull
    @Column(name = "city")
    private String city;

    @NotNull
    @Column(name = "temperature")
    @Min(value = 0)
    private int temperature;

    @NotNull
    @Column(name = "weather_description")
    private String weatherDescription;

    @NotNull
    @Column(name = "update_time")
    private LocalDate updateTime;
}
