package com.example.skill.dto;

import com.example.skill.entity.SkillLevel;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UserSkillDto {
    @NotNull
    private Long skillId;
    @NotNull

    private SkillLevel skillLevel;

}
