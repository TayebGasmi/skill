package com.example.skill.mapper;

import com.example.skill.dto.JobDto;
import com.example.skill.entity.Job;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, unmappedTargetPolicy = ReportingPolicy.IGNORE)

public interface JobMapper extends BaseMapper<Job, JobDto>  {

}
