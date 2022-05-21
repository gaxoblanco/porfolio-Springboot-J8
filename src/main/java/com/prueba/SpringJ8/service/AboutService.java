
package com.prueba.SpringJ8.service;

import com.prueba.SpringJ8.model.About;
import com.prueba.SpringJ8.repository.AboutRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AboutService implements IAboutService{
    
    @Autowired
    public AboutRepository aboutRepo;

    @Override
    public List<About> verAbouts() {
        return aboutRepo.findAll();
    }

    @Override
    public void agregarAbout(About abo) {
        aboutRepo.save(abo);
    }

    @Override
    public void borrarAbout(Long id) {
        aboutRepo.deleteById(id);
    }

    @Override
    public About buscarAbout(Long id) {
        return aboutRepo.findById(id).orElse(null);
    }

    @Override
    public void updateAbout(About abo) {
        aboutRepo.save(abo);
    }

}
