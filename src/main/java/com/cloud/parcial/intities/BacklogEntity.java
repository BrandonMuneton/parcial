package com.cloud.parcial.intities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "backlog", schema="public")
public class BacklogEntity {

    @Id
    @Column(name = "idbacklog")
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idBacklog;
    @Column(name = "projectidentifier")
    private String projectIdentifier;
    private String project;
    @Column(name = "projecttask")
    private String projectTask;

    public BacklogEntity(Integer idBacklog, String projectIdentifier, String project,
                         String projectTask) {
        this.idBacklog = idBacklog;
        this.projectIdentifier = projectIdentifier;
        this.project = project;
        this.projectTask = projectTask;
    }

    public BacklogEntity() {
        super();
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

    public Integer getIdBacklog() {
        return idBacklog;
    }

    public void setIdBacklog(Integer idBacklog) {
        this.idBacklog = idBacklog;
    }
}
