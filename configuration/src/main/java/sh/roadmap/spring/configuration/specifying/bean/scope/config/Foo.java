package sh.roadmap.spring.configuration.specifying.bean.scope.config;

import java.util.Random;

public class Foo {

    private int value = new Random().nextInt();

    @Override
    public String toString() {
        return super.toString() + " with values = " + value;
    }
}
