package com.example.skill.mapper;

import org.mapstruct.MappingTarget;

/**
 * A generic interface for mapping between entities and DTOs.
 *
 * @param <T> The entity type.
 * @param <D> The DTO type.
 */
public interface BaseMapper<T, D> {
    /**
     * Converts a DTO to an entity.
     *
     * @param d The DTO to convert.
     * @return The corresponding entity.
     */
    T toEntity(D d);

    void toEntityUpdate(D d, @MappingTarget T t);

}
