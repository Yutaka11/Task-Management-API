package com.example.TaskManagement.infraestructure.beans;

import com.example.TaskManagement.TaskManagementApplication;
import com.example.TaskManagement.core.gateway.TaskGateway;
import com.example.TaskManagement.core.usecases.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public CreateTaskUseCase createTaskUseCase(TaskGateway taskGateway){
        return new CreateTaskUseCaseImpl(taskGateway);
    }

    @Bean
    public ListTaskUseCase listTaskUseCase(TaskGateway taskGateway) {
        return new ListTaskUseCaseImpl(taskGateway);
    }

    @Bean
    public GetTaskByIdUseCase getTaskByIdUseCase(TaskGateway taskGateway){
        return new GetTaskByIdUseCaseImpl(taskGateway);
    }

    @Bean
    public UpdateTaskUseCase uptadeTaskUseCase(TaskGateway taskGateway){
        return new UptadeTaskUseCaseImpl(taskGateway);
    }

    @Bean
    public DeleteTaskUseCase deleteTaskUseCase(TaskGateway taskGateway){
        return new DeleteTaskUseCaseImpl(taskGateway);
    }

    @Bean
    public ListTaskByStatusUseCase listTaskByStatusUseCase(TaskGateway taskGateway){
        return new ListTaskByStatusUseCaseImpl(taskGateway);
    }
}
