package com.akash.taskmanager_spring_app.controller;

import com.akash.taskmanager_spring_app.dto.CreateTaskDto;
import com.akash.taskmanager_spring_app.entities.TaskEntity;
import com.akash.taskmanager_spring_app.services.TaskServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskServices taskServices;

    @GetMapping("/")
    public ResponseEntity<List<TaskEntity>> getAllTasks(){
        ArrayList<TaskEntity> tasks = taskServices.getTasks();
        return ResponseEntity.ok(tasks);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TaskEntity> getTaskByID(@PathVariable int id){
        TaskEntity task = taskServices.getTask(id);
        if(task==null){
            return  ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(task);
    }

    @PostMapping("/addTask")
    public ResponseEntity<TaskEntity> addTask(@RequestBody CreateTaskDto body){
        TaskEntity task = taskServices.addTask(body.getTitle(),body.getDescription());
        return ResponseEntity.ok(task);
    }

}
