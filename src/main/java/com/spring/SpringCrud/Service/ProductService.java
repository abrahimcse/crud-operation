package com.spring.SpringCrud.Service;

import com.spring.SpringCrud.Entity.Product;
import com.spring.SpringCrud.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;
    public Product saveProduct(Product product){
        return repository.save(product);

    }
    public List<Product> saveProducts(List<Product> products){
        return repository.saveAll(products);
    }
    public List<Product> getProduct(){
        return repository.findAll();
    }
    public Product getProductById(int id){
        return repository.findById(id).orElse(null);
    }
    public Product getProductByName(String name){
        return repository.findByName(name);
    }
    public Product getProductByQuantity(int quantity){
        return repository.findByQuantity(quantity);
    }
    public Product getProductByPrice(int price){
        return repository.findByPrice(price);
    }
    public String deleteProduct(int id){
        repository.deleteById(id);
        return "Remove Product !!"+id;
    }
    public Product updateProduct(Product product){
        Product existingProduct = repository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setPrice(product.getPrice());
        return repository.save(product);

    }

}
