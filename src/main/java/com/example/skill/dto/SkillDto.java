package com.example.skill.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class SkillDto {
    @NotEmpty
    private String name;
    private String description;
    private Long userId;
}
