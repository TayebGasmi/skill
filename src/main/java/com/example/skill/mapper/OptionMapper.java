package com.example.skill.mapper;

import com.example.skill.dto.OptionDto;
import com.example.skill.entity.Option;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;


@Mapper(componentModel = "jsr330", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface OptionMapper extends BaseMapper<Option,OptionDto> {


}
