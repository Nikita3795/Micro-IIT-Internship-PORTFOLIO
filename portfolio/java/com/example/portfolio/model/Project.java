package com.example.portfolio.model;

import lombok.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Project {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String imageUrl;
    private String githubLink;
    private String liveDemoLink;
}
