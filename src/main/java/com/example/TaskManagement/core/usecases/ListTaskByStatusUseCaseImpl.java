package com.example.TaskManagement.core.usecases;

import com.example.TaskManagement.core.entities.Task;
import com.example.TaskManagement.core.enuns.Status;
import com.example.TaskManagement.core.gateway.TaskGateway;

import java.util.List;

public class ListTaskByStatusUseCaseImpl implements  ListTaskByStatusUseCase{
    private final TaskGateway taskGateway;

    public ListTaskByStatusUseCaseImpl(TaskGateway taskGateway) {
        this.taskGateway = taskGateway;
    }

    @Override
    public List<Task> execute(Status status) {
        return taskGateway.ListTaskByStatus(status);
    }
}
