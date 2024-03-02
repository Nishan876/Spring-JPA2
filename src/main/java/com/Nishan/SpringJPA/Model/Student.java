package com.Nishan.SpringJPA.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
@Getter
@Setter
@Entity
@Scope("Prototype")
public class Student {
    @Id
    private int rollno;
    private String name;
    private int marks;
    private List<String> subjects;

    public Student(){

    }
    public Student(int rolno1, String name, int marks, List<String> subs){
        this.rollno=rolno1;
        this.name=name;
        this.marks=marks;
        this.subjects=subs;
    }


}
