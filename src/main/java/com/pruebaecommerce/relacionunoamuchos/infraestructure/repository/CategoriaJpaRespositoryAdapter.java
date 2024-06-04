package com.pruebaecommerce.relacionunoamuchos.infraestructure.repository;

import com.pruebaecommerce.relacionunoamuchos.domain.model.Categoria;
import com.pruebaecommerce.relacionunoamuchos.domain.ports.out.CategoriaReposityPort;
import com.pruebaecommerce.relacionunoamuchos.infraestructure.entity.CategoriaEntity;
import com.pruebaecommerce.relacionunoamuchos.infraestructure.mapper.CategoriaMapper;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CategoriaJpaRespositoryAdapter implements CategoriaReposityPort {
    private final CategoriaJpaRepository categoriaJpaRepository;
    private final CategoriaMapper categoriaMapper;

    public CategoriaJpaRespositoryAdapter(CategoriaJpaRepository categoriaJpaRepository, CategoriaMapper categoriaMapper) {
        this.categoriaJpaRepository = categoriaJpaRepository;
        this.categoriaMapper = categoriaMapper;
    }

    @Override
    public Categoria save(Categoria categoria) {
        CategoriaEntity categoriaEntity=categoriaMapper.toCategoriaEntity(categoria);
        CategoriaEntity saveCategoriaEntity=categoriaJpaRepository.save(categoriaEntity);
        return categoriaMapper.toCategoria(saveCategoriaEntity);
    }

    @Override
    public Optional<Categoria> findById(Long id) {

        return categoriaJpaRepository.findById(id).map(categoriaMapper::toCategoria);
    }
}
