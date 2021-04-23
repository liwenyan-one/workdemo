package com.springboot.workdemo.dao;

import com.springboot.workdemo.domain.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.ListResourceBundle;

@Mapper
public interface StudentMapper {
    public List<Student> searchAllStu();
    public Student searchStuByNo(Integer no);
    public Integer insertStu(Student s);
    public Integer updateStuByNo(Student s);
    public Integer deleteStuByNo(Integer no);
}
