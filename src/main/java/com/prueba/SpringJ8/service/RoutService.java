
package com.prueba.SpringJ8.service;

import com.prueba.SpringJ8.model.Rout;
import com.prueba.SpringJ8.repository.RoutRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoutService implements IRoutService{
    
     @Autowired
    public RoutRepository routRepo;

    @Override
    public List<Rout> verRout() {
        return routRepo.findAll();
    }

    @Override
    public void agregarRout(Rout abo) {
        routRepo.save(abo);
    }

    @Override
    public void borrarRout(Long id) {
        routRepo.deleteById(id);
    }
    
}
