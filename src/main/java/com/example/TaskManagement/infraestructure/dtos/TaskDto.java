package com.example.TaskManagement.infraestructure.dtos;

import com.example.TaskManagement.core.enuns.Status;

import java.time.LocalDateTime;

public record TaskDto(Long id,
                      String title,
                      String description,
                      Status status,
                      LocalDateTime dueDate,
                      LocalDateTime createAt) {
}
