package com.cloud.parcial.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

public class Backlog {

    @NotBlank
    private String projectIdentifier;
    private String project;
    private String projectTask;

    public Backlog() {
        super();
    }

    public Backlog(String projectIdentifier, String project, String projectTask) {
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
}
