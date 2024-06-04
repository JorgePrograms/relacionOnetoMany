package com.pruebaecommerce.relacionunoamuchos.infraestructure.controller;

import com.pruebaecommerce.relacionunoamuchos.application.service.CategoriaService;
import com.pruebaecommerce.relacionunoamuchos.domain.model.Categoria;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/categoria")
public class CategoriaController {
    private final CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }
    @PostMapping
    public ResponseEntity<Categoria>createCategoria (Categoria categoria){
        Categoria createCategoria=categoriaService.crearCategoria(categoria);
        return new ResponseEntity<>(createCategoria, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Categoria> getCategoriaById(@PathVariable Long id){
    return categoriaService.getCategoria(id).
            map(categoria -> new ResponseEntity<>(categoria,HttpStatus.OK)).
            orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
