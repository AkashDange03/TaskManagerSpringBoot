package com.akash.taskmanager_spring_app.services;

import com.akash.taskmanager_spring_app.entities.TaskEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

@Component
public class TaskServices {

    ArrayList<TaskEntity> tasks = new ArrayList<>();
    int task_id = 0;

    public ArrayList<TaskEntity> getTasks(){
        return tasks;
    }

    public TaskEntity addTask(String title , String description){
        TaskEntity task = new TaskEntity();
        task.setId(task_id);
        task.setTitle(title);
        task.setDescription(description);
        task.setCreatedAt(LocalDateTime.now());
        tasks.add(task);
        task_id++;
        return task;
    }

    public TaskEntity getTask(int id){
        for(TaskEntity task: tasks){
            if(task.getId()==id){
                return task;
            }
        }
        return null;
    }



}
