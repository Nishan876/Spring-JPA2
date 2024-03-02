package com.Nishan.SpringJPA.Controller;

import com.Nishan.SpringJPA.Model.Student;
import com.Nishan.SpringJPA.Sevice.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService stuService;

    @GetMapping("students")
    public List<Student> getStudents(){
        return stuService.getStudents();
    }

    @GetMapping("student/{rollNo}")
    public Student getStudent(@PathVariable("rollNo") int rollno){
        return stuService.getStudent(rollno);
    }

    @PostMapping("student")
    public List<Student> createStudent(Student s){
        stuService.saveStudent(s);
        return stuService.getStudents();

    }

    @PutMapping("student")
    public List<Student> updateStudent(@RequestBody Student s){
        stuService.update(s);
        return stuService.getStudents();

    }

    @DeleteMapping ("student/{rollNo}")
    public List<Student> deleteStudent(@PathVariable("rollNo") int rollno){
        stuService.deleteStudent(rollno);
        return stuService.getStudents();

    }

    @PostMapping("load")
    public void loadData(){
        stuService.load();
    }

}
