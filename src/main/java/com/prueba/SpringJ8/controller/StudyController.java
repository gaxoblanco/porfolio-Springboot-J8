
package com.prueba.SpringJ8.controller;

import com.prueba.SpringJ8.model.Study;
import com.prueba.SpringJ8.service.IStudyService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudyController {
    @Autowired
    public IStudyService estServ;
    
    @PostMapping("/new/estudio")
    public void agregarUsuario (@RequestBody Study est){
        estServ.crearEstudio(est);
    }
    
    @GetMapping("/ver/estudio")
    @ResponseBody
    public List<Study> verEstudios (){
        return estServ.verEstudios();
    }
    
    @DeleteMapping ("/delete/estudio/{id}")
    public void borrarUser(@PathVariable Long id){
          estServ.borrarEstudio(id);
    }
}
