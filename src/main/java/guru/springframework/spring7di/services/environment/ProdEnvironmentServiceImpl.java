package guru.springframework.spring7di.services.environment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service
public class ProdEnvironmentServiceImpl implements EnvironmentService {

    @Override
    public String getEnvironment() {
        return "This is the prod environment!!!";
    }

}
