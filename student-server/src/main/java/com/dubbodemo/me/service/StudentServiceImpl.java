package com.dubbodemo.me.service;

import com.dubbodemo.me.api.StudentService;
import com.dubbodemo.me.entity.Student;
import com.dubbodemo.me.vo.ResultVO;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{
    @Override
    public ResultVO<Student> getStudentByName(String name) {
        Student student = new Student(name,"m",24);
        ResultVO<Student> studentResultVO = new ResultVO<Student>(student,"success","1");
        return studentResultVO;
    }
}
