package com.example.skill.controller;

import com.example.skill.dto.SkillDto;
import com.example.skill.entity.Skill;
import com.example.skill.service.ISkillService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@RequestMapping("/skill")
@RequiredArgsConstructor
@Slf4j
public class SkillController extends BaseController<Skill, Long, SkillDto> {
    private final ISkillService skillService;
    @GetMapping("/search")
    public ResponseEntity<Page<Skill>> findSkillsByName(@RequestParam String name, @PageableDefault(size = 10, page = 0) Pageable pageable, Principal principal) {
        log.info("principal {}", principal.getName());
        return ResponseEntity.ok(skillService.findByName(name, pageable));
    }
    @PostMapping("/{domainId}/{activityId}")
    public ResponseEntity<Skill> addWithDomainAndActivity(@RequestBody @Valid SkillDto skillDto, @PathVariable Long domainId, @PathVariable Long activityId){
        return ResponseEntity.ok(skillService.addWithDomainAndActivity(skillDto,domainId,activityId));
    }

}

