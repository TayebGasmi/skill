package com.example.skill.repository;

import com.example.skill.entity.Question;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends BaseRepository<Question, Long> {
}
