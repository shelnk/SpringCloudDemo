package com.fy.Controller;

import com.fy.Dao.StudentRepository;
import com.fy.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class StuController {
    @Autowired
    private StudentRepository studentRepository;
    @RequestMapping("/getStuByName/{name}")
    public Optional<Student> getSchool1() {
        Optional<Student> stu = studentRepository.findById(1L);
        return stu;
    }
}