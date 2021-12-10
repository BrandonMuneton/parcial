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
        ResponseEntity<?> result;

        result = new ResponseEntity<>("Creacion exitosa", HttpStatus.CREATED);
        //backlogRepository.save();

        return result;
    }

//    private BacklogEntity convertDtoToEntity(Backlog backlog){
//        BacklogEntity backlogEntity = new BacklogEntity();
//        List<ProjectTaskEntity> projectTaskEntityList;
//
//        backlogEntity.setId();
//        backlogEntity.setProject();
//        backlogEntity.setProjectIdentifier();
//        backlogEntity.setProjectTaskEntityList();
//
//        return backlogEntity;
//    }
}
