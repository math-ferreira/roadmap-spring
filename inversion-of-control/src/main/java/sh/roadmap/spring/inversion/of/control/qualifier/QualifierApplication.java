package sh.roadmap.spring.inversion.of.control.qualifier;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sh.roadmap.spring.inversion.of.control.qualifier.award.FictionWriter;

@SpringBootApplication
public class QualifierApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        FictionWriter writer = context.getBean(FictionWriter.class);
        writer.write();
        writer.getBookerAward();
        writer.getNationalAward();
        writer.getPulitzerAward();

        // Close the context
        context.close();
    }

}
