package com.pruebaecommerce.relacionunoamuchos.infraestructure.config;

import com.pruebaecommerce.relacionunoamuchos.application.service.CategoriaService;
import com.pruebaecommerce.relacionunoamuchos.application.service.ProductoService;
import com.pruebaecommerce.relacionunoamuchos.application.usecase.CategoriaUseCaseImpl;
import com.pruebaecommerce.relacionunoamuchos.application.usecase.ProductoUseCaseImpl;
import com.pruebaecommerce.relacionunoamuchos.domain.ports.out.CategoriaReposityPort;
import com.pruebaecommerce.relacionunoamuchos.domain.ports.out.ProductoRepositoryPort;
import com.pruebaecommerce.relacionunoamuchos.infraestructure.repository.CategoriaJpaRespositoryAdapter;
import com.pruebaecommerce.relacionunoamuchos.infraestructure.repository.ProductoJpaRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public ProductoService productoService(ProductoRepositoryPort productoRepositoryPort){
        return new ProductoService(new ProductoUseCaseImpl(productoRepositoryPort));
    }
    @Bean
    public ProductoRepositoryPort productoRepositoryPort(ProductoJpaRepositoryAdapter productoJpaRepositoryAdapter){
        return productoJpaRepositoryAdapter;
    }
    @Bean
    public CategoriaService categoriaService(CategoriaReposityPort categoriaReposityPort){
        return new CategoriaService(new CategoriaUseCaseImpl(categoriaReposityPort));

    }
    @Bean
    public CategoriaReposityPort categoriaReposityPort(CategoriaJpaRespositoryAdapter categoriaJpaRespositoryAdapter){
        return categoriaJpaRespositoryAdapter;
    }

}
