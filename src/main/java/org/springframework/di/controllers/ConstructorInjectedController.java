package org.springframework.di.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.di.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    public ConstructorInjectedController(@Qualifier("constructorGreetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreetings(){
        return greetingService.greetings();
    }
}
