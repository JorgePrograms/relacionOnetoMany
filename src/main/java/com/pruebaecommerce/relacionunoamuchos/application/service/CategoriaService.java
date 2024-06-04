package com.pruebaecommerce.relacionunoamuchos.application.service;

import com.pruebaecommerce.relacionunoamuchos.domain.model.Categoria;
import com.pruebaecommerce.relacionunoamuchos.domain.ports.in.CategoriaUseCase;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CategoriaService implements CategoriaUseCase {
    private final CategoriaUseCase categoriaUseCase;

    public CategoriaService(CategoriaUseCase categoriaUseCase) {
        this.categoriaUseCase = categoriaUseCase;
    }

    @Override
    public Categoria crearCategoria(Categoria categoria) {

        return categoriaUseCase.crearCategoria(categoria);
    }

    @Override
    public Optional<Categoria> getCategoria(Long id) {

        return categoriaUseCase.getCategoria(id);
    }
}
