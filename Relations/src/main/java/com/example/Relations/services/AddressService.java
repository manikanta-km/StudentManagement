package com.example.Relations.services;

import com.example.Relations.model.Address;
import com.example.Relations.repo.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    IAddressRepo iAddressRepo;

    public String addAdd(List<Address> newAdd){
        iAddressRepo.saveAll(newAdd);
        return "Address Added";
    }

    public List<Address> getAddresses(){
       return iAddressRepo.findAll();
    }

    public String updateAdd(Integer id, String landmark){
        Address pAdd = iAddressRepo.findById(id).orElse(null);
        if(pAdd !=null){
            pAdd.setLandmark(landmark);
            iAddressRepo.save(pAdd);
            return "Address Updated";
        }
        else
            return "Address Not Found";
    }

    public String deleteAdd(Integer id){
        iAddressRepo.deleteById(id);
        return "Address Deleted";
    }
}
