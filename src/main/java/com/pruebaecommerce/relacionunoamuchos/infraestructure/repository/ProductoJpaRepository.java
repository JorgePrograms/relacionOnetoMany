package com.pruebaecommerce.relacionunoamuchos.infraestructure.repository;

import com.pruebaecommerce.relacionunoamuchos.infraestructure.entity.ProductoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoJpaRepository extends JpaRepository<ProductoEntity,Long> {
}
