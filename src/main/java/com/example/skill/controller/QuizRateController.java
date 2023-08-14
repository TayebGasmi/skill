package com.example.skill.controller;

import com.example.skill.dto.QuizRateDto;
import com.example.skill.entity.QuizRate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quizRate")
public class QuizRateController extends BaseController<QuizRate, Long, QuizRateDto> {
}
