package com.pruebaecommerce.relacionunoamuchos.infraestructure.mapper;

import com.pruebaecommerce.relacionunoamuchos.domain.model.Producto;
import com.pruebaecommerce.relacionunoamuchos.infraestructure.entity.ProductoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface ProductoMapper {
    @Mapping(source = "categoriaEntity",target = "categoria")
    Producto toProducto(ProductoEntity productoEntity);
    @Mapping(source = "categoria",target = "categoriaEntity")
    ProductoEntity toProductoEntity(Producto producto);

}