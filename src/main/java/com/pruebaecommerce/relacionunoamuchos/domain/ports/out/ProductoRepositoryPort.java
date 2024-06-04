package com.pruebaecommerce.relacionunoamuchos.domain.ports.out;

import com.pruebaecommerce.relacionunoamuchos.domain.model.Producto;

import java.util.Optional;

public interface ProductoRepositoryPort {
    Producto save(Producto producto);
    Optional<Producto> findById(Long id);
    Optional<Producto> update(Long id,Producto producto);
}
