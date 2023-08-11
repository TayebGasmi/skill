package com.example.skill.controller;

import com.example.skill.dto.OptionDto;
import com.example.skill.entity.Option;
import com.example.skill.mapper.OptionMapper;
import com.example.skill.service.impl.OptionService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/option")
public class OptionController {
    private final OptionService optionService;
    private final OptionMapper optionMapper;

    @PostMapping
    public ResponseEntity<Option> saveOption(@RequestBody @Valid OptionDto optionDto) {
        Option option = optionMapper.toEntity(optionDto);
        return new ResponseEntity<>(optionService.add(option), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Option> getOptionById(@PathVariable Long id) {
        return new ResponseEntity<>(optionService.findByID(id), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Option> updateOption(@PathVariable Long id, @Valid @RequestBody OptionDto optionDto) {
        Option existingOption = optionService.findByID(id);
        Option updatedOption = optionMapper.toEntity(optionDto);
        updatedOption.setId(existingOption.getId());

        return new ResponseEntity<>(optionService.update(updatedOption), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOption(@PathVariable Long id) {
        optionService.deleteByID(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping
    public ResponseEntity<Page<Option>> getAllOptionsWithPagination(@PageableDefault(size = 10, page = 0) Pageable pageable) {
        Page<Option> options = optionService.findAll(pageable);
        return new ResponseEntity<>(options, HttpStatus.OK);
    }
}
