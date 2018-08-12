package team.redrock.mybatisdemo1.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.redrock.mybatisdemo1.entity.Course;
import team.redrock.mybatisdemo1.entity.Student;
import team.redrock.mybatisdemo1.entity.StudentToCourse;
import team.redrock.mybatisdemo1.mapper.CourseMapper;
import team.redrock.mybatisdemo1.mapper.StudentMapper;
import team.redrock.mybatisdemo1.mapper.StudentToCourseMapper;
import team.redrock.mybatisdemo1.service.StudentToCourseService;

import java.util.ArrayList;
import java.util.List;


@Service
public class StudentToCourseServiceImpl implements StudentToCourseService {

    @Autowired
    private  StudentToCourseMapper studentToCourseMapper;

    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private  CourseMapper courseMapper;


    @Override
    public List<Student> getAllStudentsByCID(int cID) {
        List<StudentToCourse> list=studentToCourseMapper.getAllByCID(cID);
        List<Student> students=new ArrayList<>();
        for (StudentToCourse studentToCourse: list){
            Student student=studentMapper.getOneBysId(studentToCourse.getsID());
            students.add(student);
        }
        return students;
    }

    @Override
    public List<Course> getAllCoursesBySID(int sID) {
        List<StudentToCourse> list=studentToCourseMapper.getAllBySID(sID);
        List<Course> courses=new ArrayList<>();
        for (StudentToCourse studentToCourse : list) {
            Course course=courseMapper.getOneBycId(studentToCourse.getcID());
            courses.add(course);
        }
        return courses;
    }
}
