package com.example.skill.controller;

import com.example.skill.dto.UserSkillDto;
import com.example.skill.entity.UserSkill;
import com.example.skill.service.IUserSkillService;
import jakarta.validation.Valid;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@RequiredArgsConstructor
@RequestMapping("/skill-user")
public class SkillUserController {
   private final IUserSkillService userSkillService;
    @PostMapping()
    public ResponseEntity<UserSkill> createSkillUser(Principal principal , @RequestBody @Valid UserSkillDto userSkillDto){
        return ResponseEntity.ok(userSkillService.save(userSkillDto,principal.getName()));

    }
    @PutMapping("/{id}")
    public ResponseEntity<UserSkill> updateSkillUser(@PathVariable Long id,@RequestBody @Valid UserSkillDto userSkillDto){
        return ResponseEntity.ok(userSkillService.update(userSkillDto,id));
    }
    @GetMapping("/user")
    public ResponseEntity<?> getSkillUser(Principal principal){
        return ResponseEntity.ok(userSkillService.getSkillUser(principal.getName()));
    }
}
