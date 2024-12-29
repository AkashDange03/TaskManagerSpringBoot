package com.akash.taskmanager_spring_app.dto;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class CreateTaskDto {
    String title;
    String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
