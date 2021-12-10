package com.cloud.parcial.dto;

import javax.validation.constraints.NotEmpty;
import java.util.List;

public class Backlog {

    @NotEmpty
    private String projectIdentifier;
    private Project project;
    private List<ProjectTask> projectTask;

    public Backlog() {
        super();
    }

    public Backlog( String projectIdentifier, Project project, List<ProjectTask> projectTask) {
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

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public List<ProjectTask> getProjectTask() {
        return projectTask;
    }

    public void setProjectTask(List<ProjectTask> projectTask) {
        this.projectTask = projectTask;
    }
}
