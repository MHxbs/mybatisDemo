package team.redrock.mybatisdemo1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import team.redrock.mybatisdemo1.domain.Result;
import team.redrock.mybatisdemo1.entity.Course;
import team.redrock.mybatisdemo1.entity.Student;
import team.redrock.mybatisdemo1.service.StudentToCourseService;
import team.redrock.mybatisdemo1.util.ResultUtil;

import java.util.List;

@RestController
public class StudentToCourseController {

    @Autowired
    private StudentToCourseService studentToCourseService;

    @GetMapping(value = "/course/students")
    public Result getAllByCID(@RequestParam("cID") int cID){
        return ResultUtil.success(studentToCourseService.getAllStudentsByCID(cID));
    }

    @GetMapping(value = "/student/courses")
    public Result getAllBySID(@RequestParam("sID") int sID){
        return ResultUtil.success(studentToCourseService.getAllCoursesBySID(sID));
    }
}
