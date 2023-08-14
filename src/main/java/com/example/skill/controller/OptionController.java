package com.example.skill.controller;

import com.example.skill.dto.OptionDto;
import com.example.skill.entity.Option;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/option")
public class OptionController extends BaseController<Option, Long, OptionDto> {

}
