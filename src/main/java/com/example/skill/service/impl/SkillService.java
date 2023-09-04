package com.example.skill.service.impl;

import com.example.skill.dto.SkillDto;
import com.example.skill.entity.Skill;
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

    @Override
    public Page<Skill> findByName(String name, Pageable pageable) {
        return skillRepository.findByNameContainingIgnoreCase(name, pageable);
    }

}
