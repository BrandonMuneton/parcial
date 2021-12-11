package com.cloud.parcial.intities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "project", schema="public")
public class ProjectEntity {

    @Id
    @Column(name = "idproject")
    private Integer idProject;
    @Column(name = "projectname")
    private String projectName;
    @Column(name = "projectidentifier")
    private String projectIdentifier;
    private String description;
    @Column(name = "startdate")
    private Date startDate;
    @Column(name = "enddate")
    private Date endDate;

    private String backlog;

    public ProjectEntity(Integer idProject, String projectName, String projectIdentifier, String description,
                         Date startDate, Date endDate, String backlog) {
        this.idProject = idProject;
        this.projectName = projectName;
        this.projectIdentifier = projectIdentifier;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.backlog = backlog;
    }


    public ProjectEntity() {
        super();
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectIdentifier() {
        return projectIdentifier;
    }

    public void setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getBacklog() {
        return backlog;
    }

    public void setBacklog(String backlog) {
        this.backlog = backlog;
    }

    public Integer getIdProject() {
        return idProject;
    }

    public void setIdProject(Integer idProject) {
        this.idProject = idProject;
    }
}
