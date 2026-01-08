package com.example.TaskManagement.infraestructure.presentation;

import com.example.TaskManagement.core.entities.Task;
import com.example.TaskManagement.core.usecases.*;
import com.example.TaskManagement.infraestructure.dtos.TaskDto;
import com.example.TaskManagement.infraestructure.mapper.TaskDtoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("api/v1/")
@RequiredArgsConstructor
public class TaskController {

    private final CreateTaskUseCase createTaskUseCase;
    private final ListTaskUseCase listTaskUseCase;
    private final GetTaskByIdUseCase getTaskByIdUseCase;
    private final TaskDtoMapper taskDtoMapper;

    @GetMapping
    public ResponseEntity<Map<String, Object>> list(){
        List<Task> taskList = listTaskUseCase.execute();
        Map<String, Object> response = new HashMap<>();
        if(taskList.isEmpty()){
            response.put("Message", "Tasks not founded.");
        }else{
            response.put("Message", "Tasks founded successfully.");
            response.put("Data", taskList);
        }

        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Map<String, Object>> getTaskById(@PathVariable Long id){
        Task task = getTaskByIdUseCase.execute(id);
        Map<String, Object> response = new HashMap<>();
        if(task != null){
            response.put("Message", "Task founded successfully.");
            response.put("Data", task);
        }else{
            response.put("Message", "Task not founded.");
        }
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> create(@RequestBody TaskDto dto){
        Task task = createTaskUseCase.execute(taskDtoMapper.toDomain(dto));
        Map<String, Object> response = new HashMap<>();
        response.put("Message", "Task created successfully.");
        response.put("Data", dto);
        return ResponseEntity.ok(response);
    }
}
