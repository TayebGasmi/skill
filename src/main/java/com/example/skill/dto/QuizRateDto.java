package com.example.skill.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class QuizRateDto {
    @NotNull
    private Float score;
}
