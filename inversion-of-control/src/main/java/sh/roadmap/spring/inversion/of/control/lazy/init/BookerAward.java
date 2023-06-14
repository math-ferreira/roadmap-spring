package sh.roadmap.spring.inversion.of.control.lazy.init;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BookerAward {

    @Bean
    public void award() {
        System.out.println("You got booker prize...");
    }
}
