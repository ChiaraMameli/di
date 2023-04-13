package org.springframework.di.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.di.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MainController {

    @Autowired
    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.greetings();
    }
}
