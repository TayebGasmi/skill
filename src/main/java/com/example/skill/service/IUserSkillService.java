package com.example.skill.service;

import com.example.skill.dto.ISkillUserResponse;
import com.example.skill.dto.UserSkillDto;
import com.example.skill.entity.UserSkill;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface IUserSkillService  {
     UserSkill save(UserSkillDto userSkill,String userId);
     UserSkill update(UserSkillDto userSkillDto,Long id);
     Page<ISkillUserResponse> getSkillUser(String userId, Pageable pageable);
        void delete(Long id);
     List<UserSkill> findAll();
}
