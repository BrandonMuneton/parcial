package com.cloud.parcial.intities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "")//TODO: nombre de la tabla en la BD
public class ProjectTaskEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProjectTask;
    private String name;
    private String summary;
    private String acceptanceCriteria;
    private String status;
    private int priority;
    private double horus;
    private Date startDate;
    private Date endDate;
    private String projectIdentifier;

    @ManyToOne
    @JoinColumn(name = "idBacklog")
    private BacklogEntity backlogEntity;

    public ProjectTaskEntity(Long idProjectTask, String name, String summary, String acceptanceCriteria,
                             String status, int priority, double horus, Date startDate, Date endDate,
                             String projectIdentifier, BacklogEntity backlogEntity) {
        this.idProjectTask = idProjectTask;
        this.name = name;
        this.summary = summary;
        this.acceptanceCriteria = acceptanceCriteria;
        this.status = status;
        this.priority = priority;
        this.horus = horus;
        this.startDate = startDate;
        this.endDate = endDate;
        this.projectIdentifier = projectIdentifier;
        this.backlogEntity = backlogEntity;
    }

    public ProjectTaskEntity() {
        super();
    }

    public Long getId() {
        return idProjectTask;
    }

    public void setId(Long idProjectTask) {
        this.idProjectTask = idProjectTask;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getAcceptanceCriteria() {
        return acceptanceCriteria;
    }

    public void setAcceptanceCriteria(String acceptanceCriteria) {
        this.acceptanceCriteria = acceptanceCriteria;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
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

    public String getProjectIdentifier() {
        return projectIdentifier;
    }

    public void setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
    }

    public BacklogEntity getBacklogEntity() {
        return backlogEntity;
    }

    public void setBacklogEntity(BacklogEntity backlogEntity) {
        this.backlogEntity = backlogEntity;
    }

    public double getHorus() {
        return horus;
    }

    public void setHorus(double horus) {
        this.horus = horus;
    }
}
