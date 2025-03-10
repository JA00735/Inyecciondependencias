package com.jesus.springboot.di.app.springboot_di;

import com.jesus.springboot.di.app.springboot_di.repositories.IProductRepository;
import com.jesus.springboot.di.app.springboot_di.repositories.ProductRepositoryJson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:archivo.properties")
public class precio {

    @Bean("bean")
    public IProductRepository productRepositoryJson (){
        return new ProductRepositoryJson();
    }
}
