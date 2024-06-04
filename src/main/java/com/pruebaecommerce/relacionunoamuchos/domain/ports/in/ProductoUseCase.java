package com.pruebaecommerce.relacionunoamuchos.domain.ports.in;

import com.pruebaecommerce.relacionunoamuchos.domain.model.Producto;

import java.util.Optional;

public interface ProductoUseCase {
    Producto crearProducto(Producto producto);
    Optional<Producto> getProducto(Long id);
    Optional<Producto> actualizarProducto(Long id, Producto producto);
}
