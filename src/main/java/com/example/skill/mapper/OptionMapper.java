package com.example.skill.mapper;

import com.example.skill.dto.SkillDto;
import com.example.skill.entity.Skill;
import org.mapstruct.Mapper;

@Mapper
public interface OptionMapper {
    Skill skillDtoToSkill(SkillDto skillDto);
    SkillDto skillToSkillDto(Skill skill);
}
