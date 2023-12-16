package com.lucadani.trafficmonitorization.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity(name = "notification_options")
public class NotificationOption {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "car_id", nullable = false)
    private Car carID;

    @NotNull
    @Column(name = "weather_updates")
    private boolean weatherUpadates;

    @NotNull
    @Column(name = "sport_events")
    private boolean sportEvents;

    @NotNull
    @Column(name = "fuel_prices")
    private boolean fuelPrices;
}
