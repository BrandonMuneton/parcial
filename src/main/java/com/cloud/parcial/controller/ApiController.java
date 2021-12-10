package com.cloud.parcial.controller;

import com.cloud.parcial.dto.Backlog;
import com.cloud.parcial.dto.Project;
import com.cloud.parcial.dto.ProjectTask;
import com.cloud.parcial.services.BacklogServices;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
public class ApiController {

    private static final Logger LOGGER = Logger.getLogger(ApiController.class.getName());

    @Autowired
    private final BacklogServices backlogServices;

    public ApiController(BacklogServices backlogServices) {
        this.backlogServices = backlogServices;
    }

    @PostMapping("/backlog")
    public ResponseEntity<?> addNewBacklog(@RequestBody @Valid Backlog backlog){

        ResponseEntity<?> result;

        try {
            result = new ResponseEntity<>(backlogServices.addBacklog(backlog), HttpStatus.OK);
        }
        catch (Exception e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
            result = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return result;
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