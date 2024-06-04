package com.pruebaecommerce.relacionunoamuchos.domain.ports.out;

import com.pruebaecommerce.relacionunoamuchos.domain.model.Categoria;

import java.util.Optional;

public interface CategoriaReposityPort {
    Categoria save(Categoria categoria);
    Optional<Categoria> findById(Long id);
}
