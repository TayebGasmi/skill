    package com.example.skill.mapper;


    public interface BaseMapper<T, D> {
        T toEntity(D d);


    }
