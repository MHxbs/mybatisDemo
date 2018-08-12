package team.redrock.mybatisdemo1.mapper;

import org.apache.ibatis.annotations.Select;
import team.redrock.mybatisdemo1.entity.Teacher;

import java.util.List;

public interface TeacherMapper {

    @Select("SELECT * FROM teachers WHERE teaID = #{teaID}")
    Teacher getOneByteaId(int teaID);

    @Select("SELECT * FROM teachers ")
    List<Teacher> getAll();
}
