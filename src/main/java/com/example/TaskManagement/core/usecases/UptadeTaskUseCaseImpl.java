package com.example.TaskManagement.core.usecases;

import com.example.TaskManagement.core.entities.Task;
import com.example.TaskManagement.core.gateway.TaskGateway;

public class UptadeTaskUseCaseImpl implements UpdateTaskUseCase{
    private final TaskGateway taskGateway;

    public UptadeTaskUseCaseImpl(TaskGateway taskGateway) {
        this.taskGateway = taskGateway;
    }

    @Override
    public Task execute(Long id, Task task) {
        return taskGateway.UpdateTask(id, task);
    }
}
