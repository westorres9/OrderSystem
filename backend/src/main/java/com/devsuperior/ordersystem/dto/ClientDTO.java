package com.devsuperior.ordersystem.dto;

import com.devsuperior.ordersystem.entities.Address;
import com.devsuperior.ordersystem.entities.Category;
import com.devsuperior.ordersystem.entities.Client;
import com.devsuperior.ordersystem.entities.Product;
import com.devsuperior.ordersystem.entities.enums.ClientType;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ClientDTO {

    private Long id;
    private String name;
    private String email;
    private Integer type;
    private List<AddressDTO> addresses = new ArrayList<>();
    private Set<String> phone = new HashSet<>();

    public ClientDTO(){
    }

    public ClientDTO(Long id, String name, String email, Integer type) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.type = type;
    }

    public ClientDTO(Client entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.email = entity.getEmail();
        this.type = entity.getType().getId();
    }

    public ClientDTO(Client entity, List<Address> adressess){
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

    public ClientType getType() {
        return ClientType.toEnum(type);
    }

    public void setType(ClientType type) {
        this.type = type.getId();
    }

    public List<AddressDTO> getAddresses() {
        return addresses;
    }

    public Set<String> getPhone() {
        return phone;
    }
}
