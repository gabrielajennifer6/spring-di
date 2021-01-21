package com.ey.gds.di.controllers;

import com.ey.gds.di.services.PropertyInjectedGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Autowired
    @Qualifier("propertyInjectedGreetingService")
    private final PropertyInjectedGreetingService propertyInjectedGreetingService;

    public PropertyInjectedController(PropertyInjectedGreetingService propertyInjectedGreetingService) {
        this.propertyInjectedGreetingService = propertyInjectedGreetingService;
    }

    public String sayHello() {
        return this.propertyInjectedGreetingService.getGreeting();
    }
}
