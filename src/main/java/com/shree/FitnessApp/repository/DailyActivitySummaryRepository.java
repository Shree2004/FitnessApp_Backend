package com.shree.FitnessApp.repository;

import com.shree.FitnessApp.entity.DailyActivitySummary;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Optional;

public interface DailyActivitySummaryRepository extends JpaRepository<DailyActivitySummary, Long> {

    Optional<DailyActivitySummary> findByUserIdAndChallengeIdAndDate(
            Long userId, Long challengeId, LocalDate date);
}