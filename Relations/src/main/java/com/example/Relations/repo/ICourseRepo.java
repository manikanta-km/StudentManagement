package com.example.Relations.repo;

import com.example.Relations.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICourseRepo extends JpaRepository<Course,Integer> {
}
