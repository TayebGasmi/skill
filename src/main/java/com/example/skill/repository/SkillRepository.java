package com.example.skill.repository;

import com.example.skill.entity.Skill;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends BaseRepository<Skill, Long> {
    Page<Skill> findByNameContainingIgnoreCase(String name, Pageable pageable);
}
