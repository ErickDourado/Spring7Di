package guru.springframework.spring7di.services;

import org.springframework.stereotype.Service;

@Service("setterGreetingBean")
public class GreetingServiceSetterInjectionImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hey I'm Setting a Greeting!!";
    }

}
