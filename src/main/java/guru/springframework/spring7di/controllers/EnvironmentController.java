package guru.springframework.spring7di.controllers;

import guru.springframework.spring7di.services.environment.EnvironmentService;
import org.springframework.stereotype.Controller;

@Controller
public class EnvironmentController {

    private final EnvironmentService environmentService;

    public EnvironmentController(EnvironmentService environmentService) {
        this.environmentService = environmentService;
    }

    public String getEnvironment() {
        return environmentService.getEnvironment();
    }

}
