package sh.roadmap.spring.configuration.lifecycle.callbacks.config;

public class Foo {

    public void init() {
        System.out.println("initialization logic");
    }

    public void cleanup() {
        System.out.println("destruction logic");
    }
}
