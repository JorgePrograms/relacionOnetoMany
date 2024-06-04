package com.pruebaecommerce.relacionunoamuchos.domain.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Categoria {
    private Long id;
    private String nombre;


    public Categoria(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
}
