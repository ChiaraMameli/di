package org.springframework.di.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingServiceImpl implements GreetingService {
    @Override
    public String greetings() {
        return "Hello, World! (property)";
    }
}
