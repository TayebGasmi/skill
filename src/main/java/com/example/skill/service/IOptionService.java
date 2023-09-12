package com.example.skill.service;


import com.example.skill.dto.OptionDto;
import com.example.skill.entity.Option;

public interface IOptionService {
    Option addOptionToQuestion(Long questionId, OptionDto option);
}
