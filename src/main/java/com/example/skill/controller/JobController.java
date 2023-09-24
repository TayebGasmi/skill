package com.example.skill.controller;

import com.example.skill.dto.JobDto;
import com.example.skill.entity.Job;
import com.example.skill.entity.Skill;
import com.example.skill.service.ISkillService;
import com.example.skill.service.impl.JobService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController()
@RequestMapping("/job")
@RequiredArgsConstructor
public class JobController extends BaseController<Job, Long, JobDto>    {
    private final JobService jobService;
    @GetMapping("/search")
    public ResponseEntity<Page<Job>> findSkillsByName(@RequestParam String name, @PageableDefault(size = 10, page = 0) Pageable pageable, Principal principal) {
        return ResponseEntity.ok(jobService.findByName(name, pageable));
    }
}
