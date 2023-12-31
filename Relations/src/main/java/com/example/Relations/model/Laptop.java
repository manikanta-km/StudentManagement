package com.example.Relations.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Laptop {
    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer laptopId;
    private String name;
    private String brand;
    private Integer price;

    @OneToOne
    private Student student;
}
