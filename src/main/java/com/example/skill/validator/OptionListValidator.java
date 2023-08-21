package com.example.skill.validator;

import com.example.skill.dto.OptionDto;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Set;

public class OptionListValidator implements ConstraintValidator<OptionList, Set<OptionDto>> {
    @Override
    public boolean isValid(Set<OptionDto> optionDtos, ConstraintValidatorContext constraintValidatorContext) {
        if (optionDtos == null)
            return false;
        return optionDtos.stream().anyMatch(OptionDto::isCorrect) && optionDtos.size() > 1;
    }
}
