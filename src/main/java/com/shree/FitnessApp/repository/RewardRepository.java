package com.shree.FitnessApp.repository;

import com.shree.FitnessApp.entity.Reward;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RewardRepository extends JpaRepository<Reward, Long> {

    List<Reward> findByChallengeId(Long challengeId);
}