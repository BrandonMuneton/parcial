package com.cloud.parcial.services;

import com.cloud.parcial.dto.ProjectTask;
import com.cloud.parcial.intities.ProjectTaskEntity;
import com.cloud.parcial.repositories.ProjectRepository;
import com.cloud.parcial.repositories.ProjectTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class ProjectTaskServices {

    @Autowired
    private ProjectTaskRepository projectTaskRepository;
    @Autowired
    private ProjectRepository projectRepository;

    public ResponseEntity<?> addTask(ProjectTask projectTask){

        boolean respId = projectRepository.existsById(projectTask.getId());

        if(respId ){
            return new ResponseEntity<>("El project ya existe", HttpStatus.BAD_REQUEST);
        }else{
            projectTaskRepository.save(convertProjectTaskToProjectTaskEntity(projectTask));
            return new ResponseEntity<>("Creacion exitosa del project", HttpStatus.CREATED);
        }
    }

    public ResponseEntity<?> getTaskForProject(String projectIdentifier){
        ResponseEntity<?> result;


        result = new ResponseEntity<>("Creacion exitosa del task", HttpStatus.CREATED);

        return result;
    }

    public ResponseEntity<?> getAllHour(String projectIdentifier){
        ResponseEntity<?> result;


        result = new ResponseEntity<>("Creacion exitosa del task", HttpStatus.CREATED);

        return result;
    }

    public ResponseEntity<?> getAllHourForStatus(String projectIdentifier, String status){
        ResponseEntity<?> result;


        result = new ResponseEntity<>("Consulta exitosa", HttpStatus.CREATED);

        return result;
    }

    public ResponseEntity<?> deleteTask(String projectIdentifier, Integer idtask){
        ResponseEntity<?> result;

        projectTaskRepository.deleteById(idtask);
        return new ResponseEntity<>("Delete exitoso", HttpStatus.CREATED);

    }

    private ProjectTaskEntity convertProjectTaskToProjectTaskEntity(ProjectTask projectTask){
        ProjectTaskEntity projectTaskEntity = new ProjectTaskEntity();

        projectTaskEntity.setId(projectTask.getId());
        projectTaskEntity.setName(projectTask.getName());
        projectTaskEntity.setSummary(projectTask.getSummary());
        projectTaskEntity.setAcceptanceCriteria(projectTask.getAcceptanceCriteria());
        projectTaskEntity.setStatus(String.valueOf(projectTask.getStatus()));
        projectTaskEntity.setPriority(projectTask.getPriority());
        projectTaskEntity.setHorus(projectTask.getHorus());
        projectTaskEntity.setStartDate(projectTask.getStartDate());
        projectTaskEntity.setEndDate(projectTask.getEndDate());
        projectTaskEntity.setProjectIdentifier(projectTask.getProjectIdentifier());
        projectTaskEntity.setBacklog(projectTask.getBacklog());

        return projectTaskEntity;
    }
}
