package com.todo.tasks;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by RENT on 2016-07-26.
 */
public interface TaskDao extends JpaRepository<Task, Long> {
}

