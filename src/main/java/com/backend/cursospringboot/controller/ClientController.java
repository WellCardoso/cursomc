package com.backend.cursospringboot.controller;

import com.backend.cursospringboot.entities.Client;
import com.backend.cursospringboot.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {
    @Autowired
    public ClientService clientService;

    @GetMapping
    public ResponseEntity<List<Client>> findAll(){
        List<Client> list = clientService.findAll();
        return  ResponseEntity.ok().body(list);
    }

    @GetMapping(value="/{id}")
    public ResponseEntity<Client> findById(@PathVariable Long id){
        Client obj = clientService.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
