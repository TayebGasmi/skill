package com.example.skill.service.impl;

import com.example.skill.dto.SkillDto;
import com.example.skill.entity.Skill;
import com.example.skill.repository.SkillRepository;
import com.example.skill.service.ISkillService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SkillService extends BaseService<Skill, Long, SkillDto> implements ISkillService {
    private final SkillRepository skillRepository;

    @Override
    public List<Skill> findAllByUserId(Long userId) {
        return skillRepository.findAllByUserId(userId);

    }

    @Override
    public Skill assignSkillToUser(Long userId, Long skillId) {
        Skill skill = this.findByID(skillId);
        skill.setUserId(userId);
        return skillRepository.save(skill);
    }

    @Override
    public Collection<Skill> assignAllSkillToUser(Long userId, Collection<Skill> skills) {
        return skillRepository.saveAll(skills.stream().peek(skill -> skill.setUserId(userId)).collect(Collectors.toList()));
    }
}
