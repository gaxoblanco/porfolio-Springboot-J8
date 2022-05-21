
package com.prueba.SpringJ8.repository;

import com.prueba.SpringJ8.model.Experience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienceRepository extends JpaRepository <Experience, Long>{
    
}
