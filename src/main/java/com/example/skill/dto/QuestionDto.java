package com.example.skill.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * Represents a question along with its associated response description.
 */
@Data
public class QuestionDto {
    /**
     * The text content of the question.
     * This field cannot be null or empty.
     */
    @NotBlank(message = "Question text must not be empty.")
    private String questionText;

    /**
     * The description of the response to the question.
     * This field cannot be null or empty.
     */
    @NotBlank(message = "Response description must not be empty.")
    private String responseDescription;

}
