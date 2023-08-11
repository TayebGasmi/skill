package com.example.skill.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class QuestionDto {
    @NotEmpty
    private String questionText;
    @NotEmpty
    private String responseDescription;
}
