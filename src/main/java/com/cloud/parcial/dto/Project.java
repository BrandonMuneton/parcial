package com.cloud.parcial.dto;

import com.cloud.parcial.intities.BacklogEntity;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

public class Project {

    private Integer id;
    @NotBlank
    private String projectName;

    @NotBlank
    @Min(value = 5)
    @Max(value = 7)
    private String projectIdentifier;

    @NotBlank
    private String description;
    private Date startDate;
    private Date endDate;
    private String backlog;

    public Project(String projectName, String projectIdentifier, String description, Date startDate,
                   Date endDate, String backlog) {
        this.projectName = projectName;
        this.projectIdentifier = projectIdentifier;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.backlog = backlog;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
