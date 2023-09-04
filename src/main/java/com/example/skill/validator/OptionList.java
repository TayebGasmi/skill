package com.example.skill.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = OptionListValidator.class)
@Documented
public @interface OptionList {
    String message() default "{at least include 2 options  and one option at least should be correct by correct and all option text should be unique }";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
