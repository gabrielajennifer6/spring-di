package com.ey.gds.di.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements  GreetingService{
    @Override
    public String getGreeting() {
        return "Hello World -- Setter";
    }
}
