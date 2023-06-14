package sh.roadmap.spring.inversion.of.control.lazy.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class FictionWriter {

    @Autowired
    @Lazy // If this is not here, Demo will still get eagerly instantiated to satisfy this request.
    private BookerAward bookerAward;

    public void getBookerAward() {
        bookerAward.award();
    }


}
