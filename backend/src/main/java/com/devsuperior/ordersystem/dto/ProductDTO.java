package com.devsuperior.ordersystem.dto;

import com.devsuperior.ordersystem.entities.Category;
import com.devsuperior.ordersystem.entities.Product;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ProductDTO {

    private Long id;
    private String name;
    private Double price;

    private List<CategoryDTO> categories= new ArrayList<>();

    public ProductDTO() {
    }

    public ProductDTO(Long id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public ProductDTO(Product entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.price = entity.getPrice();
    }

    public ProductDTO(Product entity, List<Category> categories) {
        this(entity);
        categories.forEach(cat -> this.categories.add(new CategoryDTO(cat)));
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<CategoryDTO> getCategories() {
        return categories;
    }
}
