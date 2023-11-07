package com.spring.SpringCrud.Repository;

import com.spring.SpringCrud.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository <Product,Integer> {

    Product findByName(String name);
    Product findByQuantity(int quantity);

    Product findByPrice(int price);
}
