package com.nmillard.springbootfundamentals.controllers;

import com.nmillard.springbootfundamentals.repositories.ApplicationRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {
    private final ApplicationRepository repository;

    public ApplicationController(ApplicationRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/applications")
    public String getApplications(Model model) {
        model.addAttribute("applications", repository.findAll());
        return "applications";
    }
}
