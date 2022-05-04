package com.devsuperior.ordersystem.entities.enums;

import com.devsuperior.ordersystem.entities.Client;

public enum StatePayment {
    PENDING(1,"Pending"),QUTED(2,"Quited"), CANCELED(3,"Canceled");

    private Integer id;
    private String description;

    private StatePayment(Integer id, String description){
        this.id = id;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static StatePayment toEnum(Integer id) {
        if(id == null) {
            return null;
        }

        for(StatePayment x : StatePayment.values()){
            if(id.equals(x.getId())) {
                return x;
            }
        }
        throw new IllegalArgumentException("Invalid Id " + id);
    }



}
