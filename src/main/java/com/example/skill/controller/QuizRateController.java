package com.example.skill.controller;

import com.example.skill.dto.QuizRateDto;
import com.example.skill.entity.QuizRate;
import com.example.skill.service.IQuizRateService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/quizRate")
@RequiredArgsConstructor
public class QuizRateController extends BaseController<QuizRate, Long, QuizRateDto> {
    private final IQuizRateService quizRateService;

    @PostMapping("/rate/{userId}/{quizId}")
    public ResponseEntity<QuizRate> rateQuiz(
            @RequestBody QuizRateDto quizRateDto,
            @PathVariable Long userId,
            @PathVariable Long quizId) {
        QuizRate ratedQuiz = quizRateService.rateQuiz(quizRateDto, userId, quizId);
        return ResponseEntity.status(HttpStatus.CREATED).body(ratedQuiz);
    }
}
