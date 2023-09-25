package com.example.skill.controller;

import com.example.skill.dto.SkillRequestDto;
import com.example.skill.entity.SkillRequest;
import com.example.skill.service.ISkillRequestService;
import com.example.skill.service.IUserSkillService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/skill-Request")
public class SkillRequestController extends BaseController<SkillRequest,Long, SkillRequestDto>{

}
