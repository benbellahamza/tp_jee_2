package com.example.tpjpa1;

import com.example.tpjpa1.dao.entities.Product;
import com.example.tpjpa1.dao.repository.Productrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Tpjpa1Application implements CommandLineRunner {
    @Autowired
    private Productrepository ProductRepository ;

    public static void main(String[] args) {
        SpringApplication.run(Tpjpa1Application.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        Product product = new Product(1L, "hamza", "bien", 25.10);
        ProductRepository.save(product);
        List<Product> products = ProductRepository.findAll();
        products.forEach(productFromList -> {
            System.out.println(productFromList.toString());
        });
        Product productUpdatedById = productRepository.findById(3).get();
        System.out.println(productUpdatedById);
        productUpdate.setName("Hamza");
        productRepository.save(productUpdate);
        productUpdatedById = productRepository.findById(1L).get();
        System.out.println(productUpdatedById);
    }
    @Override
    public void run(String... args) throws Exception {
        Product productDelete = new Product(4L, "Hamza", "bon",25.20);
        productRepository.save(productDelete);
        System.out.println(ProductRepository.findById(4L).get());
        ProductRepository.delete(productDelete);
        try {
            System.out.println(ProductRepository.findById(4L).get());
        } catch (Exception exception) {
            System.out.println("The product has been deleted");
        }


    }
}
