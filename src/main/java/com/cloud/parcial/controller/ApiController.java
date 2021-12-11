package com.cloud.parcial.controller;

import com.cloud.parcial.dto.Backlog;
import com.cloud.parcial.dto.Project;
import com.cloud.parcial.dto.ProjectTask;
import com.cloud.parcial.services.BacklogServices;
import com.cloud.parcial.services.ProjectServices;
import com.cloud.parcial.services.ProjectTaskServices;
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
    @Autowired
    private final ProjectServices projectServices;
    @Autowired
    private final ProjectTaskServices projectTaskServices;

    public ApiController(BacklogServices backlogServices, ProjectServices projectServices,
                         ProjectTaskServices projectTaskServices) {
        this.backlogServices = backlogServices;
        this.projectServices = projectServices;
        this.projectTaskServices = projectTaskServices;
    }

    @PostMapping("/backlog")
    public ResponseEntity<?> addNewBacklog(@RequestBody @Valid Backlog backlog){

        ResponseEntity<?> result;

        try {
            result = backlogServices.addBacklog(backlog);
        }
        catch (Exception e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
            result = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return result;
    }

    @PostMapping("/project")
    public ResponseEntity<?>  addNewProject(@RequestBody @Valid Project project){
        ResponseEntity<?> result;

        try {
            result = projectServices.addProject(project);
        }
        catch (Exception e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
            result = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return result;
    }

    @GetMapping("/project")
    public ResponseEntity<?> viewAllProjects(){
        ResponseEntity<?> result;

        try {
            result = projectServices.getProject();
        }
        catch (Exception e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
            result = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return result;
    }

    @PostMapping("/task")
    public ResponseEntity<?> addNewTask(@RequestBody @Valid ProjectTask projectTask){
        ResponseEntity<?> result;

        try {
            result = projectTaskServices.addTask(projectTask);
        }
        catch (Exception e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
            result = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return result;
    }

    @GetMapping("/task/project/{projectIdentifier}")
    public ResponseEntity<?> viewAllTask(@PathVariable String projectIdentifier){
        ResponseEntity<?> result;

        try {
            result = projectTaskServices.getTaskForProject(projectIdentifier);
        }
        catch (Exception e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
            result = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return result;
    }

    @GetMapping("/task/hours/project/{projectIdentifier}")
    public ResponseEntity<?> allHoursProject(@PathVariable String projectIdentifier){
        ResponseEntity<?> result;

        try {
            result = projectTaskServices.getAllHour(projectIdentifier);
        }
        catch (Exception e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
            result = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return result;
    }

    @GetMapping("/task/hours/project/{projectIdentifier}/{status}")
    public ResponseEntity<?> allHoursProjectStatus(@PathVariable String projectIdentifier, @PathVariable String status){
        ResponseEntity<?> result;

        try {
            result = projectTaskServices.getAllHourForStatus(projectIdentifier, status);
        }
        catch (Exception e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
            result = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return result;
    }

    @DeleteMapping("/task/{idtask}/{projectIdentifier}")
    public ResponseEntity<?> deletedTask(@PathVariable Integer idtask, @PathVariable String projectIdentifier){

        try {
            return projectTaskServices.deleteTask(projectIdentifier, idtask);
        }
        catch (Exception e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}