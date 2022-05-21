 
package com.prueba.SpringJ8.controller;

import com.prueba.SpringJ8.model.About;
import com.prueba.SpringJ8.service.IAboutService;
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
public class AboutController {
    
        @Autowired
    private IAboutService aboutServ;
    
    @PostMapping("/new/about")
    public void agregarAbout(@RequestBody About abo) {
        aboutServ.agregarAbout(abo);
    }

    @GetMapping("/ver/about")
    @ResponseBody
    public List<About> verAbouts(){
        return aboutServ.verAbouts();
    }

    @DeleteMapping("/delete/about/{id}")
    public void borrarAbout(@PathVariable Long id) {
        aboutServ.borrarAbout(id);
    }

    @PostMapping("/edit/about/{id}")
    public void updateAbout(@RequestBody About abo) {
        aboutServ.updateAbout(abo);
    }
}
