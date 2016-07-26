package com.todo.spring;

/**
 * Created by RENT on 2016-07-26.
 */
import org.springframework.stereotype.Service;

@Service
public class SecurityService {
    public Long currentUserId() {
        return new Long(1);
    }
}
