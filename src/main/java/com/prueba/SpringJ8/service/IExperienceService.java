
package com.prueba.SpringJ8.service;

import com.prueba.SpringJ8.model.Experience;
import java.util.List;


public interface IExperienceService {
    public List<Experience> verExperiencias();
    public void crearExperiencia(Experience exp);
    public void borrarExperiencia(Long id);
    public Experience buscarExperiencia(Long id);
}
