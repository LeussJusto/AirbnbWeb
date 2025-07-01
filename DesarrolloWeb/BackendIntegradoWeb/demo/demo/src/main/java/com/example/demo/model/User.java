package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    
    @Column(unique = true)
    private String email;
    
    private String password;
    
    @Enumerated(EnumType.STRING)
    private Role role;
    
    private String phone;
    private String location;
    private String bio;
    
    @Column(name = "date_of_birth")
    private String dateOfBirth;
    
    private String avatar;
}