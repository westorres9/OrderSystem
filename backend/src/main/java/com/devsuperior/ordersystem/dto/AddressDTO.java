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
    private ClientDTO client;
    private CityDTO city;

    public AddressDTO() {
    }

    public AddressDTO(Long id, String street, String number, String postalCode, ClientDTO client, CityDTO city) {
        this.id = id;
        this.street = street;
        this.number = number;
        this.postalCode = postalCode;
        this.client = client;
        this.city = city;
    }

    public AddressDTO(Address entity) {
        this.id = entity.getId();
        this.street = entity.getStreet();
        this.number = entity.getNumber();
        this.postalCode = entity.getPostalCode();
    }

    public AddressDTO(Address entity, City city, Client client) {
        this(entity);
        CityDTO cityDTO = new CityDTO(city);
        ClientDTO clientDTO = new ClientDTO(client);
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

    public ClientDTO getClient() {
        return client;
    }

    public void setClient(ClientDTO client) {
        this.client = client;
    }

    public CityDTO getCity() {
        return city;
    }

    public void setCity(CityDTO city) {
        this.city = city;
    }
}
