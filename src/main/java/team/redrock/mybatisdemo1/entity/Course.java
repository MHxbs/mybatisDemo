package team.redrock.mybatisdemo1.entity;

import org.omg.PortableInterceptor.INACTIVE;

public class Course {

    private Integer cID;
    private Integer courseID;
    private String name;
    private Integer tID;

    public Integer getcID() {
        return cID;
    }

    public void setcID(Integer cID) {
        this.cID = cID;
    }

    public Integer getCourseID() {
        return courseID;
    }

    public void setCourseID(Integer courseID) {
        this.courseID = courseID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer gettID() {
        return tID;
    }

    public void settID(Integer tID) {
        this.tID = tID;
    }
}
