package com.telsukoHarshal.simpleWebApp.service;

import com.telsukoHarshal.simpleWebApp.model.Product;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Getter
@Service
public class ProductService {

    //method that will return the list of products
    //creating the manual list of products
    List<Product> products = Arrays.asList(
            new Product(101, "IPhone", 50000),
            new Product(102,"Samsung", 100000),
            new Product(103,"Realme", 10000));

        public List<Product> getProducts(){
            return products;
        }
}
