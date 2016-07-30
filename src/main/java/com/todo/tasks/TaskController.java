package com.todo.tasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @RequestMapping(method = RequestMethod.GET)
    public  List<Task> taskList(){

        return taskService.getTasks();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addTask(@RequestBody Task task) {
        taskService.addTask(task);
    }

}


