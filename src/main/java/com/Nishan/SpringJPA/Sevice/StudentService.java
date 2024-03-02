package com.Nishan.SpringJPA.Sevice;


import com.Nishan.SpringJPA.Model.Student;
import com.Nishan.SpringJPA.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepo repo;


    public List<Student> getStudents(){
        return repo.findAll();
    }

    public Student getStudent(int rollno) {
        return repo.findById(rollno).orElse(new Student());
    }

    public void saveStudent(Student s) {
        repo.save(s);
    }

    public void update(Student s) {
        repo.save(s);
    }

    public void deleteStudent(int rollno) {
        repo.deleteById(rollno);
    }

    public void load() {

      List<Student>  lstStudent=new ArrayList<>(
            List.of(new Student(101,"Nishan",67,List.of("Chemistry","Physics","Bio")), new Student(102,"Kishan",76,List.of("Chemistry","Physics","Bio")), new Student(103,"Ishan",88,List.of("Chemistry","Physics","Bio")), new Student(104,"Vivan",99,List.of("Chemistry","Physics","Bio")), new Student(105,"Pechi",100,List.of("Chemistry","Physics","Bio"))));

    repo.saveAll(lstStudent);


    }
}
