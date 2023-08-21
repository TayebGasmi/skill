package com.example.skill.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * Represents an option with its associated text.
 */
@Data
public class OptionDto {
    /**
     * The text content of the option.
     * This field cannot be null or empty.
     */
    @NotBlank(message = "Option text must not be empty.")
    private String optionText;
    @NotNull()
    private boolean isCorrect;
}
