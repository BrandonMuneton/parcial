package com.cloud.parcial.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.Date;

public class ProjectTask {

    private Integer id;

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
    private int horus;
    private Date startDate;
    private Date endDate;
    private String projectIdentifier;
    private String backlog;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public int getHorus() {
        return horus;
    }

    public void setHorus(int horus) {
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

    public String getBacklog() {
        return backlog;
    }

    public void setBacklog(String backlog) {
        this.backlog = backlog;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }
}
