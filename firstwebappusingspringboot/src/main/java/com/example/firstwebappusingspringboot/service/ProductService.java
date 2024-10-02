package com.example.firstwebappusingspringboot.service;

import java.util.*;

import com.example.firstwebappusingspringboot.model.Product;
import com.example.firstwebappusingspringboot.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductService {

    @Autowired
    ProductRepo productRepo;

    public List<Product> getProducts() {
        return productRepo.findAll();
    }

    public Product getProductById(int id) {
        return productRepo.findById(id).orElse(new Product(100, "No item", 0));
    }

    public void addProduct(Product product) {
        productRepo.save(product);
    }

    public void updateProduct(Product product) {
        productRepo.save(product);
    }

    public void deleteProduct(int id) {
        productRepo.deleteById(id);
    }


}


// without jpa

/*
* List<Product> products = new ArrayList<>(Arrays.asList(new Product(101, "Iphone", 40000)));

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int id) {
        return products.stream()
                .filter(p -> p.getProdId() == id)
                .findFirst()
                .orElse(new Product(100, "No item", 0));
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateProduct(Product product) {
        int index = 0;
        for (int i = 0; i < products.size(); i++)
            if (products.get(i).getProdId() == product.getProdId())
                index = i;
        products.set(index, product);

    }

    public void deleteProduct(int id) {
        products.removeIf(p -> p.getProdId() == id);
    }
 */