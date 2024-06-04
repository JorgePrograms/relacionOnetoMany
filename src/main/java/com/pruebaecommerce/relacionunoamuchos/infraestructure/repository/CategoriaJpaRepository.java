package com.pruebaecommerce.relacionunoamuchos.infraestructure.repository;

import com.pruebaecommerce.relacionunoamuchos.infraestructure.entity.CategoriaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaJpaRepository extends JpaRepository<CategoriaEntity,Long> {
}
