package com.example.skill.service.impl;

import com.example.skill.entity.Question;
import com.example.skill.entity.Skill;
import com.example.skill.repository.SkillRepository;
import com.example.skill.service.IQuestionService;
import com.example.skill.service.ISkillService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QuestionService extends BaseService<Question,Long> implements IQuestionService {
    private final SkillRepository skillRepository;


}
