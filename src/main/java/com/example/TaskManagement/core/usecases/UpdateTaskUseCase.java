package com.example.TaskManagement.core.usecases;

import com.example.TaskManagement.core.entities.Task;

public interface UpdateTaskUseCase {
    Task execute(Long id, Task task);
}
