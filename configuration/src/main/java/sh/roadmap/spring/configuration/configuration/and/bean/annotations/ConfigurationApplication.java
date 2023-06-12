package sh.roadmap.spring.configuration.configuration.and.bean.annotations;

import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sh.roadmap.spring.configuration.configuration.and.bean.annotations.config.HelloWorld;
import sh.roadmap.spring.configuration.configuration.and.bean.annotations.config.HelloWorldConfig;
import sh.roadmap.spring.configuration.configuration.and.bean.annotations.config.MyExample;
import sh.roadmap.spring.configuration.configuration.and.bean.annotations.config.MyExampleConfig;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

@SpringBootApplication
public class ConfigurationApplication {

    /**
     * @Configuration & @Bean Annotations:
     * Once your configuration classes are defined, you can load and provide them
     * to Spring container using AnnotationConfigApplicationContext as follows
     */
    public static void main(String[] args) {
        exampleOne();
        exampleTwo();
    }

    private static void exampleOne() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);

        HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
        helloWorld.setMessage("Hello World!");
        helloWorld.getMessage();
    }

    private static void exampleTwo() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MyExampleConfig.class);

        assertThatThrownBy(() -> ctx.getBean(HelloWorld.class))
                .isInstanceOf(NoSuchBeanDefinitionException.class);

        MyExample myExampleOne = ctx.getBean(MyExample.class);
        myExampleOne.setAge(28);
        myExampleOne.getAge();

        MyExample myExampleTwo = ctx.getBean(MyExample.class);
        myExampleTwo.setAge(7);
        myExampleTwo.getAge();

        assertThat(myExampleOne).isEqualTo(myExampleTwo);
    }

}
