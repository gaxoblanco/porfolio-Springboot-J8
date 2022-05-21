/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba.SpringJ8.service;

import com.prueba.SpringJ8.model.Email;
import com.prueba.SpringJ8.repository.EmailRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailService implements IEmailService{
    
    @Autowired
    public EmailRepository emailRepo;

    @Override
    public List<Email> verEmail() {
        return emailRepo.findAll();
    }

    @Override
    public void agregarEmail(Email email) {
        emailRepo.save(email);
    }

    @Override
    public void borrarEmail(Long id) {
        emailRepo.deleteById(id);
    }
    
}
