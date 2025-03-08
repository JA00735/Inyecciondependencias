package com.jesus.springboot.di.app.springboot_di.repositories;

import com.jesus.springboot.di.app.springboot_di.models.Product;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;
@Repository("imp1")

public class ProductRepository2 implements IProductRepository{
    @Override
    public List<Product> findAll() {
        return Collections.singletonList(new Product(2L,"pan",45L));
    }

    @Override
    public Product findById(Long id) {
        return new Product(2L,"pan",45L);
    }
}
