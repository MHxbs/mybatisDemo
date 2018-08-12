package team.redrock.mybatisdemo1.mapper;

import org.apache.ibatis.annotations.Select;
import team.redrock.mybatisdemo1.entity.StudentToCourse;

import javax.validation.constraints.Max;
import java.util.List;

public interface StudentToCourseMapper {

   /* @Select("select * from stu_coz where sID=#{sID}")
    StudentToCourse getOneBySID(int sID);*/

    @Select("select * from stu_coz where sID=#{sID}")
    List<StudentToCourse> getAllBySID(int sID);

   /* @Select("select * from stu_coz where cID=#{cID}")
    StudentToCourse getOneByCID(int cID);*/

    @Select("select * from stu_coz where cID=#{cID}")
    List<StudentToCourse> getAllByCID(int cID);




}
