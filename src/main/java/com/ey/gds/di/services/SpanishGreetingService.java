package com.ey.gds.di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nService")
public class SpanishGreetingService implements GreetingService{
    @Override
    public String getGreeting() {
        return "Hola - ES";
    }
}
