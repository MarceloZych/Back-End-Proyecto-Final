 package com.ProyectoArgP.ArgP.entityArgP;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;
import lombok.Data;

@Entity
@Data
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcontact")
    private Long id;
    
    private String nombre;
        
    private String email;
    
    private LocalDate fechaNacimiento;
    
    private String phone;
}
