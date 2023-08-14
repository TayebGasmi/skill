package com.example.skill.service.impl;

import com.example.skill.entity.BaseEntity;
import com.example.skill.error.EntityNotFoundException;
import com.example.skill.mapper.BaseMapper;
import com.example.skill.repository.BaseRepository;
import com.example.skill.service.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public abstract class BaseService<T extends BaseEntity, I extends Serializable,D> implements IBaseService<T, I,D> {
    @Autowired
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    private BaseRepository<T, I> repository;
    @Autowired
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    private BaseMapper<T, D> mapper;
    @Override
    public T add(D dto) {
        return repository.save(mapper.toEntity(dto));
    }

    @Override
    public T update(D dto,I id) {
        T existingEntity = findByID( id);
        T updatedEntity = mapper.toEntity(dto);
        updatedEntity.setId(existingEntity.getId());
        return repository.save(updatedEntity);
    }

    @Override
    public void deleteByID(I id) {
        repository.deleteById(id);
    }

    @Override
    public T findByID(I id) {
        return repository.findById(id).orElseThrow(() -> new EntityNotFoundException((Class<T>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0]));
    }

    @Override
    public List<T> saveAll(Iterable<T> entities) {
        return repository.saveAll(entities);
    }

    @Override
    public Page<T> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }
}
