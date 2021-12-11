package com.cloud.parcial.services;

import com.cloud.parcial.dto.Backlog;
import com.cloud.parcial.intities.BacklogEntity;
import com.cloud.parcial.intities.ProjectTaskEntity;
import com.cloud.parcial.repositories.BacklogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BacklogServices {

    @Autowired
    private BacklogRepository backlogRepository;

    public ResponseEntity<?> addBacklog(Backlog backlog){

        try{
            backlogRepository.save(convertDtoToEntity(backlog));
            return new ResponseEntity<>("Creacion exitosa", HttpStatus.CREATED);

        }catch (Exception e){
            System.out.println(e.getMessage());
            return new ResponseEntity<>("Fallo", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    private BacklogEntity convertDtoToEntity(Backlog backlog){
        BacklogEntity backlogEntity = new BacklogEntity();

        backlogEntity.setIdBacklog(backlog.getId());
        backlogEntity.setProjectIdentifier(backlog.getProjectIdentifier());
        backlogEntity.setProjectTask(backlog.getProjectTask());
        backlogEntity.setProject(backlog.getProject());

        return backlogEntity;
    }
}
