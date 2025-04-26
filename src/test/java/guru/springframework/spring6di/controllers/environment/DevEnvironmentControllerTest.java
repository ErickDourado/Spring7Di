package guru.springframework.spring6di.controllers.environment;

import guru.springframework.spring6di.controllers.EnvironmentController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

//comment out active profile to test use of default profile
@ActiveProfiles({"dev", "EN"})
@SpringBootTest
class DevEnvironmentControllerTest {

    @Autowired
    EnvironmentController environmentController;

    @Test
    void getEnvironment() {
        System.out.println(environmentController.getEnvironment());
    }

}
