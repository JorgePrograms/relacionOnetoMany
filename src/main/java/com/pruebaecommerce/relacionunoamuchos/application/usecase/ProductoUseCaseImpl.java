package com.pruebaecommerce.relacionunoamuchos.application.usecase;

import com.pruebaecommerce.relacionunoamuchos.domain.model.Producto;
import com.pruebaecommerce.relacionunoamuchos.domain.ports.in.ProductoUseCase;
import com.pruebaecommerce.relacionunoamuchos.domain.ports.out.ProductoRepositoryPort;

import java.util.Optional;

public class ProductoUseCaseImpl implements ProductoUseCase {
    private final ProductoRepositoryPort productoRepositoryPort;

    public ProductoUseCaseImpl(ProductoRepositoryPort productoRepositoryPort) {
        this.productoRepositoryPort = productoRepositoryPort;
    }

    @Override
    public Producto crearProducto(Producto producto) {
        return productoRepositoryPort.save(producto);
    }

    @Override
    public Optional<Producto> getProducto(Long id) {
        return productoRepositoryPort.findById(id);
    }

    @Override
    public Optional<Producto> actualizarProducto(Long id, Producto producto) {
        return productoRepositoryPort.update(id,producto);
    }
}
