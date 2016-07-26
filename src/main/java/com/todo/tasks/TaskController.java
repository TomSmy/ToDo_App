package com.todo.tasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Task>{
        return taskService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addTask(Task task) {
        taskService.addTask(Task task);
    }

}
