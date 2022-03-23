package com.backend.cursospringboot.service;

import com.backend.cursospringboot.entities.Category;
import com.backend.cursospringboot.exceptions.ObjectNotFoundException;
import com.backend.cursospringboot.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll(){
        return  categoryRepository.findAll();
    }

    public Category findById(Long id) throws org.hibernate.ObjectNotFoundException {
        Optional<Category> obj = categoryRepository.findById(id);
        if(obj == null) {
            throw new ObjectNotFoundException("Object nor found");
        }
        return obj.get();
    }
}
