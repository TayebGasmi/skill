package com.example.skill.repository;

import com.example.skill.entity.Skill;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SkillRepository extends BaseRepository<Skill, Long> {
    List<Skill> findAllByUserId(Long userId);
}
