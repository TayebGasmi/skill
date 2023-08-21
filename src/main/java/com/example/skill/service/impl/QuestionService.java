package com.example.skill.service.impl;

import com.example.skill.dto.QuestionDto;
import com.example.skill.dto.QuestionWithOptionsDto;
import com.example.skill.entity.Option;
import com.example.skill.entity.Question;
import com.example.skill.entity.Quiz;
import com.example.skill.mapper.OptionMapper;
import com.example.skill.mapper.QuestionMapper;
import com.example.skill.repository.QuestionRepository;
import com.example.skill.service.IQuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor

public class QuestionService extends BaseService<Question, Long, QuestionDto> implements IQuestionService {
    private final QuestionRepository questionRepository;
    private final OptionService optionService;
    private final QuizService quizService;
    private final OptionMapper optionMapper;
    private final QuestionMapper questionMapper;

    @Override
    public Question addQuestionToQuizWithOptions(QuestionWithOptionsDto questionOptionsDto, Long QuizId) {
        Quiz quiz = quizService.findByID(QuizId);
        Question question = questionMapper.toEntity(questionOptionsDto.getQuestionDto());
        question.setQuiz(quiz);
        Question savedQuestion = questionRepository.save(question);
        List<Option> options = questionOptionsDto.getOptions().stream().map(optionMapper::toEntity).peek(e -> e.setQuestion(question)).collect(Collectors.toList());
        Collection<Option> savedOptions = optionService.saveAll(options);
        question.setOptions(new HashSet<>(savedOptions));
        return savedQuestion;
    }
}
