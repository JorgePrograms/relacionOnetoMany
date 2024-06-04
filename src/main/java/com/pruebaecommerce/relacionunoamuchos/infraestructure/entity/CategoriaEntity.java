package com.pruebaecommerce.relacionunoamuchos.infraestructure.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Entity
@Getter
@Setter
@Table(name = "categoria")
public class CategoriaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    @OneToMany(mappedBy = "categoriaEntity",cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<ProductoEntity> productos=new ArrayList<>();

    public CategoriaEntity() {
    }

    public CategoriaEntity(Long id, String nombre, List<ProductoEntity> productos) {
        this.id = id;
        this.nombre = nombre;
        this.productos = productos;
    }
}
