package com.example.TaskManagement.core.exceptions;

public class TaskNotFoundException extends BusinessExpection{

    public TaskNotFoundException(Long id) {
        super("Task with id " + id + " not found.");
    }
}
