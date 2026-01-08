package com.example.TaskManagement.infraestructure.presentation;

import com.example.TaskManagement.core.entities.Task;
import com.example.TaskManagement.core.usecases.CreateTaskUseCase;
import com.example.TaskManagement.core.usecases.CreateTaskUseCaseImpl;
import com.example.TaskManagement.core.usecases.ListTaskUseCase;
import com.example.TaskManagement.core.usecases.ListTaskUseCaseImpl;
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

    @PostMapping
    public ResponseEntity<Map<String, Object>> create(@RequestBody TaskDto dto){
        Task task = createTaskUseCase.execute(taskDtoMapper.toDomain(dto));
        Map<String, Object> response = new HashMap<>();
        response.put("Message", "Task created successfully.");
        response.put("Data", dto);
        return ResponseEntity.ok(response);
    }
}
