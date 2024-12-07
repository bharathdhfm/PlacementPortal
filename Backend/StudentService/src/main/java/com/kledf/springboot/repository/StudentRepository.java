package com.kledf.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.kledf.springboot.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    @Query("SELECT s FROM Student s WHERE s.email = ?1 AND s.password = ?2")
    public Student checkStudentLogin(String email, String password);
    
    Student findByEmail(String email);
    public Student findByPasswordResetToken(String token);
}
	