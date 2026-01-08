package com.example.TaskManagement.infraestructure.persistence;

import com.example.TaskManagement.core.enuns.Stats;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "task")
public class TaskDtoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private Stats stats;
    private LocalDateTime dueDate;
    private LocalDateTime createAt;
}
