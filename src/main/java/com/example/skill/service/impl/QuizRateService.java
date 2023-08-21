package com.example.skill.service.impl;

import com.example.skill.dto.QuizRateDto;
import com.example.skill.entity.Quiz;
import com.example.skill.entity.QuizRate;
import com.example.skill.mapper.QuizRateMapper;
import com.example.skill.repository.QuizRateRepository;
import com.example.skill.service.IQuizRateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class QuizRateService extends BaseService<QuizRate, Long, QuizRateDto> implements IQuizRateService {
    private final QuizRateRepository quizRateRepository;
    private final QuizRateMapper quizRateMapper;
    private final QuizService quizService;

    @Override
    public QuizRate rateQuiz(QuizRateDto quizRateDto, Long userID, Long quizId) {
        Quiz quiz = quizService.findByID(quizId);
        QuizRate quizRate = quizRateMapper.toEntity(quizRateDto);
        quizRate.setUserId(userID);
        quizRate.setQuiz(quiz);
        quizRate.setRatedAt(new Date());
        return quizRateRepository.save(quizRate);
    }
}
