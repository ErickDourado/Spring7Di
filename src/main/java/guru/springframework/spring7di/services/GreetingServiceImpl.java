package guru.springframework.spring7di.services;

public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello Everyone from Base Service!!!";
    }

}
