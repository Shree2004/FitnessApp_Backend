package com.shree.FitnessApp.repository;

import com.shree.FitnessApp.entity.Leaderboard;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LeaderboardRepository extends JpaRepository<Leaderboard, Long> {

    List<Leaderboard> findByChallengeIdOrderByTotalStepsDesc(Long challengeId);

    List<Leaderboard> findTop10ByChallengeIdOrderByTotalStepsDesc(Long challengeId);
}