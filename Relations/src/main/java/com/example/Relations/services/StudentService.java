package com.example.Relations.services;

import com.example.Relations.model.Student;
import com.example.Relations.repo.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {
    @Autowired
    IStudentRepo iStudentRepo;

    public  String addStu(List<Student> newSt){
        iStudentRepo.saveAll(newSt);
        return "Student Enrolled";
    }

    public List<Student> getStu(){
       return iStudentRepo.findAll();
    }

    public String updateSt(Integer id,String cAge){
        Student pSt = iStudentRepo.findById(id).orElse(null);
        if(pSt != null){
            pSt.setAge(cAge);
            iStudentRepo.save(pSt);
            return "Student Age Updated";
        }
        else
            return "Student Not Found";
    }

    public String deleteStu(Integer id){
        iStudentRepo.deleteById(id);
        return "Student Deleted";
    }


}
