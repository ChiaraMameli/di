package org.springframework.di.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.di.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Qualifier("constructorGreetingServiceImpl")
    @Autowired
    GreetingService greetingService;

    public String getGreetings(){
        return greetingService.greetings();
    }
}
