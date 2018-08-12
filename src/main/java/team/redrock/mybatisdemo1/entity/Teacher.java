package team.redrock.mybatisdemo1.entity;

public class Teacher {
    private Integer tID;
    private Integer teaID;
    private String name;
    private Integer gender;

    public Integer gettID() {
        return tID;
    }

    public void settID(Integer tID) {
        this.tID = tID;
    }

    public Integer getTeaID() {
        return teaID;
    }

    public void setTeaID(Integer teaID) {
        this.teaID = teaID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }
}
