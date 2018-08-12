package team.redrock.mybatisdemo1.controller;

import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import team.redrock.mybatisdemo1.domain.Result;
import team.redrock.mybatisdemo1.entity.Course;
import team.redrock.mybatisdemo1.service.CourseService;
import team.redrock.mybatisdemo1.util.ResultUtil;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping(value = "/courses")
    public Result getAll(){
        return ResultUtil.success(courseService.getAll());
    }

    @GetMapping(value = "/courses/{courseID}")
    public Result getOneByID(@PathVariable("courseID") int courseID){
        return ResultUtil.success(courseService.getOneByCourseID(courseID));
    }

    @PostMapping(value = "/courses")
    public void insertOne(Course course){
        courseService.insert(course);
    }

    @DeleteMapping(value = "/courses/{id}")
    public void deleteOne(@PathVariable("id") Integer courseID){
        courseService.delete(courseID);
    }


}
