package team.redrock.mybatisdemo1.mapper;

import org.apache.ibatis.annotations.*;
import team.redrock.mybatisdemo1.entity.Student;
import team.redrock.mybatisdemo1.entity.StudentToCourse;

import java.util.List;

public interface StudentMapper {
    /*
       查找一个学生
       @return Student
    */
    @Select("SELECT * FROM students WHERE stuID = #{stuID}")
    Student getOneBystuId(int stuID);

    @Select("SELECT * FROM students ")
    List<Student> getAll();

    @Select("select * from students where sID=#{sID}")
    Student getOneBysId(int sID);

  /*  @Insert("insert into students (name,gender,stuID) values (#{name},#{gender},#{stuID})")
    void insert(Student student);

    @Delete("delete from students where stuID = #{stuID}")
    void delete(int stuID);

    @Update("update students set name= #{name},gender=#{gender} where stuID=#{stuID}")
    void update(Student student);*/

}
