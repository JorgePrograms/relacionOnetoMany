package com.pruebaecommerce.relacionunoamuchos.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Categoria {
    private Long id;
    private String nombre;
    private List<Producto> productos;

    public Categoria() {
    }

    public Categoria(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Categoria(Long id, String nombre, List<Producto> productos) {
        this.id = id;
        this.nombre = nombre;
        this.productos = productos;
    }
}
