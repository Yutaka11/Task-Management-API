package com.example.TaskManagement.infraestructure.gateway;

import com.example.TaskManagement.core.entities.Task;
import com.example.TaskManagement.core.gateway.TaskGateway;
import com.example.TaskManagement.infraestructure.mapper.TaskEntityMapper;
import com.example.TaskManagement.infraestructure.persistence.TaskEntity;
import com.example.TaskManagement.infraestructure.persistence.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class TaskRepositoryGateway implements TaskGateway {

    private final TaskRepository taskRepository;
    private final TaskEntityMapper taskEntityMapper;

    @Override
    public Task CreateTask(Task task) {
        TaskEntity taskEntity = taskEntityMapper.toEntity(task);
        taskEntity.setCreateAt(LocalDateTime.now());
        TaskEntity newTask = taskRepository.save(taskEntity);
        return taskEntityMapper.toDomain(newTask);
    }

    @Override
    public List<Task> ListTask() {
        return taskRepository.findAll()
                .stream()
                .map(taskEntityMapper::toDomain)
                .toList();
    }

    @Override
    public Task GetTaskById(Long id) {
        TaskEntity task = taskRepository.findById(id).orElse(null);
        return taskEntityMapper.toDomain(task);
    }
}
