package com.example.skill.service.impl;

import com.example.skill.entity.Skill;
import com.example.skill.repository.SkillRepository;
import com.example.skill.service.ISkillService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QuestionService extends BaseService<Skill,Long> implements ISkillService {
    private final SkillRepository skillRepository;

    @Override
    public List<Skill> findAllByUserId(Long userId) {
        return skillRepository.findAllByUserId(userId);

    }
}
