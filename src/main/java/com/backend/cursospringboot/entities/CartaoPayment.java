package com.backend.cursospringboot.entities;

import com.backend.cursospringboot.enums.StatusPayment;

public class CartaoPayment extends Payment{
    public static final Long serialVersionUID = 1L;
    private Integer parcelas;

    public CartaoPayment(){}

    public CartaoPayment(Long id, StatusPayment status, Order order, Integer parcelas) {
        super(id, status, order);
        this.parcelas = parcelas;
    }

    public Integer getParcelas() {
        return parcelas;
    }

    public void setParcelas(Integer parcelas) {
        this.parcelas = parcelas;
    }
}
