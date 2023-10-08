package com.example.Relations.controller;

import com.example.Relations.model.Student;
import com.example.Relations.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("student")
    public  String addStu(@RequestBody List<Student> newSt){
        return studentService.addStu(newSt);
    }

    @GetMapping("students")
    public List<Student> getStu(){
        return studentService.getStu();
    }

    @PutMapping("student")
    public String updateSt(@RequestParam Integer id,@RequestParam String cAge){
        return studentService.updateSt(id, cAge);
    }

    @DeleteMapping("student")
    public String deleteStu(@RequestParam Integer id){
        return studentService.deleteStu(id);
    }
}
