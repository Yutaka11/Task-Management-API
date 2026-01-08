package com.example.TaskManagement.infraestructure.persistence;

import com.example.TaskManagement.core.enuns.Stats;
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
