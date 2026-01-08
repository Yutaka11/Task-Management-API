package com.example.TaskManagement.infraestructure.dtos;

import com.example.TaskManagement.core.enuns.Stats;

import java.time.LocalDateTime;

public record TaskDto(Long id,
                      String title,
                      String description,
                      Stats stats,
                      LocalDateTime dueDate,
                      LocalDateTime createdAt) {
}
