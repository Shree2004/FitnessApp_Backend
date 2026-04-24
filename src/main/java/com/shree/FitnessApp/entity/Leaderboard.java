package com.shree.FitnessApp.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "leaderboards")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Leaderboard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Challenge challenge;

    @ManyToOne
    private User user;

    private Long totalSteps;
    private Integer rank;

    private LocalDateTime lastUpdated;
}