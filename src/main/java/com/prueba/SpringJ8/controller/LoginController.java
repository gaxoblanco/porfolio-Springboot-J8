
package com.prueba.SpringJ8.controller;

import com.prueba.SpringJ8.model.User;
import com.prueba.SpringJ8.model.dto.UserDto;
import com.prueba.SpringJ8.service.Autentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    
    @Autowired
    Autentication autServ;

    @PostMapping("/login")
    public boolean login(@RequestBody UserDto userDto) {
        return autServ.UserEnabled(userDto);
    }

    @PostMapping("/register")
    public void register(@RequestBody User user) throws Exception {
        autServ.crearUsuario(user);
    }
}
