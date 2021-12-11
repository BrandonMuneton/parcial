package com.cloud.parcial.repositories;

import com.cloud.parcial.intities.ProjectEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProjectRepository extends CrudRepository<ProjectEntity, Integer> {
}
