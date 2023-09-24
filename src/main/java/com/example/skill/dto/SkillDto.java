package com.example.skill.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * Represents a skill with its associated information.
 */
@Data
public class SkillDto {
    /**
     * The name of the skill.
     * This field cannot be null or empty.
     */
    @NotBlank(message = "Skill name must not be empty.")
    private String name;

    /**
     * The description of the skill.
     */
    private String description;



}

