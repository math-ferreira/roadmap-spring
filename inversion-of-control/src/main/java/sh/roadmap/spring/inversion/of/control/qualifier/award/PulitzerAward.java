package sh.roadmap.spring.inversion.of.control.qualifier.award;

import org.springframework.stereotype.Component;

@Component
public class PulitzerAward implements Award {

    @Override
    public void award() {

        System.out.println("You have won Pulitzer Award.");
    }
}
