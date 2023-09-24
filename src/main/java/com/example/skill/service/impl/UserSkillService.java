package com.example.skill.service.impl;

import com.example.skill.dto.ISkillUserResponse;
import com.example.skill.dto.UserSkillDto;
import com.example.skill.entity.UserSkill;
import com.example.skill.error.EntityNotFoundException;
import com.example.skill.mapper.SkillUserMapper;
import com.example.skill.repository.UserSkillRepository;
import com.example.skill.service.IUserSkillService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserSkillService implements IUserSkillService {
    private final UserSkillRepository userSkillRepository;
    private final SkillUserMapper skillUserMapper;
    private final SkillService skillService;
    @Override
    public UserSkill save(UserSkillDto userSkillDto, String userId) {
        UserSkill userSkill = skillUserMapper.toEntity(userSkillDto);
        userSkill.setUserId(userId);
        return userSkillRepository.save(userSkill);
    }

    @Override
    public UserSkill update(UserSkillDto userSkillDto, Long id) {
        UserSkill userSkill = userSkillRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("UserSkill not found"));
        skillUserMapper.toEntityUpdate(userSkillDto, userSkill);
        return userSkillRepository.save(userSkill);
    }

    @Override
    public List<ISkillUserResponse> getSkillUser(String userId) {
        return userSkillRepository.findSkillUserResponsesByUserId(userId);
    }
}
