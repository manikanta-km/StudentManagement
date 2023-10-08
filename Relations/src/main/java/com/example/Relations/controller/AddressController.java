package com.example.Relations.controller;

import com.example.Relations.model.Address;
import com.example.Relations.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;

    @PostMapping("address")
    public String addAdd(@RequestBody List<Address> newAdd){
      return addressService.addAdd(newAdd);
    }
    @GetMapping("address")
    public List<Address> getAddresses(){
        return addressService.getAddresses();
    }

    @PutMapping("address")
    public String updateAdd(@RequestParam Integer id, @RequestParam String landmark){
       return addressService.updateAdd(id, landmark);
    }

    @DeleteMapping("address")
    public String deleteAdd(@RequestParam Integer id){
        return addressService.deleteAdd(id);
    }
}
