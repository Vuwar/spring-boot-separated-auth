package com.example.spring_boot_separated_auth.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Otp {

    @Id
    private String username;
    private String code;
}
