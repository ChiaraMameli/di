package org.springframework.di.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.di.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    private GreetingService greetingService;

    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreetings() {
        return greetingService.greetings();
    }
}
