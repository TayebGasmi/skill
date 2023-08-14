package com.example.skill.service;

import com.example.skill.entity.BaseEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

public interface IBaseService<T extends BaseEntity, I extends Serializable,D> {
    T add(D dto);

    T update(D dto,I id);

    void deleteByID(I id);

    T findByID(I id);

    Page<T> findAll(Pageable pageable);

    List<T> saveAll(Iterable<T> entities);
}
