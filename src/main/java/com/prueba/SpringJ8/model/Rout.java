
package com.prueba.SpringJ8.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Rout {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String ruta;
    private String nombre;
    private String descripcion;
    private Boolean acess;
}
