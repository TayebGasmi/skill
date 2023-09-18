package com.example.skill.repository;

import com.example.skill.entity.Domain;
import com.example.skill.entity.Skill;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
public interface DomainRepository extends BaseRepository<Domain, Long> {
    Page<Domain> findByNameContainingIgnoreCase(String name, Pageable pageable);

}
