package org.springframework.di.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String greetings() {
        return "Hello, World!";
    }
}
