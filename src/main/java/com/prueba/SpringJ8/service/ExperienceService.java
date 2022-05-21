
package com.prueba.SpringJ8.service;

import com.prueba.SpringJ8.model.Experience;
import com.prueba.SpringJ8.repository.ExperienceRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienceService implements IExperienceService{
    
    @Autowired
    public ExperienceRepository expRepo;

    @Override
    public List<Experience> verExperiencias() {
        return expRepo.findAll();
    }

    @Override
    public void crearExperiencia(Experience exp) {
        expRepo.save(exp);
    }

    @Override
    public void borrarExperiencia(Long id) {
        expRepo.deleteById(id);
    }

    @Override
    public Experience buscarExperiencia(Long id) {
        return expRepo.findById(id).orElse(null);
    }
    
}
