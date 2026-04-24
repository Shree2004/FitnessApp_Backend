package com.shree.FitnessApp.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "challenge_participants",
        uniqueConstraints = @UniqueConstraint(columnNames = {"user_id", "challenge_id"}))
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChallengeParticipant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "challenge_id")
    private Challenge challenge;

    private LocalDateTime joinDate;

    private String status;

    private Long totalSteps = 0L;
    private Double totalDistance = 0.0;
    private Double totalCalories = 0.0;

    private Integer rank;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @Version
    private Integer version;
}