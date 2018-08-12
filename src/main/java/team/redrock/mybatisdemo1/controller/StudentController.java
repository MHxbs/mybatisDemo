package team.redrock.mybatisdemo1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import team.redrock.mybatisdemo1.domain.Result;
import team.redrock.mybatisdemo1.entity.Student;
import team.redrock.mybatisdemo1.service.StudentService;
import team.redrock.mybatisdemo1.util.ResultUtil;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping(value = "/students")
    public Result getAll(){
        List<Student> students= studentService.getAll();
        return ResultUtil.success(students);
    }

    @GetMapping(value = "/students/{stuID}")
    public Result  getOne(@PathVariable("stuID") int stuID){
        return ResultUtil.success(studentService.getOneBystuId(stuID));
    }
}
