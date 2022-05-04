package com.devsuperior.ordersystem.entities;

import com.devsuperior.ordersystem.entities.enums.StatePayment;

import javax.persistence.Entity;
import java.util.Date;
@Entity
public class TicketPayment extends Payment{
    private static final long serialVersionUID = 1L;

    private Date dueDate;
    private Date paymentDate;

    private TicketPayment(){
        super();
    }

    public TicketPayment(Long id, StatePayment state, Request request, Date dueDate, Date paymentDate) {
        super(id, state, request);
        this.dueDate = dueDate;
        this.paymentDate = paymentDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }


}
