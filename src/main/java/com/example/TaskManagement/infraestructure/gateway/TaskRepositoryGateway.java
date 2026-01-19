package com.example.TaskManagement.infraestructure.gateway;

import com.example.TaskManagement.core.entities.Task;
import com.example.TaskManagement.core.enuns.Status;
import com.example.TaskManagement.core.exceptions.BusinessExpection;
import com.example.TaskManagement.core.exceptions.InvalidTaskExpection;
import com.example.TaskManagement.core.exceptions.TaskNotFoundException;
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

        if (task.title() == null || task.title().isBlank()) {
            throw new BusinessExpection("Title must not be empty.");
        }

        if (task.dueDate() == null) {
            throw new BusinessExpection("Due date is required.");
        }

        if (task.dueDate().isBefore(LocalDateTime.now())) {
            throw new BusinessExpection("Due date cannot be in the past.");
        }
        if ((task.status() == null)) {
            throw new BusinessExpection("Status must not be empty.");
        }
        TaskEntity taskEntity = taskEntityMapper.toEntity(task);

        TaskEntity newTask = taskRepository.save(taskEntity);
        Task createdTask = taskEntityMapper.toDomain(newTask);
        return createdTask;
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
        TaskEntity task = taskRepository.findById(id).orElseThrow(() -> new TaskNotFoundException(id));
        return taskEntityMapper.toDomain(task);
    }

    @Override
    public Task UpdateTask(Long id, Task task) {
        TaskEntity taskEntity = taskRepository.findById(id).orElseThrow(() -> new TaskNotFoundException(id));
        Task current = taskEntityMapper.toDomain(taskEntity);
        Task updated = current.update(task.title(), task.description(), task.status(), task.dueDate());

        TaskEntity updatedEntity = taskEntityMapper.toEntity(updated);
        updatedEntity.setId(current.id());
        updatedEntity.setCreateAt(current.createAt());
        if(updatedEntity.getDueDate() != null && updatedEntity.getDueDate().isBefore(LocalDateTime.now())){
            throw new InvalidTaskExpection("Due date cannot be in the past.");
        }
        TaskEntity save = taskRepository.save(updatedEntity);

        return taskEntityMapper.toDomain(save);
    }

    @Override
    public Boolean DeleteTask(Long id) {
        Boolean bool;
        Optional<TaskEntity> task = taskRepository.findById(id);
        if(task.isPresent()){
            taskRepository.deleteById(id);
            bool = true;
        }else{
            bool = false;
        }
        return bool;
    }

    @Override
    public List<Task> ListTaskByStatus(Status status) {
        List<Task> taskList = taskRepository.findByStatus(status);
        return taskList;
    }
}
