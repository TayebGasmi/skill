package com.example.skill.service;


import com.example.skill.dto.QuizRateDto;
import com.example.skill.entity.QuizRate;

public interface IQuizRateService {
    QuizRate rateQuiz(QuizRateDto quizRateDto, Long userID, Long quizId);
}
