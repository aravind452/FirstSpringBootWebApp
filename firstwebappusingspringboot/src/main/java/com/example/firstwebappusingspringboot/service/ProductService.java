package com.example.firstwebappusingspringboot.service;

import java.util.*;

import com.example.firstwebappusingspringboot.model.Product;
import org.springframework.stereotype.Service;


@Service
public class ProductService {

    List<Product> products = List.of(new Product(101, "Iphone", 40000));

    public List<Product> getProducts() {
        return products;
    }

}
