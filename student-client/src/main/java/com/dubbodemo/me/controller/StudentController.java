package com.dubbodemo.me.controller;

import com.dubbodemo.me.api.StudentService;
import com.dubbodemo.me.entity.Student;
import com.dubbodemo.me.vo.ResultVO;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
@Controller
public class StudentController{
    Logger logger = Logger.getLogger(StudentController.class);
    @Resource
    private StudentService studentService;
    @ResponseBody
    @RequestMapping("/getData")
    public ResultVO<Student> getData(String name){
        ResultVO<Student> studentByName = studentService.getStudentByName(name);
        Student student = studentByName.getData();
        logger.info("+++++++++返回码是："+studentByName.getStatus()+" name:"+student.getName()+" resultSet:"+student.getSex());

        return studentByName;
    }
}
