package team.redrock.mybatisdemo1.service.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.redrock.mybatisdemo1.entity.Student;
import team.redrock.mybatisdemo1.mapper.StudentMapper;
import team.redrock.mybatisdemo1.service.StudentService;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;


    @Override
    public List<Student> getAll() {
        return studentMapper.getAll();
    }

    @Override
    public Student getOneBystuId(int stuID) {
        return studentMapper.getOneBystuId(stuID);
    }
}
