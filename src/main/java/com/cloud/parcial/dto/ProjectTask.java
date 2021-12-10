package com.cloud.parcial.dto;

import com.cloud.parcial.intities.BacklogEntity;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

public class ProjectTask {

    @NotEmpty
    private Long id;

    @NotEmpty
    private String name;

    @NotEmpty
    private String summary;
    private String acceptanceCriteria;


    private String status;

    //TODO: tiene rango
    private int priority;
    //TODO: tiene rango
    private double horus;
    private Date startDate;
    private Date endDate;
    private String projectIdentifier;
    //TODO: JOIN
    private BacklogEntity backlogEntity;

}
