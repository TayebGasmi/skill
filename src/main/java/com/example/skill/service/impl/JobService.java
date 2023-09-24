package com.example.skill.service.impl;

import com.example.skill.dto.JobDto;
import com.example.skill.entity.Job;
import com.example.skill.entity.Skill;
import com.example.skill.repository.JobRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
@RequiredArgsConstructor
public class JobService extends BaseService<Job,Long, JobDto> {
    private final JobRepository jobRepository;
    public Page<Job> findByName(String name, Pageable pageable) {
        return jobRepository.findByNameContainingIgnoreCase(name, pageable);
    }
}
