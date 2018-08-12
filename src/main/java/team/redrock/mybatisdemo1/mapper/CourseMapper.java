package team.redrock.mybatisdemo1.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import team.redrock.mybatisdemo1.entity.Course;

import java.util.List;

public interface CourseMapper {

    @Select("select * from courses where courseID = #{courseID} ")
    Course getOneBycourseID(int courseID);

    @Select("select * from courses where cID=#{cID}")
    Course getOneBycId(int cID);

    @Select("select * from courses")
    List<Course> getAll();

    @Update("update courses set cID = #{cID}, courseID =#{courseID}, name=#{name}, tID=#{tID} ")
    void update(Course course);

    @Insert("insert into courses (courseID,name,tID) values(#{courseID},#{name},#{tID})")
    void insert(Course course);

    @Delete("delete from courses where courseID=#{courseID}")
    void delete(int courseID);
}
