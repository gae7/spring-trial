package com.example.tutorial.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;


//student specify the type that we want this repository to work upon, while Long is related to the id

@Repository //this interface is responsible for data access
public interface StudentRepository extends JpaRepository <Student, Long > {

    // SELECT * FROM student WHERE email = ?
    //@Query("SELECT s FROM Student s WHERE s.email=?1")
    Optional<Student> findStudentByEmail(String email);
}
