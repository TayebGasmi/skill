package com.example.skill.validator;

import com.example.skill.dto.OptionDto;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.List;

public class OptionListValidator implements ConstraintValidator<OptionList, List<OptionDto>> {
    @Override
    public boolean isValid(List<OptionDto> optionDtos, ConstraintValidatorContext constraintValidatorContext) {
        if (optionDtos == null)
            return false;
        //verify that are option text are unique
        if (optionDtos.stream().map(OptionDto::getOptionText).distinct().count() != optionDtos.size())
            return false;
        return optionDtos.stream().anyMatch(OptionDto::isCorrect) && optionDtos.size() > 1;
    }
}
