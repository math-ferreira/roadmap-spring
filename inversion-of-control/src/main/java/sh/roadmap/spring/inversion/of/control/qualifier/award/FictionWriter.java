package sh.roadmap.spring.inversion.of.control.qualifier.award;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FictionWriter {

    @Autowired
    @Qualifier("bookerAward")
    private Award bookerAward;

    @Autowired
    @Qualifier("nationalAward")
    private Award nationalAward;

    @Autowired
    @Qualifier("pulitzerAward")
    private Award pulitzerAward;

    public void write() {
        System.out.println("Write Fiction Novels...");
    }

    public void getBookerAward() {
        bookerAward.award();
    }

    public void getPulitzerAward() {
        pulitzerAward.award();
    }

    public void getNationalAward() {
        nationalAward.award();
    }

}
