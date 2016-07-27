package com.todo.tasks;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;



@Entity
@Table(name = "tasks")
@ToString
public class Task {

    @Column(name = "tasks")
    @Setter
    @Getter
    private String tasks;
}
