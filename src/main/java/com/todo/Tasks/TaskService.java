package com.todo.tasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TaskService {

    @Autowired
    private TaskDao taskDao;

    public Task addTask(Task task) {

        return task;
    }
}