package com.cloud.parcial.dto;

import javax.validation.constraints.NotBlank;

public class Backlog {

    private Integer id;
    @NotBlank
    private String projectIdentifier;
    private String project;
    private String projectTask;

    public Backlog() {
        super();
    }

    public Backlog(Integer id, String projectIdentifier, String project, String projectTask) {
        this.id = id;
        this.projectIdentifier = projectIdentifier;
        this.project = project;
        this.projectTask = projectTask;
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

    public String getProjectTask() {
        return projectTask;
    }

    public void setProjectTask(String projectTask) {
        this.projectTask = projectTask;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
