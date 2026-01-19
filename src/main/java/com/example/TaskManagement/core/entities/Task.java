package com.example.TaskManagement.core.entities;

import com.example.TaskManagement.core.enuns.Status;

import java.time.LocalDateTime;

public record Task(
         Long id,
         String title,
         String description,
         Status status,
         LocalDateTime dueDate,
         LocalDateTime createdAt) {
    public Task update(
            String title,
            String description,
            Status status,
            LocalDateTime dueDate
    ) {
        return new Task(
                id,
                title != null ? title : this.title,
                description != null ? description : this.description,
                status != null ? status : this.status,
                dueDate != null ? dueDate : this.dueDate,
                createdAt
        );
    }
}
