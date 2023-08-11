package com.example.skill.service.impl;

import com.example.skill.entity.Question;
import com.example.skill.repository.QuizRepository;
import com.example.skill.service.IQuizService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class QuizService extends BaseService<Question, Long> implements IQuizService {
    private final QuizRepository quizRepository;


}
