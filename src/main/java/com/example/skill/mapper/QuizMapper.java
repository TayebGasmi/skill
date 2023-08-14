package com.example.skill.mapper;


import com.example.skill.dto.QuizDto;
import com.example.skill.entity.Quiz;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "jsr330", unmappedTargetPolicy = ReportingPolicy.IGNORE)

public interface QuizMapper extends BaseMapper<Quiz, QuizDto> {


}
