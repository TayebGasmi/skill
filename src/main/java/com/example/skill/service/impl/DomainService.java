package com.example.skill.service.impl;

import com.example.skill.dto.DomainDto;
import com.example.skill.entity.Domain;
import com.example.skill.entity.Skill;
import com.example.skill.repository.DomainRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public  class DomainService extends  BaseService<Domain,Long, DomainDto>  {
    private final DomainRepository domainRepository;
    public Page<Domain> findByName(String name, Pageable pageable) {
        return domainRepository.findByNameContainingIgnoreCase(name, pageable);
    }
}
