package com.example.skill.service;

import com.example.skill.entity.Skill;

import java.util.Collection;
import java.util.List;

public interface ISkillService {
    List<Skill> findAllByUserId(Long userId);

    Skill assignSkillToUser(Long userId, Long skillId);

    Collection<Skill> assignAllSkillToUser(Long userId, Collection<Skill> skills);

}
