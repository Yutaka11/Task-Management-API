package com.example.TaskManagement.core.usecases;

import com.example.TaskManagement.core.entities.Task;

public interface GetTaskByIdUseCase {
    public Task execute(Long id);
}
