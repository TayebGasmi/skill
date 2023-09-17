package com.example.skill.controller;

import com.example.skill.entity.BaseEntity;
import com.example.skill.service.impl.BaseService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.Collection;

@Slf4j
public abstract class BaseController<T extends BaseEntity, I extends Serializable, D> {
    @Autowired
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    private BaseService<T, I, D> baseService;

    @PostMapping
    public ResponseEntity<T> save(@RequestBody @Valid D dto) {

        return new ResponseEntity<>(baseService.add(dto), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<T> getById(@PathVariable I id) {
        return new ResponseEntity<>(baseService.findByID(id), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<T> update(@PathVariable I id, @Valid @RequestBody D dto) {


        return new ResponseEntity<>(baseService.update(dto, id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable I id) {
        baseService.deleteByID(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping
    public ResponseEntity<Page<T>> getAllWithPagination(@PageableDefault(size = 10, page = 0) Pageable pageable) {
        return new ResponseEntity<>(baseService.findAll(pageable), HttpStatus.OK);
    }
    @PutMapping("/delete")
    public ResponseEntity<Void> deleteAll(@RequestBody Collection<T> entities) {
        baseService.deleteAll(entities);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
