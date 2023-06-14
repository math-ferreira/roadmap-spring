package sh.roadmap.spring.dependency.injection.exampleone.config;

import org.springframework.stereotype.Component;

@Component
public class Customers {
    private int custid;
    private String custname;
    private String coursename;

    public void display() {
        System.out.println("Object Returned Successfully");
    }

    public int getCustid() {
        return custid;
    }

    public void setCustid(int custid) {
        this.custid = custid;
    }

    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

}
