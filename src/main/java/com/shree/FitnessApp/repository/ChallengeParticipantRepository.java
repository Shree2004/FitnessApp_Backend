package com.shree.FitnessApp.repository;

import com.shree.FitnessApp.entity.ChallengeParticipant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.List;

public interface ChallengeParticipantRepository extends JpaRepository<ChallengeParticipant, Long> {

    Optional<ChallengeParticipant> findByUserIdAndChallengeId(Long userId, Long challengeId);

    boolean existsByUserIdAndChallengeId(Long userId, Long challengeId);

    List<ChallengeParticipant> findByChallengeId(Long challengeId);

    List<ChallengeParticipant> findByUserId(Long userId);
}