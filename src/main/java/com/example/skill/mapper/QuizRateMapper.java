package com.example.skill.mapper;

import com.example.skill.dto.QuizRateDto;
import com.example.skill.entity.QuizRate;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "jsr330", unmappedTargetPolicy = ReportingPolicy.IGNORE)

public interface QuizRateMapper extends BaseMapper<QuizRate, QuizRateDto> {
}
