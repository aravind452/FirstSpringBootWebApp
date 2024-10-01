package com.example.firstwebappusingspringboot.service;

import java.util.*;

import com.example.firstwebappusingspringboot.model.Product;
import org.springframework.stereotype.Service;


@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(new Product(101, "Iphone", 40000)));

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int id) {
        return products.stream()
                .filter(p -> p.getProdId() == id)
                .findFirst()
                .orElse(new Product(100,"No item", 0));
    }

    public void addProduct(Product product) {
        products.add(product);
    }

}
