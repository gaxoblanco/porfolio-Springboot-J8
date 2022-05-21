
package com.prueba.SpringJ8.controller;

import com.prueba.SpringJ8.model.Experience;
import com.prueba.SpringJ8.service.IExperienceService;
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
public class ExperienceController {
        @Autowired
    public IExperienceService expServ;
    
    @PostMapping("/new/experiencia")
    public void agregarUsuario (@RequestBody Experience exp){
        expServ.crearExperiencia(exp);
    }
    
    @GetMapping("/ver/experiencia")
    @ResponseBody
    public List<Experience> verExperiencias (){
        return expServ.verExperiencias();
    }
    
    @DeleteMapping ("/delete/experiencia/{id}")
    public void borrarUser(@PathVariable Long id){
          expServ.borrarExperiencia(id);
    }
}
