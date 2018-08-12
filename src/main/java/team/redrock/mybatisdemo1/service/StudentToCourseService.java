package team.redrock.mybatisdemo1.service;

import team.redrock.mybatisdemo1.entity.Course;
import team.redrock.mybatisdemo1.entity.Student;
import team.redrock.mybatisdemo1.entity.StudentToCourse;

import java.util.List;

public interface StudentToCourseService {

    List<Student> getAllStudentsByCID(int cID);

    List<Course> getAllCoursesBySID(int sID);

}
