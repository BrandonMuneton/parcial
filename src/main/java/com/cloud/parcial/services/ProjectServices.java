package com.cloud.parcial.services;

import com.cloud.parcial.dto.Project;
import com.cloud.parcial.intities.ProjectEntity;
import com.cloud.parcial.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProjectServices {

    @Autowired
    private ProjectRepository projectRepository;

    public ResponseEntity<?> addProject(Project project){
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

        result = new ResponseEntity<>("Creacion exitosa del project", HttpStatus.CREATED);

        return result;
    }

    public ResponseEntity<?> getProject(){
        ResponseEntity<?> result;

        //projectRepository.findAll();

        result = new ResponseEntity<>("Creacion exitosa del project", HttpStatus.CREATED);

        return result;
    }
}
