
package com.prueba.SpringJ8.controller;

import com.prueba.SpringJ8.model.Rout;
import com.prueba.SpringJ8.service.IRoutService;
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
public class RoutController {
    @Autowired
    public IRoutService routServ;

    
    @PostMapping("/new/rout")
    public void agregarSkill (@RequestBody Rout abo){
        routServ.agregarRout(abo);
    }
    
    @GetMapping("/ver/rout")
    @ResponseBody
    public List<Rout> verRout (){
        return routServ.verRout();
    }
    
    @DeleteMapping ("/delete/rout/{id}")
    public void borrarRout(@PathVariable Long id){
          routServ.borrarRout(id);
    }
}
