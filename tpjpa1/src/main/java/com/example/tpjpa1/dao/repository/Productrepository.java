package com.example.tpjpa1.dao.repository;

import com.example.tpjpa1.dao.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Productrepository extends JpaRepository <Product,Long>{
}
