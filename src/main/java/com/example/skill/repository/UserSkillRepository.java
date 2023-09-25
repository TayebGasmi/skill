package com.example.skill.repository;

import com.example.skill.dto.ISkillUserResponse;
import com.example.skill.dto.SkillUserResponse;
import com.example.skill.entity.UserSkill;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserSkillRepository extends JpaRepository<UserSkill, Long> {
    List<UserSkill> findByUserId(String userId);
    @Query("SELECT s as skill, u.skillLevel as skillLevel,u.id as id FROM UserSkill u JOIN Skill s ON u.skillId = s.id WHERE u.userId = :userId")
    Page<ISkillUserResponse> findSkillUserResponsesByUserId(@Param("userId") String userId, Pageable pageable);
}
