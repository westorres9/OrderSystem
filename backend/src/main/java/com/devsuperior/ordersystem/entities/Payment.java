package com.devsuperior.ordersystem.entities;

import com.devsuperior.ordersystem.entities.enums.StatePayment;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tb_payment")
@Inheritance(strategy = InheritanceType.JOINED)
public class Payment implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private Long id;
    private StatePayment state;

    @OneToOne
    @JoinColumn(name = "request_id")
    @MapsId
    private Request request;

    public Payment() {
    }

    public Payment(Long id, StatePayment state, Request request) {
        this.id = id;
        this.state = state;
        this.request = request;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public StatePayment getState() {
        return state;
    }

    public void setState(StatePayment state) {
        this.state = state;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return Objects.equals(id, payment.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
