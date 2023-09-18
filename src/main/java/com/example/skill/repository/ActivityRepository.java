package com.example.skill.repository;

import com.example.skill.entity.Activity;
import com.example.skill.entity.Option;
import com.example.skill.entity.Skill;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityRepository extends BaseRepository<Activity, Long> {
    Page<Activity> findByNameContainingIgnoreCase(String name, Pageable pageable);

}
