package com.lucadani.trafficmonitorization.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity(name = "sport_events")
public class SportEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User userID;

    @NotNull
    @Column(name = "event_name")
    private String eventName;

    @NotNull
    @Column(name = "event_date")
    private LocalDate eventDate;

    @NotNull
    @Column(name = "location")
    private String location;
}
