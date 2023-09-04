package com.example.skill.service;


import com.example.skill.dto.QuizDto;
import com.example.skill.entity.Question;
import com.example.skill.entity.Quiz;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Set;

public interface IQuizService {
    Quiz addQuizToSkill(QuizDto quiz, Long SkillId);

    Set<Question> getQuizQuestion(Long quizId);

    Page<Quiz> getQuizBySkillID(Long skillId, Pageable pageable);

    Page<Quiz> findByNameAndSkillId(String name, Pageable pageable, Long id);


}
