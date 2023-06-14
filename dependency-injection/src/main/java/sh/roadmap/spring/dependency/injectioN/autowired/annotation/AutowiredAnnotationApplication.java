package sh.roadmap.spring.dependency.injection.autowired.annotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import sh.roadmap.spring.dependency.injection.autowired.annotation.config.Customers;

@SpringBootApplication
public class AutowiredAnnotationApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(AutowiredAnnotationApplication.class, args);

        Customers c = context.getBean(Customers.class);
        c.display();
    }

}
