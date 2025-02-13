package com.telsukoHarshal.simpleWebApp.controller;

import com.telsukoHarshal.simpleWebApp.model.Product;
import com.telsukoHarshal.simpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    //creating the instance of the ProductService as the object creation is handled by IoC container
    // and for this we need Autowired so the both class link with each other
    @Autowired
    ProductService service;

    @RequestMapping("/products")
    public List<Product> getProducts(){
        return service.getProducts();
    }
}
