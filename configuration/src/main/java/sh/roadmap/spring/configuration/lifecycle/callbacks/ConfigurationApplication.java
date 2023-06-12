package sh.roadmap.spring.configuration.lifecycle.callbacks;

import org.springframework.beans.factory.support.DefaultSingletonBeanRegistry;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sh.roadmap.spring.configuration.lifecycle.callbacks.config.AppConfig;
import sh.roadmap.spring.configuration.lifecycle.callbacks.config.Foo;
import sh.roadmap.spring.configuration.theimport.annotation.config.A;
import sh.roadmap.spring.configuration.theimport.annotation.config.B;
import sh.roadmap.spring.configuration.theimport.annotation.config.ConfigB;

@SpringBootApplication
public class ConfigurationApplication {

    /**
     * Lifecycle Callbacks:
     * The @Bean annotation supports specifying arbitrary initialization and destruction callback methods,
     * much like Spring XML's init-method and destroy-method attributes on the bean element
     *
     * Destroy bean: <a href="https://www.baeldung.com/spring-reinitialize-singleton-bean#2-destroying-the-bean-in-the-context">...</a>
     */
    public static void main(String[] args) {
        exampleOne();
    }

    private static void exampleOne() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        DefaultSingletonBeanRegistry registry = (DefaultSingletonBeanRegistry) ctx.getAutowireCapableBeanFactory();
        registry.destroySingleton("foo");
    }

}
