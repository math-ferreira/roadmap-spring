package sh.roadmap.spring.dependency.injection.exampleone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sh.roadmap.spring.dependency.injection.exampleone.config.Customers;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

@SpringBootApplication
public class DependencyInjectionApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);

        Customers c = context.getBean(Customers.class);
        c.display();
    }

}
