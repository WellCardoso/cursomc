package com.backend.cursospringboot.entities;

import com.backend.cursospringboot.enums.TypeClient;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="tb_client")
public class Client implements Serializable {
    public static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String cpf;
    private Integer typeClient;

    @JsonManagedReference
    @OneToMany(mappedBy = "client")
    private List<Address> address = new ArrayList<>();

    @ElementCollection
    @CollectionTable(name="tb_cellphone")
    private Set<String> cellphone = new HashSet<>();

    public Client() {}

    public Client(Long id, String name, String email, String cpf, TypeClient typeClient) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.typeClient = typeClient.getCod();
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public TypeClient getTypeClient() throws IllegalAccessException {
        return TypeClient.toEnum(typeClient);
    }

    public void setTypeClient(TypeClient typeClient) {
        this.typeClient = typeClient.getCod();
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public Set<String> getCellphone() {
        return cellphone;
    }

    public void setCellphone(Set<String> cellphone) {
        this.cellphone = cellphone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        return id != null ? id.equals(client.id) : client.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
