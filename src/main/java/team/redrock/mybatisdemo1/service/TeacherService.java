package team.redrock.mybatisdemo1.service;

import team.redrock.mybatisdemo1.entity.Teacher;

import java.lang.annotation.Target;
import java.util.List;

public interface TeacherService {

    List<Teacher> getAll();

    Teacher gerOneByteaId(int teaID);
}
