package com.cloud.parcial.controller;

import com.cloud.parcial.dto.Backlog;
import com.cloud.parcial.dto.Project;
import com.cloud.parcial.dto.ProjectTask;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
public class ApiController {

    @PostMapping("/backlog")
    public void addNewBacklog(@RequestBody @Valid Backlog backlog){

    }

    @PostMapping("/project")
    public void addNewProject(@RequestBody @Valid Project project){

    }

    @GetMapping("/project")
    public void viewAllProjects(){

    }

    @PostMapping("/task")
    public void addNewtask(@RequestBody @Valid ProjectTask projectTask){

    }

    @GetMapping("/task/project/{projectIdentifier}")
    public void viewAllTask(){

    }

    @GetMapping("/task/hours/project/{projectIdentifier}")
    public void allHoursProject(){

    }

    @GetMapping("/task/hours/project/{projectIdentifier}/{status}")
    public void allHoursProjectStatus(){

    }

    @DeleteMapping("/task/{idtask}/{projectIdentifier}")
    public void deletedTask(){

    }

}