package com.devsuperior.ordersystem.services;

import com.devsuperior.ordersystem.dto.CategoryDTO;
import com.devsuperior.ordersystem.dto.ProductDTO;
import com.devsuperior.ordersystem.entities.Category;
import com.devsuperior.ordersystem.entities.Product;
import com.devsuperior.ordersystem.repositories.CategoryRepository;
import com.devsuperior.ordersystem.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public Page<ProductDTO> findAll(Pageable pageable){
        Page<Product> page = repository.findAll(pageable);
        return page.map(x -> new ProductDTO(x, x.getCategories()));
    }
}
