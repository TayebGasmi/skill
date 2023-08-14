package com.example.skill.service.impl;

import com.example.skill.dto.QuestionDto;
import com.example.skill.entity.Question;
import com.example.skill.repository.QuestionRepository;
import com.example.skill.service.IQuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class QuestionService extends BaseService<Question, Long, QuestionDto> implements IQuestionService {
    private final QuestionRepository questionRepository;


}
