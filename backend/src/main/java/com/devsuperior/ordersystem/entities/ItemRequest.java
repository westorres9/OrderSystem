package com.devsuperior.ordersystem.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;
@Entity
@Table(name = "tb_item_request")
public class ItemRequest  implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private ItemRequestPK id = new ItemRequestPK();
    private Double discount;
    private Integer quantity;
    private Double price;

    public ItemRequest() {
    }

    public ItemRequest(Request request, Product product, Double discount, Integer quantity, Double price) {
        id.setRequest(request);
        id.setProduct(product);
        this.discount = discount;
        this.quantity = quantity;
        this.price = price;
    }

    public Request getRequest() {
        return id.getRequest();
    }

    public Product getProduct() {
        return id.getProduct();
    }

    public ItemRequestPK getId() {
        return id;
    }

    public void setId(ItemRequestPK id) {
        this.id = id;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemRequest that = (ItemRequest) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
