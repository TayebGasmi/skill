package com.example.skill.controller;

import com.example.skill.dto.QuizDto;
import com.example.skill.entity.Question;
import com.example.skill.entity.Quiz;
import com.example.skill.service.IQuizService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/quiz")
@RequiredArgsConstructor
public class QuizController extends BaseController<Quiz, Long, QuizDto> {
    private final IQuizService quizService;


    @PostMapping("/{skillId}")
    public ResponseEntity<Quiz> addQuizToSkill(
            @RequestBody @Valid QuizDto quizDto,
            @PathVariable Long skillId) {
        return ResponseEntity.ok(quizService.addQuizToSkill(quizDto, skillId));
    }

    @GetMapping("/{quizId}/questions")
    public ResponseEntity<Set<Question>> getQuizQuestions(@PathVariable Long quizId) {
        Set<Question> quizQuestions = quizService.getQuizQuestion(quizId);
        return ResponseEntity.ok(quizQuestions);
    }

    @GetMapping("/skill")
    public ResponseEntity<Page<Quiz>> getQuizzesBySkill(@RequestParam Long skillId, @PageableDefault(size = 10, page = 0) Pageable pageable) {
        return ResponseEntity.ok(quizService.getQuizBySkillID(skillId, pageable));
    }

    @GetMapping("/skill/search")
    public ResponseEntity<Page<Quiz>> findSkillsByName(@RequestParam String name, @PageableDefault(size = 10, page = 0) Pageable pageable, @RequestParam Long skillId) {
        return ResponseEntity.ok(quizService.findByNameAndSkillId(name, pageable, skillId));
    }

}
