package com.example.skill.dto;

import com.example.skill.validator.OptionList;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import java.util.List;

@Data
public class QuestionWithOptionsDto {
    QuestionDto questionDto;
    @NotEmpty()
    @OptionList()
    private List<OptionDto> options;
}
