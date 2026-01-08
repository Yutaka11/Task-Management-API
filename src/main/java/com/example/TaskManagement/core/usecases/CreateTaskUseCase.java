package com.example.TaskManagement.core.usecases;

import com.example.TaskManagement.core.entities.Task;
import com.example.TaskManagement.infraestructure.dtos.TaskDto;

public interface CreateTaskUseCase {

    public Task execute(Task task);
}
