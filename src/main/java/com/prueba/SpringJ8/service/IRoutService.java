
package com.prueba.SpringJ8.service;

import com.prueba.SpringJ8.model.Rout;
import java.util.List;


public interface IRoutService {
    public List<Rout> verRout();
    public void agregarRout(Rout abo);
    public void borrarRout(Long id);
}
