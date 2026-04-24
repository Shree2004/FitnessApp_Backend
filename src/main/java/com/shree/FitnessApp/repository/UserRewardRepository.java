package com.shree.FitnessApp.repository;

import com.shree.FitnessApp.entity.UserReward;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRewardRepository extends JpaRepository<UserReward, Long> {

    List<UserReward> findByUserId(Long userId);

    List<UserReward> findByChallengeId(Long challengeId);
}