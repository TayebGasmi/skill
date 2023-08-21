package com.example.skill.controller;

import com.example.skill.dto.QuizDto;
import com.example.skill.entity.Question;
import com.example.skill.entity.Quiz;
import com.example.skill.service.IQuizService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/quiz")
@RequiredArgsConstructor
public class QuizController extends BaseController<Quiz, Long, QuizDto> {
    private final IQuizService quizService;



    @PostMapping("/assign/{quizId}/{skillId}")
    public ResponseEntity<Quiz> assignQuizToSkill(
            @PathVariable Long quizId,
            @PathVariable Long skillId) {
        Quiz assignedQuiz = quizService.assignQuizToSkill(quizId, skillId);
        return ResponseEntity.ok(assignedQuiz);
    }

    @GetMapping("/{quizId}/questions")
    public ResponseEntity<Set<Question>> getQuizQuestions(@PathVariable Long quizId) {
        Set<Question> quizQuestions = quizService.getQuizQuestion(quizId);
        return ResponseEntity.ok(quizQuestions);
    }
    @GetMapping("/skill/{skillId}")
    public ResponseEntity<Set<Quiz>> getQuizzesBySkill(@PathVariable Long skillId) {
        Set<Quiz> quizzes = quizService.getQuizBySkillID(skillId);
        return ResponseEntity.ok(quizzes);
    }
}
