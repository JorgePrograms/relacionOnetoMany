package com.pruebaecommerce.relacionunoamuchos.infraestructure.mapper;

import com.pruebaecommerce.relacionunoamuchos.domain.model.Categoria;
import com.pruebaecommerce.relacionunoamuchos.infraestructure.entity.CategoriaEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CategoriaMapper {
Categoria toCategoria(CategoriaEntity categoriaEntity);
@Mapping(target = "productos", ignore = true)
CategoriaEntity toCategoriaEntity(Categoria categoria);

}
