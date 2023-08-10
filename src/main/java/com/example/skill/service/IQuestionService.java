package com.example.skill.service;

import com.example.skill.entity.Skill;

import java.util.List;

public interface ISkillService  {
    List<Skill> findAllByUserId(Long userId);
}
