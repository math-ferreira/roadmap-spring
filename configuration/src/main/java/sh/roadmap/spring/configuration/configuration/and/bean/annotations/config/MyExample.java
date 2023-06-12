package sh.roadmap.spring.configuration.configuration.and.bean.annotations.config;

public class MyExample {
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public void getAge() {
        System.out.println("hash code is :" + this.getClass().hashCode());
        System.out.println("Your Age is : " + age + " years old");
    }
}
