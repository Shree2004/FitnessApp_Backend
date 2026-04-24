package com.shree.FitnessApp.repository;

import com.shree.FitnessApp.entity.Challenge;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChallengeRepository extends JpaRepository<Challenge, Long> {

    List<Challenge> findByStatus(String status);

    List<Challenge> findByIsDeletedFalse();
}