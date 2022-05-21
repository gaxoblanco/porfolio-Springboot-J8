
package com.prueba.SpringJ8.model.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class UserDto {
        private String email;
    private String password;
    @Id
    private Long id;

    public UserDto() {
    }

    public UserDto(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserDto{" + "email=" + email + ", password=" + password + '}';
    }


}
