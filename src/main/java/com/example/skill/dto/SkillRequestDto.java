package com.example.skill.dto;

import com.example.skill.entity.SkillStatus;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class SkillRequestDto {
    @NotBlank(message = "Skill status must not be empty.")
    private SkillStatus skillStatus;
}
