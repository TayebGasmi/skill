package com.example.skill.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class QuizDto {
    @NotEmpty
    private String name;
    @NotEmpty
    private String description;
}
