package com.example.TaskManagement.core.gateway;

import com.example.TaskManagement.core.entities.Task;

import java.util.List;

public interface TaskGateway {
    Task CreateTask (Task task);
    List<Task> ListTask ();
}
