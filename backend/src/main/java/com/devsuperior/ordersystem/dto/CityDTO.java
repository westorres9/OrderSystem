package com.devsuperior.ordersystem.dto;

import com.devsuperior.ordersystem.entities.Category;
import com.devsuperior.ordersystem.entities.City;
import com.devsuperior.ordersystem.entities.Product;

import java.util.List;

public class CityDTO {

    private Long id;
    private String name;

    public CityDTO() {
    }

    public CityDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public CityDTO(City entity) {
        this.id = entity.getId();
        this.name = entity.getName();
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

}
