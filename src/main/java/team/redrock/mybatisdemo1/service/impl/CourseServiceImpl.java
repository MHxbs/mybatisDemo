package team.redrock.mybatisdemo1.service.impl;

import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.redrock.mybatisdemo1.entity.Course;
import team.redrock.mybatisdemo1.entity.Student;
import team.redrock.mybatisdemo1.mapper.CourseMapper;
import team.redrock.mybatisdemo1.mapper.StudentToCourseMapper;
import team.redrock.mybatisdemo1.service.CourseService;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseMapper courseMapper;



    @Override
    public Course getOneByCourseID(int courseID) {
        return courseMapper.getOneBycourseID(courseID);
    }

    @Override
    public List<Course> getAll() {
        return courseMapper.getAll();
    }

    @Override
    public void update(Course course) {
        courseMapper.update(course);
    }

    @Override
    public void insert(Course course) {
        courseMapper.insert(course);
    }

    @Override
    public void delete(int courseID) {
        courseMapper.delete(courseID);
    }


}
