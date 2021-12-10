package com.cloud.parcial.intities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
public class BacklogEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String projectIdentifier;
    private String project;
    //TODO: JOIN
    private List<ProjectTaskEntity> projectTaskEntityList;

    public BacklogEntity(Long id, String projectIdentifier, String project,
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

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public List<ProjectTaskEntity> getProjectTaskEntityList() {
        return projectTaskEntityList;
    }

    public void setProjectTaskEntityList(List<ProjectTaskEntity> projectTaskEntityList) {
        this.projectTaskEntityList = projectTaskEntityList;
    }
}
