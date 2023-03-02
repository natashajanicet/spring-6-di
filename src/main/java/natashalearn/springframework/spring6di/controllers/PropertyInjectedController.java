package natashalearn.springframework.spring6di.controllers;

import natashalearn.springframework.spring6di.services.GreetingService;

public class PropertyInjectedController {
    GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
