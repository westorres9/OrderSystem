package com.devsuperior.ordersystem.resources;

import com.devsuperior.ordersystem.dto.CategoryDTO;
import com.devsuperior.ordersystem.dto.ProductDTO;
import com.devsuperior.ordersystem.entities.Product;
import com.devsuperior.ordersystem.services.CategoryService;
import com.devsuperior.ordersystem.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductResource {

    @Autowired
    private ProductService service;

    @GetMapping
    public ResponseEntity<Page<ProductDTO>> findAll(Pageable pageable) {
        Page<ProductDTO> page = service.findAll(pageable);
        return ResponseEntity.ok().body(page);
    }
}
