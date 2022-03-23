package com.backend.cursospringboot.entities;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable {
    public static final Long serialVersionUID = 1L;
    private Long id;
    private Date instante;

    private Payment payment;
    private Client client;
    private Address address;

    public Order() {}

    public Order(Long id, Date instante, Payment payment, Client client, Address address) {
        this.id = id;
        this.instante = instante;
        this.payment = payment;
        this.client = client;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getInstante() {
        return instante;
    }

    public void setInstante(Date instante) {
        this.instante = instante;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        return id != null ? id.equals(order.id) : order.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
