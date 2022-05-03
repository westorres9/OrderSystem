package com.devsuperior.ordersystem.dto;

import com.devsuperior.ordersystem.entities.Category;
import com.devsuperior.ordersystem.entities.City;
import com.devsuperior.ordersystem.entities.Product;
import com.devsuperior.ordersystem.entities.State;

import java.util.ArrayList;
import java.util.List;

public class StateDTO {

    private Long id;
    private String name;

    private List<CityDTO> cities = new ArrayList<>();

    private StateDTO(){
    }

    public StateDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public StateDTO(State entity) {
        this.id = entity.getId();
        this.name = entity.getName();
    }

    public StateDTO(State entity, List<City> cities) {
        this(entity);
        cities.forEach(city -> this.cities.add(new CityDTO(city)));
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

    public List<CityDTO> getCities() {
        return cities;
    }
}
