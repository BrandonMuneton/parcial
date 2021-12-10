package com.cloud.parcial.services;

import com.cloud.parcial.dto.ProjectTask;
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
        ResponseEntity<?> result;

        //TODO: primer consultar si el projecto ya existe
/*        boolean respId = projectRepository.existsById();
        boolean respIdentifier = projectRepository.existsById(); //TODO: crear query

        if(respId || respIdentifier){
            result = new ResponseEntity<>("El project ya existe", HttpStatus.BAD_REQUEST);
        }else{
            result = new ResponseEntity<>("Creacion exitosa del project", HttpStatus.CREATED);
            //projectRepository.save();
        }*/

        result = new ResponseEntity<>("Creacion exitosa del task", HttpStatus.CREATED);

        return result;
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

    public ResponseEntity<?> deleteTask(String projectIdentifier, String idtask){
        ResponseEntity<?> result;

        result = new ResponseEntity<>("Delete exitoso", HttpStatus.CREATED);

        return result;
    }
}
