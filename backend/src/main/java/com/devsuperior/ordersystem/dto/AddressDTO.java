package com.devsuperior.ordersystem.dto;

import com.devsuperior.ordersystem.entities.*;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.List;

public class AddressDTO {

    private Long id;
    private String street;
    private String number;
    private String postalCode;
    private String city;
    private String state;

    public AddressDTO() {
    }

    public AddressDTO(Long id, String street, String number, String postalCode,String city,String state ) {
        this.id = id;
        this.street = street;
        this.number = number;
        this.postalCode = postalCode;
        this.city = city;
        this.state = state;
    }

    public AddressDTO(Address entity) {
        this.id = entity.getId();
        this.street = entity.getStreet();
        this.number = entity.getNumber();
        this.postalCode = entity.getPostalCode();
        this.city = entity.getCity();
        this.state = entity.getState();
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
