
package com.prueba.SpringJ8.repository;

import com.prueba.SpringJ8.model.Rout;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoutRepository extends JpaRepository <Rout, Long>{
    
}
