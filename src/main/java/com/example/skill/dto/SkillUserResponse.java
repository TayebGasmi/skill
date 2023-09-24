package com.example.skill.dto;

import com.example.skill.entity.Skill;
import com.example.skill.entity.SkillLevel;
import lombok.Data;

@Data
public class SkillUserResponse {
    SkillLevel skillLevel;
    Skill skill;
}
