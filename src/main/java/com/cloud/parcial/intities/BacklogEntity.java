package com.cloud.parcial.intities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "")//TODO: nombre de la tabla en la BD
public class BacklogEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBacklog;
    private String projectIdentifier;

    @OneToOne
    @JoinColumn(name = "idProject")
    private ProjectEntity project;

    @OneToMany
    @JoinColumn(name = "idProjectTask")
    private List<ProjectTaskEntity> projectTaskEntityList;

    public BacklogEntity(Long idBacklog, String projectIdentifier, ProjectEntity project,
                         List<ProjectTaskEntity> projectTaskEntityList) {
        this.idBacklog = idBacklog;
        this.projectIdentifier = projectIdentifier;
        this.project = project;
        this.projectTaskEntityList = projectTaskEntityList;
    }

    public BacklogEntity() {
        super();
    }

    public Long getId() {
        return idBacklog;
    }

    public void setId(Long id) {
        this.idBacklog = idBacklog;
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
