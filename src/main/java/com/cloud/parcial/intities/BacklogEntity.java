package com.cloud.parcial.intities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "")//TODO: nombre de la tabla en la BD
public class BacklogEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String projectIdentifier;

    @OneToOne
    @JoinColumn(name = "id")
    private ProjectEntity project;

    @OneToMany
    @JoinColumn(name = "id")
    private List<ProjectTaskEntity> projectTaskEntityList;

    public BacklogEntity(Long id, String projectIdentifier, ProjectEntity project,
                         List<ProjectTaskEntity> projectTaskEntityList) {
        this.id = id;
        this.projectIdentifier = projectIdentifier;
        this.project = project;
        this.projectTaskEntityList = projectTaskEntityList;
    }

    public BacklogEntity() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjectIdentifier() {
        return projectIdentifier;
    }

    public void setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
    }

    public ProjectEntity getProject() {
        return project;
    }

    public void setProject(ProjectEntity project) {
        this.project = project;
    }

    public List<ProjectTaskEntity> getProjectTaskEntityList() {
        return projectTaskEntityList;
    }

    public void setProjectTaskEntityList(List<ProjectTaskEntity> projectTaskEntityList) {
        this.projectTaskEntityList = projectTaskEntityList;
    }
}
