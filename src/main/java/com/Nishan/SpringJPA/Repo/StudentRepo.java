package com.Nishan.SpringJPA.Repo;

import com.Nishan.SpringJPA.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {


}
