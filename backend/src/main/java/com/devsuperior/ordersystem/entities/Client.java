package com.devsuperior.ordersystem.entities;

import com.devsuperior.ordersystem.entities.enums.ClientType;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;
@Entity
@Table(name = "tb_client")
public class Client implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private Integer type;

    @OneToMany(mappedBy = "client")
    private List<Address> addresses = new ArrayList<>();

    @ElementCollection
    @CollectionTable(name = "tb_phones")
    private Set<String> phone = new HashSet<>();

    public Client() {
    }

    public Client(Long id, String name, String email, ClientType type) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.type = type.getId();
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

    public List<Address> getAddresses() {
        return addresses;
    }

    public Set<String> getPhone() {
        return phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(id, client.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}