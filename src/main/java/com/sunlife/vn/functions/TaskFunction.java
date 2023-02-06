package com.sunlife.vn.functions;

import com.sunlife.vn.models.dto.TaskRequest;
import com.sunlife.vn.models.dto.TaskResponse;
import org.springframework.stereotype.Component;

import java.util.function.Function;
import java.util.logging.Logger;

@Component
public class TaskFunction implements Function<TaskRequest, TaskResponse> {
    private static final Logger LOG = Logger.getLogger(String.valueOf(TaskFunction.class));

    @Override
    public TaskResponse apply(TaskRequest request) {
        TaskResponse response = new TaskResponse();

        LOG.info("[INFO] " + response.getResult());

        return response;
    }
}
