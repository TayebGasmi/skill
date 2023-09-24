package com.example.skill.repository;

import com.example.skill.entity.Job;
import com.example.skill.entity.Skill;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends BaseRepository<Job,Long> {
    Page<Job> findByNameContainingIgnoreCase(String name, Pageable pageable);
}
