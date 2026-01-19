package com.example.TaskManagement.core.usecases;

import com.example.TaskManagement.core.entities.Task;
import com.example.TaskManagement.core.gateway.TaskGateway;

public class DeleteTaskUseCaseImpl implements DeleteTaskUseCase{

    private final TaskGateway taskGateway;

    public DeleteTaskUseCaseImpl(TaskGateway taskGateway) {
        this.taskGateway = taskGateway;
    }

    @Override
    public Boolean execute(Long id) {
        return taskGateway.DeleteTask(id);
    }
}
