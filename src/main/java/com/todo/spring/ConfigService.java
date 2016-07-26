package com.todo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;


@Component
public class ConfigService {

    @Autowired
    private Environment environment;

    public String get(String key) {
        return environment.getProperty(key);
    }

    public Integer getAsInt(String key) {
        return Integer.parseInt(get(key));
    }
}

