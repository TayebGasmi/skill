package com.example.skill.dto;

import com.example.skill.entity.Skill;
import com.example.skill.entity.SkillLevel;

public interface ISkillUserResponse {
    Long getId();
    Skill getSkill();
    SkillLevel getSkillLevel();

}
