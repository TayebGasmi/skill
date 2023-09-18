package com.example.skill.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class DomainDto {
    @NotEmpty
    private String name;

}
