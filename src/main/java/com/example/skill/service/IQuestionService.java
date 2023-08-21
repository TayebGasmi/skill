package com.example.skill.service;


import com.example.skill.dto.QuestionWithOptionsDto;
import com.example.skill.entity.Question;

public interface IQuestionService {
    Question addQuestionToQuizWithOptions(QuestionWithOptionsDto questionOptionsDto, Long QuizId);
}
