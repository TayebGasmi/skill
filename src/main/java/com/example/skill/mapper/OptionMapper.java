package com.example.skill.mapper;

import com.example.skill.dto.OptionDto;
import com.example.skill.entity.Option;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface OptionMapper extends BaseMapper<Option, OptionDto> {
    @Override

    // To avoid overwriting the existing question
    @Mapping(source = "correct", target = "isCorrect")
    Option toEntity(OptionDto optionDto);

}
