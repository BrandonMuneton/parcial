package com.cloud.parcial.dto;

import com.cloud.parcial.intities.BacklogEntity;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

public class Project {

    @NotEmpty
    private String projectName;

    @NotEmpty
    @Min(value = 5)
    @Max(value = 7)
    private String projectIdentifier;

    @NotEmpty
    private String description;
    private Date startDate;
    private Date endDate;
    //TODO: JOIN
    private BacklogEntity backlogEntity;

}
