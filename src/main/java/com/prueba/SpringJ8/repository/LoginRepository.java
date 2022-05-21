
package com.prueba.SpringJ8.repository;

import com.prueba.SpringJ8.model.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository <User, Long>{
    List<User> findByEmailAndIsEnabledTrue(String email);
}
