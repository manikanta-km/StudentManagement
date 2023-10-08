package com.example.Relations.services;

import com.example.Relations.model.Course;
import com.example.Relations.repo.ICourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    ICourseRepo iCourseRepo;

    public String addCourse(List<Course> newCourse){
        iCourseRepo.saveAll(newCourse);
        return "Course Added";
    }

    public List<Course> getCourses(){
        return iCourseRepo.findAll();
    }

    public String updateCourse(Integer id,String newDuration){
        Course pCourse = iCourseRepo.findById(id).orElse(null);
        if(pCourse != null){
            pCourse.setDuration(newDuration);
            iCourseRepo.save(pCourse);
            return "Course Duration Updated";
        }
        else
            return  "Course Not Found";
    }

    public String deleteCourse(Integer id){
        iCourseRepo.deleteById(id);
        return "Course Deleted";
    }
}
