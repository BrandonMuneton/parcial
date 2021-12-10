package controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ApiController {

    @PostMapping("/backlog")
    public void addNewBacklog(){

    }

    @PostMapping("/project")
    public void addNewProject(){

    }

    @PostMapping("/task")
    public void addNewtask(){

    }

    @GetMapping("/project")
    public void viewAllProjects(){

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
