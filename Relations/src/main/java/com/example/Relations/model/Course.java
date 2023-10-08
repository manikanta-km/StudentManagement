package com.example.Relations.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {

    @Id
    private Integer courseId ;
    private String title;
    private String description;
    private String duration;

    @ManyToMany
    @JoinTable(name = "course_students_m_m_mappings",
            joinColumns = @JoinColumn(name = "fk_course") ,
            inverseJoinColumns = @JoinColumn(name = "fk_student"))
    List<Student> students;
}
