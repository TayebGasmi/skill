package com.example.skill.service.impl;

import com.example.skill.dto.OptionDto;
import com.example.skill.entity.Option;
import com.example.skill.repository.OptionRepository;
import com.example.skill.service.IOptionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OptionService extends BaseService<Option, Long, OptionDto> implements IOptionService {
    private final OptionRepository optionRepository;


}
