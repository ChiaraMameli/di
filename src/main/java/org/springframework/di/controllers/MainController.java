package org.springframework.di.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MainController {

    public String sayHello(){
            System.out.println("Hello, World!");
        return "Hello!";
    }
}
