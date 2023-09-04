package com.example.skill.repository;

import com.example.skill.entity.Quiz;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizRepository extends BaseRepository<Quiz, Long> {
    Page<Quiz> findByNameContainingIgnoreCaseAndSkillId(String name, Pageable pageable, Long skillId);

    Page<Quiz> findBySkillId(Long id, Pageable pageable);

}
