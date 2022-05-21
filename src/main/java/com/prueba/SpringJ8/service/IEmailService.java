
package com.prueba.SpringJ8.service;

import com.prueba.SpringJ8.model.Email;
import java.util.List;


public interface IEmailService {
    public List<Email> verEmail();
    public void agregarEmail(Email email);
    public void borrarEmail (Long id);
}
