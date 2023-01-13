package com.ProyectoArgP.ArgP.controllerArgP;


import com.ProyectoArgP.ArgP.entityArgP.Contact;
import com.ProyectoArgP.ArgP.repositoryArgP.ContactRepository;
import java.util.List;
import lombok.AllArgsConstructor;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/contact") //localhost:8080/persona
@AllArgsConstructor
public class ContactController {
    
    private final ContactRepository contactRepository;    
    
    @GetMapping
    public List<Contact> listContact(){
        return contactRepository.findAll();
    }
}
