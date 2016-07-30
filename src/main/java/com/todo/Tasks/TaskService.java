package com.todo.tasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.BeanNameViewResolver;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import java.util.ArrayList;
import java.util.List;


@Service
public class TaskService {

    @Autowired
    private TaskDao taskDao;

    public void addTask(Task task) {
        taskDao.save(task);
    }

    public void deleteTask(Long id) {
        Task taskToDelete = taskDao.findOne(id);

        taskDao.delete(taskToDelete);
        //taskDao.delete(task);
    }
    public void updateTask(Task task) {
//        Task taskToUpdate = taskDao.findOne(id);
        taskDao.save(task);
    }

    public List getTasks() {
//        taskDao.flush();
        return taskDao.findAll();
    }

    public boolean deleteTask2(Long id) {
//        taskDao.flush();
        taskDao.delete(id);
        return true;
    }


    public void storeAllTasks(List<Task> newTasks) {
        taskDao.deleteAll();
        taskDao.save(newTasks);
    }

}

