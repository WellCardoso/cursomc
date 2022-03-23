package com.backend.cursospringboot.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="tb_address")
public class Address implements Serializable {
    public static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String logradouro;
    private String numero;
    private String compĺemento;
    private String bairro;
    private String cep;

    @ManyToOne
    @JoinColumn(name="client_id")
    private Client client;

    @ManyToOne
    @JoinColumn(name="city_id")
    private  City city;

    public Address() {}

    public Address(
            Long id,
            String logradouro,
            String numero,
            String compĺemento,
            String bairro,
            String cep,
            Client client,
            City city) {
        this.id = id;
        this.logradouro = logradouro;
        this.numero = numero;
        this.compĺemento = compĺemento;
        this.bairro = bairro;
        this.cep = cep;
        this.client = client;
        this.city = city;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCompĺemento() {
        return compĺemento;
    }

    public void setCompĺemento(String compĺemento) {
        this.compĺemento = compĺemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        return id != null ? id.equals(address.id) : address.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
