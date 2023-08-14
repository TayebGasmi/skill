package com.example.skill.mapper;

import com.example.skill.entity.Skill;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "jsr330", unmappedTargetPolicy = ReportingPolicy.IGNORE)

public interface SkillMapper extends BaseMapper<Skill, SkillMapper> {

}
