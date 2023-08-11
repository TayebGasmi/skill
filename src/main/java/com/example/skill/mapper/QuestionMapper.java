package com.example.skill.mapper;

import com.example.skill.dto.QuestionDto;
import com.example.skill.entity.Question;

//@Mapper(componentModel = "jsr330")
public interface QuestionMapper extends BaseMapper<Question, QuestionDto> {
}
