package com.pruebaecommerce.relacionunoamuchos.infraestructure.controller;

import com.pruebaecommerce.relacionunoamuchos.application.service.ProductoService;
import com.pruebaecommerce.relacionunoamuchos.domain.model.Producto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/productos")
public class ProductoController {
    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }
    @PostMapping
    public ResponseEntity<Producto> createProducto(@RequestBody Producto producto){
        try {
            Producto createProducto =productoService.crearProducto(producto);
            return new ResponseEntity<>(createProducto, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }

    }
    @GetMapping("/{productoId}")
    public ResponseEntity<Producto> getProductoById(@PathVariable Long productoId){
        return productoService.getProducto(productoId)
                .map(producto -> new ResponseEntity<>(producto,HttpStatus.OK)).
                orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{productoId}")
    public ResponseEntity<Producto> updateProducto(@PathVariable Long productoId, @RequestBody Producto producto){
        return productoService.actualizarProducto(productoId,producto).
                map(pro->new ResponseEntity<>(pro,HttpStatus.OK)).
                orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));

    }

}
