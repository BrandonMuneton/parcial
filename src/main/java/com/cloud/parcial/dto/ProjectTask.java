package com.cloud.parcial.dto;

import com.cloud.parcial.intities.BacklogEntity;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

public class ProjectTask {

    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    private String summary;
    private String acceptanceCriteria;

    private enum StatusEnum {
        PROGRESS,
        COMPLETED,
        DELETE,
        NOT_STARTED
    }

    private StatusEnum status;

    @Min(value = 1)
    @Max(value = 5)
    private int priority;

    @Min(value = 1)
    @Max(value = 8)
    private double horus;
    private Date startDate;
    private Date endDate;
    private String projectIdentifier;
    //TODO: JOIN
    private BacklogEntity backlogEntity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public double getHorus() {
        return horus;
    }

    public void setHorus(double horus) {
        this.horus = horus;
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

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }
}
