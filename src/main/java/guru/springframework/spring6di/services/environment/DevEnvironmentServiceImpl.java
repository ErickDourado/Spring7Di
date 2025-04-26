package guru.springframework.spring6di.services.environment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dev", "default"})
@Service
public class DevEnvironmentServiceImpl implements EnvironmentService {

    @Override
    public String getEnvironment() {
        return "This is the dev environment!!!";
    }

}
