package com.pruebaecommerce.relacionunoamuchos.infraestructure.repository;

import com.pruebaecommerce.relacionunoamuchos.domain.model.Producto;
import com.pruebaecommerce.relacionunoamuchos.domain.ports.out.ProductoRepositoryPort;
import com.pruebaecommerce.relacionunoamuchos.infraestructure.entity.ProductoEntity;
import com.pruebaecommerce.relacionunoamuchos.infraestructure.mapper.ProductoMapper;
import org.springframework.stereotype.Component;

import java.util.Optional;
@Component

public class ProductoJpaRepositoryAdapter implements ProductoRepositoryPort {
    private final ProductoJpaRepository productoJpaRepository;
    private final ProductoMapper productoMapper;

    public ProductoJpaRepositoryAdapter(ProductoJpaRepository productoJpaRepository, ProductoMapper productoMapper) {
        this.productoJpaRepository = productoJpaRepository;
        this.productoMapper = productoMapper;
    }

    @Override
    public Producto save(Producto producto) {
        ProductoEntity productoEntity=productoMapper.toProductoEntity(producto);
        ProductoEntity saveProductoEntity=productoJpaRepository.save(productoEntity);
        return productoMapper.toProducto(saveProductoEntity);
    }

    @Override
    public Optional<Producto> findById(Long id) {
        return productoJpaRepository.findById(id).map(productoMapper::toProducto);
    }

    @Override
    public Optional<Producto> update(Long id, Producto producto) {
        if(productoJpaRepository.existsById(id)){
            ProductoEntity productoEntity=productoMapper.toProductoEntity(producto);
            productoEntity.setId(id);
            ProductoEntity updateProductoEntity=productoJpaRepository.save(productoEntity);
            Producto updateProducto=productoMapper.toProducto(updateProductoEntity);
            return Optional.of(updateProducto);
        }
        return Optional.empty();
    }
}
