package team.redrock.mybatisdemo1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.redrock.mybatisdemo1.entity.Teacher;
import team.redrock.mybatisdemo1.mapper.TeacherMapper;
import team.redrock.mybatisdemo1.service.TeacherService;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;


    @Override
    public List<Teacher> getAll() {
        return teacherMapper.getAll();
    }

    @Override
    public Teacher gerOneByteaId(int teaID) {
        return teacherMapper.getOneByteaId(teaID);
    }
}
