package com.example.skill.controller;

import com.example.skill.dto.SkillDto;
import com.example.skill.entity.Skill;
import com.example.skill.service.ISkillService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/skill")
@RequiredArgsConstructor
public class SkillController extends BaseController<Skill, Long, SkillDto> {
    private final ISkillService skillService;

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Skill>> getAllSkillsByUserId(@PathVariable Long userId) {
        List<Skill> skills = skillService.findAllByUserId(userId);
        return ResponseEntity.ok(skills);
    }

    @PostMapping("/assign/{userId}/{skillId}")
    public ResponseEntity<Skill> assignSkillToUser(@PathVariable Long userId, @PathVariable Long skillId) {
        Skill assignedSkill = skillService.assignSkillToUser(userId, skillId);
        return ResponseEntity.ok(assignedSkill);
    }

    @PostMapping("/assign-all/{userId}")
    public ResponseEntity<Collection<Skill>> assignAllSkillsToUser(@PathVariable Long userId, @RequestBody List<Skill> skills) {
        Collection<Skill> assignedSkills = skillService.assignAllSkillToUser(userId, skills);
        return ResponseEntity.ok(assignedSkills);
    }
}

