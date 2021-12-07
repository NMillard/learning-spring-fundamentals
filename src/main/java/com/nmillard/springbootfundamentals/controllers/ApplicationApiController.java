package com.nmillard.springbootfundamentals.controllers;

import com.nmillard.springbootfundamentals.models.Application;
import com.nmillard.springbootfundamentals.repositories.ApplicationRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/application")
public class ApplicationApiController {

    private final ApplicationRepository repository;

    public ApplicationApiController(ApplicationRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public ResponseEntity<List<Application>> getApplications() {
        List<Application> all = (List<Application>) repository.findAll();
        return new ResponseEntity<>(all, HttpStatus.OK);
    }
}
