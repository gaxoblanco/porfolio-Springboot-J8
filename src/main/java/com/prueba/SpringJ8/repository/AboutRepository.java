
package com.prueba.SpringJ8.repository;

import com.prueba.SpringJ8.model.About;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AboutRepository extends JpaRepository<About, Long>{
    
}