package com.example.skill.mapper;

import com.example.skill.dto.QuestionDto;
import com.example.skill.entity.Question;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;


@Mapper(componentModel = "jsr330", unmappedTargetPolicy = ReportingPolicy.IGNORE)

public interface QuestionMapper extends BaseMapper<Question, QuestionDto> {
}
