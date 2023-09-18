package com.example.skill.mapper;

import com.example.skill.dto.ActivityDto;
import com.example.skill.entity.Activity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ActivityMapper extends BaseMapper<Activity, ActivityDto>{
}
