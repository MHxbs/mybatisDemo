package team.redrock.mybatisdemo1.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import team.redrock.mybatisdemo1.entity.StudentToCourse;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentToCourseMapperTest {
    @Autowired
    private StudentToCourseMapper studentToCourseMapper;


    @Test
    public void getAllBySID() {
        List<StudentToCourse> list=studentToCourseMapper.getAllBySID(1);
        assertEquals(1,list.size());
    }


    @Test
    public void getAllByCID() {
        List<StudentToCourse> list=studentToCourseMapper.getAllByCID(1);
        assertEquals(4,list.size());
    }
}