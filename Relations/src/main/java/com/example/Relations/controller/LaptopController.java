package com.example.Relations.controller;

import com.example.Relations.model.Laptop;
import com.example.Relations.services.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaptopController {
    @Autowired
    LaptopService laptopService;

    @PostMapping("laptop")
    public String addLaptop(@RequestBody List<Laptop> newLap){
        return  laptopService.addLaptop(newLap);
    }

    @GetMapping("laptops")
    public List<Laptop> getLaps(){
        return laptopService.getLaps();
    }

    @PutMapping("laptop")
    public String updateLap(@RequestParam Integer id, @RequestParam Integer newPrice){
        return laptopService.updateLap(id, newPrice);
    }

    @DeleteMapping("laptop")
    public String deleteLaptop(@RequestParam Integer id){
      return laptopService.deleteLaptop(id);
    }
}
