package com.example.skill.controller;

import com.example.skill.dto.SkillDto;
import com.example.skill.entity.Skill;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/skill")
public class SkillController extends BaseController<Skill, Long, SkillDto> {
}
