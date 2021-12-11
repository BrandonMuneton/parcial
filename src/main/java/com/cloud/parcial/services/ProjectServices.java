package com.cloud.parcial.services;

import com.cloud.parcial.dto.Project;
import com.cloud.parcial.intities.ProjectEntity;
import com.cloud.parcial.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProjectServices {

    @Autowired
    private ProjectRepository projectRepository;

    public ResponseEntity<?> addProject(Project project){

        boolean respId = projectRepository.existsById(project.getId());

        if(respId){
            return new ResponseEntity<>("El project ya existe", HttpStatus.BAD_REQUEST);
        }else{
            projectRepository.save(convertProjectToProjectEntity(project));
            return new ResponseEntity<>("Creacion exitosa del project", HttpStatus.CREATED);
        }
    }

    public ResponseEntity<?> getProject(){

        ArrayList<ProjectEntity> projectEntityArrayList;
        projectEntityArrayList = (ArrayList<ProjectEntity>) projectRepository.findAll();

        return new ResponseEntity<>(projectEntityArrayList, HttpStatus.CREATED);
    }

    private ProjectEntity convertProjectToProjectEntity(Project project){
        ProjectEntity projectEntity = new ProjectEntity();

        projectEntity.setIdProject(project.getId());
        projectEntity.setBacklog(project.getBacklog());
        projectEntity.setProjectIdentifier(project.getProjectIdentifier());
        projectEntity.setEndDate(project.getEndDate());
        projectEntity.setStartDate(project.getStartDate());
        projectEntity.setProjectName(project.getProjectName());
        projectEntity.setDescription(project.getDescription());

        return projectEntity;
    }
}
