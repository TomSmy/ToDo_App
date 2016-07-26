package com.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class Bootstrap {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringConfig.class, args);
    }
}