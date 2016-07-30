package com.todo.tasks;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.persistence.Id;


@Entity
@Table(name = "tasks")
@ToString
public class Task {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;

    @Column(name = "description")
    @Setter
    @Getter
    private String description;
}
