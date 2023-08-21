package com.example.skill.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.Date;

/**
 * Represents the score given for a quiz.
 */
@Data
public class QuizRateDto {
    /**
     * The score value.
     * This field cannot be null.
     */
    @NotNull(message = "Score must not be null.")
    private Float score;
    private Date ratedAt = new Date();

}