package com.example.Relations.controller;

import com.example.Relations.model.Course;
import com.example.Relations.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    CourseService courseService;

    @PostMapping("course")
    public String addCourse(@RequestBody List<Course> newCourse){
        return courseService.addCourse(newCourse);
    }

    @GetMapping("courses")
    public List<Course> getCourses(){
        return courseService.getCourses();
    }

    @PutMapping("course")
    public String updateCourse(@RequestParam Integer id, @RequestParam String newDuration){
       return courseService.updateCourse(id, newDuration);
    }

    @DeleteMapping("course")
    public String deleteCourse(@RequestParam Integer id){
        return courseService.deleteCourse(id) ;
    }

}
