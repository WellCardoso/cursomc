package com.backend.cursospringboot.service;

import com.backend.cursospringboot.entities.Client;
import com.backend.cursospringboot.exceptions.ObjectNotFoundException;
import com.backend.cursospringboot.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public List<Client> findAll(){
        return  clientRepository.findAll();
    }

    public Client findById(Long id) throws org.hibernate.ObjectNotFoundException {
        Optional<Client> obj = clientRepository.findById(id);
        if(obj == null) {
            throw new ObjectNotFoundException("Object nor found");
        }
        return obj.get();
    }
}
