package com.pruebaecommerce.relacionunoamuchos.application.usecase;

import com.pruebaecommerce.relacionunoamuchos.domain.model.Categoria;
import com.pruebaecommerce.relacionunoamuchos.domain.ports.in.CategoriaUseCase;
import com.pruebaecommerce.relacionunoamuchos.domain.ports.out.CategoriaReposityPort;

import java.util.Optional;

public class CategoriaUseCaseImpl implements CategoriaUseCase {
    private final CategoriaReposityPort categoriaReposityPort;

    public CategoriaUseCaseImpl(CategoriaReposityPort categoriaReposityPort) {
        this.categoriaReposityPort = categoriaReposityPort;
    }

    @Override
    public Categoria crearCategoria(Categoria categoria) {
        return categoriaReposityPort.save(categoria);
    }

    @Override
    public Optional<Categoria> getCategoria(Long id) {
        return categoriaReposityPort.findById(id);
    }
}
