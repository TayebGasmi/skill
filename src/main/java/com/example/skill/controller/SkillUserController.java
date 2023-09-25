package com.example.skill.controller;

import com.example.skill.dto.UserSkillDto;
import com.example.skill.entity.UserSkill;
import com.example.skill.service.IUserSkillService;
import jakarta.validation.Valid;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@RequiredArgsConstructor
@RequestMapping("/skill-user")
public class SkillUserController {
   private final IUserSkillService userSkillService;
    @GetMapping("/user")
    public ResponseEntity<?> getSkillUser(Principal principal,@PageableDefault(size = 10, page = 0) Pageable pageable){
        return ResponseEntity.ok(userSkillService.getSkillUser(principal.getName(),pageable));
    }
    @PostMapping()
    public ResponseEntity<UserSkill> createSkillUser(Principal principal , @RequestBody @Valid UserSkillDto userSkillDto){
        return ResponseEntity.ok(userSkillService.save(userSkillDto,principal.getName()));

    }
    @PutMapping("/{id}")
    public ResponseEntity<UserSkill> updateSkillUser(@PathVariable Long id,@RequestBody @Valid UserSkillDto userSkillDto){
        return ResponseEntity.ok(userSkillService.update(userSkillDto,id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSkillUser(@PathVariable Long id){
        userSkillService.delete(id);
        return ResponseEntity.noContent().build();
    }
    @GetMapping("/all")
    public ResponseEntity<?> getAllSkillUser(){
        return ResponseEntity.ok(userSkillService.findAll());
    }
}
