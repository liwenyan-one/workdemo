package com.springboot.workdemo.controller;

import com.springboot.workdemo.dao.StudentMapper;
import com.springboot.workdemo.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController{
    @Autowired
    private StudentMapper studentMapper;

    @RequestMapping("searchAllStu")
    public List<Student> searchAllStu(){
        return studentMapper.searchAllStu();
    }

    @RequestMapping("searchStuByNo")
    public Student searchStuByNo(Integer no){
        return studentMapper.searchStuByNo(no);
    }

    @RequestMapping("updateStuByNo")
    public Integer updateStuByNo(Student s){
        return studentMapper.updateStuByNo(s);
    }

    @RequestMapping("deleteStuByNo")
    public Integer deleteStuByNo(Integer no){
        return studentMapper.deleteStuByNo(no);
    }

    @RequestMapping("insertStu")
    public Integer insertStu(Student s){
        return studentMapper.insertStu(s);
    }
}
