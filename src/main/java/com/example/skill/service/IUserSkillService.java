package com.example.skill.service;

import com.example.skill.dto.ISkillUserResponse;
import com.example.skill.dto.UserSkillDto;
import com.example.skill.entity.UserSkill;

import java.util.List;


public interface IUserSkillService  {
     UserSkill save(UserSkillDto userSkill,String userId);
     UserSkill update(UserSkillDto userSkillDto,Long id);
     List<ISkillUserResponse> getSkillUser(String userId);

}
