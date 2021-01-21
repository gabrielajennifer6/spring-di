package com.ey.gds.di.controllers;

import com.ey.gds.di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController{
    private GreetingService greetingService;

    @Autowired
    @Qualifier("setterInjectedGreetingService")
    public void setGreetingService( GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return this.greetingService.getGreeting();
    }
}
