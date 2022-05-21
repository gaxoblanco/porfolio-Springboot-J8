
package com.prueba.SpringJ8.service;

import com.prueba.SpringJ8.model.Study;
import java.util.List;


public interface IStudyService {
    public List<Study> verEstudios();
    public void crearEstudio(Study est);
    public void borrarEstudio(Long id);
    public Study buscarEstudio(Long id);
}
