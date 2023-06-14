package sh.roadmap.spring.dependency.injection.autowired.annotation.config;

import org.springframework.stereotype.Component;

@Component
public class Technologies {
    private int techid;

    private String techname;

    public void tech() {
        System.out.println(" Successful");
    }

    public int getTechid() {
        return techid;
    }

    public void setTechid(int techid) {
        this.techid = techid;
    }

    public String getTechname() {
        return techname;
    }

    public void setTechname(String techname) {
        this.techname = techname;
    }
}
