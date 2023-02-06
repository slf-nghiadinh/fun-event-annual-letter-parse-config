package com.sunlife.vn;

import com.sunlife.vn.functions.TaskFunction;
import com.sunlife.vn.models.dto.TaskRequest;
import com.sunlife.vn.models.dto.TaskResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication(scanBasePackages = {"com.sunlife.vn"})
public class FunctionApplication {

    public static void main(String[] args) {
        SpringApplication.run(FunctionApplication.class, args);
    }

    @Bean
    public Function<TaskRequest, TaskResponse> handle() {
        return new TaskFunction();
    }
}
