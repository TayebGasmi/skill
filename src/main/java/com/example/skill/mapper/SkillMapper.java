package com.example.skill.mapper;

import com.example.skill.dto.SkillDto;
import com.example.skill.entity.Skill;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface SkillMapper extends BaseMapper<Skill, SkillDto> {
    @Override
    Skill toEntity(SkillDto skillDto);
}
