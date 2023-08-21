package com.example.skill.controller;

import com.example.skill.dto.QuestionDto;
import com.example.skill.dto.QuestionWithOptionsDto;
import com.example.skill.entity.Question;
import com.example.skill.service.impl.QuestionService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/question")
@RequiredArgsConstructor
public class QuestionController extends BaseController<Question, Long, QuestionDto> {
    private final QuestionService questionService;


    @PostMapping("/quiz/{quizId}")
    public ResponseEntity<?> addQuestionToQuizWithOptions(@RequestBody @Valid QuestionWithOptionsDto questionOptionsDto, @PathVariable Long quizId) {
        return new ResponseEntity<>(questionService.addQuestionToQuizWithOptions(questionOptionsDto, quizId), HttpStatus.CREATED);
    }
}

