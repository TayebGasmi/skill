package com.example.skill.service.impl;

import com.example.skill.entity.BaseEntity;
import com.example.skill.error.EntityNotFoundException;
import com.example.skill.mapper.BaseMapper;
import com.example.skill.repository.BaseRepository;
import com.example.skill.service.IBaseService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.Collection;
import java.util.List;

@Transactional
public abstract class BaseService<T extends BaseEntity, I extends Serializable, D> implements IBaseService<T, I, D> {
    @Autowired
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    private BaseRepository<T, I> repository;

    @Override
    public List<T> getAll() {
        return repository.findAll();
    }

    @Autowired
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    private BaseMapper<T, D> mapper;

    @Override
    public T add(D dto) {
        return repository.save(mapper.toEntity(dto));
    }

    @Override
    public T update(D dto, I id) {
        T entity = findByID(id);
        mapper.toEntityUpdate(dto, entity);
        return repository.save(entity);
    }

    @Override
    public void deleteAll(Collection<T> entities) {
         repository.deleteAll(entities);
    }

    @Override
    public void deleteByID(I id) {
        T entity = findByID(id);
        repository.deleteById(id);

    }

    @Override
    public T findByID(I id) {
        return repository.findById(id).orElseThrow(() -> new EntityNotFoundException((Class<T>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0]));
    }

    @Override
    public Collection<T> saveAll(Collection<T> entities) {
        return repository.saveAll(entities);
    }


    @Override
    public Page<T> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }
}
