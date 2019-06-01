package com.dubbodemo.me.api;

import com.dubbodemo.me.entity.Student;
import com.dubbodemo.me.vo.ResultVO;

public interface StudentService{
    ResultVO<Student> getStudentByName(String name);
}
