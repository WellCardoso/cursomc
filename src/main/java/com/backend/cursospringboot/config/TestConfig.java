package com.backend.cursospringboot.config;

import com.backend.cursospringboot.entities.*;
import com.backend.cursospringboot.enums.TypeClient;
import com.backend.cursospringboot.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class TestConfig implements CommandLineRunner {

    @Autowired
    public CategoryRepository categoryRepository;

    @Autowired
    public ProductRepository productRepository;

    @Autowired
    public StateRepository stateRepository;

    @Autowired
    public CityRepository cityRepository;

    @Autowired
    public AddressRepository addressRepository;

    @Autowired
    public ClientRepository clientRepository;


    @Override
    public void run(String... args) throws Exception {
        Category cat1 = new Category(null, "Informatica");
        Category cat2 = new Category(null, "Escritoria");

        Product p1 = new Product(null, "Computador", 2000.00);
        Product p2 = new Product(null, "Impressora", 800.00);
        Product p3 = new Product(null, "Mouse", 80.00);

        cat1.getProduct().addAll(Arrays.asList(p1,p2,p3));
        cat2.getProduct().add(p2);

        p1.getCategories().add(cat1);
        p2.getCategories().addAll(Arrays.asList(cat1, cat2));
        p3.getCategories().add(cat1);

        categoryRepository.saveAll(Arrays.asList(cat1, cat2));
        productRepository.saveAll(Arrays.asList(p1,p2,p3));

        State state1 = new State(null, "Minas Gerais");
        State state2 = new State(null, "São Paulo");

        City city1 = new City(null, "Uberlândia", state1);
        City city2 = new City(null, "São Paulo", state2);
        City city3 = new City(null, "Campinas", state2);

        state1.getCities().add(city1);
        state2.getCities().addAll(Arrays.asList(city2, city3));

        stateRepository.saveAll(Arrays.asList(state1, state2));
        cityRepository.saveAll(Arrays.asList(city1, city2, city3));

        Client clin1 = new Client(
                null, "Maria Silva",
                " maria@gnmail.com",
                "123456789",
                TypeClient.PESSOAFISICA
        );

        clin1.getCellphone().addAll(Arrays.asList("123456789", "123456789"));

        Address address1 = new Address(
                null,
                "Rua: Flores",
                "300",
                "Apto 30",
                "Jardim",
                "123456789",
                clin1,
                city1
        );

        Address address2 = new Address(
                null,
                "Rua: Mattos",
                "500",
                "casa 30",
                "Jardim Esmeralda",
                "123456789",
                clin1,
                city2
        );

        clin1.getAddress().addAll(Arrays.asList(address1, address2));

        clientRepository.save(clin1);
        addressRepository.saveAll(Arrays.asList(address1, address2));
    }
}
