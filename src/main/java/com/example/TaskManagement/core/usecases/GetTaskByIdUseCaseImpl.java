package com.example.TaskManagement.core.usecases;

import com.example.TaskManagement.core.entities.Task;
import com.example.TaskManagement.core.gateway.TaskGateway;

public class GetTaskByIdUseCaseImpl implements GetTaskByIdUseCase{

    private final TaskGateway taskGateway;

    public GetTaskByIdUseCaseImpl(TaskGateway taskGateway) {
        this.taskGateway = taskGateway;
    }

    @Override
    public Task execute(Long id) {
        return taskGateway.GetTaskById(id);
    }
}
