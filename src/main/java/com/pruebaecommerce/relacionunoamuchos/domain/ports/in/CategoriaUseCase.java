package com.pruebaecommerce.relacionunoamuchos.domain.ports.in;

import com.pruebaecommerce.relacionunoamuchos.domain.model.Categoria;

import java.util.Optional;

public interface CategoriaUseCase {
    Categoria crearCategoria(Categoria categoria);
    Optional<Categoria>getCategoria(Long id);
}
