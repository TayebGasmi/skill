package com.example.skill.repository;

import com.example.skill.entity.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface BaseRepository<T extends BaseEntity, I extends Serializable> extends JpaRepository<T, I> {
}
