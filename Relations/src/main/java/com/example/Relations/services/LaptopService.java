package com.example.Relations.services;

import com.example.Relations.model.Laptop;
import com.example.Relations.repo.ILaptopRepo;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {
    @Autowired
    ILaptopRepo iLaptopRepo;

    public String addLaptop(List<Laptop> newLap){
        iLaptopRepo.saveAll(newLap);
        return "Laptop Added";
    }

    public List<Laptop> getLaps(){
        return iLaptopRepo.findAll();
    }

    public String updateLap(Integer id,Integer newPrice){
        Laptop pLap = iLaptopRepo.findById(id).orElse(null);
        if(pLap != null){
            pLap.setPrice(newPrice);
            iLaptopRepo.save(pLap);
            return "Laptop Price Updated";
        }
        else
            return "Laptop Not Found";
    }

    public String deleteLaptop(Integer id){
        iLaptopRepo.deleteById(id);
        return  "Laptop Deleted";
    }

}
