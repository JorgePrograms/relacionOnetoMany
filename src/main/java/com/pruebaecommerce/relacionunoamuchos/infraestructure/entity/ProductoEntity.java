package com.pruebaecommerce.relacionunoamuchos.infraestructure.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name="producto")
public class ProductoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double precio;
    private String nombre;
    @ManyToOne
    @JoinColumn(name="categoria_id")
    @JsonBackReference
    private CategoriaEntity categoriaEntity;

    public ProductoEntity() {
    }

    public ProductoEntity(Long id, double precio, String nombre, CategoriaEntity categoriaEntity) {
        this.id = id;
        this.precio = precio;
        this.nombre = nombre;
        this.categoriaEntity = categoriaEntity;
    }
}
