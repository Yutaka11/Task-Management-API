package com.example.TaskManagement.infraestructure.persistence;

import com.example.TaskManagement.core.enuns.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "task")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TaskEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private Status status;
    private LocalDateTime dueDate;
    private LocalDateTime createAt;
}
