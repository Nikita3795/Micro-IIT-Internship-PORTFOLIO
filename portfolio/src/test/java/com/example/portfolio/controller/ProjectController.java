 package com.example.portfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.portfolio.service.ProjectService;
import com.example.portfolio.model.Project;
import com.example.portfolio.repository.ProjectRepository;

import java.util.List;
@RestController
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    private ProjectRepository projectRepository;

    @GetMapping
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }
}
