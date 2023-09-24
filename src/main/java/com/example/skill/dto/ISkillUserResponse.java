package com.example.skill.dto;

import com.example.skill.entity.Skill;
import com.example.skill.entity.SkillLevel;

public interface ISkillUserResponse {
    Skill getSkill();
    SkillLevel getSkillLevel();

}
