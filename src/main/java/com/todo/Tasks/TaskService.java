package com.todo.tasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@Service
public class TaskService {

    @Autowired
    private TaskDao taskDao;

    public void addTask(Task task) {
        taskDao.save(task);
    }

    @RequestMapping(method= RequestMethod.GET)
    public List getTasks() {
//        taskDao.flush();
        return taskDao.findAll();
    }

    public void replaceAllTasks(List<Task> newTasks) {
        taskDao.deleteAll();
        taskDao.save(newTasks);
    }

}

