package com.example.TaskManagement.core.gateway;

import com.example.TaskManagement.core.entities.Task;

import java.time.LocalDateTime;
import java.util.List;

public interface TaskGateway {
    Task CreateTask (Task task);
    List<Task> ListTask ();
    Task GetTaskById(Long id);
    Task UpdateTask(Long id, Task task);
    Boolean DeleteTask(Long id);
}
