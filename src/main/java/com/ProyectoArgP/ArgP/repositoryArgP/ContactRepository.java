package com.ProyectoArgP.ArgP.repositoryArgP;

import com.ProyectoArgP.ArgP.entityArgP.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
    
}
