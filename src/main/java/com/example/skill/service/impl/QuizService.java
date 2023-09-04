package com.example.skill.service.impl;

import com.example.skill.dto.QuizDto;
import com.example.skill.entity.Question;
import com.example.skill.entity.Quiz;
import com.example.skill.entity.Skill;
import com.example.skill.mapper.QuizMapper;
import com.example.skill.repository.QuizRepository;
import com.example.skill.service.IQuizService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class QuizService extends BaseService<Quiz, Long, QuizDto> implements IQuizService {
    private final SkillService skillService;
    private final QuizRepository quizRepository;
    private final QuizMapper quizMapper;

    @Override
    public Quiz addQuizToSkill(QuizDto quizDto, Long SkillId) {
        Quiz quiz = quizMapper.toEntity(quizDto);
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
    public Page<Quiz> getQuizBySkillID(Long skillId, Pageable pageable) {
        return quizRepository.findBySkillId(skillId, pageable);
    }

    @Override
    public Page<Quiz> findByNameAndSkillId(String name, Pageable pageable, Long id) {
        return quizRepository.findByNameContainingIgnoreCaseAndSkillId(name, pageable, id);
    }
}
