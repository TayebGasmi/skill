package com.example.skill.service.impl;

import com.example.skill.entity.Question;
import com.example.skill.repository.QuizRateRepository;
import com.example.skill.service.IQuizRateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class QuizRateService extends BaseService<Question, Long> implements IQuizRateService {
    private final QuizRateRepository quizRateRepository;


}
