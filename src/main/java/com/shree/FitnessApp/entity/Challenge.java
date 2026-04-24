package com.shree.FitnessApp.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "challenges")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Challenge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;

    private String type;

    private LocalDateTime startDate;
    private LocalDateTime endDate;

    private Long targetValue;
    private Integer maxParticipants;

    private String status;

    @ManyToOne
    @JoinColumn(name = "created_by")
    private User createdBy;

    private Boolean isDeleted = false;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @Version
    private Integer version;
}