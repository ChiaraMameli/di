package org.springframework.di.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {
    @Override
    public String greetings() {
        return "Hello, World! (setter)";
    }

}
