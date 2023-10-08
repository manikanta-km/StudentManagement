package com.example.Relations.repo;

import com.example.Relations.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILaptopRepo extends JpaRepository<Laptop,Integer> {
}
