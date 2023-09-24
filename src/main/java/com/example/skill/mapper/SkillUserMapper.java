package com.example.skill.mapper;

import com.example.skill.dto.UserSkillDto;
import com.example.skill.entity.UserSkill;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, unmappedTargetPolicy = ReportingPolicy.IGNORE)

public interface SkillUserMapper extends BaseMapper<UserSkill, UserSkillDto> {
}
