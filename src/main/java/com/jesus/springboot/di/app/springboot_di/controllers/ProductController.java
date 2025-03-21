package com.jesus.springboot.di.app.springboot_di.controllers;

import com.jesus.springboot.di.app.springboot_di.models.Product;
import com.jesus.springboot.di.app.springboot_di.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {


    @Autowired
    private IProductService service;

    @GetMapping("/all")
    public List<Product> all(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Product uno (@PathVariable Long id){
        return service.findById(id);
    }
}
