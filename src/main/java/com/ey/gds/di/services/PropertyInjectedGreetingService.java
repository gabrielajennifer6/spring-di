package com.ey.gds.di.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements GreetingService{
    @Override
    public String getGreeting() {
        return "Hello World -- Property";
    }
}
