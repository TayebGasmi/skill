package com.example.skill.service;

import com.example.skill.dto.SkillDto;
import com.example.skill.entity.Skill;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ISkillService {

    Page<Skill> findByName(String name, Pageable pageable);
    Skill addWithDomainAndActivity(SkillDto skillDto, Long domainId, Long activityId);

}
