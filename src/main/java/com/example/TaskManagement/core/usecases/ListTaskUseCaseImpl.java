package com.example.TaskManagement.core.usecases;


import com.example.TaskManagement.core.entities.Task;
import com.example.TaskManagement.core.gateway.TaskGateway;

import java.util.List;

public class ListTaskUseCaseImpl implements ListTaskUseCase {

    private final TaskGateway taskGateway;

    public ListTaskUseCaseImpl(TaskGateway taskGateway) {
        this.taskGateway = taskGateway;
    }

    @Override
    public List<Task> execute() {
        return taskGateway.ListTask();
    }
}
