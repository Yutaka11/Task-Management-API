package com.example.TaskManagement.core.entities;

import com.example.TaskManagement.core.enuns.Status;

import java.time.LocalDateTime;

public record Task(Long id,
         String title,
         String description,
         Status status,
         LocalDateTime dueDate,
         LocalDateTime createdAt) {
}
