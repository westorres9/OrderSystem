package com.devsuperior.ordersystem.entities;

import com.devsuperior.ordersystem.entities.enums.StatePayment;

import javax.persistence.Entity;

@Entity
public class CardPayment extends Payment {
    private static final long serialVersionUID = 1L;

    private Integer numberOfQuotas;

    public CardPayment(){
    }

    public CardPayment(Long id, StatePayment state, Request request, Integer numberOfQuotas) {
        super(id, state, request);
        this.numberOfQuotas = numberOfQuotas;
    }


}
