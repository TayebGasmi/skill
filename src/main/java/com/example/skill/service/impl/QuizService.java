package com.example.skill.service.impl;

import com.example.skill.dto.QuizDto;
import com.example.skill.entity.Question;
import com.example.skill.entity.Quiz;
import com.example.skill.entity.Skill;
import com.example.skill.repository.QuizRepository;
import com.example.skill.service.IQuizService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class QuizService extends BaseService<Quiz, Long, QuizDto> implements IQuizService {
    private final SkillService skillService;
    private final QuizRepository quizRepository;

    @Override
    public Quiz assignQuizToSkill(Long quizId, Long SkillId) {
        Quiz quiz = findByID(quizId);
        Skill skill = skillService.findByID(SkillId);
        quiz.setSkill(skill);

        return quizRepository.save(quiz);
    }

    @Override
    public Set<Question> getQuizQuestion(Long quizId) {
        Quiz quiz = findByID(quizId);
        return quiz.getQuestions();
    }

    @Override
    public Set<Quiz> getQuizBySkillID(Long skillId) {
        Skill skill = skillService.findByID(skillId);
        return skill.getQuizzes();
    }
}
