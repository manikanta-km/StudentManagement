package com.example.Relations.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addressId;
    private String landmark;
    private String zipcode;
    private String district;
    private String state;
    private String country;
}
