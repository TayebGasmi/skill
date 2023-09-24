package com.example.skill.service.impl;

import com.example.skill.dto.SkillDto;
import com.example.skill.entity.Activity;
import com.example.skill.entity.Domain;
import com.example.skill.entity.Skill;
import com.example.skill.mapper.SkillMapper;
import com.example.skill.repository.SkillRepository;
import com.example.skill.service.ISkillService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SkillService extends BaseService<Skill, Long, SkillDto> implements ISkillService {
    private final SkillRepository skillRepository;
    private final DomainService domainService;
    private final ActivityService activityService;
    private final SkillMapper skillMapper;

    @Override
    public Page<Skill> findByName(String name, Pageable pageable) {
        return skillRepository.findByNameContainingIgnoreCase(name, pageable);
    }

    @Override
    public Skill addWithDomainAndActivity(SkillDto skillDto, Long domainId, Long activityId) {
        Activity activity=activityService.findByID(activityId);
        Domain domain=domainService.findByID(domainId);
        Skill skill=skillRepository.save(skillMapper.toEntity(skillDto));
        skill.setActivity(activity);
        skill.setDomain(domain);
        return skillRepository.save(skill);
    }

}
