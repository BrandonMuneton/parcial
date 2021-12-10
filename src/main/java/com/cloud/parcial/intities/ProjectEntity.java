package com.cloud.parcial.intities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "")//TODO: nombre de la tabla en la BD
public class ProjectEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProject;
    private String projectName;
    private String projectIdentifier;
    private String description;
    private Date startDate;
    private Date endDate;

    @OneToOne
    @JoinColumn(name = "idBacklog")
    private BacklogEntity backlogEntity;

    public ProjectEntity(Long idProject, String projectName, String projectIdentifier, String description,
                         Date startDate, Date endDate, BacklogEntity backlogEntity) {
        this.idProject = idProject;
        this.projectName = projectName;
        this.projectIdentifier = projectIdentifier;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.backlogEntity = backlogEntity;
    }


    public ProjectEntity() {
        super();
    }

    public Long getId() {
        return idProject;
    }

    public void setId(Long id) {
        this.idProject = idProject;
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

    public BacklogEntity getBacklogEntity() {
        return backlogEntity;
    }

    public void setBacklogEntity(BacklogEntity backlogEntity) {
        this.backlogEntity = backlogEntity;
    }
}
