package com.example.TaskManagement.infraestructure.mapper;

import com.example.TaskManagement.core.entities.Task;
import com.example.TaskManagement.infraestructure.dtos.TaskDto;
import org.springframework.stereotype.Component;

@Component
public class TaskDtoMapper {
    public Task toDomain (TaskDto taskDto){
        return new Task(
                taskDto.id(),
                taskDto.title(),
                taskDto.description(),
                taskDto.status(),
                taskDto.dueDate(),
                taskDto.createdAt()
        );
    }

    public TaskDto toDto(Task task){
        return new TaskDto(
                task.id(),
                task.title(),
                task.description(),
                task.status(),
                task.dueDate(),
                task.createdAt()
        );
    }
}

