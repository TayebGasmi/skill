package com.example.skill.service.impl;

import com.example.skill.dto.OptionDto;
import com.example.skill.entity.Option;
import com.example.skill.entity.Question;
import com.example.skill.mapper.OptionMapper;
import com.example.skill.repository.OptionRepository;
import com.example.skill.repository.QuestionRepository;
import com.example.skill.service.IOptionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OptionService extends BaseService<Option, Long, OptionDto> implements IOptionService {

    private final OptionRepository optionRepository;
    private final QuestionRepository questionRepository;
    private final OptionMapper optionMapper;
    @Override
    public Option addOptionToQuestion(Long questionId, OptionDto option) {
        Question question = questionRepository.findById(questionId).orElseThrow(() -> new RuntimeException("Question not found"));
        Option optionEntity = optionMapper.toEntity(option);
        optionEntity.setQuestion(question);
        return optionRepository.save(optionEntity);
    }
}
