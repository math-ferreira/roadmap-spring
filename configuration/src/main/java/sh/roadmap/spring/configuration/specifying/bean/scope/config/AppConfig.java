package sh.roadmap.spring.configuration.specifying.bean.scope.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    /**
     * Specifying Bean Scope:
     * The default scope is singleton, but you can override this with the @Scope annotation
     * from another configuration class. Consider a ConfigA class
     * <p>
     * You can import above Bean declaration in another Bean Declaration
     */
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Foo fooPrototype() {
        return new Foo();
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public Foo fooSingleton() {
        return new Foo();
    }
}
