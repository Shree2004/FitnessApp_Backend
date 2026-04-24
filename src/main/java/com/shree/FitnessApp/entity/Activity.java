package com.shree.FitnessApp.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "activities",
        uniqueConstraints = @UniqueConstraint(columnNames = {"user_id", "challenge_id", "activity_date"}))
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "challenge_id")
    private Challenge challenge;

    private LocalDate activityDate;

    private Long steps;
    private Double distance;
    private Double calories;

    @Version
    private Integer version;
}