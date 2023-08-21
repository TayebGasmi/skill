package com.example.skill.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * Represents a quiz with its associated name and description.
 */
@Data
public class QuizDto {
    /**
     * The name of the quiz.
     * This field cannot be null or empty.
     */
    @NotBlank(message = "Quiz name must not be empty.")
    private String name;

    /**
     * The description of the quiz.
     * This field cannot be null or empty.
     */
    @NotBlank(message = "Quiz description must not be empty.")
    private String description;
}
