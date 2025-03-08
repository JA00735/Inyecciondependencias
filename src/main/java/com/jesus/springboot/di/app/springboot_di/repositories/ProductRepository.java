package com.jesus.springboot.di.app.springboot_di.repositories;

import com.jesus.springboot.di.app.springboot_di.models.Product;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
@Repository
public class ProductRepository implements IProductRepository{

    private List<Product> data;

    public ProductRepository() {
        this.data= Arrays.asList(
                new Product(1L,"cafe",100L),
                new Product(2L,"pan",200L),
        new Product(3L,"leche",300L),
        new Product(4L,"azucar",400L)
    );
    }

    @Override
    public List<Product> findAll(){
        return data;
    }

    @Override
    public Product findById(Long id){
        return data.stream().filter(p->p.getId().equals(id)).findFirst().orElse(null);
    }
}
