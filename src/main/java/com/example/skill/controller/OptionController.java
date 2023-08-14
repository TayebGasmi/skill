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
@RequestMapping("/option")
public class OptionController extends BaseController<Option,Long,OptionDto> {

}
