package com.example.skill.mapper;

import com.example.skill.dto.SkillRequestDto;
import com.example.skill.entity.SkillRequest;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface SkillRequestMapper extends BaseMapper<SkillRequest, SkillRequestDto> {
}
