package com.example.TaskManagement.core.usecases;

import com.example.TaskManagement.core.entities.Task;

public interface DeleteTaskUseCase {
    Boolean execute(Long id);
}
