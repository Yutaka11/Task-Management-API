package com.example.TaskManagement.core.usecases;

import com.example.TaskManagement.core.entities.Task;

import java.util.List;

public interface ListTaskUseCase {
    List<Task> execute();
}
