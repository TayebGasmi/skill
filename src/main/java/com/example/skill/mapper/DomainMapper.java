package com.example.skill.mapper;

import com.example.skill.dto.DomainDto;
import com.example.skill.entity.Domain;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DomainMapper extends BaseMapper<Domain, DomainDto> {
}
