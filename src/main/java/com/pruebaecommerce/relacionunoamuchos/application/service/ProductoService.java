package com.pruebaecommerce.relacionunoamuchos.application.service;

import com.pruebaecommerce.relacionunoamuchos.domain.model.Producto;
import com.pruebaecommerce.relacionunoamuchos.domain.ports.in.ProductoUseCase;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ProductoService implements ProductoUseCase {

    private final ProductoUseCase productoUseCase;

    public ProductoService(ProductoUseCase productoUseCase) {
        this.productoUseCase = productoUseCase;
    }

    @Override
    public Producto crearProducto(Producto producto) {
        return productoUseCase.crearProducto(producto);
    }

    @Override
    public Optional<Producto> getProducto(Long id) {
        return productoUseCase.getProducto(id);
    }

    @Override
    public Optional<Producto> actualizarProducto(Long id, Producto producto) {
        return productoUseCase.actualizarProducto(id,producto);
    }
}
