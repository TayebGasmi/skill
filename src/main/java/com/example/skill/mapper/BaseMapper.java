package com.example.skill.mapper;

import org.mapstruct.Mapping;

public interface BaseMapper<T, D> {
    @Mapping(target = ".", ignore = true)
    T toEntity(D d);


}
