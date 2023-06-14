package sh.roadmap.spring.inversion.of.control.lazy.init;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class LazyInitApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        FictionWriter fictionWriter = context.getBean(FictionWriter.class);
        fictionWriter.getBookerAward();
    }

}
