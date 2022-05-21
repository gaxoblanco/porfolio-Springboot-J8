
package com.prueba.SpringJ8.service;

import com.prueba.SpringJ8.model.Study;
import com.prueba.SpringJ8.repository.StudyRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudyService implements IStudyService{
    @Autowired
    public StudyRepository estRepo;

    @Override
    public List<Study> verEstudios() {
        return estRepo.findAll();
    }

    @Override
    public void crearEstudio(Study est) {
        estRepo.save(est);
    }

    @Override
    public void borrarEstudio(Long id) {
        estRepo.deleteById(id);
    }

    @Override
    public Study buscarEstudio(Long id) {
        return estRepo.findById(id).orElse(null);
    }
    
}
