package com.example.TaskManagement.infraestructure.mapper;

import com.example.TaskManagement.core.entities.Task;
import com.example.TaskManagement.infraestructure.persistence.TaskEntity;
import org.springframework.stereotype.Component;

@Component
public class TaskEntityMapper {
    public TaskEntity toEntity(Task task){
        return new TaskEntity(
                task.id(),
                task.title(),
                task.description(),
                task.status(),
                task.dueDate(),
                null
        );
    }

    public Task toDomain(TaskEntity taskEntity){
        return new Task(
                taskEntity.getId(),
                taskEntity.getTitle(),
                taskEntity.getDescription(),
                taskEntity.getStatus(),
                taskEntity.getDueDate(),
                taskEntity.getCreateAt()
        );
    }

}
