package com.example.TaskManagement.core.usecases;

import com.example.TaskManagement.core.entities.Task;

import java.util.List;

public interface ListTaskUseCase {
    public List<Task> execute();
}
