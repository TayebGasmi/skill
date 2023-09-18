package com.example.skill.controller;

import com.example.skill.dto.ActivityDto;
import com.example.skill.entity.Activity;
import com.example.skill.entity.Skill;
import com.example.skill.service.impl.ActivityService;
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
@RequestMapping("/activity")
@RequiredArgsConstructor
public class ActivityController extends BaseController<Activity,Long, ActivityDto> {
    private final ActivityService activityService;
    @GetMapping("/search")
    public ResponseEntity<Page<Activity>> findSkillsByName(@RequestParam String name, @PageableDefault(size = 10, page = 0) Pageable pageable) {
        return ResponseEntity.ok(activityService.findByName(name, pageable));
    }
}
