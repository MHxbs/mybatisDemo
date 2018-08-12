package team.redrock.mybatisdemo1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import team.redrock.mybatisdemo1.domain.Result;
import team.redrock.mybatisdemo1.entity.Teacher;
import team.redrock.mybatisdemo1.service.TeacherService;
import team.redrock.mybatisdemo1.util.ResultUtil;

import java.util.List;

@RestController
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping(value = "/teachers")
    public Result getAll(){
        return ResultUtil.success(teacherService.getAll());
    }

    @GetMapping(value = "/teachers/{teaID}")
    public Result getOneByID(@PathVariable("teaID") int teaID){
        return ResultUtil.success(teacherService.gerOneByteaId(teaID));
    }
}
