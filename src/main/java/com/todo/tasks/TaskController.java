package com.todo.tasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(maxAge = 3600)
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

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
//    @RequestMapping(value = "/{id}", method = RequestMethod.OPTIONS)
    public void deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
    }


}


