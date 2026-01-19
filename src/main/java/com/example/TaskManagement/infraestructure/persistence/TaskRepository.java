package com.example.TaskManagement.infraestructure.persistence;

import com.example.TaskManagement.core.entities.Task;
import com.example.TaskManagement.core.enuns.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<TaskEntity, Long> {
    List<Task> findByStatus(Status status);
}
