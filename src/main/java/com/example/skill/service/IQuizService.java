package com.example.skill.service;


import com.example.skill.entity.Question;
import com.example.skill.entity.Quiz;

import java.util.Set;

public interface IQuizService {
    Quiz assignQuizToSkill(Long quizId, Long SkillId);

    Set<Question> getQuizQuestion(Long quizId);
    Set<Quiz> getQuizBySkillID(Long skillId);
}
