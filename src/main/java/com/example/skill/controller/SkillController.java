package com.example.skill.controller;

import com.example.skill.dto.SkillDto;
import com.example.skill.entity.Skill;
import com.example.skill.service.ISkillService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/skill")
@RequiredArgsConstructor
public class SkillController extends BaseController<Skill, Long, SkillDto> {
    private final ISkillService skillService;

    @GetMapping("/search")
    public ResponseEntity<Page<Skill>> findSkillsByName(@RequestParam String name, @PageableDefault(size = 10, page = 0) Pageable pageable) {
        return ResponseEntity.ok(skillService.findByName(name, pageable));
    }

}

