package com.example.TaskManagement.core.usecases;

import com.example.TaskManagement.core.entities.Task;
import com.example.TaskManagement.core.enuns.Status;

import java.util.List;

public interface ListTaskByStatusUseCase {
    List<Task> execute(Status status);
}
