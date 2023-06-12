package sh.roadmap.spring.configuration.injecting.bean.dependencies;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sh.roadmap.spring.configuration.injecting.bean.dependencies.config.TextEditor;
import sh.roadmap.spring.configuration.injecting.bean.dependencies.config.TextEditorConfig;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

@SpringBootApplication
public class ConfigurationApplication {

    /**
     * Injecting Bean Dependencies:
     * When @Beans have dependencies on one another, expressing that the dependency
     * is as simple as having one bean method calling another as follows
     */
    public static void main(String[] args) {
        exampleOne();
    }

    private static void exampleOne() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(TextEditorConfig.class);

        TextEditor te = ctx.getBean(TextEditor.class);
        te.spellCheck();
    }

}
