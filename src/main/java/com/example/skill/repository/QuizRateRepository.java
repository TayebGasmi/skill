package com.example.skill.repository;

import com.example.skill.entity.Quiz;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizRateRepository extends BaseRepository<Quiz,Long> {
}
