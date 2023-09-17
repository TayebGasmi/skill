package com.example.skill.controller;

import com.example.skill.dto.OptionDto;
import com.example.skill.entity.Option;
import com.example.skill.service.impl.OptionService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/option")
@RequiredArgsConstructor
@Slf4j
public class OptionController extends BaseController<Option, Long, OptionDto> {
    private  final OptionService optionService;
  @PostMapping("/{id}")
    ResponseEntity<Option> addOptionToQuestion(@PathVariable  Long id ,@RequestBody OptionDto optionDto){
      return new ResponseEntity<>(optionService.addOptionToQuestion(id, optionDto), HttpStatus.CREATED);
  }
}
