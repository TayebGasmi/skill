package com.example.skill.service.impl;

import com.example.skill.dto.ActivityDto;
import com.example.skill.entity.Activity;
import com.example.skill.entity.Domain;
import com.example.skill.repository.ActivityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public  class ActivityService extends BaseService <Activity,Long, ActivityDto> {
    private final ActivityRepository activityRepository;
    public Page<Activity> findByName(String name, Pageable pageable) {
        return activityRepository.findByNameContainingIgnoreCase(name, pageable);
    }
}
