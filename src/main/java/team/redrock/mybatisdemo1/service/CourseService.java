package team.redrock.mybatisdemo1.service;

import team.redrock.mybatisdemo1.entity.Course;
import team.redrock.mybatisdemo1.entity.Student;

import java.util.List;

public interface CourseService {

    Course getOneByCourseID(int courseID);

    List<Course> getAll();

    void update(Course course);

    void insert(Course course);

    void delete(int courseID);



}
