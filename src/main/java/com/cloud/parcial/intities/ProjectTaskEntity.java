package com.cloud.parcial.intities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "projecttask", schema="public")
public class ProjectTaskEntity {

    @Id
    @Column(name = "idprojecttask")
    private Integer idProjectTask;
    private String name;
    private String summary;
    @Column(name = "acceptancecriteria")
    private String acceptanceCriteria;
    private String status;
    private int priority;
    @Column(name = "hours")
    private int horus;
    @Column(name = "startdate")
    private Date startDate;
    @Column(name = "enddate")
    private Date endDate;
    @Column(name = "projectidentifier")
    private String projectIdentifier;

    private String backlog;

    public ProjectTaskEntity(Integer idProjectTask, String name, String summary, String acceptanceCriteria,
                             String status, int priority, int horus, Date startDate, Date endDate,
                             String projectIdentifier, String backlog) {
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
        this.backlog = backlog;
    }

    public ProjectTaskEntity() {
        super();
    }

    public Integer getId() {
        return idProjectTask;
    }

    public void setId(Integer idProjectTask) {
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

    public String getBacklog() {
        return backlog;
    }

    public void setBacklog(String backlog) {
        this.backlog = backlog;
    }

    public int getHorus() {
        return horus;
    }

    public void setHorus(int horus) {
        this.horus = horus;
    }
}
