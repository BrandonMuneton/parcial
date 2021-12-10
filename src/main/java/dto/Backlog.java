package dto;

import java.util.List;

public class Backlog {

    private Long id;
    private String projectIdentifier;
    private Project project;
    private List<ProjectTask> projectTask;

    public Backlog() {
        super();
    }

    public Backlog(Long id, String projectIdentifier, Project project, List<ProjectTask> projectTask) {
        this.id = id;
        this.projectIdentifier = projectIdentifier;
        this.project = project;
        this.projectTask = projectTask;
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
