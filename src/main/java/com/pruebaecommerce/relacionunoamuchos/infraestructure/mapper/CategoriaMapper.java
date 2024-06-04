package com.pruebaecommerce.relacionunoamuchos.infraestructure.mapper;

import com.pruebaecommerce.relacionunoamuchos.domain.model.Categoria;
import com.pruebaecommerce.relacionunoamuchos.domain.model.Producto;
import com.pruebaecommerce.relacionunoamuchos.infraestructure.entity.CategoriaEntity;
import com.pruebaecommerce.relacionunoamuchos.infraestructure.entity.ProductoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoriaMapper {
    @Mapping(source = "productos", target = "productosEntities")
    CategoriaEntity toCategoriaEntity(Categoria categoria);

    @Mapping(source = "productosEntities", target = "productos")
    Categoria toCategoria(CategoriaEntity categoriaEntity);

}
