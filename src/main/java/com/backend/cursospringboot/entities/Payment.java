package com.backend.cursospringboot.entities;

import com.backend.cursospringboot.enums.StatusPayment;

import java.io.Serializable;

public class Payment implements Serializable {
    public static final Long serialVersionUID = 1L;
    private Long id;
    private StatusPayment status;

    private Order order;

    public Payment(){}

    public Payment(Long id, StatusPayment status, Order order) {
        this.id = id;
        this.status = status;
        this.order = order;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public StatusPayment getStatus() {
        return status;
    }

    public void setStatus(StatusPayment status) {
        this.status = status;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Payment payment = (Payment) o;

        return id != null ? id.equals(payment.id) : payment.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
