package com.example.Relations.repo;

import com.example.Relations.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepo extends JpaRepository<Student,Integer> {
}
