package com.example.skill.service.impl;


import com.example.skill.dto.SkillRequestDto;
import com.example.skill.entity.Skill;
import com.example.skill.entity.SkillRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SkillRequestService extends BaseService<SkillRequest, Long, SkillRequestDto>{
}
