package com.example.skill.controller;

import com.example.skill.dto.QuizDto;
import com.example.skill.entity.Quiz;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quiz")
public class QuizController extends BaseController<Quiz,Long, QuizDto>{
}
