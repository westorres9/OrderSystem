package com.devsuperior.ordersystem.services;

import com.devsuperior.ordersystem.dto.CategoryDTO;
import com.devsuperior.ordersystem.entities.Category;
import com.devsuperior.ordersystem.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    @Transactional(readOnly = true)
    public Page<CategoryDTO> findAll(Pageable pageable){
        Page<Category> page = repository.findAll(pageable);
        return page.map(x -> new CategoryDTO(x));
    }
}
