
package com.prueba.SpringJ8.repository;

import com.prueba.SpringJ8.model.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailRepository extends JpaRepository <Email, Long>{
    
}
