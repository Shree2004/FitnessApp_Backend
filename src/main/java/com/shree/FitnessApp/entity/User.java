package com.shree.FitnessApp.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true, nullable = false)
    private String email;

    private String password;

    private String role;

    private Integer age;
    private Double weight;
    private String fitnessGoal;

    private Long totalSteps = 0L;
    private Integer challengesJoined = 0;
    private Integer challengesWon = 0;

    private Boolean isDeleted = false;

    private String provider; // GOOGLE / LOCAL
    private String providerId;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @Version
    private Integer version;
}