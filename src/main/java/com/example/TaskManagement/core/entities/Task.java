package com.example.TaskManagement.core.entities;

import com.example.TaskManagement.core.enuns.Stats;

import java.time.LocalDateTime;

public record Task(Long id,
         String title,
         String description,
         Stats stats,
         LocalDateTime dueDate,
         LocalDateTime createdAt) {
}
