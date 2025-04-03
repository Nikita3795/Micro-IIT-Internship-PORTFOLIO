package com.example.portfolio.service;

import com.example.portfolio.model.Project;
import com.example.portfolio.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    // Get all projects
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    // Get project by ID
    public Optional<Project> getProjectById(Long id) {
        return projectRepository.findById(id);
    }

    // Add new project
    public Project addProject(Project project) {
        return projectRepository.save(project);
    }

    // Update an existing project
    public Project updateProject(Long id, Project updatedProject) {
        return projectRepository.findById(id)
                .map(project -> {
                    project.setTitle(updatedProject.getTitle());
                    project.setDescription(updatedProject.getDescription());
                    project.setImageUrl(updatedProject.getImageUrl());
                    project.setGithubLink(updatedProject.getGithubLink());
                    project.setLiveDemoLink(updatedProject.getLiveDemoLink());
                    return projectRepository.save(project);
                }).orElseThrow(() -> new RuntimeException("Project not found with ID: " + id));
    }

    // Delete a project
    public void deleteProject(Long id) {
        projectRepository.deleteById(id);
    }
}
