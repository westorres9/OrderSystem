package com.devsuperior.ordersystem.dto;

import com.devsuperior.ordersystem.entities.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ClientDTO {

    private Long id;
    private String name;
    private String email;
    private String phone;
    private List<AddressDTO> addresses = new ArrayList<>();


    public ClientDTO() {
    }

    public ClientDTO(Long id, String name, String email, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public ClientDTO(Client entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.email = entity.getEmail();
        this.phone = entity.getPhone();

    }

    public ClientDTO(Client entity, List<Address> adressess) {
        this(entity);
        adressess.forEach(address -> this.addresses.add(new AddressDTO(address)));
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<AddressDTO> getAddresses() {
        return addresses;
    }
}

