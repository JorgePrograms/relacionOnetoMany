package com.pruebaecommerce.relacionunoamuchos.domain.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Producto {
    private Long id;
    private double precio;
    private String nombre;
    private Categoria categoria;

    public Producto(Long id, double precio, String nombre, Categoria categoria) {
        this.id = id;
        this.precio = precio;
        this.nombre = nombre;
        this.categoria = categoria;
    }
}
