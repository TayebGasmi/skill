package com.example.skill.repository;

import com.example.skill.entity.Skill;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends BaseRepository<Skill, Long> {
    @Query("SELECT s FROM Skill s " +
            "LEFT JOIN s.activity a " +
            "LEFT JOIN s.domain d " +
            "WHERE lower(a.name) LIKE lower(concat('%', :activityName, '%')) " +
            "OR lower(d.name) LIKE lower(concat('%', :domainName, '%')) " +
            "OR lower(s.name) LIKE lower(concat('%', :skillName, '%'))")
    Page<Skill> findByActivityNameOrDomainNameOrSkillName(
            @Param("activityName") String activityName,
            @Param("domainName") String domainName,
            @Param("skillName") String skillName,
            Pageable pageable);
}

