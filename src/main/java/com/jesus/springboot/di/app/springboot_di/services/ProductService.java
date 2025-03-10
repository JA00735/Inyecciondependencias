package com.jesus.springboot.di.app.springboot_di.services;

import com.jesus.springboot.di.app.springboot_di.models.Product;
import com.jesus.springboot.di.app.springboot_di.repositories.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
@Service
public class ProductService implements IProductService {

    @Value("${valor.precio}")
    private Double P;

    @Autowired
    @Qualifier("bean")
    private IProductRepository repository;


    @Override
    public List<Product> findAll(){


        return repository.findAll().stream().map(p->{
            Double priceImp=p.getPrice()*P;
            //Product newProduct=new Product(p.getId(), p.getName(), priceImp.longValue());
            Product newProduct=(Product)p.clone();
            newProduct.setPrice(priceImp.longValue());
            return newProduct;
        } ).collect(Collectors.toList());

    }
    @Override
    public Product findById (Long id){
        return repository.findById(id);
    }
}
