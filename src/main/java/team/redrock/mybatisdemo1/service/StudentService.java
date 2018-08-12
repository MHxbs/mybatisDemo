package team.redrock.mybatisdemo1.service;

import team.redrock.mybatisdemo1.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAll();

    Student getOneBystuId(int stuID);


}
