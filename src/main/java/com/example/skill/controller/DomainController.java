package com.example.skill.controller;

import com.example.skill.dto.DomainDto;
import com.example.skill.entity.Domain;
import com.example.skill.service.impl.DomainService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/domain")
@RequiredArgsConstructor
public class DomainController extends BaseController<Domain,Long, DomainDto> {
 private final DomainService domainService;
 @GetMapping("/search")
    public ResponseEntity<Page<Domain>> findSkillsByName(@RequestParam String name, @PageableDefault(size = 10, page = 0) Pageable pageable) {
        return ResponseEntity.ok(domainService.findByName(name, pageable));
    }
}
