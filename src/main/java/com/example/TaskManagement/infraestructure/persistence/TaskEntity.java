package com.example.TaskManagement.infraestructure.persistence;

import com.example.TaskManagement.core.enuns.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

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
    @NotNull
    private String title;
    @NotNull
    private String description;
    @Enumerated(EnumType.STRING)
    @NotNull
    private Status status;
    @NotNull
    private LocalDateTime dueDate;
    @NotNull
    private LocalDateTime createAt;
}
