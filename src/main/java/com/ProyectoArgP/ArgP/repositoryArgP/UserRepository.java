package com.ProyectoArgP.ArgP.repositoryArgP;

import com.ProyectoArgP.ArgP.entityArgP.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <User,Long>{
    
    Optional<User> findOneByEmail(String email);
}
