package sh.roadmap.spring.configuration.theimport.annotation;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sh.roadmap.spring.configuration.injecting.bean.dependencies.config.TextEditor;
import sh.roadmap.spring.configuration.injecting.bean.dependencies.config.TextEditorConfig;
import sh.roadmap.spring.configuration.theimport.annotation.config.A;
import sh.roadmap.spring.configuration.theimport.annotation.config.B;
import sh.roadmap.spring.configuration.theimport.annotation.config.ConfigB;

@SpringBootApplication
public class ConfigurationApplication {

    /**
     * The @Import Annotation:
     * The @Import annotation allows for loading @Bean definitions
     * from another configuration class. Consider a ConfigA class
     * <p>
     * You can import above Bean declaration in another Bean Declaration
     */
    public static void main(String[] args) {
        exampleOne();
    }

    private static void exampleOne() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigB.class);

        B b = ctx.getBean(B.class);
        A a = ctx.getBean(A.class);
    }

}
