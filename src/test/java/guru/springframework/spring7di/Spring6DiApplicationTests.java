package guru.springframework.spring7di;

import guru.springframework.spring6di.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootTest
class Spring6DiApplicationTests {

    @Autowired
    ConfigurableApplicationContext context;

    @Autowired
    MyController myController;

    @Test
    void testAutowireOfController() {
        System.out.println(myController.sayHello());
    }

    @Test
    void testControllerFromCtx() {
        MyController myController = context.getBean(MyController.class);
        System.out.println(myController.sayHello());
    }

}
