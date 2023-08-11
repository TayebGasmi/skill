package com.example.skill.mapper;

import com.example.skill.dto.OptionDto;
import com.example.skill.entity.Option;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "jsr330")
public interface OptionMapper  {


    Option toEntity(OptionDto optionDto);
}
