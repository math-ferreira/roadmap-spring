package sh.roadmap.spring.inversion.of.control.qualifier.award;

import org.springframework.stereotype.Component;

@Component
public class NationalAward implements Award{

    public void award() {

        System.out.println("Your Writting got National Award!");
    }
}
