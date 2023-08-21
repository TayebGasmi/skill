package com.example.skill.mapper;

import com.example.skill.dto.QuizRateDto;
import com.example.skill.entity.QuizRate;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, unmappedTargetPolicy = ReportingPolicy.IGNORE)

public interface QuizRateMapper extends BaseMapper<QuizRate, QuizRateDto> {
}
