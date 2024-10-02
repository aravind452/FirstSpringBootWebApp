package com.example.firstwebappusingspringboot.controller;

import com.example.firstwebappusingspringboot.model.Product;
import com.example.firstwebappusingspringboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @RequestMapping("/products")
    public List<Product> getProducts() {
        return service.getProducts();

    }

    @RequestMapping("/products/{id}")
    public Product getProductById(@PathVariable int id) {
        return service.getProductById(id);

    }

    @PostMapping("/addproduct")
    public void addProduct(@RequestBody Product product) {
        System.out.println(product.toString());
        service.addProduct(product);
    }


    @PutMapping("/products")
    public void updateProduct(@RequestBody Product product) {
        service.updateProduct(product);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable int id) {
        service.deleteProduct(id);

    }
}
